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
}