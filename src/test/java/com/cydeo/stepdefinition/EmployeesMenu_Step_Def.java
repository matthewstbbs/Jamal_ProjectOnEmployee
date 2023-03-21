package com.cydeo.stepdefinition;

import com.cydeo.pages.EmployeePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeesMenu_Step_Def {
    EmployeePage employeePage = new EmployeePage();

    @Given("user already logged in main page")
    public void userAlreadyLoggedInAsMainPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        WebElement username = Driver.getDriver().findElement(By.xpath("(//input[@class='login-inp'])[1]"));
        username.sendKeys("hr2@cybertekschool.com");

        WebElement password = Driver.getDriver().findElement(By.xpath("(//input[@class='login-inp'])[2]"));
        password.sendKeys("UserUser");

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("(//input[@type='submit'])"));
        loginButton.click();

    }

    @When("user clicks Employees tab")
    public void user_clicks_employees_tab() {
        employeePage.employeelink.click();
    }

    @And("user should see company structure title")
    public void userShouldSeeCompanyStructureTitle() {
        Assert.assertEquals("Company Structure", employeePage.pageTitle.getText());

    }

    @When("user clicks telephone directory tab")
    public void userClicksTelephoneDirectoryTab() {
        employeePage.tellink.click();
    }

    @And("user should see telephone directory title")
    public void userShouldSeeTelephoneDirectoryTitle() {
        Assert.assertEquals("Telephone Directory", employeePage.pageTitle.getText());

    }

}
