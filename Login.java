package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//open the browser
		WebDriver dr= new ChromeDriver();
		
		Thread.sleep(3000);
		
		// open facebook page https://www.facebook.com/
		
		dr.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		// enter the user name
		
		dr.findElement(By.id("email")).sendKeys("neelima.sindhu@gmail.com");
		Thread.sleep(3000);
		
		// enter the password
		
		dr.findElement(By.id("pass")).sendKeys("shoelacee");
		Thread.sleep(3000);
		
		//click on login button
		
		dr.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		


	}

}
