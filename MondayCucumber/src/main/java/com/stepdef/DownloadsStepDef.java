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

public class DownloadsStepDef {
WebDriver driver;
ArrayList<String> actList=null;
@Before("@downloads")
public void setup(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
}
@After("@downloads")
public void teardown(){
	driver.close();
}
	@Given("^user should be on downloads page$")
	public void user_should_be_on_downloads_page() throws Throwable {
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/downloads.html");
	   
	}

	@When("^user gets the actual list of versions$")
	public void user_gets_the_actual_list_of_versions() throws Throwable {
	  List<WebElement> List=driver.findElements(By.xpath("//td[4]"));
	  actList=new ArrayList<>();
	  for(WebElement version:List){
		  String str=version.getText();
		  actList.add(str);
	  }
	}

	@Then("^users verifies it with expected list$")
	public void users_verifies_it_with_expected_list() throws Throwable {
	  ArrayList<String> explist=new ArrayList<>();
	  explist.add("1.8");
	  explist.add("2.52.0");
	  explist.add("3.9.0");
	  explist.add("2.46.0");
	  explist.add("76.0");
	  explist.add("76.0");
	  explist.add("69.0");
	  explist.add("0.24.0");
	  Assert.assertEquals(actList, explist);
	   
	}
}
