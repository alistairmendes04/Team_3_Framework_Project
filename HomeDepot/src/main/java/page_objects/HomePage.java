package page_objects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(id = "headerSearchButton")
    public static WebElement searchBoxButton;
    @FindBy(id = "headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//a[text()='All Departments']")
    public static WebElement allDepartmentTab;
    @FindBy(xpath = "//*[@id='container']/div[1]/div[2]/div/div[4]//li[2]/a")
    public static WebElement shopRoomTab;
    @FindBy(xpath = "//*[@id='container']/div[1]/div[2]/div/div[4]//li[3]/a")
    public static WebElement diyProjectTab;
    @FindBy(xpath = "//*[@id='container']/div[1]/div[2]/div/div[4]//li[4]/a")
    public static WebElement homeServicesTab;
    @FindBy(xpath = "//*[@id='container']/div[1]//div[4]/div//li[5]/a")
    public static WebElement specialOfferTab;
    @FindBy(xpath = "//*[@id='container']/div[1]//div[4]//li[6]/a")
    public static WebElement localAdTab;
    @FindBy(xpath="//div[@id='allDepartmentsFlyout']/section[1]//li[1]/a")
    public static WebElement appliancesLink;
    @FindBy(xpath = "//a[text()='Christmas Decorations']")
    public static WebElement christDecTab;
    @FindBy(xpath = "//*[@id=\"roomFlyout\"]/section/div[1]/div/div[1]/div/div/a/img")
    public static WebElement bathroomImgLink;
    @FindBy(xpath = "//span[text()='Bathroom']")
    public static WebElement bathroomTextLink;
    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/div[1]/div//a/img")
    public static WebElement heroImage;
    @FindBy(xpath = "//div[text()='My Account']")
    public static WebElement myAcctButton;
    @FindBy(xpath = "//*[@id=\'authSignIn\']/a/span")
    public static WebElement signinLink;
    @FindBy(id = "email_id")
    public static WebElement emailBox;

    //T3HOM_HP_TC01 check if the search button is displayed
    public static boolean isSearchButtonDisplay() {
        boolean disp = searchBoxButton.isDisplayed();
        return disp;
    }
    //T3HOM_HP_TC02 Go to Appliance link in All departments tab and get title of the page
    public static String goToAppliances(){
        allDepartmentTab.click();
        implicitWait(driver, 30);
        appliancesLink.click();
        String str = driver.getTitle();
        return str;
    }
    //T3HOM_HP_TC03 hover over All Department tab and click 1st item and navigate back to home page
    public static String returnBackAllDept() {
        allDepartmentTab.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        appliancesLink.click();
        System.out.println("Title of the page: " + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println("Title of the page: " + title);
        return title;
    }
    //T3HOM_HP_TC04, T3HOM_HP_TC06 Go to Bathroom image link under Shop Room tab and get title of the page
    public static String goToBathroomUsingImg() {
        shopRoomTab.click();
        implicitWait(driver, 35);
        bathroomImgLink.click();
        implicitWait(driver, 35);
        String imgLinkTitle = driver.getTitle();
        return imgLinkTitle;
    }
    //T3HOM_HP_TC05, T3HOM_HP_TC06 Go to Bathroom text link under Shop Room tab and get title of the page
    public static String goToBathroomUsingTxt() {
        shopRoomTab.click();
        implicitWait(driver, 35);
        bathroomTextLink.click();
        implicitWait(driver, 30);
        String textLinkTitle = driver.getTitle();
        return textLinkTitle;
    }
    //T3HOM_HP_TC07 capture the text of hero image
    public static String captureTextHeroImage() {
        String text = heroImage.getAttribute("title");
        return text;
    }
    //T3HOM_SR_TC01, T3HOM_SR_TC02, T3HOM_SR_TC03, T3HOM_SR_TC04, T3HOM_SR_TC05, T3HOM_SR_TC06,
    // T3HOM_SR_TC07, T3HOM_SR_TC08, T3HOM_SR_TC09, T3HOM_SR_TC10 shows Search product- 'floor tiles'
    public static void goToSearchProductPage() {

        searchBox.sendKeys("floor tiles", Keys.ENTER);
    }
    //Go to Login Page
    public static void goToLoginPage() {
        myAcctButton.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(signinLink));
        signinLink.click();
         }
}

