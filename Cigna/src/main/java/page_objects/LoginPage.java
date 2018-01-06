package page_objects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPage extends CommonAPI{
    @FindBy(id = "username")
    public static WebElement username;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(xpath = ".//*[@id='userForm']/fieldset[2]/div/span/button")
    public static WebElement loginbutton;

//to work on the newly opened page
    public void enterCredintials(){
        for (String handle:driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        username.sendKeys("AlistairMendes", Keys.TAB);
        password.sendKeys("abcd1234");
        loginbutton.click();
        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='c1289878640341']/div/p")).isDisplayed(),"The ID and password combination you entered does not match our records.");
    }
}