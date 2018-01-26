package homePageObjects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI{
    @FindBy(className = "StreamsHero-image")
    public static WebElement heroImage;
    @FindBy(tagName = "a")
    public List<WebElement> anchorTag = new ArrayList<>();
    @FindBy(xpath = "//div[@id='doc']/div[1]/div/div[2]//a[1]/span")
    public static WebElement featured;
    @FindBy(xpath = "//div[@id='doc']/div[1]//div[2]/div/a[2]")
    public static WebElement sports;
    @FindBy(xpath = "//div[@id='doc']/div[1]//div[2]/div/a[3]")
    public static WebElement news;
    @FindBy(xpath = "//div[@id='timeline']/div[2]/div[1]/div[1]/a")
    public static WebElement imageLink;
    @FindBy(xpath = "//div[@id='doc']/div[1]//div[2]//div[2]/span")
    public static WebElement moreDropBox;
    @FindBy(xpath = "//a[text()='Log in']")
    public static WebElement login;

    //T3TWI_HP_TC01 get HeroImage text
    public static String getHeroImageTest(){
        String str = heroImage.getText();
        System.out.println("Image text: "+str);
        return str;
    }
    //T3TWI_HP_TC02 Get list of links in Home page(anchor tags)
    public void findNumberOfLinks() {
        System.out.println(anchorTag.size());
        implicitWait(driver, 5);
        List<String> actualLinks = new ArrayList<>();
        for (int i = 0; i < anchorTag.size(); i = i + 1) {
            implicitWait(driver, 5);
           // System.out.println(anchorTag.get(i).getText());
            if (anchorTag.get(i).getText() != null && anchorTag.get(i).getText().length() > 0){
                actualLinks.add(anchorTag.get(i).getText());
            }
        }
        for (String link:actualLinks){
            System.out.println("Link text: " + link);
        }
    }
    //T3TWI_HP_TC03 verify Sports link
    public static boolean verifySportsLink(){
        Boolean bl = sports.isDisplayed();
        return bl;
    }
    //T3TWI_HP_TC04 verify News link
    public static boolean verifyNewsLink(){
        Boolean bl = news.isDisplayed();
        return bl;
    }
    //Go to Sports page
    public void goToSportsPage() {
        sports.click();
    }
    //T3TWI_HP_TC05 Get items from Sortby drop box
    public void getDropBoxList(){
        moreDropBox.click();
        List<String> moreDropBox = new ArrayList<>();
        List<WebElement> more = driver.findElements(By.className("StreamsCategoryBar-dropdownMenuContent"));
        for (WebElement we : more) {
            moreDropBox.add(we.getText());
        }
        int i=0;
        for (String st: moreDropBox){
            System.out.println(st);
            i++;
        }
        System.out.println("Total number of items in SortBy drop box with size(): "+i+ " and "+moreDropBox.size());
    }
    //Go to LogIn
    public void goToLoginPage() {
        login.click();
    }
}
