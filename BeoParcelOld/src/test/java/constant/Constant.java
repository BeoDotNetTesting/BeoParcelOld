package constant;

public class Constant {
	//File Location
	public static final String propertyFileLocation="\\src\\main\\resources\\Properties\\config.properties";
	public static final String ExcelFileLocation="\\src\\main\\resources\\Excel\\ParcelTest.xls";
	public static final String ExcelLogInSheetName="LogInPage";
	public static final String ChromeDriverFileLocation="\\src\\main\\resources\\Driver\\chromedriver.exe";
	
	public static final String sovp_completeShipmentWithoutPrinting_TC58127 = "::company name not as expected";
	
	
	public static final String sovp_completeShipmentWithoutPrinting_TC58127_FinalListTableStatus = "::company name not as expected";
	public static final String sovp_downloadTheCustomsDeclaration_TC58223_Expected="http://11.100.101.23/BEO-Parcel/ViewPdf.aspx?InvoiceReportNew=Pdf/InvoicesReportNew.pdf";
	public static final String sovp_downloadTheCustomsDeclaration_TC58223_ErrorMessage="Download Invoice not as expected";
	
	public static final String sovp_downloadPackingList_TC58667_Expected="http://11.100.101.23/BEO-PARCEL/ViewPdf.aspx?packList=PackageType/PackageType_922d9f40-d0bd-496f-8bce-f984dc9e2a38.pdf";
	public static final String sovp_downloadPackingList_TC58667_ErrorMessage="Download package list not as expected";
	
	public static final String sovp_downloadCMRFreightLetter_TC58668_Expected="http://11.100.101.23/BEO-PARCEL/ViewPdf.aspx?packList=PackageType/PackageType_922d9f40-d0bd-496f-8bce-f984dc9e2a38.pdf";
	public static final String sovp_downloadCMRFreightLetter_TC58668_ErrorMessage="CMR freight number print  not as expected";
	
	public static final String downloadTheCustomsDeclarationTryWithPDF_Write_TC58223_Expected="http://11.100.101.23/BEO-Parcel/ViewPdf.aspx?InvoiceReportNew=Pdf/InvoicesReportNew.pdf";
	public static final String downloadTheCustomsDeclarationTryWithPDF_Write_TC58223_ErrorMessage="invoice declaration print url not as expected";
	
}
