package mypro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import myproject.app;



public class test1 {
@Test
	public void testLogin() {
		
		app myapp= new app();
		Assert.assertEquals(1, myapp.userlogin("abc", "abc123"));
		
	}
@Test
public void testLogin2() {
	
	app myapp= new app();
	Assert.assertEquals(0, myapp.userlogin("abc", "abc@123"));
	
}

}
