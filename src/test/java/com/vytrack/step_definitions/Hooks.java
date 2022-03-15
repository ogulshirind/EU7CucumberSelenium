package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class
Hooks {
    @Before
    public void setup(){
    }

    @Before("@driver")
    public void setupDriver(){
    }

    @Before("@sales_manager")
    public void setupSalesManager(){
    }

    @Before("@store_manager")
    public void setupStoreManager(){
    }

    @After
    //taking screenshot
    //we need to place screenshot implementation on after method in hooks in cucumber

    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);

            //saving screenshot
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}
