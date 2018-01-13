package testCases;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.AddToCart;
import page_objects.HomePage;
import page_objects.SearchProductPage;

public class TestAddToCartPage extends AddToCart{
    HomePage objHomePage;
    SearchProductPage objSearchPage;
    AddToCart objAddToCartPage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSearchPage = PageFactory.initElements(driver, SearchProductPage.class);
        objAddToCartPage = PageFactory.initElements(driver, AddToCart.class);
    }
    //T3HOM_AP_TC01 verify CheckOut Now
    @Test(priority=1, enabled=false)
    public void testCheckOut(){
        objHomePage.goToSearchProductPage();
        objSearchPage.goToCart();
        String actual = objAddToCartPage.clickCheckOutButton();
        System.out.println(actual);
    }
}
