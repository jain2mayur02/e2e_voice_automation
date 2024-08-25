package com.voices.stepDefinition.TalentProfileStepDef;

import com.voices.controlManager.TestContext;
import com.voices.pageObjects.TalentProfilePageObj.TalentProfilePage;
import io.cucumber.java.en.Then;


public class TalentProfilePageStep {
    TestContext testContext;
    TalentProfilePage talentProfilePage;

    public TalentProfilePageStep(TestContext testContext) {
        this.testContext = testContext;
        talentProfilePage = testContext.getPageManager().getTalentProfilePage();
    }

    @Then("Verify me drop down option for talent profile")
    public void verify_me_drop_down_option_for_talent_profile() {
        talentProfilePage.verifyMeIconOption();
    }

    @Then("Verify Talent user is able to navigate to My Home page")
    public void Verify_Talent_user_is_able_to_navigate_to_My_Home_page() {
        talentProfilePage.verifyTalentUserNavigateToHomePage();
    }

    @Then("Verify Project Marketplace Banner")
    public void Verify_Project_Marketplace_Banner() {
        talentProfilePage.verifyProjectMarketplaceBanner();
    }

    @Then("Verify Manual closing of Project Marketplace Banner")
    public void Verify_Manual_closing_of_Project_Marketplace_Banner() {
        talentProfilePage.verifyManualClosingProjectMarketplaceBanner();
    }

    @Then("Verify Jobs Section")
    public void Verify_Jobs_Section() {
        talentProfilePage.verifyJobSection();
    }

    @Then("Verify Shortlist Section")
    public void Verify_Shortlist_Section() {
        talentProfilePage.verifyShortlistSection();
    }

    @Then("Verify Profile Section")
    public void Verify_Profile_Section() {
        talentProfilePage.verifyProfileSection();
    }

    @Then("Verify Career Section")
    public void Verify_Career_Section() {
        talentProfilePage.verifyCareerSection();
    }

    @Then("Verify Customer Support Section")
    public void Verify_Customer_Support_Section() {
        talentProfilePage.verifyCustomerSupportSection();
    }

    @Then("Verify Talent user is able to navigate to Account Settings Page")
    public void verify_talent_user_is_able_to_navigate_to_account_settings_page() {
        talentProfilePage.navigateToAccountSettingPage();
    }

    @Then("Verify General Settings")
    public void verify_general_settings() {
        talentProfilePage.verifyGeneralSetting();
    }

    @Then("Verify Notifications")
    public void verify_notifications() {
        talentProfilePage.verifyNotification();
    }

    @Then("Verify SurePay")
    public void verify_sure_pay() {
        talentProfilePage.verifySurePay();
    }

    @Then("Verify Membership")
    public void verify_membership() {
        talentProfilePage.verifyMembership();
    }

    @Then("Verify Billing History")
    public void verify_billing_history() {
        talentProfilePage.verifyBillingHistory();
    }

    @Then("Verify Change Password")
    public void verify_change_password() {
        talentProfilePage.verifyChangePassword();
    }

    @Then("Verify Talent user is able to navigate to Statistics Page")
    public void verify_talent_user_is_able_to_navigate_to_statistics_page() {
        talentProfilePage.userAbleToNavigateToStatisticPage();
    }

    @Then("Verify Components in Statistics section")
    public void verify_components_in_statistics_section() {
        talentProfilePage.verifyComponentsInStatisticsSection();
    }

    @Then("Verify Components in Audition History Section")
    public void verify_components_in_audition_history_section() {
        talentProfilePage.verifyComponentsInAuditionHistorySection();

    }

    @Then("Verify Components in Demo History section")
    public void verify_components_in_demo_history_section() {
        talentProfilePage.verifyComponentsInDemoHistorySection();
    }

    @Then("Verify Helpful Resources")
    public void verify_helpful_resources() {
        talentProfilePage.verifyHelpfulResources();
    }

    @Then("Verify Talent user is able to navigate to Reviews Page")
    public void verify_talent_user_is_able_to_navigate_to_reviews_page() {
        talentProfilePage.userAbleToNavigateToReviewPage();
    }

    @Then("Verify Pending Reviews section")
    public void verify_pending_reviews_section() {
        talentProfilePage.verifyPendingReviewsSection();
    }

    @Then("Verify Received Compliments section")
    public void verify_received_compliments_section() {
        talentProfilePage.verifyReceivedComplimentsSection();
    }

