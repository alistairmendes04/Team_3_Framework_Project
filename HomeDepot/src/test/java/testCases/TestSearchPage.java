package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.SearchPage;
import reporting.TestLogger;

public class TestSearchPage extends SearchPage {
    //@Test
    public void testSearchProduct() throws InterruptedException {
        //TestLogger.log("test log");
        SearchPage sr = PageFactory.initElements(driver, SearchPage.class);


    }
}
