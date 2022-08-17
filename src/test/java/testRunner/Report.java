package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/Extent.feature"
        ,glue = {"stepDefinition"}
        ,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        ,monochrome = true
        ,publish = true
)
        public class Report extends AbstractTestNGCucumberTests
{
}
