package practise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	
	@BeforeTest
	public void login(){
		
		System.out.println("login success");
	}
	
	@Test
	public void first(){
		
		
		System.out.println("first success ");
	}

	
	@Test
	public void second(){
		
		System.out.println("secodn success");
		
		 
	}
	
	@AfterTest
	public void logout(){
		
		System.out.println("logout success");
	}
}
