package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Images {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		
		
			WebDriver d= new FirefoxDriver();
			
			Thread.sleep(3000);
			
			// open the youtube website
			
			d.get("https://www.youtube.com/");
			
			Thread.sleep(3000);
			
			// handling hyperlink image
			
			String titleYouTube=d.findElement(By.id("logo-container")).getAttribute("Title");
			
			System.out.println("youtube title :"+titleYouTube);
			
			
			// handling general images
				
			d.get("https://www.google.com/");
			
			String googleSrc=d.findElement(By.id("hplogo")).getAttribute("src");
			
			System.out.println("Google Logo image source :"+googleSrc);
			
			
			// handling input images 
			
			
			d.get("http://www.newtours.demoaut.com/");
			
			String inputButtonType=d.findElement(By.name("login")).getAttribute("type");
			
			String inputButtonValue=d.findElement(By.name("login")).getAttribute("value");
			
			
			System.out.println("inputButtonType :"+inputButtonType);
			
			System.out.println("inputButtonValue :"+inputButtonValue);
			
			
			// close the browser
			
			d.close();
			
			

	}

}
