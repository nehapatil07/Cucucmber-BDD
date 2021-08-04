package com.stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	WebDriver driver;
	//hooks
	@Before
	public void setup(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void teardown(){
		driver.close();
	}
	@Given("^User should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
	   driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  }

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
	    driver.findElement(By.id("email")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pass);
	   
	}

	@When("^User hits submit button$")
	public void user_hits_submit_button() throws Throwable {
	   driver.findElement(By.xpath("//button")).click();
	    
	}
	@Then("^User should be on homepage$")
	public void user_should_be_on_homepage() throws Throwable {
		 Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	@Then("^user should see jbk logo$")
	public void user_should_see_jbk_logo() throws Throwable{
		WebElement logo=driver.findElement(By.tagName("img"));
		 Assert.assertTrue(logo.isDisplayed());
	}
	@Then("^User should see title$")
	public void User_should_see_title() throws Throwable{
		String str=driver.getTitle();
		 Assert.assertEquals(str, "JavaByKiran | Log in");
	}
}
