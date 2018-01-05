package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Gold Supplier')][1]")
    private WebElement goldSuppliers;

    @FindBy(xpath = "//a[@class='more' and @href='javascript:;']")
    private WebElement seeMore;

   /* @FindBy (partialLinkText = "Wrench ")
    private WebElement wrench;*/

    @FindBy(partialLinkText = "Leather crafting Tools ")
    private WebElement leatherCraftingTools;

    @FindBy (xpath = "//span[text()='Free samples']")
    private WebElement freeSamples;

    @FindBy (xpath = "//span[(text()='Asia ')][1]")
    private WebElement asia;

    @FindBy (xpath = "//input[@id=\"J-domdot-refine-moqt\"]")
    private WebElement minOrder;

    @FindBy (xpath = "//div[1]/div/div[2]/div[3]/a[1]")
    private WebElement contactSupplier;

    @FindBy (xpath = "//*[@id=\"tinymce\"]")
    private WebElement messageBox;

    @FindBy (name = "email")
    private WebElement email;

    @FindBy (xpath = "//*[@id=\"inquiry-body\"]//div[5]/div[4]/div/input")
    private  WebElement inquiryBody;

    public void toolsSearch() throws InterruptedException {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        System.out.println("Hand Tools Page Title: " + driver.getTitle());
        seeMore.click();
        leatherCraftingTools.click();
        freeSamples.click();

      /* minOrder.sendKeys("10", Keys.ENTER);
        contactSupplier.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
           *//* messageBox.sendKeys("Red 4pcs, Blue 6 pcs ");
            email.sendKeys("testdata@gmail.cm");
            inquiryBody.click();*//*

        }*/

    }
}
