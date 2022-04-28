package test;

public class git {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.composepage;
import pages.loginpage;
import pages.logout;

public class stepdef {      
	
	public RemoteWebDriver driver;
	public Homepage obj1;
	public loginpage obj2;
	public composepage obj3;
	public logout obj4;
	
	
	@Given("open {string} browser")
	  public void method1(String bn)
	  {
		if(bn.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			obj1=new Homepage(driver);
			obj2=new loginpage(driver);
			obj3=new composepage(driver);
			obj4=new logout(driver);
			
		}	
			
	  }
	@When("lanch site using {string}")
	public void method2(String lanchsite) throws Exception
	{
		driver.get(lanchsite);
		Thread.sleep(5000);
	}

}
