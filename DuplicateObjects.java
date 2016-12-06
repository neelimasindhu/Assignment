package practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DuplicateObjects {

	public static void main(String[] args) {
		
		//http://www.infibeam.com/
		
		WebDriver dr= new FirefoxDriver();
		
		dr.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		// open website
		
		dr.get("http://www.infibeam.com/");
		
		// Click on login/register link
		
		dr.findElement(By.id("loginlink")).click();
		
		//Click on Register button
		
		dr.findElement(By.id("new-account-btn")).click();
		
		//get all password text boxes
		
		List<WebElement> list= dr.findElements(By.id("password"));
		
		System.out.println(list.size());
		
		
		list.get(0).sendKeys("12328");
		
		list.get(1).sendKeys("12");

	}

}
