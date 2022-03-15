package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {



    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> expectedMenuOptions) {
        List <String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(expectedMenuOptions, actualOptions);
        BrowserUtils.waitFor(10);
        System.out.println("actualOptions = " + actualOptions);
        System.out.println("menuOptions = " + expectedMenuOptions);
        //System.out.println("menuOptions size = " + expectedMenuOptions.size());
        //System.out.println("menuOptions = " + expectedMenuOptions);
    }

    @When("the user logs in following credentials")
    public void the_user_logs_in_following_credentials(Map<String, String> userInfo) {

        new LoginPage().login(userInfo.get("username"), userInfo.get("password"));

        String actualName = new DashboardPage().getUserName();
        String expectedName = userInfo.get("firstname") + " " + userInfo.get("lastname");

        Assert.assertEquals(expectedName, actualName);
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);

    }
}
