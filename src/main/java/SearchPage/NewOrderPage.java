package SearchPage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewOrderPage {

    AndroidDriver driver;

    public static String selectRetailerName = "Deb";
    public static String chooseTradeProgramName = "Trade Program";
    public static String chooseTradeSlabName = "Gift item";
    public NewOrderPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickOnMenuBar() {
        WebElement menu = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Navigate up']")));
        menu.click();
    }

    public void clickNewOrder() {
        WebElement newOrder = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='New Order']")));
        newOrder.click();
    }

    public void selectRetailer() {
        WebElement newOrder = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("btnCustomer")));
        newOrder.click();

        WebElement retailerName = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.visibilityOfElementLocated(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+selectRetailerName+"\").instance(0))")));
        retailerName.click();
        //scroll down to the element and click

    }

    public void chooseTradeOffer() {
        WebElement yes = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Yes']")));
        yes.click();
    }

    public void selectTradeProgram() {
        WebElement tradeProgram = new WebDriverWait(driver, Duration.ofSeconds(60)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("edtTradeProg")));
        tradeProgram.click();
        WebElement chooseTradeProgram = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, '"+chooseTradeProgramName+"')]")));
        chooseTradeProgram.click();
    }

    public void selectTradeSlab() {
        WebElement tradeSlab = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("edtTradePlicy")));
        tradeSlab.click();
        WebElement chooseTradeSlab = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, '"+chooseTradeSlabName+"')]")));
        chooseTradeSlab.click();
    }

    public void save() {
        WebElement save = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Save']")));
        save.click();

        try{
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@text='OK']")).click();
        }
        catch (NoSuchElementException e){
            System.out.println(e);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void chooseNoTradeOffer() {
        WebElement yes = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='No']")));
        yes.click();
    }

    public void clickOrderDetails() {
        WebElement orderDetails = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ORDER DETAILS']")));
        orderDetails.click();

        WebElement brands = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Meril']")));
        brands.click();

        WebElement products = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Meril Baby  Oil']")));
        products.click();

        WebElement chooseProducts = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Meril Baby Olive Oil - 100 ml']")));
        chooseProducts.click();

        WebElement orderQty = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("edtQty")));
        orderQty.click();
        orderQty.sendKeys("2");

        WebElement ok = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='OK']")));
        ok.click();

        WebElement back = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Navigate up']")));
        back.click();

        WebElement back2 = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Navigate up']")));
        back2.click();

        WebElement saveDraft = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='SAVE DRAFT']")));
        saveDraft.click();

        WebElement draftSent = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, '"+selectRetailerName+"')]")));

        Actions actions = new Actions(driver);
        actions.clickAndHold(draftSent).perform();

        WebElement send = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='send']")));
        send.click();

        WebElement confirmSend = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='SEND']")));
        confirmSend.click();

        WebElement sentInformation= new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, '"+selectRetailerName+"')]")));
        sentInformation.click();


    }
    public void backOrderDetails(){
        WebElement back = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Navigate up']")));
        back.click();
    }
}