package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		WebDriver dr= new FirefoxDriver();
		dr.get("http://www.keynotesupport.com/websites/contact-form-example-checkboxes.shtml");
		WebElement we=dr.findElement(By.xpath(".//*[@id='align']/span[5]/input"));
		if(!(we.isSelected())){
			 System.out.println("The check box is not checked");
			we.click();
		}


	}

}
