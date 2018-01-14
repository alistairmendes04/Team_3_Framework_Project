package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.LoginPage;
import page_objects.SearchProductPage;

public class TestHomePage extends HomePage {
     HomePage objHomePage;
   
  @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    //T3HOM_HP_TC01 Verify Search button, if it is displayed
    @Test ( enabled=true)
    public void verifySearchButton(){
        boolean bl = objHomePage.isSearchButtonDisplay();
        Assert.assertTrue(bl);
        System.out.println("VerifySearchButton test passed");
    }
    //T3HOM_HP_TC02  Go to Appliance tab and get title of the page
    @Test ( enabled=false)
    public void verifyApplianceTitle(){
        String actual = objHomePage.goToAppliances();
        String expected = "Appliances at The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyApplianceTitle test passed");
    }
    //T3HOM_HP_TC03  Navigate back to Home page after clicking AllDepartment tab
    @Test ( enabled=true)
    public void verifyBackToHomePage() {
        String actual = objHomePage.returnBackAllDept();
        String expected = "The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyBackToHomePage test passed");
    }
    //T3HOM_HP_TC04 Go to Bathroom image link under Shop Room tab and get title of the page
    @Test (priority=4, enabled=true)
    public void verifyShopRoomImgLink() {
        String actual = objHomePage.goToBathroomUsingImg();
        String expected = "Bathrooms — Shop by Room at The Home Depot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyShopRoomImageLink test is passed");
    }
    //T3HOM_HP_TC05 Go to Bathroom text link under Shop Room tab and get title of the page
    @Test ( enabled=true)
    public void verifyShopRoomtextLink() {
        String actual = objHomePage.goToBathroomUsingTxt();
        String expected = "Bathrooms — Shop by Room at The Home Depot";
        Assert.assertEquals(actual,expected);
        System.out.println("VerifyShopRoomTextLink test passed");
    }
    //T3HOM_HP_TC06 Compare the text and image link to check if it takes to same page
    @Test ( enabled=true)
    public void compareImageTextLink() {
        String str1 = objHomePage.goToBathroomUsingTxt();
        String str2 = objHomePage.goToBathroomUsingTxt();
        Assert.assertEquals(str1,str2);
        System.out.println("CompareImageTextLink test passed");
    }
    //T3HOM_HP_TC07 capture the text of hero image
    @Test ( enabled=true)
    public void testHeroImage() {
        String actual = objHomePage.captureTextHeroImage();
        String expected = "Up to 30% off select storage solutions";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("TestHeroImage test passed");
    }
}
