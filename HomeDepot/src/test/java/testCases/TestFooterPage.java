package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.FooterPage;

public class TestFooterPage extends FooterPage {
    FooterPage objFooterPage;

    @BeforeMethod
    public void initializePageObjects() {
        objFooterPage = PageFactory.initElements(driver, FooterPage.class);
    }
    //T3HOM_FP_TC01 verify 'Check Order status'
    @Test( enabled=true)
    public void testCheckOrderLink() {
        boolean actual = objFooterPage.verifyCheckOrderStatus();
        Assert.assertEquals(actual,true);
        System.out.println("testCheckOrderLink test passed");
    }
    //T3HOM_FP_TC02 verify 'Pay Credit card'
    @Test( enabled=true)
    public void testPayCreditCardLink() {
        boolean actual = objFooterPage.verifyPayCreditCard();
        Assert.assertEquals(actual,true);
        System.out.println("testPayCreditCardLink test passed");
    }
    //T3HOM_FP_TC03 verify 'Order Cancellation'
    @Test( enabled=true)
    public void testOrderCancellationLink() {
        boolean actual = objFooterPage.verifyOrderCancellation();
        Assert.assertEquals(actual,true);
        System.out.println("testOrderCancellationLink test passed");
    }
    //T3HOM_FP_TC04 verify 'Returns'
    @Test( enabled=true)
    public void testReturnsLink() {
        boolean actual = objFooterPage.verifyReturns();
        Assert.assertEquals(actual,true);
        System.out.println("testReturnsLink test passed");
    }
    //T3HOM_FP_TC05 verify 'Special & Offers'
    @Test( enabled=true)
    public void testSpecialOffersLink() {
        boolean actual = objFooterPage.verifySpecialOffers();
        Assert.assertEquals(actual,true);
        System.out.println("testSpecialOffersLink test passed");
    }
    //T3HOM_FP_TC06 verify 'DIY Project & Ideas'
    @Test( enabled=true)
    public void testDIYProjectIdeasLink() {
        boolean actual = objFooterPage.verifyDIYProjectIdeas();
        Assert.assertEquals(actual,true);
        System.out.println("testDIYProjectIdeasLink test passed");
    }
    //T3HOM_FP_TC07 verify 'Truck & Tool Rental'
    @Test( enabled=true)
    public void testTruckToolRentalLink() {
        boolean actual = objFooterPage.verifyTruckToolRental();
        Assert.assertEquals(actual,true);
        System.out.println("testTruckToolRentalLink test passed");
    }
    //T3HOM_FP_TC08 verify 'Home Services'
    @Test( enabled=true)
    public void testHomeServicesLink() {
        boolean actual = objFooterPage.verifyHomeServices();
        Assert.assertEquals(actual,true);
        System.out.println("testHomeServicesLink test passed");
    }
    //T3HOM_FP_TC09 verify 'Careers' link
    @Test(enabled=true)
    public void testCareersLink() {
        boolean actual = objFooterPage.verifyCareers();
        Assert.assertEquals(actual,true);
        System.out.println("testCareersLink test passed");
    }
    //T3HOM_FP_TC10 verify 'Corporate Information' link
    @Test( enabled=true)
    public void testCorporateInformationLink() {
        boolean actual = objFooterPage.verifyCorporateInformation();
        Assert.assertEquals(actual,true);
        System.out.println("testCorporateInformationLink test passed");
    }
    //T3HOM_FP_TC11 verify 'Digital Newsroom'
    @Test( enabled=true)
    public void testDigitalRoomLink() {
        boolean actual = objFooterPage.verifyDigitalNewsroom();
        Assert.assertEquals(actual,true);
        System.out.println("testDigitalRoomLink test passed");
    }
    //T3HOM_FP_TC12 verify 'Home Depot Foundation' link
    @Test( enabled=true)
    public void testHomeDepotFoundationLink() {
        boolean actual = objFooterPage.verifyHomeDepotFondation();
        Assert.assertEquals(actual,true);
        System.out.println("testHomeDepotFoundationLink test passed");
    }
    //T3HOM_FP_TC12 verify 'Home Depot Foundation' link
    @Test( enabled=true)
    public void testGoToHomeDepotCanadaLinks() {
        String actual = objFooterPage.goToHomeDepotCanada();
        String expected = "VICTORIA DOWNTOWN";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testGoToHomeDepotCanadaLinks test passed");
    }
    //T3HOM_FP_TC14 verify FooterEmail function
    @Test( enabled=true)
    public void testFooterEmail() {
        String actual = objFooterPage.enterFooterEmail();
        String expected = "Thank you for signing up.";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testFooterEmail test passed "+actual );
    }
    //T3HOM_FP_TC15 verify Facebook link and return back to Home Depot page
    @Test( enabled=true)
    public void testFaceBookLink() {
        String actual = objFooterPage.verifyFacebookLink();
        String expected = "https://www.facebook.com/homedepot";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testFaceBookLink test passed");
    }
    //T3HOM_FP_TC16 verify Youtube link
    @Test( enabled=true)
    public void testYoutubeLink() {
        String actual = objFooterPage.verifyYoutubeLink();
        String expected = "The Home Depot - YouTube - YouTube";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testYoutubeLink test passed");
    }
    //T3HOM_FP_TC17 verify Mobile Apps link
    @Test(enabled=true)
    public void testMobileAppsLink() {
        String actual = objFooterPage.verifyMobileAppLink();
        String expected = "Home Depot Mobile";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testMobileAppsLink test passed");
    }
    //T3HOM_FP_TC18 verify Pinterest link
    @Test( enabled=false)
    public void testPinterestLink() {
        String actual = objFooterPage.verifyPinterestLink();
        String expected = "The Home Depot (homedepot) on Pinterest";
        Assert.assertTrue(actual.contains(expected));
        System.out.println("testPinterestLink test passed");
    }
}