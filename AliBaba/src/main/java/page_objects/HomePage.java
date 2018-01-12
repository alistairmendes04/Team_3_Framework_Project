package page_objects;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

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
    @FindBy(xpath = "//div/a[text()='Alibaba.com']")
    private WebElement logo;
    @FindBy(xpath = "//a[@data-val='ordericon']")
    private WebElement orderProtectionButton;
    //After sign under MyAccount this location shall be available
    @FindBy(css = ".sc-hd-ms-name")
    public static WebElement greetingsToAccountHolder;
    @FindBy(partialLinkText = "My Alibaba")
    public static WebElement myAlibaba;
    @FindBy (css = ".J-search-text")
    public static WebElement emailBoxToSubscribeForTradeAlert;
    @FindBy (css = ".J-btn-search")
    public static WebElement tradeAlertSubscriptionButton;
    //Footer
    @FindBy (xpath = "//*[@id=\"ui-footer\"]//div[1]/dl/dd[1]/a")
    public static WebElement helpCenterLink;
    @FindBy (xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div[1]/a")
    public static WebElement verificationPointHelpCenter;
    @FindBy (xpath = "//dd/a[contains (text(), 'About Alibaba.com')]")
    public static WebElement aboutAlibabaLink;
    @FindBy (xpath = "//h2[contains (text(), 'About Alibaba.com')]")
    public static WebElement verificationPointAboutAlibaba;
    @FindBy (xpath = "//dd/a[contains (text(),'Wholesaler Market')]")
    public static WebElement wholesalerMarket;
    @FindBy (linkText = "Wholesaler Market")
    public static WebElement vaerificationPointAWholesaleMarket;


    //T3ALI_HP_TC01 Verify Home Page URL
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

    //T3ALI_SI_TC02, T3ALI_SI_TC01
    public void clikSignIn() throws InterruptedException {
       // waitUntilClickAble(signInButton);
       try{ signInButton.click();}
       catch (TimeoutException e){
           e.getLocalizedMessage();
       }
    }

    //T3ALI_SI_TC13, Get Account Holder Name from My Alibaba
    public String hoverOverMyAccount() {
        driver.navigate();
        Actions act = new Actions(driver);
        act.moveToElement(myAlibaba).build().perform();
        String actuaMessage = greetingsToAccountHolder.getText();
        return actuaMessage;
    }

    public void homePageButtonStatus() {
        System.out.println("Get The App link status: " + getTheAppLink.isEnabled());
        System.out.println("'One Request' link status: " + oneRequestButton.isEnabled());
        System.out.println("favorite link status: " + favoriteLink.isEnabled());
    }

    public void categories() {
        //hover over Categories. Hover in multiple windows.
        Actions act = new Actions(driver);
        act.moveToElement(categories).moveToElement(machinery).build().perform();
        handTools.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
    }

    public void clickLogo() {
        boolean displayed = logo.isDisplayed();
        org.testng.Assert.assertEquals(displayed, true);
        boolean enabled = logo.isEnabled();
        Assert.assertEquals(enabled, true);
    }

    public void orderProtectionButtonStatus() {
        boolean displayed = orderProtectionButton.isDisplayed();
        org.testng.Assert.assertEquals(displayed, true);
        boolean enabled = orderProtectionButton.isEnabled();
        Assert.assertEquals(enabled, true);
    }

    public void categoriesList() {
        //getTextFromWebElements("//div[class=\"component-list\"]");
        List<String> sortByOptions = new ArrayList<>();
        List<WebElement> option = driver.findElements(By.xpath("//ul[@class='component-list']"));
        for (WebElement we : option) {
            sortByOptions.add(we.getText());
        }
        for (String st : sortByOptions) {
            System.out.println(st);
        }

    }
    //T3ALI_HP_TC10 Trade Alert Subscription
    public String tradeAlertSubscription() throws InterruptedException {
        emailBoxToSubscribeForTradeAlert.sendKeys("testdata.islam@gmail.com");
        tradeAlertSubscriptionButton.click();
        sleepFor(5);
       String currentUrl = driver.getCurrentUrl();
       return currentUrl;
    }
    //T3ALI_HP_TC11 Help Center Link Status
    public String helpCenterLinkStatus() throws InterruptedException {
        helpCenterLink.click();
        for(String handle : driver.getWindowHandles()){
            driver.switchTo().window(handle);
        }
       sleepFor(5);
        String text = verificationPointHelpCenter.getText();
        return text ;
    }
    //T3ALI_HP_TC12 About ALibaba.com Link Status
    public String aboutAlibabaLinkStatus() throws InterruptedException {
        aboutAlibabaLink.click();
        switchWindow(driver);
        sleepFor(5);
        String text = verificationPointAboutAlibaba.getText();
        return text ;
    }
    //T3ALI_HP_TC13 About Wholesale Market Link Status
    public String wholesaleMarketLinkStatus() throws InterruptedException {
        wholesalerMarket.click();
        sleepFor(5);
        switchWindow(driver);
        sleepFor(5);
        String text = vaerificationPointAWholesaleMarket.getText();
        return text;
    }
}
