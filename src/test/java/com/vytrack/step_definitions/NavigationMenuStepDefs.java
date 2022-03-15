package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NavigationMenuStepDefs {

    @When("the user navigates Fleet, Vehicles")
    public void the_user_navigates_Fleet_Vehicles() {
        System.out.println("the user navigates Fleet, Vehicles");
    }

    @Then("the page title should be Vehicles")
    public void the_page_title_should_be_Vehicles() {
        System.out.println("the page title is Vehicles");
    }

    @When("the user navigates Marketing, Campaigns")
    public void the_user_navigates_Marketing_Campaigns() {
        System.out.println("the user navigates Marketing, Campaigns");
    }

    @Then("the page title should be Campaigns")
    public void the_page_title_should_be_Campaigns() {

        System.out.println("the page title is Campaigns");
    }

    @When("the user navigates Activities, Calendar Events")
    public void the_user_navigates_Activities_Calendar_Events() {
        System.out.println("the user navigates Activities, Calendar Events");
    }

    @Then("the page title should be Calendar Events")
    public void the_page_title_should_be_Calendar_Events() {

        System.out.println("the page title is Calendar Events");
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        new DashboardPage().navigateToModule(tab, module);
    }

    @When("the user navigates {string}, {string}")
    public void theUserNavigates(String tab, String module) {
        new DashboardPage().navigateToModule(tab, module);
    }

    @Then("default page number is {int}")
    public void default_page_number_is(Integer expectedPageNumber) {
        ContactsPage contactsPage = new ContactsPage();
        Integer actualPageNumber = Integer.parseInt(contactsPage.pageNumber.getText());
        Assert.assertEquals(expectedPageNumber, actualPageNumber);
    }

}
