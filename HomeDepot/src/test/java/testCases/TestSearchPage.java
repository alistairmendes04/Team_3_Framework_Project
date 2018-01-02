package testCases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.SearchPage;

public class TestSearchPage extends SearchPage {
    @Test
    public void testSearchProduct() throws InterruptedException {
        SearchPage sr = PageFactory.initElements(driver, SearchPage.class);
        sr.searchProduct();
    }
}
