package page_objects;

import base.CommonAPI;
import com.google.api.services.sheets.v4.model.*;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static googleAPIs.GoogleSheetReader.getSheetsService;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class GoogleSheetsReaderPage extends CommonAPI {
    @FindBy(how = ID, using = "headerSearch")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id='topnavCore']/div/h1")
    public static WebElement resultText;

    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //T3HOM_GS_TC01 Search using Googlesheet data
    public List<String> searchProduct(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(searchBox, row.get(1).toString());
            sleepFor(2);
            actual.add(driver.getTitle());
           // actual.add(getTextByWebElement(resultText));
            System.out.println(actual.add(driver.getTitle()));
            clearInputBox(searchBox);
            sleepFor(1);
        }
        return actual;
    }
}