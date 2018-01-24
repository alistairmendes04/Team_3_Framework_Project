package testKeyword;

import keyword.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestFeatures extends Features{
    Features objFeatures;
    @Test
    public void testFeatures() throws IOException, InterruptedException {
        objFeatures = PageFactory.initElements(driver, Features.class);
        objFeatures.selectFeature();
    }
}
