package testLogInPageObjects;

import homePageObjects.HomePage;
import logInPageObjects.LogInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogInPage extends LogInPage {
    HomePage objOfHomePage;
    LogInPage objOfLogInPage;
    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfLogInPage = PageFactory.initElements(driver, LogInPage.class);
    }
    @Test
    public void testRegistration(){
        objOfLogInPage.register();
    }
}
