package TestNG_package;

import org.testng.annotations.DataProvider;

public class Datapro {
	@DataProvider(name="SearchProvider")
	public static Object[][] getDataFromDataprovider(){
	return new Object[][] {
	{ "admin", "7667771111111111111" },
	
	};

}}
