package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalPage extends CommonAPI{

    @FindBy(id = "login")
    public static WebElement loginButton;

    @FindBy(id = "find-doc")
    public static WebElement findDoctor;

    @FindBy(xpath = ".//*[@id='csng-search-header']/search-header-bar/form/cigna-typeahead/div/input")
    public static WebElement search;

    @FindBy(xpath=".//*[@id='1386067114266']/div[4]/div/div[2]/nav/ul/li[1]/a")
    public static WebElement indFamPlan;

    @FindBy(css = ".mainNav")
    public static WebElement cMedicare;

    @FindBy(css = ".mainNav.two-lines")
    public static WebElement intIndPlan;

    @FindBy(css = ".mainNav.two-lines")
    public static WebElement offeredCigThroughW;

    @FindBy(css = ".mainNav")
    public static WebElement healthWellness;

    @FindBy(css = ".navbar-brand")
    public static WebElement logo;

    @FindBy(css = ".cigna-color-white")
    public static WebElement youSmileWeSmile;

    public static void clickLoginButton() {
        //click login button
        loginButton.click();
    }
    public static void clickFindDoctor() {
        //Find a Doctor
        findDoctor.click();
    }
    public static void searchBar(){
        //click and search
        search.sendKeys("location", Keys.ENTER);
    }

    public static void individualFamilyPlan(){
      boolean ind = indFamPlan.isEnabled();
        System.out.println("Individual Family Plan Link Status: " + ind);
    }
    public static void cignaMedicare(){
        boolean cMed = cMedicare.isEnabled();
        System.out.println("Cigna Medicare Link Status: " + cMed);
    }
    public static void internationalIndividualPlan(){
        boolean iip = intIndPlan.isEnabled();
        System.out.println("International Individual Plan Link Status: " + iip);
    }
    public static void offerCignaThroWork(){
        boolean octw = offeredCigThroughW.isEnabled();
        System.out.println("Offered Cigna Through Work: " + octw);
    }
    public static void healthNWellness(){
        boolean hnw= healthWellness.isEnabled();
        System.out.println("Health and Wellness: " + hnw);
    }
    public static void mLogo(){
        boolean ml= logo.isDisplayed();
        System.out.println("Cigna Logo is dislpayed: " + ml);
    }
    public static void youSmileWeSmile(){
        boolean ysws= youSmileWeSmile.isDisplayed();
        System.out.println("You Smile We Smile text is displayed: " + ysws);
    }


}