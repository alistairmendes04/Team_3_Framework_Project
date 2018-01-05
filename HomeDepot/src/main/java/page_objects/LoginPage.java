package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id="email_id")
    public static WebElement emailBox;
    @FindBy(id="password")
    public static WebElement passwordBox;
    @FindBy(id="email_id")
    public static WebElement signinButton;

    public void checkEmailBoxEnable(){
        System.out.println("Status of Email box is :"+ emailBox.isEnabled());
    }

}
