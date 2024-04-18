package SearchPage;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SynchronisePage {

    public AndroidDriver driver;
    public SynchronisePage(AndroidDriver driver){
        this.driver = driver;
    }
    public void syncProducts(){
        WebElement products = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("syncProducts")));
        products.click();
    }
    public void syncRetailers(){
        WebElement retailers = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("syncCustomers")));
        retailers.click();
    }
    public void syncPriority(){
        WebElement priority = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("syncPriority")));
        priority.click();
    }
    public void syncStock(){
        WebElement stock = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("syncShortProd")));
        stock.click();
    }

    public void syncTrade(){
        WebElement trade = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("syncTradeProg")));
        trade.click();
    }

    public void syncRepCause(){
        WebElement repCause = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("ivSyncReplacementCause")));
        repCause.click();
    }
    public void syncProductMrp(){
        WebElement productMrp = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("ivSyncProductMrp")));
        productMrp.click();
    }
    public void syncDailyTarget(){
        WebElement dailyTarget = new WebDriverWait(driver, Duration.ofSeconds(20)).
                until(ExpectedConditions.visibilityOfElementLocated(By.id("ivSyncSkuWiseTarget")));
        dailyTarget.click();
    }
}
