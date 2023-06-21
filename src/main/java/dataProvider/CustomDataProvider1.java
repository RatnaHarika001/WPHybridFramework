package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider1 {
	
	@DataProvider(name="Assignment")
	public static Object[][] test2()
	{
		
		Object arr[][] = ExcelReader.getDataFromSheet("User Details");
		return arr;
		
	}
}
