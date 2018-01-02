package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class TestSearchOption extends CommonAPI {

    @Test (priority = 2)
    public void testProductSearch(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.searchProduct();
    }

    @Test (priority = 1)
    public void testSupplierSearch(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.searchSuppliers();
    }
    /*@Test
    public void sourcingSolutions(){
        HomePage srr = PageFactory.initElements(driver, HomePage.class);
        srr.sourcingSolutions();
    }*/

}
