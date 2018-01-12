package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.ByInputFromExls;
import page_objects.GoogleSheetsPage;
import page_objects.GoogleSheetsReaderPage;
import page_objects.SignInPage;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class TestGoogleSheetsReader extends GoogleSheetsReaderPage {
    GoogleSheetsReaderPage objGoogleSheet;

    @BeforeMethod
    public void initialization(){
        objGoogleSheet = PageFactory.initElements(driver, GoogleSheetsReaderPage.class);
    }
    // AMZ_TS5: Use google sheets test data to search multiple items
    // AMZ_TS5_TC1: Search multiple items by name from a google sheets file
    @Test
    public void testSearchProductUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1A6G3avCchSjTPM1xoGU8YaYo3azwl4uHBsfgwRZB31A";
        String range = "Sheet1!A2:C";
        List<String> actualSearchItem = objGoogleSheet.searchProduct(spreadsheetId, range);
        List<List<Object>> expectedSearchItem = objGoogleSheet.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedSearchItem) {
            Assert.assertTrue(actualSearchItem.get(i).contains(row.get(2).toString()));
            //System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedSearchItem.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testSearchProductUsingGoogleSheet Passed");
    }
}
