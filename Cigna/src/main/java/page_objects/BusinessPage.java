package page_objects;

import base.CommonAPI;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BusinessPage extends CommonAPI {

    @FindBy(css = ".business>a>span")
    public static WebElement businesstab;
    @FindBy(xpath = ".//*[@id='login']")
    public static WebElement login1;

    public static void business() {
        //Select dropdown = new Select(login1);
        businesstab.click();
    }


        public List<WebElement> getListOfWebElementsByXpath(String locator) {
            List<WebElement> list = new ArrayList<WebElement>();
            list = driver.findElements(By.xpath(String.valueOf(login1)));
            return list;
        }
}