package testSportsPageObjects;

import homePageObjects.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sportsPageObjects.SportsPage;

public class testSportsPage extends SportsPage {
    HomePage objHomePage;
    SportsPage objSportsPage;

    @BeforeMethod
    public void initializePageObjects() {
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objSportsPage = PageFactory.initElements(driver, SportsPage.class);
    }
    //T3TWI_SP_TC01 verify First Sports video if it is displayed
    //@Test
    public void testFirstSportsImage(){
        objHomePage.goToSportsPage();
        objSportsPage.verifyFirstSportsImage();
        System.out.println("testFirstSportsImage test passed");
    }
    //T3TWI_SP_TC02 Play first video for few seconds and stop the video
   // @Test
    public void testFirstVideo(){
        objHomePage.goToSportsPage();
        objSportsPage.playFirstVideo();
        System.out.println("testFirstVideo");
    }
    //T3TWI_SP_TC03 verify Reply Link
    @Test
    public void testReplyLink(){
        objHomePage.goToSportsPage();
        objSportsPage.verifyReplylink();
        System.out.println("testReplyLink");
    }
}
