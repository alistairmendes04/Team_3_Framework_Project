package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {

    @FindBy(name = "SearchText")
    public static WebElement searchBox;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
    public static WebElement productSearchOption;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
    public static WebElement suppliersSearchOption;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[2]")
    public static WebElement quotesSearchOptin;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]//input[4]")
    public static WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[1]/span")
    public static WebElement sourcingSolutions;

    @FindBy(partialLinkText = "Top Selected")
    public static WebElement topSelectedSuppliers;

    @FindBy(partialLinkText = "Sign")
    public static WebElement signInButton;

    @FindBy(partialLinkText = "Get the App")
    public static WebElement getTheAppLink;

    @FindBy(partialLinkText = "One Request")
    public static WebElement oneRequestButton;

    @FindBy(partialLinkText = "Favorites")
    public static WebElement favoriteLink;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3")
    public static WebElement categories;

    @FindBy(partialLinkText = "Machinery")
    private WebElement machinery;

    @FindBy(partialLinkText = "Hand Tools")
    private WebElement handTools;

    @FindBy(xpath = "//a[@class='more' and @href='javascript:;']")
    private WebElement seeMore;

    public void searchProduct() {
        String url = driver.getCurrentUrl();
        org.testng.Assert.assertEquals(url, "https://www.alibaba.com/");
        // search by product search option
        searchBox.sendKeys("I phone", Keys.ENTER);
        System.out.println("Get Product Search Page Title: " + driver.getTitle());
    }

    public void searchSuppliers() {
        productSearchOption.click();
        suppliersSearchOption.click();
        searchBox.sendKeys("laptop i7");
        searchButton.click();
        System.out.println("Suppliers Search Page Titel: " + driver.getTitle());

    }

    public void quotesSearchOption() {
        productSearchOption.click();
        quotesSearchOptin.click();
        searchBox.sendKeys("laptop bag");
        System.out.println("Quotes page Title: " + driver.getTitle());
    }

    public void sourcingSolutions() {
        //hover Sourcing Solutions
        Actions act = new Actions(driver);
        act.moveToElement(sourcingSolutions).build().perform();
        // clcik top selected suppliers
        boolean bl = topSelectedSuppliers.isEnabled();
       // boolean bl = isEnableStatus(driver,topSelectedSuppliers);
        System.out.println("Top Selected Suppliers link status: " + bl);
        System.out.println(topSelectedSuppliers.getText());
        topSelectedSuppliers.click();
        System.out.println("Page titel for Sourcing Solutions: " + driver.getTitle());
    }

    public void clikSignIn() {
        signInButton.click();
        //continue in Sign In Page
    }

    public void homePageButtonStatus() {
        System.out.println("Get The App link status: " + getTheAppLink.isEnabled());
        System.out.println("'One Request' link status: " + oneRequestButton.isEnabled());
        System.out.println("favorite link status: " + favoriteLink.isEnabled());

    }

    public void categories() {
        //hover over Categories
        Actions act = new Actions(driver);
        act.moveToElement(categories).moveToElement(machinery).build().perform();
        handTools.click();


    }

}
