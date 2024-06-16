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

    @Then("Verify Client user is able to navigate to Manage Licences page")
    public void verify_client_user_is_able_to_navigate_to_manage_licences_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToManageLicencesPage();
    }

    @Then("Verify All Licenses Tab")
    public void verify_all_licenses_tab() {
        clientProfilePage.verifyAllLicensesTab();
    }

    @Then("Verify each record in All Licenses Tab")
    public void verify_each_record_in_all_licenses_tab() {
        clientProfilePage.verifyEachRecordInAllLicensesTab();
    }

    @Then("Verify Search Functionality in All Licenses Tab")
    public void verify_search_functionality_in_all_licenses_tab() {
        clientProfilePage.verifySearchFunctionalityInAllLicensesTab();
    }

    @Then("Verify Show filter Functionality in All Licenses Tab")
    public void verify_show_filter_functionality_in_all_licenses_tab() {
        clientProfilePage.verifyShowFilterFunctionalityInAllLicensesTab();
    }

    @Then("Verify Sort Functionality in All Licenses Tab")
    public void verify_sort_functionality_in_all_licenses_tab() {
        clientProfilePage.verifySortFunctionalityInAllLicenses_tab();
    }

    @Then("Verify View button Functionality in All Licenses Tab")
    public void verify_view_button_functionality_in_all_licenses_tab() {
        clientProfilePage.verifyViewButtonFunctionalityInAllLicensesTab();
    }

    @Then("Verify Get Renewal Quote button Functionality in All Licenses Tab")
    public void verify_get_renewal_quote_button_functionality_in_all_licenses_tab() {
        clientProfilePage.verifyGetRenewalQuoteButtonFunctionalityInAllLicensesTab();
    }

    @Then("Verify Quotes Requested Tab")
    public void verify_quotes_requested_tab() {
        clientProfilePage.verifyQuotesRequestedTab();
    }

    @Then("Verify each record in Quotes Requested Tab")
    public void verify_each_record_in_quotes_requested_tab() {
        clientProfilePage.verifyEachRecordInQuotesRequestedTab();
    }

    @Then("Verify Search Functionality in Quotes Requested Tab")
    public void verify_search_functionality_in_quotes_requested_tab() {

    }

    @Then("Verify Show filter Functionality in Quotes Requested Tab")
    public void verify_show_filter_functionality_in_quotes_requested_tab() {

    }

    @Then("Verify Sort Functionality in Quotes Requested Tab")
    public void verify_sort_functionality_in_quotes_requested_tab() {

    }

    @Then("Verify Edit Request button Functionality in Quotes Requested Tab")
    public void verify_edit_request_button_functionality_in_quotes_requested_tab() {
        clientProfilePage.verifyEditRequestButtonFunctionalityInQuotesRequestedTab();
    }

    @Then("Verify Cancel Request button Functionality in Quotes Requested Tab")
    public void verify_cancel_request_button_functionality_in_quotes_requested_tab() {
        clientProfilePage.verifyCancelRequestButtonFunctionalityInQuotesRequestedTab();
    }

    @Then("Verify Client user is able to navigate to Reviews Page")
    public void verify_client_user_is_able_to_navigate_to_reviews_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToReviewsPage();
    }

    @Then("Verify Pending Reviews section for client")
    public void verify_pending_reviews_section_for_client() {
        clientProfilePage.verifyPendingReviewsSectionForClient();
    }

    @Then("Verify My Reviews section")
    public void verify_my_reviews_section() {
        clientProfilePage.verifyMyReviewsSection();
    }

    @Then("Verify Leave a Review CTA functionality for client")
    public void verify_leave_a_review_cta_functionality_for_client() {
        clientProfilePage.verifyLeaveReviewCTAFunctionalityForClient();
    }

    @Then("Verify Client user is able to navigate to Billing History page")
    public void verify_client_user_is_able_to_navigate_to_billing_history_page() {
        clientProfilePage.verifyClientUserIsAbleToNavigateToBillingHistoryPage();
    }

    @Then("Verify Billing History list")
    public void verify_billing_history_list() {
        clientProfilePage.verifyBillingHistoryList();
    }

    @Then("Verify Each record")
    public void verify_each_record() {
        clientProfilePage.verifyEachRecord();
    }

    @Then("Verify Transaction Details of Unpaid bill")
    public void verify_transaction_details_of_unpaid_bill() {

    }

    @Then("Verify Transaction Details of Paid bill")
    public void verify_transaction_details_of_paid_bill() {
        clientProfilePage.verifyTransactionDetailsOfPaidBill();
    }

    @Then("Verify Date Sort Up and Sort Down functionality")
    public void verify_date_sort_up_and_sort_down_functionality() {
        clientProfilePage.verifyDateSortUpAndSortDownFunctionality();
    }

    @Then("Verify Amount Sort Up and Sort Down functionality")
    public void verify_amount_sort_up_and_sort_down_functionality() {
        clientProfilePage.verifyAmountSortUpAndSortDownFunctionality();
    }

    @Then("Verify Search functionality for billing history")
    public void verify_search_functionality_for_billing_history() {
        clientProfilePage.verifySearchFunctionalityForBillingHistory();
    }

    @Then("Verify Download CSV Functionality")
    public void verify_download_csv_functionality() {
        clientProfilePage.verifyDownloadCsvFunctionality();
    }

    @Then("Verify Show filter Functionality for billing history")
    public void verify_show_filter_functionality_for_billing_history() {
        clientProfilePage.verifyShowFilterFunctionalityForBillingHistory();
    }

    @Then("Verify Date filter Functionality")
    public void verify_date_filter_functionality() {
        clientProfilePage.verifyDateFilterFunctionality();
    }

    @Then("Verify Pay Now button Functionality")
    public void verify_pay_now_button_functionality() {

    }

    @Then("Verify Add Optional button Functionality")
    public void verify_add_optional_button_functionality() {

    }

    @Then("Verify Back button functionality")
    public void verify_back_button_functionality() {

    }

    @Then("Verify Pagination")
    public void verify_pagination() {
        clientProfilePage.verifyPagination();
    }


}
