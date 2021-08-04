package com.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features="src/main/java/com/feature",
    glue= "com.stepdef",  //exact implementation of feature file
	plugin= {"pretty","html:target/report.html"}, // for report generation
	tags="@downloads",  //when we only want to execute the single scenario, mention it here
	dryRun=false
)

public class TestRunner {

}
