package test1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.LoginPage;

public class TestFacebook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
System.setProperty("webdriver.chrome.driver", "E:\\study\\selinium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//test case1
	LoginPage loginpage=new LoginPage(driver);
	
	loginpage.username();
	loginpage.password();
	
	
	
	
	
	
	
	
	
	
}
}
