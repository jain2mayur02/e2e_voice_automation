package com.voices.stepDefinition.AIStudioStepDef;

import com.voices.controlManager.TestContext;
import com.voices.managers.ReaderManager;
import com.voices.pageObjects.AIStudioPageObj.AIStudioPage;
import com.voices.pageObjects.HyperLinkPageObj.HyperLinkPage;
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

    @Then("Verify by clicking on Voices logo")
    public void verify_by_clicking_on_voices_logo() {
        aiStudioPage.verifyByClickingOnVoicesLogo();
    }

    @Then("Verify user able to Save the AI studio by clicking on Voices logo button Save and Exit button")
    public void verify_user_able_to_save_the_ai_studio_by_clicking_on_voices_logo_button_save_and_exit_button() {
        aiStudioPage.verifyUserAbleToSaveTheAIStudioByClickingOnVoicesLogoButtonSaveAndExitButton();
    }

    @Then("Verify by clicking on Exit button")
    public void verify_by_clicking_on_exit_button() {
        aiStudioPage.verifyByClickingOnExitButton();
    }

    @Then("Verify user able to Save the AI studio by clicking on Exit button Save and Exit button")
    public void verify_user_able_to_save_the_ai_studio_by_clicking_on_exit_button_save_and_exit_button() {
        aiStudioPage.verifyUserAbleToSaveTheAIStudioByClickingOnVoicesLogoButtonSaveAndExitButton();
    }

    @Then("Verify Save & Exit modal is not displayed if user clicks on exit button")
    public void verify_save_exit_modal_is_not_displayed_if_user_clicks_on_exit_button() {
        aiStudioPage.verifySaveExitModalIsNotDisplayedIfUserClicksOnExitButton();
    }

    @Then("Confirm text block is displayed with default script")
    public void confirm_text_block_is_displayed_with_default_script() {
        aiStudioPage.confirmTextBlockIsDisplayedWithDefaultScript();
    }

    @Then("Confirm if there is only one text block move up down and delete buttons should be disabled")
    public void confirm_if_there_is_only_one_text_block_move_up_down_and_delete_buttons_should_be_disabled() {
        aiStudioPage.moveUpDownAndDeleteButtonsShouldBeDisabled();
    }

    @Then("Verify user able to play Audio player within text block")
    public void verify_user_able_to_play_audio_player_within_text_block() {
        aiStudioPage.verifyUserAbleToPlayAudioPlayerWithinTextBlock();
    }

    @Then("Verify Word count within text block")
    public void verify_word_count_within_text_block() {
        aiStudioPage.verifyWordCountWithinTextBlock();
    }

    @Then("Verify user should not able to play Audio player if text block does not have any words")
    public void verify_user_should_not_able_to_play_audio_player_if_text_block_does_not_have_any_words() {
        aiStudioPage.verifyUserShouldNotAbleToPlayAudioPlayerIfTextBlockDoesNotHaveAnyWords();
    }

    @Then("Verify error message is displayed and audio player is not clickable if user enters dirty word filter within text block single text block")
    public void verify_error_message_is_displayed_and_audio_player_is_not_clickable_if_user_enters_dirty_word_filter_within_text_block_single_text_block() {
        aiStudioPage.verifyErrorMessageForDirtyWordSingleTextBlock();
    }

    @Then("Confirm Error Message gets cleared if user remove the dirty word filter")
    public void confirm_error_message_gets_cleared_if_user_remove_the_dirty_word_filter() {
        aiStudioPage.confirmErrorMessageGetsClearedIfUserRemoveTheDirtyWordFilter();
    }

    @Then("Verify error message is displayed and audio player is not clickable if user enters restriction word filter within text block single text block")
    public void verify_error_message_is_displayed_and_audio_player_is_not_clickable_if_user_enters_restriction_word_filter_within_text_block_single_text_block() {
        aiStudioPage.verifyErrorMessageForRestrictedWordSingleTextBlock();
    }

    @Then("Confirm Error Message gets cleared if user remove the restricted word filter")
    public void confirm_error_message_gets_cleared_if_user_remove_the_restricted_word_filter() {
        aiStudioPage.confirmErrorMessageGetsClearedIfUserRemoveTheDirtyWordFilter();
    }

    @Then("Confirm user able to add multiple text block")
    public void confirm_user_able_to_add_multiple_text_block() {
        aiStudioPage.confirmUserAbleToAddMultipleTextBlock();
    }

    @Then("Confirm if there is more than one text block move up down and delete buttons should be enabled")
    public void confirm_if_there_is_more_than_one_text_block_move_up_down_and_delete_buttons_should_be_enabled() {
        aiStudioPage.moveUpDownAndDeleteButtonsShouldBeEnabled();
    }

    @Then("Verify Move up icon within text block")
    public void verify_move_up_icon_within_text_block() {
        aiStudioPage.verifyMoveUpIconWithinTextBlock();
    }

    @Then("Verify Move down icon within text block")
    public void verify_move_down_icon_within_text_block() {
        aiStudioPage.verifyMoveDownIconWithinTextBlock();
    }

    @Then("Verify error message is displayed and audio player is not clickable if user enters dirty word filter within text block multiple text block")
    public void verify_error_message_is_displayed_and_audio_player_is_not_clickable_if_user_enters_dirty_word_filter_within_text_block_multiple_text_block() {
        aiStudioPage.verifyErrorMessageForDirtyWordMultipleTextBlock();
    }

    @Then("Verify error message is displayed and audio player is not clickable if user enters restriction word filter within text block multiple text block")
    public void verify_error_message_is_displayed_and_audio_player_is_not_clickable_if_user_enters_restriction_word_filter_within_text_block_multiple_text_block() {
        aiStudioPage.verifyErrorMessageForRestrictedWordMultipleTextBlock();
    }

    @Then("Confirm user able to delete text block")
    public void confirm_user_able_to_delete_text_block() {
        aiStudioPage.confirmUserAbleToDeleteTextBlock();
    }

    @Then("Verify user should not able to add more than one fifty words in single text block")
    public void verify_user_should_not_able_to_add_more_than_one_fifty_words_in_single_text_block() {
        aiStudioPage.verifyUserNotAbleToAddMoreThanOneFiftyWordsInSingleTextBlock();
    }

    @Then("Confirm Default speed should be 1x")
    public void confirm_default_speed_should_be_1x() {
        aiStudioPage.confirmDefaultSpeedShouldBe1x();
    }

    @Then("Verify Speed adjustment for single text block")
    public void verify_speed_adjustment_for_single_text_block() {
        aiStudioPage.verifySpeedAdjustmentForSingleBlock();
    }

    @Then("Verify Speed adjustment for multiple text block")
    public void verify_speed_adjustment_for_multiple_text_block() {
        aiStudioPage.verifySpeedAdjustmentForMultipleBlock();
    }

    @Then("Confirm User able to adjust speed zero 75x")
    public void confirm_user_able_to_adjust_speed_zero_75x() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(0.75, "0.75");
    }

    @Then("Confirm User able to adjust speed Onex")
    public void confirm_user_able_to_adjust_speed_onex() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(1.0, "1");
    }

    @Then("Confirm User able to adjust speed One 25x")
    public void confirm_user_able_to_adjust_speed_one_25x() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(1.25, "1.25");
    }

    @Then("Confirm User able to adjust speed One 5x")
    public void confirm_user_able_to_adjust_speed_one_5x() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(1.5, "1.5");
    }

    @Then("Confirm User able to adjust speed One 75x")
    public void confirm_user_able_to_adjust_speed_one_75x() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(1.75, "1.75");
    }

    @Then("Confirm User able to adjust speed Twox")
    public void confirm_user_able_to_adjust_speed_twox() {
        aiStudioPage.verifySpeedAdjustmentForAnySpeed(2.0, "2");
    }

    @Then("Confirm User able to adjust speed Twox to One 25x")
    public void confirm_user_able_to_adjust_speed_twox_to_one_25x() {
        aiStudioPage.verifySpeedAdjustmentBetweenTwoPoint(2.0, "2", 1.25, "1.25");
    }

    @Then("Confirm User able to adjust speed One 5x to Zero 75x")
    public void confirm_user_able_to_adjust_speed_one_5x_to_zero_75x() {
        aiStudioPage.verifySpeedAdjustmentBetweenTwoPoint(1.5, "1.5", 0.75, "0.75");
    }

    @Then("Confirm User able to adjust speed One x to One 5x")
    public void confirm_user_able_to_adjust_speed_one_x_to_one_5x() {
        aiStudioPage.verifySpeedAdjustmentBetweenTwoPoint(1.0, "1", 1.5, "1.5");
    }

    @Then("Confirm User able to adjust speed Zero 75x to Twox")
    public void confirm_user_able_to_adjust_speed_zero_75x_to_twox() {
        aiStudioPage.verifySpeedAdjustmentBetweenTwoPoint(0.75, "0.75", 2.0, "2");
    }

    @Then("Confirm User able to adjust speed One 5x to One 5x")
    public void confirm_user_able_to_adjust_speed_one_5x_to_one_5x() {
        aiStudioPage.verifySpeedAdjustmentBetweenTwoPoint(1.5, "1.5", 1.5, "1.5");
    }

    @Then("Verify Price Per word is displayed correctly for Broadcast within AI Studio")
    public void verify_price_per_word_is_displayed_correctly_for_broadcast_within_ai_studio() {
        aiStudioPage.verifyPricePerWordForBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly for Non-Broadcast within AI Studio")
    public void verify_price_per_word_is_displayed_correctly_for_non_broadcast_within_ai_studio() {
        aiStudioPage.verifyPricePerWordForNonBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Category Non broadcast to Non broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_category_non_broadcast_to_non_broadcast() {
        aiStudioPage.verifyPricePerWordForNonBroadcastToNonBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Category Non-broadcast to broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_category_non_broadcast_to_broadcast() {
        aiStudioPage.verifyPricePerWordForNonBroadcastToBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Category broadcast to Non broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_category_broadcast_to_non_broadcast() {
        aiStudioPage.verifyPricePerWordForBroadcastToNonBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Category Broadcast to broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_category_broadcast_to_broadcast() {
        aiStudioPage.verifyPricePerWordForBroadcastToBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Voice Clone David to Rachael Broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_voice_clone_david_to_rachael_broadcast() {
        aiStudioPage.verifyPricePerWordForDavidToRachaelBroadcastWithinAIStudio();
    }

    @Then("Verify Price Per word is displayed correctly if user edit Voice Clone David to Rachael Non Broadcast")
    public void verify_price_per_word_is_displayed_correctly_if_user_edit_voice_clone_david_to_rachael_non_broadcast() {
        aiStudioPage.verifyPricePerWordForDavidToRachaelNonBroadcastWithinAIStudio();
    }



    @Then("Verify Save Draft button is disabled if AI studio has zero words")
    public void verify_save_draft_button_is_disabled_if_ai_studio_has_zero_words() {
        aiStudioPage.verifySaveDraftButtonIsDisabledIfAIStudioHasZeroWords();
    }

    @Then("Verify Save Draft button is disabled if text block contains error message dirty word")
    public void verify_save_draft_button_is_disabled_if_text_block_contains_error_message_dirty_word() {
        aiStudioPage.verifySaveDraftButtonIsDisabledIfAIStudioHasDirtyWords();
    }

    @Then("Verify Save Draft button is disabled if text block contains error message restriction word")
    public void verify_save_draft_button_is_disabled_if_text_block_contains_error_message_restriction_word() {
        aiStudioPage.verifySaveDraftButtonIsDisabledIfAIStudioHasRestrictedWords();
    }

    @Then("Verify Functionality of Save Draft button")
    public void verify_functionality_of_save_draft_button() {
        aiStudioPage.verifyFunctionalityOfSaveDraftButton();
    }

    @Then("Verify Functionality of Save Draft button by editing the AI Studio")
    public void verify_functionality_of_save_draft_button_by_editing_the_ai_studio() {
        aiStudioPage.verifyFunctionalityOfSaveDraftButtonByEditingAIStudio();
    }

    @Then("Verify {int} Error if user tries to access deleted draft AI studio")
    public void verify_error_if_user_tries_to_access_deleted_draft_ai_studio(Integer errorCode) {
        aiStudioPage.verifyErrorIfUserTriesToAccessDeletedDraftAIStudio(errorCode);
    }

    @Then("Verify Functionality of Edit Draft button")
    public void verify_functionality_of_edit_draft_button() {
        aiStudioPage.verifyFunctionalityOfEditDraftButton();
    }

    @Then("Verify AI Studio is saved as Draft My Home Jobs All Jobs Draft Draft tab within AI Studio")
    public void verify_ai_studio_is_saved_as_draft_my_home_jobs_all_jobs_draft_draft_tab_within_ai_studio() {
        aiStudioPage.verifyAIStudioIsSavedAsDraft();
    }

    @Then("Verify by deleting the Draft AI studio via Drafts tab within AI Studio")
    public void verify_by_deleting_the_draft_ai_studio_via_drafts_tab_within_ai_studio() {
        aiStudioPage.verifyByDeletingDraftAIStudioViaDraftsTab();
    }

    @Then("Verify by deleting the Draft AI studio via Drafts tab within Jobs page Draft tab")
    public void verify_by_deleting_the_draft_ai_studio_via_drafts_tab_within_jobs_page_draft_tab() {
        aiStudioPage.verifyByDeletingDraftAIStudioViaDraftsTab();
    }

    @Then("Verify Search functionality within AI Studio Draft Tab")
    public void verify_search_functionality_within_ai_studio_draft_tab() {
        aiStudioPage.verifySearchFunctionality();
    }

    @Then("Verify Sort functionality within AI Studio Draft Tab")
    public void verify_sort_functionality_within_ai_studio_draft_tab() {
        aiStudioPage.verifySortFunctionality();
    }

    @Then("Verify Ai studio is saved as Draft if user navigates to check out page and land back on AI Studio page")
    public void verify_ai_studio_is_saved_as_draft_if_user_navigates_to_check_out_page_and_land_back_on_ai_studio_page() {
        aiStudioPage.verifySavedAsDraftNavigatesToCheckOutPageAndBackAIStudioPage();
    }

    @Then("Verify user lands on Home page if user clicks on Exit button if AI studio is already saved")
    public void verify_user_lands_on_home_page_if_user_clicks_on_exit_button_if_ai_studio_is_already_saved() {
        aiStudioPage.verifyUserLandsOnHomePageIfUserClicksExitButtonForAlreadySaved();
    }

    @Then("Verify Exit modal shows up if user clicks on Exit button if AI Studio is not saved")
    public void verify_exit_modal_shows_up_if_user_clicks_on_exit_button_if_ai_studio_is_not_saved() {
        aiStudioPage.verifyExitModalShowsIfClickExitButtonForNotSavedJob();
    }

    @Then("Verify AI Studio is saved as Draft and if user clicks on Save and Exit button within AI studio Exit modal")
    public void verify_ai_studio_is_saved_as_draft_and_if_user_clicks_on_save_and_exit_button_within_ai_studio_exit_modal() {
        aiStudioPage.verifyAIStudioIsSavedIfClickExitButtonForNotSavedJob();
    }

    @Then("Verify AI Studio is not saved as Draft and if user clicks on Discard changes button within AI studio Exit modal")
    public void verify_ai_studio_is_not_saved_as_draft_and_if_user_clicks_on_discard_changes_button_within_ai_studio_exit_modal() {
        aiStudioPage.verifyAIStudioIsNotSavedIfClickExitButtonForNotSavedJob();
    }

    @Then("Verify AI Studio is not saved as Draft and if user clicks on close icon within AI studio Exit modal")
    public void verify_ai_studio_is_not_saved_as_draft_and_if_user_clicks_on_close_icon_within_ai_studio_exit_modal() {
        aiStudioPage.verifyAIStudioIsNotSavedIfClickCloseButtonForNotSavedJob();
    }

    @Then("Verify Exit modal shows up if user clicks on Voices logo if AI Studio is not saved Voices logo")
    public void verify_exit_modal_shows_up_if_user_clicks_on_voices_logo_if_ai_studio_is_not_saved_voices_logo() {
        aiStudioPage.verifyExitModalShowsIfClickExitButtonForNotSavedJobVoicesLogo();
    }

    @Then("Verify AI Studio is saved as Draft and if user clicks on Save and Exit button within AI studio Exit modal Voices logo")
    public void verify_ai_studio_is_saved_as_draft_and_if_user_clicks_on_voices_logo_within_ai_studio_exit_modal_voices_logo() {
        aiStudioPage.verifyAIStudioIsSavedIfClickExitButtonForNotSavedJobVoicesLogo();
    }

    @Then("Verify AI Studio is not saved as Draft and if user clicks on Discard changes button within AI studio Exit modal Voices logo")
    public void verify_ai_studio_is_not_saved_as_draft_and_if_user_clicks_on_discard_changes_button_within_ai_studio_exit_modal_voices_logo() {
        aiStudioPage.verifyAIStudioIsNotSavedIfClickExitButtonForNotSavedJobVoicesLogo();
    }

    @Then("Verify AI Studio is not saved as Draft and if user clicks on close icon within AI studio Exit modal Voices logo")
    public void verify_ai_studio_is_not_saved_as_draft_and_if_user_clicks_on_close_icon_within_ai_studio_exit_modal_voices_logo() {
        aiStudioPage.verifyAIStudioIsNotSavedIfClickCloseButtonForNotSavedJobVoicesLogo();
    }

    @Then("Verify AI Drafts job should not be displayed in Job form public job")
    public void verify_ai_drafts_job_should_not_be_displayed_in_job_form_public_job() {
        aiStudioPage.verifyAIDraftsJobShouldNotDisplayedInJobFormPublicJob();
    }

    @Then("Verify the Price should be {int} if word count is {int}")
    public void verify_the_price_should_be_if_word_count_is(Integer int1, Integer int2) {
        aiStudioPage.verifyPriceShouldBeZeroIfWordCountIsZero();
    }

    @Then("Verify the Price for the default script for Broadcast category")
    public void verify_the_price_for_the_default_script_for_broadcast_category() {
        aiStudioPage.verifyPriceForDefaultScriptForBroadcastCategory();
    }

    @Then("Verify Price gets increased if user add the words to the default script within text block for Broadcast category")
    public void verify_price_gets_increased_if_user_add_the_words_to_the_default_script_within_text_block_for_broadcast_category() {
        aiStudioPage.verifyPriceGetsIncreasedForAddingWordsToDefaultScriptForBroadcastCategory();
    }

    @Then("Verify Price gets increased if user add the words to the text block2 for Broadcast category")
    public void verify_price_gets_increased_if_user_add_the_words_to_the_text_block2_for_broadcast_category() {
        aiStudioPage.verifyPriceGetsIncreasedIfAddWordsToTextBlock2ForBroadCastCategory();
    }

    @Then("Verify Price gets decreased if user removes words from the default script within text block for Broadcast category")
    public void verify_price_gets_decreased_if_user_removes_words_from_the_default_script_within_text_block_for_broadcast_category() {
        aiStudioPage.verifyPriceIfRemovesWordsFromDefaultScriptWithinTextBlockForBroadcastCategory();
    }

    @Then("Verify Price gets decreased if user add the words and remove the words and delete the text block for Broadcast category")
    public void verify_price_gets_decreased_if_user_add_the_words_and_remove_the_words_and_delete_the_text_block_for_broadcast_category() {
        aiStudioPage.verifyPriceIfAddRemoveWordsAndDeleteTextBlockForBroadcastCategory();
    }

    @Then("Verify the Price for the default script for Non Broadcast category")
    public void verify_the_price_for_the_default_script_for_non_broadcast_category() {
        aiStudioPage.verifyPriceForDefaultScriptForNonBroadcastCategory();
    }

    @Then("Verify Price gets increased if user add the words to the default script within text block for Non Broadcast category")
    public void verify_price_gets_increased_if_user_add_the_words_to_the_default_script_within_text_block_for_non_broadcast_category() {
        aiStudioPage.verifyPriceGetsIncreasedForAddingWordsToDefaultScriptForNonBroadcastCategory();
    }

    @Then("Verify Price gets increased if user add the words to the text block2 for Non Broadcast category")
    public void verify_price_gets_increased_if_user_add_the_words_to_the_text_block2_for_non_broadcast_category() {
        aiStudioPage.verifyPriceGetsIncreasedIfAddWordsToTextBlock2ForNonBroadCastCategory();
    }

    @Then("Verify Price gets decreased if user removes words from the default script within text block for Non Broadcast category")
    public void verify_price_gets_decreased_if_user_removes_words_from_the_default_script_within_text_block_for_non_broadcast_category() {
        aiStudioPage.verifyPriceIfRemovesWordsFromDefaultScriptWithinTextBlockForNonBroadcastCategory();
    }

    @Then("Verify Price gets decreased if user add the words and remove the words and delete the text block for Non Broadcast category")
    public void verify_price_gets_decreased_if_user_add_the_words_and_remove_the_words_and_delete_the_text_block_for_non_broadcast_category() {
        aiStudioPage.verifyPriceIfAddRemoveWordsAndDeleteTextBlockForNonBroadcastCategory();
    }

    @Then("Verify the price of AI studio when user selects different voice clone Non Broadcast")
    public void verify_the_price_of_ai_studio_when_user_selects_different_voice_clone_non_broadcast() {
        aiStudioPage.verifyPriceWhenUserSelectsDifferentVoiceCloneNonBroadcast();
    }

    @Then("Verify the price of AI studio when user selects different voice clone Broadcast")
    public void verify_the_price_of_ai_studio_when_user_selects_different_voice_clone_broadcast() {
        aiStudioPage.verifyPriceWhenUserSelectsDifferentVoiceCloneBroadcast();
    }

    @Then("Verify the price of AI studio if user edits the category from broadcast to non broadcast")
    public void verify_the_price_of_ai_studio_if_user_edits_the_category_from_broadcast_to_non_broadcast() {
        aiStudioPage.verifyPriceIfUserEditsCategoryFromBroadcastToNonBroadcast();
    }

    @Then("Verify the price of AI studio if user edits the category from broadcast to broadcast")
    public void verify_the_price_of_ai_studio_if_user_edits_the_category_from_broadcast_to_broadcast() {
        aiStudioPage.verifyPriceIfUserEditsCategoryFromBroadcastToBroadcast();
    }

    @Then("Verify the price of AI studio if user edits the category from non broadcast to broadcast")
    public void verify_the_price_of_ai_studio_if_user_edits_the_category_from_non_broadcast_to_broadcast() {
        aiStudioPage.verifyPriceIfUserEditsCategoryFromNonBroadcastToBroadcast();
    }

    @Then("Verify the price of AI studio if user edits the category from non broadcast to non broadcast")
    public void verify_the_price_of_ai_studio_if_user_edits_the_category_from_non_broadcast_to_non_broadcast() {
        aiStudioPage.verifyPriceIfUserEditsCategoryFromNonBroadcastToNonBroadcast();
    }

    @Then("Verify the price calculation is working as expected based on broadcast price per word total word count")
    public void verify_the_price_calculation_is_working_as_expected_based_on_broadcast_price_per_word_total_word_count() {
        aiStudioPage.verifyPriceCalculationForBroadcastPricePerWordTotalWordCount();
    }

    @Then("Verify the price calculation is working as expected based on non broadcast price per word total word count")
    public void verify_the_price_calculation_is_working_as_expected_based_on_non_broadcast_price_per_word_total_word_count() {
        aiStudioPage.verifyPriceCalculationForNonBroadcastPricePerWordTotalWordCount();
    }

    @Then("Verify Top nav word count matches with the default text block script")
    public void verify_top_nav_word_count_matches_with_the_default_text_block_script() {
        aiStudioPage.verifyTopNavWordCountMatchesWithDefaultTextBlockScript();
    }

    @Then("Verify Top Nav words count matches if user adds words to default script")
    public void verify_top_nav_words_count_matches_if_user_adds_words_to_default_script() {
        aiStudioPage.verifyTopNavWordsCountMatchesIfUserAddsWordsToDefaultScript();
    }

    @Then("Verify Top Nav words count matches if user remove few words from default script")
    public void verify_top_nav_words_count_matches_if_user_remove_few_words_from_default_script() {
        aiStudioPage.verifyTopNavWordsCountMatchesIfUserRemoveFewWordsFromDefaultScript();
    }

    @Then("Verify Top Nav word count by removing entire default script")
    public void verify_top_nav_word_count_by_removing_entire_default_script() {
        aiStudioPage.verifyTopNavWordCountByRemovingEntireDefaultScript();
    }

    @Then("Verify Top Nav word count by removing entire default script and adding entire new script")
    public void verify_top_nav_word_count_by_removing_entire_default_script_and_adding_entire_new_script() {
        aiStudioPage.verifyTopNavWordCountByRemovingEntireDefaultScriptAndAddingEntireNewScript();
    }

    @Then("Verify Top Nav word count by removing entire default script and by removing few words for newly added script")
    public void verify_top_nav_word_count_by_removing_entire_default_script_and_by_removing_few_words_for_newly_added_script() {
        aiStudioPage.verifyRemovingEntireDefaultScriptAndRemovingFewWordsForNewlyAddedScript();
    }

    @Then("Verify Word count within text block with default script")
    public void verify_word_count_within_text_block_with_default_script() {
        aiStudioPage.verifyTopNavWordCountMatchesWithDefaultTextBlockScript();
    }

    @Then("Verify Word count within text block by adding additional words to default script")
    public void verify_word_count_within_text_block_by_adding_additional_words_to_default_script() {
        aiStudioPage.verifyTopNavWordsCountMatchesIfUserAddsWordsToDefaultScript();
    }

    @Then("Verify Word count within text block by removing few words from default script")
    public void verify_word_count_within_text_block_by_removing_few_words_from_default_script() {
        aiStudioPage.verifyTopNavWordsCountMatchesIfUserRemoveFewWordsFromDefaultScript();
    }

    @Then("Verify word count within text block by removing entire default script")
    public void verify_word_count_within_text_block_by_removing_entire_default_script() {
        aiStudioPage.verifyTopNavWordCountByRemovingEntireDefaultScript();
    }

    @Then("Verify word count within text block by removing entire default script and adding entire new script")
    public void verify_word_count_within_text_block_by_removing_entire_default_script_and_adding_entire_new_script() {
        aiStudioPage.verifyTopNavWordCountByRemovingEntireDefaultScriptAndAddingEntireNewScript();
    }

    @Then("Verify word count within text block by removing entire default script and by removing few words for newly added script")
    public void verify_word_count_within_text_block_by_removing_entire_default_script_and_by_removing_few_words_for_newly_added_script() {
        aiStudioPage.verifyRemovingEntireDefaultScriptAndRemovingFewWordsForNewlyAddedScript();
    }

    @Then("Verify user should able to enter {int} words within text block")
    public void verify_user_should_able_to_enter_words_within_text_block(Integer expectedCount) {
        aiStudioPage.verifyUserShouldAbleToEnterWordsWithinTextBlock(expectedCount);
    }

    @Then("Verify text block should not contain more than {int} words")
    public void verify_text_block_should_not_contain_more_than_words(Integer expectedCount) {
        aiStudioPage.verifyTextBlockShouldNotContainMoreThanWords(expectedCount);
    }

}
