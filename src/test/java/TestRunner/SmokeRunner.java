package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features" ,glue = "StepDefinitions",dryRun = false)//dryrun will check for each step if the code written if not it will generated
public class SmokeRunner {
}
