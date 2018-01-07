package page_objects;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchProductPage extends CommonAPI {


    @FindBy(xpath = "//div[@class='col__3-12']/nav[1]/span")
    public static WebElement sortByButton;
    @FindBy(xpath = "//*[@id=\'products\']/div/div[1]/div/div[10]/div/a/span")
    public static WebElement addToCart;
    @FindBy(xpath="//*[@id='products']/div/div[1]/div/div[3]/a")
    public static WebElement product;
    @FindBy(xpath = "//div[@id='layout']/div[3]//li[1]/span/label")
    public static WebElement bestMatchLink;
    @FindBy(xpath="//div[@id='layout']/div[3]//li[2]/span/label")
    public static WebElement topSellerLink;
    @FindBy (xpath="//div[@id='layout']/div[3]//li[3]/span/label")
    public static WebElement lowToHighLink;
    @FindBy (xpath="//div[@id='layout']/div[3]//li[4]/span/label")
    public static WebElement highToLowLink;
    @FindBy (xpath="//div[@id='layout']/div[3]//li[5]/span/label")
    public static WebElement topRatedLink;
    @FindBy (xpath="//*[@id='compare205216805']")
    public static WebElement compareButton1;
   @FindBy(xpath="//*[@id='compare204834499']")
    public static WebElement compareButton2;

    //Checking status of BestMatch link under Sort BY dropbox
   /* Tried clicking the drop box by using Select Class but didn't work as this drop box
     doesn't have element type- select instead it has span type thatswhy
     it was throwing the error - UnexpectedTagNameException.*/
    public static void checkBestMatchSortBy() {
        sortByButton.click();
        implicitWait(driver, 40);
        System.out.println("Under SortBy dropbox 'Best match' link is enabled: " + bestMatchLink.isEnabled());
    }

    //Checking status of TopSeller Link under sort By dropbox
    public static void checkTopSellerSortBy(){
        implicitWait(driver,40);
        sortByButton.click();
        System.out.println("Under SortBy dropbox 'Top Seller' link is enabled: "+topSellerLink.isEnabled());
    }

    //Checking status of LowToHigh link under sort by dropbox
    public static void checkLowToHighSortBy() {
        implicitWait(driver, 40);
        sortByButton.click();
        System.out.println("Under SortBy dropbox 'Low to High' link is enabled: " + lowToHighLink.isEnabled());
    }

    //Checking status of HighToLow link under sort by dropbox
    public static void checkHighToLowSortBy() {
        implicitWait(driver, 40);
        sortByButton.click();
        System.out.println("Under SortBy dropbox 'High to Low' link is enabled: " + highToLowLink.isEnabled());
    }

    //Checking status of HighToLow link under sort by dropbox
    public static void checkTopRatedSortBy() {
        implicitWait(driver, 40);
        sortByButton.click();
        System.out.println("Under SortBy dropbox 'Top Rated' link is enabled: " + topRatedLink.isEnabled());
    }

    //Get items from Sortby drop box
    public static void getItemsFromSortBy(){
        sortByButton.click();
        List<String> sortByOptions = new ArrayList<>();
        List<WebElement> option = driver.findElements(By.className("sortby__items"));
        for (WebElement we : option) {
            sortByOptions.add(we.getText());
        }
        for (String st: sortByOptions){
            System.out.println(st);
        }
      System.out.println("Total number of items in SortBy drop box with size(): "+sortByOptions.size());
    }

    //Click on compare button
    public static void checkComparebutton(){

    }


    public static void goToCart(){
        //Click add to cart and continue with the next page
        addToCart.click();
        System.out.println("Page title of search phone: "+driver.getTitle());
    }
}
