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
    @FindBy(partialLinkText = "Leather crafting Tools ")
    private WebElement leatherCraftingTools;
    @FindBy(xpath = "//span[text()='Free samples']")
    private WebElement freeSamples;
    @FindBy(xpath = "//input[@id='J-domdot-refine-moqt']")
    private WebElement minOrder;
    @FindBy(xpath = "//div[2]/div[2]//div[2]/div[2]/div/div/a")
    private WebElement okButton;
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
    @FindBy(xpath = "//span[text()='Asia']")
    private WebElement asiaCheckBox;

    public void toolsSearch() throws InterruptedException {

        System.out.println("Hand Tools Page Title: " + driver.getTitle());
        // Filter product
        waitUntilClickAble(seeMore);
        seeMore.click();
        waitUntilClickAble(leatherCraftingTools);
        leatherCraftingTools.click();
        waitUntilClickAble(freeSamples);
        freeSamples.click();
        waitUntilClickAble(minOrder);
        minOrder.sendKeys("10", Keys.ENTER);
        waitUntilClickAble(okButton);
        okButton.click();
        waitUntilClickAble(asiaCheckBox);
        asiaCheckBox.click();
        waitUntilClickAble(selectCuttingKnife);
        selectCuttingKnife.click();
        switchWindow(driver);
        waitUntilClickAble(contactSupplier);
        contactSupplier.click();
    }
}
