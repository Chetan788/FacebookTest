package pomClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class LoginPage {
@FindBy (xpath="//input[@id='email']")
private WebElement username;

@FindBy (xpath="//input[@id='pass']")
private WebElement password;

@FindBy (xpath="//button[text()='Log In']")
private WebElement login;

@FindBy (xpath="//a[text()='Forgotten password?']")
private WebElement ForgottenPass;

@FindBy (xpath="//button[@id='u_0_d_ge']")
private WebElement CreateNewAcc;

public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);

}
public void username() throws EncryptedDocumentException, IOException
{
	Utility.getDataFromExcelSheet("Sheet1", 2, 1);

	//username.sendKeys("triangularvibe@gmail.com");
}
public void password() throws EncryptedDocumentException, IOException 
{
	Utility.getDataFromExcelSheet("Sheet1", 1, 1);
    //password.sendKeys("Triangular@123");
    
    
}
public void clickonlogin()
{
	login.click();
}
public void Forgetpassword()
{
	ForgottenPass.click();
}
public void CreateNewAcc()
{
	CreateNewAcc.click();
}


}