    @Then("VerifyMy Reviews section")
    public void verify_my_reviews_section() {
        talentProfilePage.verifyMyReviewsSection();
    }

    @Then("Verify Leave a Review CTA functionality")
    public void verify_leave_a_review_cta_functionality() {
        talentProfilePage.verifyLeaveReviewCTAFunctionality();

    }

    @Then("Verify Client user is able to navigate to Response Templates page")
    public void verify_client_user_is_able_to_navigate_to_response_templates_page() {
        talentProfilePage.userAbleToNavigateToResponseTemplatePage();
    }

    @Then("Verify Add Your Live Directed Session Policy banner")
    public void verify_add_your_live_directed_session_policy_banner() {
        talentProfilePage.verifyAddYourLiveDirectedSessionPolicyBanner();
    }

    @Then("Verify User is able to dismiss the Add Your Live Directed Session Policy banner manually")
    public void verify_user_is_able_to_dismiss_the_add_your_live_directed_session_policy_banner_manually() {
        talentProfilePage.verifyUserIsAbleToDismissPolicyBannerManually();
    }

    @Then("Verify Drag to Reorder functionality")
    public void verify_drag_to_reorder_functionality() {

    }

    @Then("Verify Response Template Record in the list")
    public void verify_response_template_record_in_the_list() {
        talentProfilePage.verifyResponseTemplateRecordInList();
    }

    @Then("Verify Down arrow functionality")
    public void verify_down_arrow_functionality() {
        talentProfilePage.verifyDownArrowFunctionality();
    }

    @Then("Verify Up arrow functionality")
    public void verify_up_arrow_functionality() {
        talentProfilePage.verifyUpArrowFunctionality();
    }

    @Then("Verify Talent user is able to navigate to Manage Packages Page")
    public void verify_talent_user_is_able_to_navigate_to_manage_packages_page() {
        talentProfilePage.userAbleToNavigateToManagePackagePage();
    }

    @Then("Verify Draft Tab")
    public void verify_draft_tab() {
        talentProfilePage.verifyDraftTab();
    }

    @Then("Verify Delete Functionality of A Draft Tab record")
    public void verify_delete_functionality_of_a_draft_tab_record() {
        talentProfilePage.verifyDeleteFunctionalityOfDraftTabRecord();
    }

    @Then("Verify Search Functionality of A Draft Tab record")
    public void verify_search_functionality_of_a_draft_tab_record() {
        talentProfilePage.verifySearchFunctionalityOfDraftTabRecord();
    }

    @Then("Verify Pending Review Tab")
    public void verify_pending_review_tab() {
        talentProfilePage.verifyPendingReviewTab();
    }

    @Then("Verify Delete Functionality of A Pending Review Tab record")
    public void verify_delete_functionality_of_a_pending_review_tab_record() {
        talentProfilePage.verifyDeleteFunctionalityOfPendingReviewTabRecord();
    }

    @Then("Verify Search Functionality of A Pending Review record")
    public void verify_search_functionality_of_a_pending_review_record() {
        talentProfilePage.verifySearchFunctionalityOfPendingReviewRecord();
    }

    @Then("Verify Approved Tab")
    public void verify_approved_tab() {
        talentProfilePage.verifyApprovedTab();
    }

    @Then("Verify Deactivate Functionality of Approved Tab record")
    public void verify_deactivate_functionality_of_approved_tab_record() {
        talentProfilePage.verifyDeactivateFunctionalityOfApprovedTabRecord();
    }

    @Then("Verify Activate Functionality of Approved Tab record")
    public void verify_activate_functionality_of_approved_tab_record() {
        talentProfilePage.verifyActivateFunctionalityOfApprovedTabRecord();
    }

    @Then("Verify Search Functionality of Approved tab record")
    public void verify_search_functionality_of_approved_tab_record() {
        talentProfilePage.verifySearchFunctionalityOfApprovedTabRecord();
    }

    @Then("Verify Talent user is able to navigate to Edit Profile Page")
    public void verify_talent_user_is_able_to_navigate_to_edit_profile_page() {
        talentProfilePage.userAbleToNavigateToEditProfilePage();
    }

    @Then("Verify Talent Member Section")
    public void verify_talent_member_section() {
        talentProfilePage.verifyTalentMemberSection();
    }


    @Then("Verify Member Container section")
    public void verify_member_container_section() {
        talentProfilePage.verifyMemberContainerSection();
    }

