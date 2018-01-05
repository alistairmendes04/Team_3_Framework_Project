package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;

public class TestHomePage extends HomePage {

    @Test (enabled = false)
    public void testHomePage(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        System.out.println("Search button Displayed: "+sr.isSearchButtonDisplay()); //test Search button for Display status
        sr.searchProduct();
        sr.returnBackAllDept(); //navigate back to home page after clicking in AllDepartment tab
        sr.returnbackShopRoomImg();
        sr.returnbackShopRoomTxt();
        sr.compareImageNTextLink();
        sr.captureTextHeroImage();
        sr.goToLoginPage();
    }

    @Test
    public void testLogin(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.goToLoginPage();
        LoginPage log = PageFactory.initElements(driver, LoginPage.class);
        log.checkEmailBoxEnable();

    }
}
