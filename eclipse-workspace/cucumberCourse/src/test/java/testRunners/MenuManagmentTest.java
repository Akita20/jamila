package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/test/java/linkdedinLearning/cucumberCourse/features"},
glue= {"stepdefinitions"},
plugin= {"pretty"})

public class MenuManagmentTest {
	
	

}
