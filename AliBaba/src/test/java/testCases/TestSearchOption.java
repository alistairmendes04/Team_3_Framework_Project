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
        HomePage sr1 = PageFactory.initElements(driver, HomePage.class);
        sr1.searchSuppliers();
    }
    @Test (priority = 3)
    public void  testQuotesSearch(){
        HomePage sr2 = PageFactory.initElements(driver, HomePage.class);
        sr2.quotesSearchOption();
    }
    @Test
    public void sourcingSolutions(){
        HomePage sr3 = PageFactory.initElements(driver, HomePage.class);
        sr3.sourcingSolutions();
    }

}
