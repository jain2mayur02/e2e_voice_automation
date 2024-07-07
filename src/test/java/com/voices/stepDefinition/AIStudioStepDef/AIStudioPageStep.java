package com.voices.stepDefinition.AIStudioStepDef;

import com.voices.controlManager.TestContext;
import com.voices.managers.ReaderManager;
import com.voices.pageObjects.AIStudioPageObj.AIStudioPage;
import com.voices.pageObjects.HyperLinkPageObj.HyperLinkPage;
import com.voices.pageObjects.TalentProfilePageObj.TalentProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AIStudioPageStep {

    TestContext testContext;
    AIStudioPage aiStudioPage;
    HyperLinkPage hyperLinkPage;

    public AIStudioPageStep(TestContext testContext) {
        this.testContext = testContext;
        aiStudioPage = testContext.getPageManager().getAIStudioPage();
        hyperLinkPage = testContext.getPageManager().getHomePage();
    }


    @Then("Verify AI Voice section is not displayed on Profile page for Non AI talent users")
    public void verify_ai_voice_section_is_not_displayed_on_profile_page_for_non_ai_talent_users() {
        aiStudioPage.verifyAIVoiceSectionIsNotDisplayedOnProfilePageForNonAITalentUsers();
    }

    @When("User login with AI user credentials")
    public void user_login_with_ai_user_credentials() {
        hyperLinkPage.clickOnFindTalentUrl();
        hyperLinkPage.userLogin(ReaderManager.getInstance().getConfigReader().getAIUserName(), ReaderManager.getInstance().getConfigReader().getAIPassword(), "AILoginUrl");
    }

    @Then("Verify AI Voice section is displayed on Profile page for AI talent users")
    public void verify_ai_voice_section_is_displayed_on_profile_page_for_ai_talent_users() {
        aiStudioPage.verifyAIVoiceSectionIsDisplayedOnProfilePageForAITalentUsers();
    }

    @Then("Verify client user able to navigate to AI Studio page via Talent profile page")
    public void verify_client_user_able_to_navigate_to_ai_studio_page_via_talent_profile_page() {
        aiStudioPage.verifyClientUserAbleToNavigateToAIStudioPageViaTalentProfilePage();
    }

    @Then("Verify client user able to navigate to AI Studio page via Sub Nav")
    public void verify_client_user_able_to_navigate_to_ai_studio_page_via_sub_nav() {
        aiStudioPage.verifyClientUserAbleToNavigateToAIStudioPageViaSubNav();
    }

    @Then("Verify Welcome to AI Studio modal Category Initial Selection Updates")
    public void verify_welcome_to_ai_studio_modal_category_initial_selection_updates() {
        aiStudioPage.verifyWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category Initial Selection Updates")
    public void verify_the_functionality_of_confirm_button_by_selecting_category_in_welcome_to_ai_studio_modal_category_initial_selection_updates() {
        aiStudioPage.verifyTheFunctionalityOfConfirmButtonBySelectingCategoryInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the Error Message for Project Name field in Welcome to AI Studio modal Category Initial Selection Updates")
    public void verify_the_error_message_for_project_name_field_in_welcome_to_ai_studio_modal_category_initial_selection_updates() {
        aiStudioPage.verifyTheErrorMessageForProjectNameFieldInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category Initial Selection Updates")
    public void verify_the_functionality_of_confirm_button_by_selecting_category_and_entering_valid_project_name_in_welcome_to_ai_studio_modal_category_initial_selection_updates() {
        aiStudioPage.verifyTheFunctionalityOfConfirmButtonBySelectingCategoryAndEnteringValidProjectNameInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify that client user able to navigate to AI Studio page via Talent profile page")
    public void verify_that_client_user_able_to_navigate_to_ai_studio_page_via_talent_profile_page() {
        aiStudioPage.verifyClientUserAbleToNavigateToAIStudioPageViaTalentProfilePage();
    }

    @Then("Verify Welcome to AI Studio modal Category Initial Selection Updates via AI Talent profile page")
    public void verify_welcome_to_ai_studio_modal_category_initial_selection_updates_via_ai_talent_profile_page() {
        aiStudioPage.verifyWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category via AI Talent profile page")
    public void verify_the_functionality_of_confirm_button_by_selecting_category_in_welcome_to_ai_studio_modal_category_via_ai_talent_profile_page() {
        aiStudioPage.verifyTheFunctionalityOfConfirmButtonBySelectingCategoryInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the Error Message for Project Name field in Welcome to AI Studio modal Category via AI Talent profile page")
    public void verify_the_error_message_for_project_name_field_in_welcome_to_ai_studio_modal_category_via_ai_talent_profile_page() {
        aiStudioPage.verifyTheErrorMessageForProjectNameFieldInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category via AI Talent profile page")
    public void verify_the_functionality_of_confirm_button_by_selecting_category_and_entering_valid_project_name_in_welcome_to_ai_studio_modal_category_via_ai_talent_profile_page() {
        aiStudioPage.verifyTheFunctionalityOfConfirmButtonBySelectingCategoryAndEnteringValidProjectNameInWelcomeToAIStudioModalCategoryInitialSelectionUpdates();
    }

    @Then("Verify the Category and Project name is displayed correctly in studio page via AI Talent profile page")
    public void verify_the_category_and_project_name_is_displayed_correctly_in_studio_page_via_ai_talent_profile_page() {

    }

    @Then("Verify Go to Drafts button is not displayed in welcome modal if client account does not have at least {int} or more AI job in draft or done status")
    public void verify_go_to_drafts_button_is_not_displayed_in_welcome_modal_if_client_account_does_not_have_at_least_or_more_ai_job_in_draft_or_done_status(Integer int1) {
        aiStudioPage.verifyGoToDraftsButtonIsNotDisplayed();
    }

    @Then("Verify Go to Drafts button is displayed in welcome modal if client account have at least {int} or more AI job in draft or done status")
    public void verify_go_to_drafts_button_is_displayed_in_welcome_modal_if_client_account_have_at_least_or_more_ai_job_in_draft_or_done_status(Integer int1) {
        aiStudioPage.verifyGoToDraftsButtonIsDisplayed();
    }

    @When("User re login with AI user credentials")
    public void user_re_login_with_AI_user_credentials() {
        aiStudioPage.userLogoutFromUser();
        hyperLinkPage.userLogin(ReaderManager.getInstance().getConfigReader().getAIUserName(), ReaderManager.getInstance().getConfigReader().getAIPassword(), "searchUrl");
    }

    @Then("Verify the UI in studio page via AI Talent profile page")
    public void verify_the_ui_in_studio_page_via_ai_talent_profile_page() {
        aiStudioPage.verifyTheUIInStudioPageViaAITalentProfilePage();
    }

}