    @Then("Verify Personal Info tab")
    public void verify_personal_info_tab() {
        talentProfilePage.verifyPersonalInfoTab();
    }

    @Then("Verify Overview tab")
    public void verify_overview_tab() {
        talentProfilePage.verifyOverviewTab();
    }

    @Then("Verify Demos Tab")
    public void verify_demos_tab() {
        talentProfilePage.verifyDemosTab();
    }

    @Then("Verify Each record in Demo Samples list")
    public void verify_each_record_in_demo_samples_list() {
        talentProfilePage.verifyEachRecordInDemoSamplesList();
    }

    @Then("Verify Add Demo button")
    public void verify_add_demo_button() {
        talentProfilePage.verifyAddDemoButton("Arabic", "Algerian", "Abrupt", "Airhead", "Teen (13-17)");
    }

    @Then("Verify Exit Demo button functionality")
    public void verify_exit_demo_button_functionality() {
        talentProfilePage.verifyExitDemoButtonFunctionality("Arabic", "Algerian", "Abrupt", "Airhead", "Teen (13-17)");
    }

    @Then("Verify Cancel button in Add Demo page")
    public void Verify_Cancel_button_in_Add_Demo_page() {
        talentProfilePage.verifyCancelDemoButtonFunctionality("Arabic", "Algerian", "Abrupt", "Airhead", "Teen (13-17)");
    }

    @Then("Verify Edit Demo button functionality")
    public void Verify_Edit_Demo_button_functionality() {
        talentProfilePage.verifyEditDemoButtonFunctionality("Dutch");
    }

    @Then("Verify Cancel button in Edit Demo Page")
    public void verify_cancel_button_in_edit_demo_page() {
        talentProfilePage.verifyCancelButtonInEditDemoPage("French");
    }

    @Then("Verify Delete button in Edit Demo Page")
    public void verify_delete_button_in_edit_demo_page() {
        talentProfilePage.verifyDeleteButtonInEditDemoPage("French");
    }

    @Then("Verify Exit button in Edit Demo Page")
    public void verify_exit_button_in_edit_demo_page() {
        talentProfilePage.verifyExitButtonInEditDemoPage("French");
    }

    @Then("Verify Drag To Reorder button functionality")
    public void verify_drag_to_reorder_button_functionality() {
        talentProfilePage.verifyDragToReorderButtonFunctionality();
    }

    @Then("Verify Play button of Demo Sample")
    public void verify_play_button_of_demo_sample() {
        talentProfilePage.verifyPlayButtonOfDemoSample();
    }

    @Then("Verify Navigation to Public Profile page")
    public void verify_navigation_to_public_profile_page() {
        talentProfilePage.verifyNavigationToPublicProfilePage();
    }

    @Then("Verify Profile Top Header")
    public void verify_profile_top_header() {
        talentProfilePage.verifyProfileTopHeader();
    }

    @Then("Verify Talent Profile Container")
    public void verify_talent_profile_container() {
        talentProfilePage.verifyTalentProfileContainer();
    }

    @Then("Verify Profile content")
    public void verify_profile_content() {
        talentProfilePage.verifyProfileContent();
    }

    @Then("Verify Share button")
    public void verify_share_button() {
        talentProfilePage.verifyShareButton();
    }

    @Then("Verify Portfolio tab")
    public void verify_portfolio_tab() {
        talentProfilePage.verifyPortfolioTab();
    }

    @Then("Verify About Talent tab")
    public void verify_about_talent_tab() {
        talentProfilePage.verifyAboutTalentTab();
    }

    @Then("Verify Packages")
    public void verify_packages() {
        talentProfilePage.verifyPackages();
    }

    @Then("Verify Demos")
    public void verify_demos() {
        talentProfilePage.verifyDemos();
    }

    @Then("Verify Reviews Container")
    public void verify_reviews_container() {
        talentProfilePage.verifyReviewsContainer();
    }

    @Then("Verify Invite To Job and Message Talent buttons")
    public void verify_invite_to_job_and_message_talent_buttons() {
        talentProfilePage.verifyInviteToJobAndMessageTalentButtons();
    }

    @Then("Verify Past Clients section and Profile Metadata Section")
    public void verify_past_clients_section_and_profile_metadata_section() {
        talentProfilePage.verifyPastClientsSectionAndProfileMetadataSection();
    }


}
