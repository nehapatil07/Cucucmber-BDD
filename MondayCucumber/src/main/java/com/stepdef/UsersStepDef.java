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

public class UsersStepDef {
WebDriver driver;
@Before
public void setup(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
}
@After
public void teardown(){
	driver.close();
}
ArrayList<String> actlist=null;
	@Given("^user should be on users page$")
	public void user_should_be_on_users_page() throws Throwable {
	   driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	    
	}

	@When("^user selects table headings$")
	public void user_selects_table_headings() throws Throwable {
	   List<WebElement> list=driver.findElements(By.xpath("//th"));
	   actlist=new ArrayList<>();
	   for(WebElement heading:list){
		   String str=heading.getText();
		   actlist.add(str);
	   }    
	}

	@Then("^verify with expected list$")
	public void verify_with_expected_list() throws Throwable {
	   ArrayList<String> explist=new ArrayList<>();
	   explist.add("#");
	   explist.add("Username");
	   explist.add("Email");
	   explist.add("Mobile");
	   explist.add("Course");
	   explist.add("Gender");
	   explist.add("State");
	   explist.add("Action");
	    Assert.assertEquals(actlist, explist);
	}

}
