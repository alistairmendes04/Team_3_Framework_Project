package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HomePage extends CommonAPI {
    @FindBy(id="headerSearchButton")
    public static WebElement searchBoxButton;
    @FindBy(id="headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//a[text()='All Departments']")
    public static WebElement allDepartmentTab;
    @FindBy(xpath="//*[@id='container']/div[1]/div[2]/div/div[4]//li[2]/a")
    public static WebElement shopRoomTab;
    @FindBy(xpath="//*[@id='container']/div[1]/div[2]/div/div[4]//li[3]/a")
    public static WebElement diyProjectTab;
    @FindBy(xpath="//*[@id='container']/div[1]/div[2]/div/div[4]//li[4]/a")
    public static WebElement homeServicesTab;
    @FindBy(xpath="//*[@id='container']/div[1]//div[4]/div//li[5]/a")
    public static WebElement specialOfferTab;
    @FindBy(xpath="//*[@id='container']/div[1]//div[4]//li[6]/a")
    public static WebElement localAdTab;

    @FindBy(xpath="//a[text()='Christmas Decorations']")
    public static WebElement christDecTab;

    @FindBy(xpath ="//*[@id=\"roomFlyout\"]/section/div[1]/div/div[1]/div/div/a/img")
    public static WebElement bathroomImgLink;

    @FindBy(xpath ="//span[text()='Bathroom']")
    public static WebElement bathroomTextLink;
    //*[@id="roomFlyout"]/section/div[1]/div/div[1]/div/a/span

    @FindBy(xpath = "//*[@id='container']/div[2]/div[3]/div[1]/div//a/img")
    public static WebElement heroImage;

    @FindBy(xpath="//div[text()='My Account']")
    public static WebElement myAcctButton;

    @FindBy(xpath = "//*[@id='authSignIn']/a/span")
    public static WebElement signinLink;


        //check if the search button is displayed
    public static boolean isSearchButtonDisplay() {
        boolean disp = searchBoxButton.isDisplayed();
        return disp;
    }

    //hover over All Department tab and click 1st item and navigate back to home page
    public static void returnBackAllDept(){
     /*   Actions ac = new Actions(driver);
        ac.moveToElement(allDepartmentTab).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        christDecTab.click();*/
        allDepartmentTab.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        christDecTab.click();
        System.out.println("Title of the page: "+driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Title of the page: "+driver.getTitle());
    }

    //Click on shopeByRoom tab and click image of bathroom and navigate back to home page
    public static String returnbackShopRoomImg(){
        shopRoomTab.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bathroomImgLink.click();
        String imgLinkTitle = driver.getTitle();
        System.out.println("Title of the page: "+imgLinkTitle);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return imgLinkTitle;
    }

    //Click on shopeByRoom tab and click text link of bathroom and navigate back to home page
    public static String returnbackShopRoomTxt(){
        shopRoomTab.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bathroomTextLink.click();
        String textLinkTitle = driver.getTitle();
        System.out.println("Title of the page: "+textLinkTitle);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return textLinkTitle;

    }

    //check if the text link and image link of same item opens same page in Shop by Room tab
    public static void compareImageNTextLink(){
        if(returnbackShopRoomImg().equals(returnbackShopRoomTxt())){
            System.out.println("Both links take to the same page");
        }
    }

    //capture the text of hero image
    public static void captureTextHeroImage(){
        String text = heroImage.getAttribute("title");
            System.out.println("Text of the Hero Image is: "+ text);
        }

  //shows all Search product
    public static void searchProduct(){
        searchBox.sendKeys("i phone", Keys.ENTER);
        System.out.println("Current Title: "+driver.getTitle());
    }

    public static void goToLoginPage(){
        myAcctButton.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        signinLink.click();
      }


}
