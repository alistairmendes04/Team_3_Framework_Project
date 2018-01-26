package loginPageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI{
    @FindBy(name = "session[username_or_email]")
    public static WebElement username;
    @FindBy(name = "session[password]")
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"login-dialog-dialog\"]//form/input[1]")
    public static WebElement loginButton;
    @FindBy(xpath = "//*[@id=\"message-drawer\"]/div/div/span")
    public static WebElement errorMessage;

    //T3TWI_LP_TC01 verify Login with blank email and blank password
    public String blankEmailPassword(){
        loginButton.click();
        String str = errorMessage.getText();
        return str;
    }
    //T3TWI_LP_TC02 verify Login with invalid email and blank password
    public String invalidEmailBlankPassword(){
        username.sendKeys("Aarti");
        loginButton.click();
        String str = errorMessage.getText();
        return str;
    }
    //T3TWI_LP_TC03 verify Login with invalid email and invalid password
    public String invalidEmailInvalidPassword(){
        username.sendKeys("Aarti");
        password.sendKeys("password");
        loginButton.click();
        String str = errorMessage.getText();
        return str;
    }
}
