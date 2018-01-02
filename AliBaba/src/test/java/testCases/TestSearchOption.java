package testCases.testHomePage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_objects.HomePage;

public class TestSearchOption extends CommonAPI {

    @Test
    public void testSearchOption(){

        HomePage sr = PageFactory.initElements(driver, HomePage.class);
        sr.searchProduct();
    }

}
