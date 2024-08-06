package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/Features"},glue={"StepDefinations","AppHooks"},
monochrome=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class MyTestRunner extends AbstractTestNGCucumberTests{
//	@DataProvider(parallel=true)
//	public Object[][] scenerios(){
//		return super.scenarios();
//	}
}
