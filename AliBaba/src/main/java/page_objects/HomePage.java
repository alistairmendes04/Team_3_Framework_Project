package page_objects;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy( name = "SearchText")
    public static WebElement searchBox;

   /* @FindBy (how = How.NAME, using = "SearchText")
    public static  WebElement menu;*/


    /*public  static WebElement getSearchBox(){
        return searchBox;*//*
    }*/
    public void searchProduct(){
        searchBox.sendKeys("I phone", Keys.ENTER);
        // driver.findElement(By.name("hhh")).sendKeys("I phone", Keys.ENTER);
    }



}
