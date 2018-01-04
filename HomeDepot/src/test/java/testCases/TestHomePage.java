package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class TestHomePage extends HomePage {

    @Test
    public void testSearch(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        System.out.println("Search button Displayed: "+sr.isSearchButtonDisplay()); //test Search button for Display status
      //  sr.searchProduct();
        sr.returnbackAfterClickingAllDept(); //navigate back to home page after clicking in AllDepartment tab
        sr.returnbackAfterClickingShopRoomImg();
        sr.returnbackAfterClickingShopRoomTxt();
    }
}
