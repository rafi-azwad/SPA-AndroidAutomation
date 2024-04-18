package SearchPage;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class RegistrationPage {
    AndroidDriver driver;

    public RegistrationPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickOnRegister() {

        WebElement register = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Register']")));
        register.click();

    }
    public void requiredField(String userID, String pass, String mobileNo) {

        WebElement userid = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='User ID']")));
        userid.sendKeys(userID);

        WebElement password = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Password']")));
        password.sendKeys(pass);

        WebElement showPassword = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@content-desc='Show password'])[1]")));
        showPassword.click();

        WebElement confirmPassword = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Confirm Password']")));
        confirmPassword.sendKeys(pass);

        WebElement showPassword2 = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@content-desc='Show password'])[2]")));
        showPassword2.click();

        WebElement mobileNumber = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Mobile No']")));
        mobileNumber.sendKeys(mobileNo);

    }

}