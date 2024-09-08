package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders
{
	@DataProvider(name = "LeadData")
	public String[][] getLeadInfo() throws IOException
	{
		String path = ".\\testdata\\testdata.xlsx"; // taking xl file from testData

		ExcelUtility xlutil = new ExcelUtility(path);// creating an object for XLUtility

		int totalrows = xlutil.getRowCount("LeadCreate");
		int totalcols = xlutil.getCellCount("LeadCreate", 1);

		String lead[][] = new String[totalrows][totalcols]; // created for two dimension array which can store

		for (int i = 1; i <= totalrows; i++) // 1--we are ignoring header part of excel //read the data from x1 storing
		// in two deminsional array
		{
			for (int j = 0; j < totalcols; j++) // 0 i is rows j is col
			{
				lead[i - 1][j] = xlutil.getCellData("LeadCreate", i, j); // 1,0
				// [i-1]--in xl, we are ignoring header part of excel
			}
		}

		return lead;// returning two dimension array

	}
}
