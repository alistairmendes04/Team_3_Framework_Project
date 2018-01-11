package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.SearchProductPage;

public class TestSearchPage extends SearchProductPage {
    HomePage objHomePage;
    SearchProductPage objSearchPage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSearchPage = PageFactory.initElements(driver, SearchProductPage.class);
    }
    //T3HOM_SP_TC01 verify Best Match link in Sort by drop box
    @Test (priority=1 , enabled=false)
    public void testSortByBestMatch() {
        objHomePage.goToSearchProductPage();
        boolean bl = objSearchPage.checkBestMatchSortBy();
        Assert.assertTrue(bl);
        System.out.println("testSortByBestMatch test passed");
    }
    //T3HOM_SP_TC02 verify TopSeller Link under sort By dropbox
    @Test (priority=2 , enabled=false)
    public void testSortByTopSeller(){
        objHomePage.goToSearchProductPage();
        boolean bl = objSearchPage.checkTopSellerSortBy();
        Assert.assertTrue(bl);
        System.out.println("testSortByTopSeller test passed");
    }
    //T3HOM_SP_TC03 verify LowToHigh link under sort by dropbox
    @Test (priority=3 , enabled=false)
    public void testSortByLowToHigh(){
        objHomePage.goToSearchProductPage();
        boolean bl = objSearchPage.checkLowToHighSortBy();
        Assert.assertTrue(bl);
        System.out.println("testSortByLowToHigh test passed");
    }
    //T3HOM_SP_TC04 verify HighToLow link under sort by dropbox
    @Test (priority=4 , enabled=false)
    public void testSortByHighToLow(){
        objHomePage.goToSearchProductPage();
        boolean bl = objSearchPage.checkHighToLowSortBy();
        Assert.assertTrue(bl);
        System.out.println("testSortByHighToLow test passed");
    }
    //T3HOM_SP_TC05 verify TopRated link under sort by dropbox
    @Test (priority=5 , enabled=false)
    public void testSortByTopRated(){
        objHomePage.goToSearchProductPage();
        boolean bl = objSearchPage.checkTopRatedSortBy();
        Assert.assertTrue(bl);
        System.out.println("testSortByTopRated test passed");
    }
    //T3HOM_SP_TC06 Get items from Sortby drop box
    @Test (priority=6 , enabled=false)
    public void testListSortBy(){
        objHomePage.goToSearchProductPage();
        objSearchPage.getItemsFromSortBy();
        System.out.println("testListSortBy test passed");
    }
    //T3HOM_SP_TC07 verify increment Quantity of the product by clicking increment button
    @Test (priority=7 , enabled=false)
    public void testIncrementQuantityBox(){
        objHomePage.goToSearchProductPage();
        String actual = objSearchPage.verifyIncrementButton();
        String expected = "2";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testIncrementQuantity test passed");
    }
    //T3HOM_SP_TC08 verify decrement Quantity of the product by clicking decrement button
    @Test (priority=8 , enabled=false)
    public void testDecrementQuantityBox(){
        objHomePage.goToSearchProductPage();
        String actual = objSearchPage.verifyDecrementButton();
        String expected = "1";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testIncrementQuantity test passed");
    }
    //T3HOM_SP_TC09 check Price filter under $10 check box
    @Test (priority=9 , enabled=false)
    public void testPriceFilterBox(){
        objHomePage.goToSearchProductPage();
        boolean actual = objSearchPage.verifyPriceFilter();
        Assert.assertEquals(actual, true);
        System.out.println("testPriceFilter test passed");
    }
    //T3HOM_SP_T10 verify Price filter under $10 selection feature
    @Test (priority=10 , enabled=false)
    public void testPriceFilterFeature(){
        objHomePage.goToSearchProductPage();
        String actual = objSearchPage.goToPriceFilter();
        String expected = "Price: $0 - $10";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testPriceFilterFeature test passed"+actual);
    }
    //T3HOM_SP_T11 verify scroll down of a page
    @Test (priority=11 , enabled=true)
    public void testScrollDown(){
        objHomePage.goToSearchProductPage();
        String actual = objSearchPage.checkScrollDown();
        String expected = "Store Directory";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testScrollDown test passed");
    }

}
