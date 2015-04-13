package translator;


import java.io.IOException;

import com.memetix.mst.language.Language;
import com.memetix.mst.translate.Translate;

public class microsofttranslator {
    
public  static String gettranslatorbyMicrosoft(String Text, String From,String To) throws NullPointerException
{
	
	try{
    Translate.setClientId("BingTranslorQAInfosys");
    Translate.setClientSecret("sdLLF9bL69p9sT90neEQe66U+GSNyNOarl1k2owKnUI=");
    String translatedText;
    Language lan = null;
    
	translatedText = Translate.execute(Text,Language.valueOf(From.toUpperCase()),Language.valueOf(To.toUpperCase()));
	System.out.println("Microsoft API Translated Text =>"+translatedText);
	return(translatedText);
	
	}
	catch (Exception e) {
		    
		    e.printStackTrace();
		    return("FAIL");
			
	 }
	/*
    if (From.equals("English")&&(To.equals("French")))
    		{
    	translatedText = Translate.execute(Text, Language.ENGLISH, Language.FRENCH);
    	System.out.println("Microsoft API Translated Text =>"+translatedText);
    		}
    else if (From.equals("French") && (To.equals("English")))
    		{
    	translatedText = Translate.execute(Text, Language.FRENCH, Language.ENGLISH);
    	System.out.println("Microsoft API Translated Text =>"+translatedText);
    		}
    else if (From.equals("English")&&(To.equals("Italian")))
	{
    	translatedText = Translate.execute(Text, Language.ENGLISH, Language.ITALIAN);
    	System.out.println("Microsoft API Translated Text =>"+translatedText);
	}
    else if (From.equals("Italian") && (To.equals("English")))
	{
		translatedText = Translate.execute(Text, Language.ITALIAN, Language.ENGLISH);
		System.out.println("Microsoft API Translated Text =>"+translatedText);
	} 
    else if (From.equals("French")&&(To.equals("Italian")))
	{
		translatedText = Translate.execute(Text, Language.FRENCH, Language.ITALIAN);
		System.out.println("Microsoft API Translated Text =>"+translatedText);
	}
	else if (From.equals("Italian") && (To.equals("French")))
	{
		translatedText = Translate.execute(Text, Language.ITALIAN, Language.FRENCH);
		System.out.println("Microsoft API Translated Text =>"+translatedText);
	}
    else
    		{
    	 translatedText = Translate.execute(Text, Language.ENGLISH, Language.ENGLISH);
    	System.out.println("Microsoft API Translated Text =>"+translatedText);
    		}
    

     * 
     */
	
	
	
}



}