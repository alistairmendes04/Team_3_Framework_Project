package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.GetHelpHerePage;
import page_objects.HomePage;
import page_objects.ProductsPage;
import page_objects.SignInPage;

public class TestGetHelpHerePage extends GetHelpHerePage {
    HomePage objOfHomePage;
    SignInPage objOfSignInPage;
    ProductsPage objOfProductsPage;
    GetHelpHerePage objGetHelpHerePage;
    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePage.class);
        objOfSignInPage = PageFactory.initElements(driver, SignInPage.class);
        objGetHelpHerePage = PageFactory.initElements(driver, GetHelpHerePage.class);
    }

    //T3ALI_TC_01 Verify User able to send message to Anna
    @Test(enabled = true)
    public void messageToAnna() {
        try {
            objOfHomePage.clikSignIn();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        objOfSignInPage.getHlepHere();
        switchWindow(driver);
        objGetHelpHerePage.sendTextToAnna();
    }

}