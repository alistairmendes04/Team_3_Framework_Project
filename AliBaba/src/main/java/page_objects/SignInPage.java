package page_objects;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class SignInPage extends CommonAPI {

    @FindBy (how= XPATH, using = ".//*[@id='fm-login-id']")
    public static WebElement account;

    @FindBy (how = ID, using = "fm-login-password")
    public static   WebElement password;

    @FindBy (id = "fm-login-submit")
    public static WebElement loginSubmit;


    public void signIn() throws InterruptedException {

        //new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(account));
       /* JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].sendKeys(\"testdata\");", account);*/
        driver.switchTo().frame("alibaba-login-box");
       account.sendKeys("testdata@gmail.com");
        password.sendKeys("testdata");
        loginSubmit.click();
    }


}
