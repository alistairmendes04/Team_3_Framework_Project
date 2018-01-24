package features;

import base.CommonAPI;
import com.sun.xml.internal.fastinfoset.sax.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFeatures {

    public class FeatureTest extends CommonAPI {
        Features features;

        @BeforeMethod
        public void initilizationOfObject() {
            features= PageFactory.initElements(driver, Features.class);
        }

        @Test
        public void testFeatures(){
            features
        }
    }
}
