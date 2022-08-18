package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ExtentReport {

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        System.out.println("user is on registration page");
    }

    @When("user enters following details")
    public void user_enters_following_details(DataTable dataTable) {
        java.util.List<java.util.List<String>> userList = dataTable.asLists(String.class);
        for (java.util.List<String> e : userList) {
            System.out.println(e);
        }
    }
   //Kavya added the new code
    @Then("user registration should be successful")
    public void user_registration_should_be_successful() {
        System.out.println("user registration should be successful");
    }

// Step definition created
    //HI KAVYA
    }
