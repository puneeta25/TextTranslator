package translator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class csvreader {
	@SuppressWarnings("null")
	static

	int i =0 ;
	static bing bingtranslator;
	
	static String data;
	
	public static void main (String[] args) throws Exception{
	File file = new File(System.getProperty("user.dir")+"\\src\\translator\\data.csv");
	if(file.exists()){
	 System.out.println("File Exists");
	}
	BufferedReader bufRdr;
	bufRdr = new BufferedReader(new FileReader(file));
	String line = null;

	Boolean Firstline = true;

	while((line = bufRdr.readLine()) != null){

		if (Firstline)
		{
		Firstline = false;
		continue;
		}

	    StringTokenizer st = new StringTokenizer(line,"\n");
	  
		while (st.hasMoreTokens()){
						
	    data = st.nextToken();    
	   	} 
		
		String[] str;
		
		str = data.split(",");
		
		String Text = str[0];
		String From = str[1];
		String To = str[2];
		
		System.out.println("Text => "+Text);
		System.out.println("From => "+From);
		System.out.println("To => "+To);
		
		String bingData,microsoftData;
		bingData = bing.gettranslatorbyBing(Text,From,To);
		microsoftData = microsofttranslator.gettranslatorbyMicrosoft(Text, From, To);
		//System.out.println("Bing Result => "+bingData);
		
		//System.out.println("Microsoft Result => "+microsoftData);
		
		if (bingData.equalsIgnoreCase(microsoftData))
		{
			System.out.println("Test Results for From "+From+" To "+To+" is PASS");
		}
		else
		{
			System.out.println("Test Result for From =>"+From+" To " +To+" is FAIL");
		}
		
	}
	 bufRdr.close();

}
	
}
