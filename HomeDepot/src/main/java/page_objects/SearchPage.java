package page_objects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\'products\']/div/div[1]/div/div[10]/div/a/span")
    public static WebElement addToCart;
    @FindBy(className = "drop-down__title")
    public static WebElement sortByButton;

    public static void goToCart(){
        //Click add to cart and continue with the next page
        addToCart.click();
        System.out.println("Page title of search phone: "+driver.getTitle());
    }


    public static void selectSortBy(){
        Select dropBox = new Select(sortByButton);
        dropBox.selectByIndex(1);

        List<WebElement> e = dropBox.getOptions();
        System.out.println(e.size());

    }


}
