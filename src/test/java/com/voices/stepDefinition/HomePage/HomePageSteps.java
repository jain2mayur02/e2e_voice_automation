package com.voices.stepDefinition.HomePage;

import com.voices.controlManager.TestContext;
import com.voices.managers.ReaderManager;
import com.voices.pageObjects.HomePageObj.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class HomePageSteps {

    TestContext testContext;
    private List<Map<String, String>> data;

    HomePage homePage;

    public HomePageSteps(TestContext testContext) {
        this.testContext = testContext;
        homePage = testContext.getPageManager().getHomePage();
    }

    @Given("User Open Home Page")
    public void user_open_home_page() {
        homePage.userLaunchAndValidateHomePage();
    }


    @And("User click on How it works link and validate url")
    public void user_click_on_how_it_works_link_and_validate_url() {
        homePage.clickOnHowItWorkAndValidateUrl();
    }

    @And("User click on log in link and validate url")
    public void user_click_on_log_in_link_and_validate_url() {
        homePage.clickOnLogInAndValidateUrl();
    }

    @And("User click on sign up link and validate url")
    public void user_click_on_sign_up_link_and_validate_url() {
        homePage.clickOnSignUpAndValidateUrl();
    }


}
