package keyword;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import page_objects.ExcelFileReader;
import page_objects.HomePage;
import page_objects.LoginPage;

import java.io.IOException;


public class Features extends CommonAPI {
    ExcelFileReader objExcelFileReader;
    HomePage objHomePage;
    LoginPage objLoginPage;


    public void applianceItems(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objHomePage.goToAppliances();
        System.out.println("Appliance test pass");
    }
    public void bathroomItems(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objHomePage.goToBathroomUsingImg();
        System.out.println("Bathroom test pass");
    }
    public void invalidEmail(){
        objLoginPage = PageFactory.initElements(driver, LoginPage.class);
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objHomePage.goToLoginPage();
        objLoginPage.enterInvalidEmail();
        System.out.println("InvalidEmail test pass");
    }
    public String[] generalSearch(String fileName) throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
        String[] title = objExcelFileReader.searchProduct(fileName);
        System.out.println("ExcelfileReader test pass");
        return title;
    }
    public void select(String featureName) throws IOException, InterruptedException {
        switch(featureName){
            case "applianceItems":
                applianceItems();
                break;
            case "bathroomItems":
                bathroomItems();
                break;
            case "invalidEmail":
                invalidEmail();
                break;
            case "generalSearch":
                generalSearch("Data.xls");
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
        String[] title = objExcelFileReader.getDatafromExcelFileForFeatureChoice("DataFeature1.xls");
        for(int i=0;i<title.length;i++){
            select(title[i]);
        }
    }
}
