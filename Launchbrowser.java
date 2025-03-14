package week2day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChromeDriver dri=new ChromeDriver();
     
    dri.get("https://www.facebook.com/");
    
    dri.manage().window().maximize();
	
    
	}
	
}
