package com.stepdef;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DashboardStepdef {
	WebDriver driver;
	ArrayList<String> actCourselist=null;
	
	@Before("@dash")
	public void setup(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After("@dash")
	public void teardown(){
		driver.close();
	}
	@Given("^user should be on dashboard page$")
	public void user_should_be_on_dashboard_page() throws Throwable {
	   driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	}

	@When("^user will create a list of courses$")
	public void user_will_create_a_list_of_courses() throws Throwable {
	  List<WebElement> courses=driver.findElements(By.xpath("//h3"));
	  actCourselist=new ArrayList<String>();
	  for(WebElement course:courses){
		  String str=course.getText();
		  actCourselist.add(str);
	  }
	}

	@Then("^user will verify courses with expected$")
	public void user_will_verify_courses_with_expected() throws Throwable {
	  ArrayList<String> explist=new ArrayList<>();
	  explist.add("Selenium");
	  explist.add("Java / J2EE");
	  explist.add("Python");
	  explist.add("Php");
	  Assert.assertEquals(actCourselist,explist);
	}
	
	@When("^user will click on the users page$")
	public void user_will_click_on_the_users_page() throws Throwable {
	    driver.findElement(By.xpath("//span[text()='Users']")).click();
	}

	@Then("^user page should be displayed$")
	public void user_page_should_be_displayed() throws Throwable {
	    Assert.assertEquals(driver.getTitle(),"JavaByKiran | User");
	   
	}

	@When("^user will click on the operators link$")
	public void user_will_click_on_the_operators_link() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Operators']")).click();
	    
	   
	}

	@Then("^operators link should be opened$")
	public void operators_link_should_be_opened() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Operators");
	   
	}

	@When("^user will click on the useful links$")
	public void user_will_click_on_the_useful_links() throws Throwable {
	     driver.findElement(By.xpath("//span[text()='     Useful Links']")).click();
	}

	@Then("^useful links page should be opened$")
	public void useful_links_page_should_be_opened() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Useful Links");
	   
	}

	@When("^user clicks on the downloads page$")
	public void user_clicks_on_the_downloads_page() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	   
	}

	@Then("^downloads page should be opened$")
	public void downloads_page_should_be_opened() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Downloads");
	   
	}


}
