package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import page_objects.PersonalPage;

public class TestPersonalPage extends CommonAPI {

    @Test(enabled=false)
    public void loginButton() {
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.clickLoginButton();
        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        lp.enterCredintials();
    }
    @Test(enabled = false)
    public void personalPageFunctions() {
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.clickFindDoctor();
        pg.navigateBack();
        pg.individualFamilyPlan();
        pg.searchBar();
        pg.navigateBack();
        pg.cignaMedicare();
        pg.internationalIndividualPlan();
        pg.offerCignaThroWork();
        pg.healthNWellness();
        pg.mLogo();
        pg.moreI();
        pg.viewDet();
        pg.seeV();
        pg.hearWhatYouNeed();
        pg.downloadApps();
        pg.listenN();
        pg.readMore();
        pg.newsL();
        pg.investorsL();
        pg.coperateL();
        pg.findADoctorL();
        pg.informedOnRepormL();
        pg.mobileApp();
        pg.contactAsLink();
        pg.feedbackL();
        pg.linkedin();
        pg.facebookLink();
        pg.twitterL();
        pg.youtubeL();
        pg.googleLink();
        pg.pinintrestLink();
        pg.weiboLink();
        pg.instagramL();
        pg.viewAllLink();
        pg.nortonLink();
    }
    @Test
    public void personalPageFunctions1(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.feedbackSideLink();
        pg.goBackToHomeWindow();
        pg.learnMor();
        //pg.navigateBack();
        //pg.sign();
    }
    }