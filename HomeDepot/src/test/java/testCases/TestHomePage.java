package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;
import page_objects.SearchProductPage;

public class TestHomePage extends HomePage {

    @Test (enabled = false)
    public void testHomePage()  {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        System.out.println("Search button Displayed: "+hm.isSearchButtonDisplay()); //test Search button for Display status
        hm.returnBackAllDept(); //navigate back to home page after clicking in AllDepartment tab
        hm.returnbackShopRoomImg();
        hm.returnbackShopRoomTxt();
        hm.compareImageNTextLink();
        hm.captureTextHeroImage();
        hm.goToLoginPage();
    }

    @Test (enabled = false)
    public void testLogin(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.goToLoginPage();

        LoginPage log = PageFactory.initElements(driver, LoginPage.class);
        log.checkEmailBoxEnable();
        log.checkPasswordBoxEnable();
        log.checkClearText();
        log.checkSignInButton();
        log.captureEmailErrorMessage();
        log.capturePasswordErrorMesssage();
        log.checkForgotPasswordLink();
        log.checkForgotEmail();

    }
    @Test (enabled = true)
    public void testSortByBestMatch() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();

        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.checkBestMatchSortBy();
    }

    @Test (enabled=false)
    public void testSortByTopSeller(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.checkTopSellerSortBy();
    }
    @Test (enabled= false)
    public void testSortByLowToHigh(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.checkLowToHighSortBy();
    }

    @Test (enabled= false)
    public void testSortByHighToLow(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.checkHighToLowSortBy();
    }

    @Test (enabled= false)
    public void testSortByTopRated(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.checkTopRatedSortBy();
    }

    @Test (enabled= false)
    public void testListSortBy(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goTosearchProductPage();
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);
        sr.getItemsFromSortBy();
    }
}
