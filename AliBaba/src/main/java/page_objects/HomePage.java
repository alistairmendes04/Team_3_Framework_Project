package page_objects;

import base.CommonAPI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {

    @FindBy(name = "SearchText")
    public static WebElement searchBox;

    @FindBy (xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
    public static WebElement productSearchOption;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[1]")
    public static WebElement suppliersSearchOption;

    @FindBy (xpath = "//div[@id=\"J_SC_header\"]//form/div[1]/div/div/span[2]")
    public static WebElement quotesSearchOptin;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]//input[4]")
    public static WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[1]/div[3]/ul/li[1]/span")
    public static WebElement sourcingSolutions;

    @FindBy(partialLinkText = "Top Selected")
    public static WebElement topSelectedSuppliers;



    public void searchProduct() {
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
    public void  quotesSearchOption(){
        productSearchOption.click();
        quotesSearchOptin.click();
        searchBox.sendKeys("laptop bag");
        System.out.println("Quotes page Title: " + driver.getTitle());
    }

    public void sourcingSolutions() {
        //click Sourcing Solutions
        //sourcingSolutions.click();

        Actions act = new Actions(driver);
        act.moveToElement(sourcingSolutions).build().perform();
        topSelectedSuppliers.click();
        System.out.println("Page titel for Sourcing Solutions: " + driver.getTitle());
    }


}
