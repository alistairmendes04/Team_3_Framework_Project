package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;



public class LoginPage extends CommonAPI{
    @FindBy(id="email_id")
    public static WebElement emailBox;
    @FindBy(id="password")
    public static WebElement passwordBox;
    @FindBy(id="email_id")
    public static WebElement signinButton;
    @FindBy(xpath="//span[contains(text(),'your email')]")
    public static WebElement errorEmailMessage;
    @FindBy(xpath="//span[contains(text(),'your password')]")
    public static WebElement errorPasswordMessage;
    @FindBy(xpath="//a[contains(text(),'Forgot')]")
    public static WebElement forgotPasswordLink;

    @FindBy(xpath="//*[@id='forgotpasswordEmail']")
    public static WebElement forgotPasswordEmail;
    @FindBy(xpath="//span[text()='Submit']")
    public static WebElement forgotPasswordSubmit;

    //Check if Email text box is enabled
    public void checkEmailBoxEnable() {
        boolean eb = emailBox.isEnabled();
        System.out.println("Status of Email Textbox is :" + eb);
    }

    //Check if password text box is enabled
    public void checkPasswordBoxEnable(){
        boolean pb = passwordBox.isEnabled();
        System.out.println("Status of Password Textbox is :" + pb);
    }

    //Clearing the text box message after entering text
    public void checkClearText(){
        emailBox.sendKeys("Aarti Pathania");
        emailBox.clear();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        emailBox.sendKeys("aarti@gmail.com");
        emailBox.clear();
    }

    //Sign-in button disabled if entered wrong email and wrong password
    public void checkSignInButton(){
        emailBox.sendKeys("aarti");
        passwordBox.sendKeys("abcd1234");
        boolean bl = signinButton.isEnabled();
        System.out.println("With wrong credentials, SignIn button is disabled: "+bl);
    }

    //Capture error message when entered wrong email
    public void captureEmailErrorMessage() {
        emailBox.clear();
        emailBox.sendKeys("aarti", Keys.ENTER);
        String str = errorEmailMessage.getText();
        System.out.println("Error messsage when wrong email entered: " + str);
    }

    //Capture error message when entered blank password
    public void capturePasswordErrorMesssage(){
        passwordBox.sendKeys("", Keys.ENTER);
        System.out.println("Error messsage when wrong password entered: " + errorPasswordMessage.getText());
    }

    //Check Forgot Password link
    public void checkForgotPasswordLink(){
        forgotPasswordLink.click();
        System.out.println("URL of 'Forgot password' page: " + driver.getCurrentUrl());
    }

    public void checkForgotEmail(){
        forgotPasswordEmail.sendKeys("aarti@gmail.com");
        forgotPasswordSubmit.click();
    }


/*
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        emailBox.sendKeys("aarti");
        passwordBox.sendKeys("abcd");
        signinButton.click();
        System.out.println("Status of Email Textbox is :"+ emailBox.isEnabled());
       // Thread.sleep(4000);
    }*/

}
