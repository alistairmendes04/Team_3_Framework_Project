package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {

    @FindBy(id="headerSearch")
     public static WebElement searchbox;

    @FindBy(xpath = "//*[@id=\'products\']/div/div[1]/div/div[10]/div/a/span")
    public static WebElement addToCart;

    public static void searchProduct() throws InterruptedException {
        searchbox.sendKeys("i phone", Keys.ENTER);
        System.out.println("Current Title: "+driver.getTitle());

        //Click add to cart and continue with the next page
        addToCart.click();

        System.out.println("Page title of search phone: "+driver.getTitle());
        Thread.sleep(2000);
    }



}
