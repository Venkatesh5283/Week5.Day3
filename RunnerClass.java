package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features="src/test/java/feature/AssignmentSalesforce.feature", glue="stepDefinition", publish=true, monochrome=true)

public class RunnerClass extends BaseClass {

}
