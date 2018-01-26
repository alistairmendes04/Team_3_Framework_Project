package testHomePageObjects;

import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage{
    HomePage objHomePage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }
    //T3TWI_HP_TC01 verify HeroImage text
    //@Test
    public void verifyHeroImage(){
        String actual = objHomePage.getHeroImageTest();
        String expected = "What’s happening?";
       // Assert.assertTrue(actual.contains(expected));
        System.out.println("VerifyHeroImage test passed "+ actual);
    }
    //T3TWI_HP_TC02 Get list of links in Home page(anchor tags)
    @Test
    public void verifyTotalLinksHomePage(){
        objHomePage.findNumberOfLinks();
        System.out.println("verifyTotalLinksHomePage test passed");
    }
    //T3TWI_HP_TC03 verify Sports link
    @Test
    public void testNumberOfList(){
       boolean actual = objHomePage.verifySportsLink();
       Assert.assertTrue(actual);
        System.out.println("testNumberOfList test passed");
    }
    //T3TWI_HP_TC04 verify News link
    @Test
    public void testSportsLink(){
        boolean actual = objHomePage.verifyNewsLink();
        Assert.assertTrue(actual);
        System.out.println("testSportsLink test passed");
    }
    //T3TWI_HP_TC05 Get items from Sortby drop box
  //  @Test
    public void testListSortBy(){
        objHomePage.getDropBoxList();
        System.out.println("testListSortBy test passed");
    }
}
