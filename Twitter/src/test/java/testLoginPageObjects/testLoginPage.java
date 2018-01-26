package testLoginPageObjects;

import homePageObjects.HomePage;
import loginPageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testLoginPage extends LoginPage {
    HomePage objHomePage;
    LoginPage objLoginPage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objLoginPage = PageFactory.initElements(driver, LoginPage.class);
    }
    //T3TWI_LP_TC01 verify Login with blank email and blank password
   // @Test
    public void testBlankEmailPassword(){
        objHomePage.goToLoginPage();
        String actual = objLoginPage.blankEmailPassword();
        String expected = "The username and password you entered did not match our records. Please double-check and try again.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testFirstSportsImage test passed");
    }
    //T3TWI_LP_TC02 verify Login with invalid email and blank password
    //@Test
    public void testInvalidEmailBlankPassword(){
        objHomePage.goToLoginPage();
        String actual = objLoginPage.invalidEmailBlankPassword();
        String expected = "The username and password you entered did not match our records. Please double-check and try again.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testFirstSportsImage test passed");
    }
    //T3TWI_LP_TC03 verify Login with invalid email and invalid password
    @Test
    public void testInvalidEmailInvalidPassword(){
        objHomePage.goToLoginPage();
        String actual = objLoginPage.invalidEmailInvalidPassword();
        String expected = "The username and password you entered did not match our records. Please double-check and try again.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testFirstSportsImage test passed");
    }
}
