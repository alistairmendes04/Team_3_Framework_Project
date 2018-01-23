package keyword;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import page_objects.LoginPage;
import page_objects.PersonalPage;
import search.IteamsToBeSearched;

import java.io.IOException;

import static javafx.beans.binding.Bindings.select;

public class Features extends CommonAPI{
    LoginPage objOfLoginPage= PageFactory.initElements(driver,LoginPage.class);
    PersonalPage objOfPersonalPage= PageFactory.initElements(driver, PersonalPage.class);

    public void Login() {
        objOfLoginPage.enterCredintials();
    }

    public void Regristration(){
        objOfLoginPage.regristration1();
        objOfLoginPage.regristration2();
    }

    public void searchProduct(){
        objOfPersonalPage.searchBar();
        System.out.println("Search");
    }

    public void selectAction(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "Login":
                Login();
                break;
            case "Regristration":
                Regristration();
                break;
            case "SearchProduct":
                searchProduct();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }

    public void selectFeatures() throws IOException, InterruptedException {
        IteamsToBeSearched itemsToBeSearched = new IteamsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i]);
        }
    }
}
