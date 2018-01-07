package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.ProductsPage;
import page_objects.SignInPage;


import java.util.concurrent.TimeUnit;


public class TestHomePage extends CommonAPI {

     @Test (priority = 2, enabled = false )
     public void testProductSearch(){
         HomePage sr = PageFactory.initElements(driver, HomePage.class);
         sr.searchProduct();
     }
     @Test (priority = 1, enabled = false)
     public void testSupplierSearch(){
         HomePage sr = PageFactory.initElements(driver, HomePage.class);
         sr.searchSuppliers();
     }
     @Test (priority = 3, enabled = false)
     public void  testQuotesSearch(){
         HomePage sr = PageFactory.initElements(driver, HomePage.class);
         sr.quotesSearchOption();
     }
     @Test (priority = 4, enabled = false)
     public void sourcingSolutions(){
         HomePage sr = PageFactory.initElements(driver, HomePage.class);
         sr.sourcingSolutions();
     }
    @Test(priority = 5, enabled = false)
    public void signIn() throws InterruptedException {
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.clikSignIn();
        SignInPage sign = PageFactory.initElements(driver, SignInPage.class);
        sign.signIn();
    }
    @Test (priority = 6, enabled = false)
    public void testHompageButtonStatus() {
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.homePageButtonStatus();
    }
    @Test (priority = 7, enabled = false)
    public void testCategories() throws InterruptedException {
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.categories();

        ProductsPage productsPage = PageFactory.initElements(driver, ProductsPage.class);
        productsPage.toolsSearch();
    }
    @Test( priority = 8, enabled = false)
    public void testOptionsOfCategories(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.categories();
       // sr.getListOfCategories();
    }
    // verify logo displayed on homepage or not
    @Test (priority = 9, enabled = true)
    public void checkLogoVisibility(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.clickLogo();
    }
    @Test (priority = 10, enabled = false)
    public void orderProtectionButtonStatus(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.orderProtectionButtonStatus();
    }
    @Test (priority = 11, enabled = false)
    public void categoriesList(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.categoriesList();
    }
}
