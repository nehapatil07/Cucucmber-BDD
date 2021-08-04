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

public class OperatorsStepDef {
WebDriver driver;
ArrayList<String> actlist=null;
@Before("@Operators")
public void setup(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
}
@After("@Operators")
public void teardown(){
	driver.close();
}
@Given("^user should be on operators page$")
public void user_should_be_on_operators_page() throws Throwable {
  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/operators.html");
}

@When("^user gets all actual person names from page$")
public void user_gets_all_actual_person_names_from_page() throws Throwable {
  List<WebElement> List=driver.findElements(By.xpath("//td[2]"));
  actlist=new ArrayList<>();
  for(WebElement person:List){
	  String str=person.getText();
	  actlist.add(str);
  }
   
}
@Then("^user verify with expected list$")
public void user_verify_with_expected_list() throws Throwable {
	 ArrayList<String> explist=new ArrayList<>();
	 explist.add("Kiran");
	 explist.add("Neelam");
	 explist.add("Seema");
	 explist.add("Varsha");
	 explist.add("Darshit");
	Assert.assertEquals(actlist,explist);
}

}
