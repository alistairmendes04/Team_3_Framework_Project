package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.SearchProductPage;

public class TestSearchPage extends SearchProductPage {
    @Test
    public void testSearchProduct() throws InterruptedException {
        SearchProductPage sr = PageFactory.initElements(driver, SearchProductPage.class);


    }
}
