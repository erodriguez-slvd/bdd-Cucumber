package com.solvd.carina.demo.cucumber.steps;

import com.solvd.carina.demo.gui.pages.LoginPage;
import com.zebrunner.carina.cucumber.CucumberRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaucedemoSteps extends CucumberRunner {
    @Given("^I am on login page of Saucedemo website")
    public boolean mainPageIsOpen(){
        LoginPage login= new LoginPage(getDriver());
        login.open();
        return login.isPageOpened();
    }
    @Given("I am on login page of Saucedemo website")
    public void i_am_on_login_page_of_saucedemo_website() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I enter valid username and password and click on Login button")
    public void i_enter_valid_username_and_password_and_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("page {string} should be open")
    public void page_should_be_open(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("page {string} should display all items")
    public void page_should_display_all_items(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
