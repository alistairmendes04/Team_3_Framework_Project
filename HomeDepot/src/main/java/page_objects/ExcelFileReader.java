package page_objects;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.DataReader;

import java.io.IOException;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class ExcelFileReader extends CommonAPI {
    @FindBy(how = ID, using = "headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id='topnavCore']/div/h1")
    public static WebElement resultText;

    DataReader dtr = new DataReader();

    //Read data for input search
    public String[] getExcelData(String fileName) throws IOException {
        String path = "../HomeDepot/data/" + fileName;
        String[] output = dtr.colReader(path, 2); //Reading from column2
        return output;
    }
    //Read data for Expected result
    public String[] getAssertData(String fileName) throws IOException {
        String path = "../HomeDepot/data/" + fileName;
        String[] output = dtr.colReader(path, 3);  //Reading from Column3 which has Expected data
        return output;
    }
    // //T3HOM_ER _TC01 Search Product using Excel data
    public String[] searchProduct(String fileName) throws IOException, InterruptedException {
        String[] searchItem = getExcelData(fileName);
        String[] actual = new String[searchItem.length];
        for (int i = 0; i < searchItem.length; i++) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchBox, searchItem[i]);
            sleepFor(2);
            actual[i] = driver.getTitle();
            //actual[i] = getTextByWebElement(resultText);
            clearInputBox(searchBox);
            sleepFor(1);
        }
        return actual;
    }
}
