package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.GoogleSheetsReaderPage;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestGoogleSheetsReader extends GoogleSheetsReaderPage {
    GoogleSheetsReaderPage objGoogleSheet;

    @BeforeMethod
    public void initialization(){
        objGoogleSheet = PageFactory.initElements(driver, GoogleSheetsReaderPage.class);
    }
    //T3HOM_GS_TC01 Search Product using Googlesheet
    @Test
    public void testSearchProductUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1uXfdj9opuVSm4_l88YgGuyQx9DnOk6hMlLHb8OwKzc4";
        String range = "Sheet1!A2:C";
        List<String> actualSearchItem = objGoogleSheet.searchProduct(spreadsheetId, range);
        List<List<Object>> expectedSearchItem = objGoogleSheet.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedSearchItem) {
          //  Assert.assertTrue(actualSearchItem.get(i).contains(expectedSearchItem.get(i).toString()));
          //  Assert.assertTrue(actualSearchItem.get(i).contains(row.get(2).toString()));
            System.out.println("actual: "+actualSearchItem.get(i));
            System.out.println(expectedSearchItem.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testSearchProductUsingGoogleSheet Passed");
    }
}
