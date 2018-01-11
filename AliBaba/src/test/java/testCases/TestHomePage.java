package testCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.HomePage;
import page_objects.ProductsPage;
import page_objects.SignInPage;

public class TestHomePage extends HomePage {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    ProductsPage objOfProductsPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objOfProductsPage = PageFactory.initElements(driver, ProductsPage.class);
    }

  // T3ALI_HP_TC01 Verify Home Page URL
    @Test(priority = 1, enabled = true)
    public void testProductSearch() {
        objOfHomePage.searchProduct();
    }

    //T3ALI_HP_TC02 Verify Search Options
    @Test(priority = 2, enabled = true)
    public void testSupplierSearch() {
        objOfHomePage.searchSuppliers();
    }

    //T3ALI_HP_TC03 Verify Search by Quote Option
    @Test(priority = 3, enabled = true)
    public void testQuotesSearch() {
        objOfHomePage.quotesSearchOption();
    }

    //T3ALI_HP_TC04 Verify by Sourcing Solutions
    @Test(priority = 4, enabled = true)
    public void sourcingSolutions() {
        objOfHomePage.sourcingSolutions();
    }

    //T3ALI_HP_TC05 Verify by Home Page Links Status
    @Test(priority = 6, enabled = true)
    public void testHompageButtonStatus() {
        objOfHomePage.homePageButtonStatus();
    }

    ////T3ALI_HP_TC06 Verify Options Of Categories
    @Test(priority = 8, enabled = true)
    public void testOptionsOfCategories() {
        objOfHomePage.categories();
    }

    // T3ALI_HP_TC07 verify logo displayed on homepage or not
    @Test(priority = 9, enabled = true)
    public void checkLogoVisibility() {
        objOfHomePage.clickLogo();
    }

    // T3ALI_HP_TC08 Verify Order Protection Link
    @Test(priority = 10, enabled = true)
    public void orderProtectionButtonStatus() {
        objOfHomePage.orderProtectionButtonStatus();
    }

    // T3ALI_HP_TC09
    @Test(priority = 11, enabled = true)
    public void categoriesList() {
        objOfHomePage.categoriesList();
    }

    //T3ALI_HP_TC10 Verify Trade Alert Subscription is functional
    @Test (enabled = true)
    public void testTradeAlertSubscriptionFunction() throws InterruptedException {
        String actual = objOfHomePage.tradeAlertSubscription();
        String expected = "https://login.alibaba.com";
        Assert.assertTrue(actual.contains(expected));
    }
    //T3ALI_HP_TC11 Help Center Link Status
    @Test (enabled = true)
    public void testHelpCenterLinkStatus() throws InterruptedException {
        String actual = objOfHomePage.helpCenterLinkStatus();
        String expected = "Help Center";
        Assert.assertTrue(actual.contains(expected));
    }
    //T3ALI_HP_TC12 About Alibaba Link Status
    @Test (enabled = true)
    public void testAboutAlibabaLinkStatus() throws InterruptedException {
        String actual = objOfHomePage.aboutAlibabaLinkStatus();
        String expected = "About Alibaba.com";
        Assert.assertTrue(actual.contains(expected));
    }
    //T3ALI_HP_TC13 About Wholesale Market Link Status
    @Test(enabled = true)
    public void testWholesaleMarketLinkStatus() throws InterruptedException {
        String actual = objOfHomePage.wholesaleMarketLinkStatus();
        String expected = "Wholesaler Market";
        Assert.assertTrue(actual.contains(expected));
    }
}