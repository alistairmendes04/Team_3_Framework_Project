package logInPageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LogInPage extends CommonAPI {
    @FindBy(id = "banner-close")
    public WebElement bannerClose;
    @FindBy(id = "Login_1")
    public WebElement loginRegister;
    @FindBy(id = "Email_1")
    public WebElement emailBox;
    @FindBy(id = "Password_1")
    public WebElement passwordBox;
    @FindBy(id = "LoginBtn_1")
    public WebElement logInButon;
    @FindBy(id = "SignUpBtn_1")
    public WebElement signUpButton;
    @FindBy(id = "fname")
    public WebElement fName;
    @FindBy(id = "lname")
    public WebElement lName;
    @FindBy(id = "email")
    public WebElement emailBoxRegistration;
    @FindBy(id = "password")
    public WebElement newPassword;
    @FindBy(id = "passwordConfirmation")
    public WebElement passwordConfirmation;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement startSearching;
    @FindBy(css = "#errorMsgID > div")
    public WebElement errorMessage;

    public void register(){
        implicitWait(driver,15);
        bannerClose.click();
        loginRegister.click();
        signUpButton.click();
        fName.sendKeys("Jack");
        lName.sendKeys("Mack");
        emailBoxRegistration.sendKeys("testdata.isla@gmail.com");
        newPassword.sendKeys("jack2525");
        passwordConfirmation.sendKeys("jack2525");
        startSearching.click();
        String actual = errorMessage.getText();
        String expectedError = "Captcha is required, prove that you are human.";
        Assert.assertTrue(actual.contains(expectedError));
    }
}
