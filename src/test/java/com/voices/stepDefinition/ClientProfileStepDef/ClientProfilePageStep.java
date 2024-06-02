package com.voices.stepDefinition.ClientProfileStepDef;

import com.voices.controlManager.TestContext;
import com.voices.pageObjects.ClientProfilePageObj.ClientProfilePage;
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
        clientProfilePage.verifyMyJobsDraftTab();
    }

    @Then("Verify My Jobs Hiring tab")
    public void verify_my_jobs_hiring_tab() {

    }

    @Then("Verify My Jobs Working tab")
    public void verify_my_jobs_working_tab() {
        clientProfilePage.verifyMyJobsWorkingTab();
    }

    @Then("Verify My Jobs Done tab")
    public void verify_my_jobs_done_tab() {
        clientProfilePage.verifyMyJobsDoneTab();
    }

    @Then("Verify Previously Hired Talent Section")
    public void verify_previously_hired_talent_section() {
        clientProfilePage.verifyPreviouslyHiredTalentSection();
    }

    @Then("Verify Client Career Section")
    public void verify_client_career_section() {
        clientProfilePage.verifyClientCareerSection();
    }

    @Then("Verify Customer Support Section for client")
    public void verify_customer_support_section_for_client() {
        clientProfilePage.verifyCustomerSupportSectionForClient();
    }

    @Then("Verify Client user is able to navigate to Account Settings Page")
    public void verify_client_user_is_able_to_navigate_to_account_settings_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToAccountSettingsPage();
    }

    @Then("Verify Business Profile for client")
    public void verify_business_profile_for_client() {
        clientProfilePage.verifyBusinessProfileForClient();
    }

    @Then("Verify General Settings for client")
    public void verify_general_settings_for_client() {
        clientProfilePage.verifyGeneralSettingsForClient();
    }

    @Then("Verify Notifications for client")
    public void verify_notifications_for_client() {
        clientProfilePage.verifyNotificationsForClient();
    }


    @Then("Verify Subscription for client")
    public void verify_subscription_for_client() {
        clientProfilePage.verifySubscriptionForClient();
    }

    @Then("Verify Billing Information for client")
    public void verify_billing_information_for_client() {
        clientProfilePage.verifyBillingInformationForClient();
    }

    @Then("Verify Change Password for client")
    public void verify_change_password_for_client() {
        clientProfilePage.verifyChangePasswordForClient();
    }

    @Then("Verify Talent user is able to navigate to Previously Hired Talent Page")
    public void verify_talent_user_is_able_to_navigate_to_previously_hired_talent_page() {
        clientProfilePage.verifyTalentUserIsAbleToNavigateToPreviouslyHiredTalentPage();
    }

    @Then("Verify Previously Hired Talent list")
    public void verify_previously_hired_talent_list() {
        clientProfilePage.verifyPreviouslyHiredTalentList();
    }

    @Then("Verify Previously Hired Talent record")
    public void verify_previously_hired_talent_record() {
        clientProfilePage.verifyPreviouslyHiredTalentRecord();
    }

    @Then("Verify Search Functionality")
    public void verify_search_functionality() {
        clientProfilePage.verifySearchFunctionality();
    }

    @Then("Verify Show filter functionality")
    public void verify_show_filter_functionality() {
        clientProfilePage.verifyShowFilterFunctionality();
    }

    @Then("Verify Sort By functionality")
    public void verify_sort_by_functionality() {
        clientProfilePage.verifySortByFunctionality();
    }

    @Then("Verify Invite To Job CTA functionality")
    public void verify_invite_to_job_cta_functionality() {
        clientProfilePage.verifyInviteToJobCTAFunctionality();
    }

    @Then("Verify Client user is able to navigate to Favorites page")
    public void verify_client_user_is_able_to_navigate_to_favorites_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToFavoritesPage();
    }

    @Then("Verify Talent Tab")
    public void verify_talent_tab() {
        clientProfilePage.verifyTalentTab();
    }

    @Then("Verify Packages Tab")
    public void verify_packages_tab() {
        clientProfilePage.verifyPackagesTab();
    }

    @Then("Verify Create New List CTA functionality")
    public void verify_create_new_list_cta_functionality() {
        clientProfilePage.verifyCreateNewListCTAFunctionality();
    }

    @Then("Verify Invite All To Job CTA functionality")
    public void verify_invite_all_to_job_cta_functionality() {
        clientProfilePage.verifyInviteAllToJobCTAFunctionality();
    }


}
