package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;

    @FindBy(xpath = "//a[@title='Employees']/span")
    public WebElement employeelink;
    @FindBy(xpath = "//span[.='Telephone Directory']")
    public WebElement tellink;






}
