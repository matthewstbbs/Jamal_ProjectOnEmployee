package com.cydeo.stepdefinition;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
//    @Before
//    public void setUp() {
//        System.out.println("Before Scenario is running");
//    }
    @After
    public void tearDown() {
        Driver.closeDriver();
    }

}
