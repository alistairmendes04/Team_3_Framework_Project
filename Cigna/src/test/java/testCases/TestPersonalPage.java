package testCases;

import base.CommonAPI;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import page_objects.PersonalPage;

public class TestPersonalPage extends CommonAPI {
    PersonalPage objOfPersonalPage;
    LoginPage objOfLoginPage;

    @BeforeMethod
    public void initilizationOfObject() {
        objOfPersonalPage = PageFactory.initElements(driver, PersonalPage.class);
        objOfLoginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test(priority = 1, enabled = true)
    public void testFindDoctor() {
        objOfPersonalPage.clickFindDoctor();
        //System.out.println("Test case pass: ");
    }
    @Test(priority = 2, enabled = true)
    public void testIndividualFamilyPlan() {
        objOfPersonalPage.individualFamilyPlan();
    }
    @Test(priority = 3, enabled = true)
    public void testSearchBar() {
        objOfPersonalPage.searchBar();
    }
    @Test(priority = 4, enabled = true)
    public void testCignaMedicare() {
        objOfPersonalPage.cignaMedicare();
    }
    @Test(priority = 5, enabled = true)
    public void testInternationalIndividualPlan() {
        objOfPersonalPage.internationalIndividualPlan();
    }
    @Test(priority = 6, enabled = true)
    public void testOfferCignaThroughWork() {
        objOfPersonalPage.offerCignaThroWork();
    }
    @Test(priority = 7, enabled = true)
    public void testHealthWellness() {
        objOfPersonalPage.healthNWellness();
    }
    @Test(priority = 8, enabled = true)
    public void testMainLogo() {
        objOfPersonalPage.mLogo();
    }
    @Test(priority = 9, enabled = true)
    public void testMoreInformation() {
        objOfPersonalPage.moreI();
    }
    @Test(priority = 10, enabled = true)
    public void testViewDetails() {
        objOfPersonalPage.viewDet();
    }
    @Test(priority = 11, enabled = true)
    public void testSeeVideo() {
        objOfPersonalPage.seeV();
    }
    @Test(priority = 12, enabled = true)
    public void testHearWhatYouNeed() {
        objOfPersonalPage.hearWhatYouNeed();
    }
    @Test(priority = 13, enabled = true)
    public void testDownloadAPP() {
        objOfPersonalPage.downloadApps();
    }
    @Test(priority = 14, enabled = true)
    public void testListenNow() {
        objOfPersonalPage.listenN();
    }
    @Test(priority = 15, enabled = true)
    public void testReadMore() {
        objOfPersonalPage.readMore();
    }
    @Test(priority = 16, enabled = true)
    public void testNews() {
        objOfPersonalPage.newsL();
    }
    @Test(priority = 17, enabled = true)
    public void testInvestors() {
        objOfPersonalPage.investorsL();
    }
    @Test(priority = 18, enabled = true)
    public void testCoperate() {
        objOfPersonalPage.coperateL();
    }
    @Test(priority = 19, enabled = true)
    public void testFindADoctor() {
        objOfPersonalPage.findADoctorL();
    }
    @Test(priority = 20, enabled = true)
    public void testInformedOnReport() {
        objOfPersonalPage.informedOnReportL();
    }
    @Test(priority = 21, enabled = true)
    public void testMopileApp() {
        objOfPersonalPage.mobileApp();
    }
    @Test(priority = 22, enabled = true)
    public void testContactAs() {
        objOfPersonalPage.contactAsLink();
    }
    @Test(priority = 23, enabled = true)
    public void testFeedback() {
        objOfPersonalPage.feedbackL();
    }
    @Test(priority = 24, enabled = true)
    public void testLinkedin() {
        objOfPersonalPage.linkedin();
    }
    @Test(priority = 25, enabled = true)
    public void testFacebook() {
        objOfPersonalPage.facebookLink();
    }
    @Test(priority = 26, enabled = true)
    public void testTwitter() {
        objOfPersonalPage.twitterL();
    }
    @Test(priority = 27, enabled = true)
    public void testYoutube() {
        objOfPersonalPage.youtubeL();
    }
    @Test(priority = 28, enabled = true)
    public void testGoogle() {
        objOfPersonalPage.googleLink();
    }
    @Test(priority = 29, enabled = true)
    public void testPinIntrest() {
        objOfPersonalPage.pinintrestLink();
    }
    @Test(priority = 30, enabled = true)
    public void testWeibo() {
        objOfPersonalPage.weiboLink();
    }
    @Test(priority = 31, enabled = true)
    public void testInstragram() {
        objOfPersonalPage.instagramL();
    }
    @Test(priority = 32, enabled = true)
    public void testViewAll() {
        objOfPersonalPage.viewAllLink();
    }
    @Test(priority = 33, enabled = true)
    public void testNorton() {
        objOfPersonalPage.nortonLink();
    }
    @Test(priority = 34, enabled = true)
    public void testFeedbackSideLink() {
        objOfPersonalPage.feedbackSideLink();
    }
    @Test(priority = 35, enabled = true)
    public void testSign() {
        objOfPersonalPage.sign();
    }
}