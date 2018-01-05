package page_objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.How.CSS;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class SignInPage extends CommonAPI {

    @FindBy (how = XPATH, using = "//input[@id=\"fm-login-id\"]")
    public static WebElement account;

    @FindBy (how = ID, using = "fm-login-password")
    public static   WebElement password;

    @FindBy (id = "fm-login-submit")
    public static WebElement loginSubmit;


    public void signIn(){
        //account.sendKeys("testdata@gmail.com");
        //password.sendKeys("testdata");
        /*WebDriverWait wait10 = new WebDriverWait(driver, 10);
        WebElement element10 = wait10.until(ExpectedConditions.elementToBeClickable(account));*/
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // element10.sendKeys("testdata@gmail.com");
        //loginSubmit.click();
    }


}
