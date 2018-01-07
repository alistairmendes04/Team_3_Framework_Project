package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductsPage extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Gold Supplier')][1]")
    private WebElement goldSuppliers;

    @FindBy(xpath = "//a[@class='more' and @href='javascript:;']")
    private WebElement seeMore;

   /* @FindBy (partialLinkText = "Wrench ")
    private WebElement wrench;*/

    @FindBy(partialLinkText = "Leather crafting Tools ")
    private WebElement leatherCraftingTools;

    @FindBy(xpath = "//span[text()='Free samples']")
    private WebElement freeSamples;

    @FindBy(xpath = "//input[@id=\"J-domdot-refine-moqt\"]")
    private WebElement minOrder;

    @FindBy(css = "//a[text()='cutting knife leather crafting tools']")
    private WebElement selectCuttingKnife;

    @FindBy(xpath = "//a[@title='Click to send an inquiry']")
    private WebElement contactSupplier;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    private WebElement messageBox;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"inquiry-body\"]//div[5]/div[4]/div/input")
    private WebElement inquiryBody;

    public void toolsSearch() throws InterruptedException {

        System.out.println("Hand Tools Page Title: " + driver.getTitle());
        // Filter product
        waitUntilClickAble(seeMore);
        seeMore.click();
        waitUntilClickAble(leatherCraftingTools);
        leatherCraftingTools.click();
       waitUntilClickAble(freeSamples);
        freeSamples.click();
        /*minOrder.sendKeys("10", Keys.ENTER);
        waitUntilClickAble(asia);
        asia.click();*/

        selectCuttingKnife.click();

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        waitUntilClickAble(contactSupplier);
        contactSupplier.click();

            /* messageBox.sendKeys("Red 4pcs, Blue 6 pcs ");
            email.sendKeys("testdata@gmail.cm");
            inquiryBody.click();*/



    }
}
