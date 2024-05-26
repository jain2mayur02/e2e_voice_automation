package com.voices.stepDefinition.ClientProfileStepDef;

import com.voices.controlManager.TestContext;
import com.voices.pageObjects.ClientProfilePageObj.ClientProfilePage;
import com.voices.pageObjects.TalentProfilePageObj.TalentProfilePage;
import io.cucumber.java.en.Then;

public class ClientProfilePageStep {

    TestContext testContext;
    ClientProfilePage clientProfilePage;

    public ClientProfilePageStep(TestContext testContext) {
        this.testContext = testContext;
        clientProfilePage = testContext.getPageManager().getClientProfilePage();
    }

    @Then("Verify Client user is able to navigate to My Home page")
    public void verify_client_user_is_able_to_navigate_to_my_home_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToMyHomePage();
    }

    @Then("Verify Top Talent Home Banner")
    public void verify_top_talent_home_banner() {
        clientProfilePage.verifyTopTalentHomeBanner();
    }

    @Then("Verify Manual closing of Top Talent Home Banner")
    public void verify_manual_closing_of_top_talent_home_banner() {
        clientProfilePage.verifyManualClosingProjectMarketplaceBanner();
    }

    @Then("Verify My Jobs Section")
    public void verify_my_jobs_section() {
        clientProfilePage.verifyJobSection();
    }

    @Then("Verify My Jobs Draft tab")
    public void verify_my_jobs_draft_tab() {

    }

    @Then("Verify My Jobs Hiring tab")
    public void verify_my_jobs_hiring_tab() {

    }

    @Then("Verify My Jobs Working tab")
    public void verify_my_jobs_working_tab() {

    }

    @Then("Verify My Jobs Done tab")
    public void verify_my_jobs_done_tab() {

    }

    @Then("Verify Previously Hired Talent Section")
    public void verify_previously_hired_talent_section() {

    }

    @Then("Verify Client Career Section")
    public void verify_client_career_section() {

    }

}
