package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.LoginPage;
import page_objects.PersonalPage;

public class TestPersonalPage extends CommonAPI {

    @Test
    public void loginButton() {
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.clickLoginButton();
        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        lp.enterCredintials();
    }
   /* @Test(enabled = false)
    public void findAdoctor(){
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.clickFindDoctor();
    }
    @Test
    public void search(){
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.searchBar();
    }
    @Test
    public void indivisualFamilyPlanButtonStatus() {
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        pg.individualFamilyPlan();
    }
    @Test
    public void cignamedicareButtonStatus(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.cignaMedicare();
    }
    @Test
    public void InternationalIndividualPlanButtonStatus(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.internationalIndividualPlan();
    }
    @Test
    public void offerCignaThroughWork(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.offerCignaThroWork();
    }
    @Test
    public void healthandWellness(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.healthNWellness();
    }
    @Test
    public void mainPageCignaLogo(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.mLogo();
    }
    @Test
    public void blueBoxtexts(){
        PersonalPage pg= PageFactory.initElements(driver, PersonalPage.class);
        pg.youSmileWeSmile();
    }*/
}
