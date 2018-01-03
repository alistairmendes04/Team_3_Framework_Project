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
    @Test (priority = 3)
    public void  testQuotesSearch(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.quotesSearchOption();
    }
    @Test
    public void sourcingSolutions(){
        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.sourcingSolutions();
    }

}
