package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {

public static String getDataFromExcelSheet(String sheet,int row,int coloum) throws EncryptedDocumentException, IOException 
{ 
	String data;
String path = "C:\\Users\\SAI\\Downloads\\Actitime.xlsx";
FileInputStream file= new FileInputStream(path);
//data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
try{
	 data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getStringCellValue();
	
}
catch(Exception e) {
	double d=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(coloum).getNumericCellValue();
data=Double.toString(d);
}
return data;
}
}
