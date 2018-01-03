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
        //pg.clickFindDoctor();
        //pg.searchBar();
    }

    @Test
    public void indivisualFamilyPlanButtonStatus() {
        PersonalPage pg = PageFactory.initElements(driver, PersonalPage.class);
        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        //lp.enterCredintials();


    }

}
