package translator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bing {

	public static String gettranslatorbyBing(String Text, String From, String To) throws InterruptedException
	{
	WebDriver driver = new FirefoxDriver();
	//Open Application
	driver.get("https://www.bing.com/translator/");
	//Enter Text	 
	driver.findElement(By.xpath("//*[@id='InputText']")).sendKeys(Text);
	//Select From Language
	driver.findElement(By.xpath("//*[@id='HeaderTitle_SrcLangList']")).click();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText(From)).click();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	Thread.sleep(5000);
	//Select To Language
	driver.findElement(By.xpath("//*[@id='HeaderTitle_DstLangList']")).click();

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//Click Link
	 driver.findElement(By.linkText(To)).click();
	
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 
	 Thread.sleep(5000);
	 // Get Data
	 String getdata = driver.findElement(By.xpath("//*[@id='OutputText']")).getText();
	 
	 System.out.println("Bing Website Translated Text =>"+getdata);
	 
	 driver.close();
	 
	 return (getdata);
	 
	 

	}

}

