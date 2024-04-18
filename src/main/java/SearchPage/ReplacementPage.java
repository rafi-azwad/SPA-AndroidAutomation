package SearchPage;

import Core.AppHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static SearchPage.NewOrderPage.selectRetailerName;

public class ReplacementPage {

    public AndroidDriver driver;
    public ReplacementPage(AndroidDriver driver){
        this.driver = driver;
    }

    public void clickOnMenuBar() {

        WebElement menu = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Navigate up']")));
        menu.click();
    }
    public void clickOnReplacement() {

        WebElement replacement = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Replacement']")));
        replacement.click();
    }
   public void clickDotMenu() {

        WebElement menu = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='More options']")));
        menu.click();

        WebElement add = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Add']")));
        add.click();
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

    public void replacementDetails() {

        WebElement replacementDetails = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Replacement details']")));
        replacementDetails.click();
    }
    public void replaceReceive(){
        WebElement replaceReceive = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Chamak']")));
        replaceReceive.click();

        WebElement selectItem = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Chamak Fabric Brightener - 50 ml']")));
        selectItem.click();

        WebElement orderQty = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("edtQty")));
        orderQty.click();
        orderQty.sendKeys("3");

        WebElement chooseMRP = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("spinnerPrice")));
        chooseMRP.click();

        WebElement selectMRP = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = '20.00']")));
        selectMRP.click();

        WebElement replaceCause = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("spinnerRepCause")));
        replaceCause.click();

        WebElement selectCause = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'Date Expired']")));
        selectCause.click();

         WebElement ok = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'OK']")));
        ok.click();

    }

    public void replaceAdjustment(){

        WebElement repAdj = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'Replace Adjustment']")));
        repAdj.click();

        WebElement products = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'Chaka']")));
        products.click();

         WebElement selectProducts = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'Chaka Advanced Ball Soap - 125gm']")));
        selectProducts.click();

        WebElement orderQty = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("edtQty")));
        orderQty.click();
        orderQty.sendKeys("2");

        WebElement ok = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'OK']")));
        ok.click();
    }

    public void orderSummary(){

        WebElement orderSummary = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'ORDER SUMMARY']")));
        orderSummary.click();

        AppHelper.getScreenshot("replacement receive and adjustment");

        WebElement sendNow = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Send now']")));
        sendNow.click();

         WebElement send = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text = 'SEND']")));
        send.click();

        AppHelper.getScreenshot("order replacement");

    }

}
