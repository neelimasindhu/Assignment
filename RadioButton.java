package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		
				WebDriver d= new FirefoxDriver();
				
				Thread.sleep(2000);
				
				// open the mercury tours website
				
				d.get("http://www.newtours.demoaut.com/");
				
				Thread.sleep(3000);
				
				// enter the username
				
				d.findElement(By.name("userName")).sendKeys("mahesh");
				
				Thread.sleep(3000);
				
				// enter the password
				
				d.findElement(By.name("password")).sendKeys("mahesh");
				
				Thread.sleep(3000);
				
				// click on sign in image button
				
				d.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
				
				Thread.sleep(3000);
				// select the one way trip radio button
				
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
				Thread.sleep(3000);
				
				// select the round trip radio button
				
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]")).click();
				Thread.sleep(3000);
				// select the Business Class
				
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
				
				Thread.sleep(3000);
				// select the First class
				
				
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]")).click();
				
				Thread.sleep(3000);
				// select the economy class
				
				d.findElement(By.xpath("html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/input")).click();
				Thread.sleep(3000);
				
				
				// close the browser
				
				d.close();

	}

}
