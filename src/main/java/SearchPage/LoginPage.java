package SearchPage;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class LoginPage {
    public AndroidDriver driver;
    public LoginPage(AndroidDriver driver){

        this.driver = driver;
    }

    public void userInformation(String userid, String password) {

        WebElement userID = new WebDriverWait(driver, Duration.ofSeconds(15)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='User ID']")));
        userID.click();
        userID.sendKeys(userid);

        WebElement pass = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Password']")));
        pass.click();
        pass.sendKeys(password);

        WebElement visiblePassword = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Show password']")));
        visiblePassword.click();


    }
    public void clickLogin() {

        WebElement rememberMe = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Remember me']")));
        rememberMe.click();

        WebElement login = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Login']")));
        login.click();

    }

    public void getSuccessfulMsg() {

     /*   Alert alert = driver.switchTo().alert();
        alert.accept();*/

        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@text='OK']")).click();
        }
        catch (NoSuchElementException exception){
            System.out.println(exception);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@text='OK']")).click();
        }
        catch (NoSuchElementException exception){
            System.out.println(exception);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {

            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@text='OK']")).click();
        }
        catch (NoSuchElementException exception){
            System.out.println(exception);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String expect = "Sync Menu";
        WebElement syncMenu = new WebDriverWait(driver, Duration.ofSeconds(30)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Sync Menu']")));
       String actual = syncMenu.getText();

        Assert.assertEquals(expect,actual,"failed to login");

        System.out.println("Successfully login to home page ");

    }

}
