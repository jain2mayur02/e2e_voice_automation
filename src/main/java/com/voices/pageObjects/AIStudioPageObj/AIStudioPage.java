package com.voices.pageObjects.AIStudioPageObj;

import com.voices.baseClass.BaseClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AIStudioPage {

    private static WebDriver driver;

    public AIStudioPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='margin-zero text-lg font-medium']")
    private WebElement aiUserNameLink;
    @FindBy(xpath = "//p[@class='margin-bottom-smaller text-grey1 text-sm']")
    private WebElement aiUserDescription;
    @FindBy(xpath = "(//a[normalize-space()=\"Try David's AI Voice\"])[1]")
    private WebElement aiUserTryAIVoice;
    @FindBy(xpath = "//h3[text()='Welcome to AI Studio']")
    private WebElement welcomeToAIStudioHeader;
    @FindBy(xpath = "//strong[@class='text-dark']")
    private WebElement welcomeToAIStudioDescription;
    @FindBy(xpath = "//p[@class='margin-bottom-medium welcome-modal-helper-text']")
    private WebElement welcomeToAIStudioSubDescription;
    @FindBy(xpath = "//p[@class='helper-text margin-top-medium']")
    private WebElement licenceText;
    @FindBy(xpath = "//input[@id='ai_project_name']")
    private WebElement projectNameTextFiled;
    @FindBy(xpath = "//button[@id='submit-ai-welcome-modal']")
    private WebElement confirmButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Online Ad']/..")
    private WebElement onlineAdCategoryRadioButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Podcasting']/..")
    private WebElement podcastingCategoryRadioButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Animation']/..")
    private WebElement animationCategoryRadioButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Movie Trailers']/..")
    private WebElement movieTrailersCategoryRadioButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Television Ad']/..")
    private WebElement televisionCategoryRadioButton;
    @FindBy(xpath = "//div[@class='radio-input-group d-flex flex-wrap']//label[text()='Radio Ad']/..")
    private WebElement radioAdCategoryRadioButton;
    @FindBy(xpath = "//ul[@id='licensing-details']/li[1]")
    private WebElement onlineAdLicensingDetails01;
    @FindBy(xpath = "//ul[@id='licensing-details']/li[2]")
    private WebElement onlineAdLicensingDetails02;
    @FindBy(xpath = "//div[@class='form-input-message form-input-message-error']")
    private WebElement errorMessage;
    @FindBy(xpath = "//span[@id='header-project-name']")
    private WebElement projectName;
    @FindBy(xpath = "//i[@class='edit-studio-project-information far fa-edit']")
    private WebElement projectEditIcon;
    @FindBy(xpath = "//div[@id='header-category-icon']")
    private WebElement projectCategoryIcon;
    @FindBy(xpath = "//span[@id='header-project-category']")
    private WebElement projectCategoryName;
    @FindBy(xpath = "//div[@class='circle-avatar-container circle-avatar-container-xs']//img[@alt='Profile photo for David Kaplan']")
    private WebElement projectAvtarIcon;
    @FindBy(xpath = "//a[normalize-space()='Change voice']")
    private WebElement changeVoiceLink;
    @FindBy(xpath = "//button[@id='save-draft']")
    private WebElement saveDraftButton;
    @FindBy(xpath = "//span[@id='total-minutes']")
    private WebElement projectDuration;
    @FindBy(xpath = "//span[@id='total-words']")
    private WebElement projectWordCount;
    @FindBy(xpath = "//span[@id='total-words']/span")
    private WebElement totalWordCount;
    @FindBy(xpath = "//span[@id='total-price']")
    private WebElement projectTotalPrice;
    @FindBy(xpath = "//button[@id='continue-download']")
    private WebElement continueToDownloadButton;
    @FindBy(xpath = "//a[@id='exit-btn']")
    private WebElement exitButton;
    @FindBy(xpath = "//div[@class='ai-script-block-header']//div[@class='choices__inner']")
    private WebElement toneDropdown;
    @FindBy(xpath = "//textarea[@class='ai-script-input']")
    private WebElement projectTextBox;
    @FindBy(xpath = "(//button[@class='caret-up action-btns'])[1]")
    private WebElement moveUpButton;
    @FindBy(xpath = "(//button[@class='caret-up action-btns'])[2]")
    private WebElement moveUpButton2;
    @FindBy(xpath = "(//button[@class='caret-down action-btns'])[1]")
    private WebElement moveDownButton;
    @FindBy(xpath = "(//button[@class='caret-down action-btns'])[2]")
    private WebElement moveDownButton2;
    @FindBy(xpath = "(//button[@class='trash-icon action-btns'])[1]")
    private WebElement deleteButton;
    @FindBy(xpath = "(//button[@class='trash-icon action-btns'])[2]")
    private WebElement deleteButton2;
    @FindBy(xpath = "//div[@class='play-pause-btn']")
    private WebElement audioPlayButton;
    @FindBy(xpath = "//span[@class='script-block-speed-wrapper margin-left-small']")
    private WebElement audioPlayerSpeed;
    @FindBy(xpath = "//span[@class='ai-script-counter']")
    private WebElement wordCounter;
    @FindBy(xpath = "//button[@id='add-new-script']")
    private WebElement addTextBlockButton;
    @FindBy(xpath = "//h2[normalize-space()='Voice Clone']")
    private WebElement voiceCloneHeader;
    @FindBy(xpath = "//div[@class='circle-avatar-container circle-avatar-container-lg']")
    private WebElement voiceCloneAvtar;
    @FindBy(xpath = "//div[@class='talent-metadata']/h3")
    private WebElement voiceCloneAvtarName;
    @FindBy(xpath = "//i[@class='fas fa-pen text-blue1']")
    private WebElement voiceCloneEditIcon;
    @FindBy(xpath = "//div[@class='talent-metadata']/span[1]")
    private WebElement voiceCloneAccent;
    @FindBy(xpath = "//div[@class='talent-metadata']/span[2]")
    private WebElement voiceCloneAge;
    @FindBy(xpath = "//div[@class='talent-metadata']/span[3]")
    private WebElement voiceClonePricePerWord;
    @FindBy(xpath = "//input[@id='ai-speed']")
    private WebElement speedSlider;
    @FindBy(xpath = "//h2[normalize-space()='Pronunciation']")
    private WebElement pronunciationHeader;
    @FindBy(xpath = "//button[@id='manage-pronunciations']")
    private WebElement managePronunciationsButton;
    @FindBy(xpath = "//input[@id='ai_pronunciation']")
    private WebElement highlightAWordTextBox;
    @FindBy(xpath = "//input[@id='ai_pronunciation_replacement']")
    private WebElement changeToTextField;
    @FindBy(xpath = "//button[@id='preview-btn']")
    private WebElement previewLink;
    @FindBy(xpath = "//button[@id='add-pronunciation']")
    private WebElement saveLink;
    @FindBy(xpath = "//input[@id='ai_pause']")
    private WebElement addPauseTextBox;
    @FindBy(xpath = "//button[@id='add-pause']")
    private WebElement addPauseButton;
    @FindBy(xpath = "//button[@id='pause_0_25_sec']")
    private WebElement pauseButton01;
    @FindBy(xpath = "//button[@id='pause_1_sec']")
    private WebElement pauseButton02;
    @FindBy(xpath = "//button[@id='pause_1_5_sec']")
    private WebElement pauseButton03;
    @FindBy(xpath = "//button[@id='go-draft-modal-btn']")
    private WebElement goToDraftButton;
    @FindBy(xpath = "//div[@class='circle-avatar-container circle-avatar-container-xs']//div[contains(@class,'circle-avatar circle-avatar-upload')]")
    private WebElement meIcon;
    @FindBy(xpath = "//li[@class='nav-main-dropdown-list-item']//a[@class='nav-main-dropdown-link'][normalize-space()='Log Out']")
    private WebElement logoutLink;
    @FindBy(xpath = "//div[@id='voices-studio-logo']/a")
    private WebElement voicesStudioLogo;
    @FindBy(xpath = "//button[@id='just-exit-modal']")
    private WebElement discardChangesButton;
    @FindBy(xpath = "//button[@id='submit-save-exit-modal']")
    private WebElement saveAndExitButton;
    @FindBy(xpath = "//h3[normalize-space()='Save and Exit']")
    private WebElement saveAndExitHeader;
    @FindBy(xpath = "//h1[contains(text(),'Welcome back')]")
    private WebElement welcomeBackHeader;
    @FindBy(xpath = "//div[@class='jobs-info-wrapper']/div[1]//span[@class='job-title']")
    private WebElement firstDraftProjectName;
    @FindBy(xpath = "(//form[@id='ai-scripts']//textarea[@class='ai-script-input'])[1]")
    private WebElement firstProjectTextBlock;
    @FindBy(xpath = "(//form[@id='ai-scripts']//textarea[@class='ai-script-input'])[2]")
    private WebElement secondProjectTextBlock;
    @FindBy(xpath = "//span[@class='current-time']")
    private WebElement audioCurrentTime;
    @FindBy(xpath = "(//span[@class='word-counter'])[1]")
    private WebElement wordCount;
    @FindBy(xpath = "(//span[@class='word-counter'])[2]")
    private WebElement secondBlockWordCount;
    @FindBy(xpath = "(//div[@class='form-input-message form-input-message-error']/span)[1]")
    private WebElement shitErrorMessage;
    @FindBy(xpath = "(//div[@class='form-input-message form-input-message-error']/span)[2]")
    private WebElement shitErrorMessage2;
    @FindBy(xpath = "//div[@class='form-input-message form-input-message-error']")
    private WebElement blankErrorMessage;
    @FindBy(xpath = "//form[@id='ai-scripts']/div[1]")
    private WebElement firstTextBlock;
    @FindBy(xpath = "//form[@id='ai-scripts']/div[2]")
    private WebElement secondTextBlock;
    @FindBy(xpath = "//button[@id='delete-script-modal-btn']")
    private WebElement deleteBlockButton;
    @FindBy(xpath = "(//span[@class='script-block-speed'])[1]")
    private WebElement firstTextBlockAudioSpeed;
    @FindBy(xpath = "(//span[@class='script-block-speed'])[2]")
    private WebElement secondTextBlockAudioSpeed;
    @FindBy(xpath = "//div[@class='range-slider']")
    private WebElement audioSpeedSlider;
    @FindBy(xpath = "//h3[text()='Edit Your Voice']")
    private WebElement editYourVoiceHeader;
    @FindBy(xpath = "//h5[text()='David Kaplan']/../../following-sibling::div[@class='ResultCard-action']/button[2]")
    private WebElement davidSelectButton;
    @FindBy(xpath = "//h5[text()='Rachael West']/../../following-sibling::div[@class='ResultCard-action']/button[2]")
    private WebElement rachaelSelectButton;
    @FindBy(xpath = "//h5[text()='Kristy Reed']/../../following-sibling::div[@class='ResultCard-action']/button[2]")
    private WebElement kristySelectButton;
    @FindBy(xpath = "//div[@id='ai-talent-modal']//button[@type='button']")
    private WebElement editYourVoiceCloseButton;
    @FindBy(xpath = "//a[normalize-space()='Edit details']")
    private WebElement editDetailsLink;
    @FindBy(xpath = "//li[@id='view-draft-list']")
    private WebElement draftTab;
    @FindBy(xpath = "(//span[@class='studio-job-details'])[1]")
    private WebElement firstDraftProjectCode;
    @FindBy(xpath = "//input[@id='action_bar_search_keyword']")
    private WebElement draftSearchField;
    @FindBy(xpath = "//button[@title='Submit Search']")
    private WebElement searchIcon;
    @FindBy(xpath = "//button[@title='Clear Search']")
    private WebElement clearSearchField;
    @FindBy(xpath = "(//a[@class='studio-job-title'])[1]")
    private WebElement firstDraftProject;
    @FindBy(xpath = "//button[@class='action-list-btn btn-default']")
    private WebElement projectSortButton;
    @FindBy(xpath = "//div[@id='header-title']/span")
    private WebElement secureCheckoutPageTitle;
    @FindBy(xpath = "//div[@id='ai-save-exit-modal']//div[@class='modal-header']//button[@type='button']")
    private WebElement closeButtonInExitModel;
    @FindBy(xpath = "(//a[text()='Post a Job'])[1]")
    private WebElement postAJobButton;
    @FindBy(xpath = "//label[@for='job_form_path-edit_draft_job']")
    private WebElement editExistingDraftJobLink;
    @FindBy(xpath = "//div[@role='combobox']")
    private WebElement jobIdDropdown;
    @FindBy(xpath = "//button[@id='bulk-delete-jobs']")
    private WebElement deleteBulkJobButton;
    @FindBy(xpath = "//button[@id='submit-delete-draft-modal']")
    private WebElement confirmDeleteJobButton;
    @FindBy(xpath = "//span[@class='page-status']")
    private WebElement pageStatus;
    @FindBy(xpath = "//li[@id='view-studio']")
    private WebElement aiStudioTab;

    public void verifyAIVoiceSectionIsNotDisplayedOnProfilePageForNonAITalentUsers() {
        AIStudioPage.driver.get("https://www.voices.systems/profile/talent0123");
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertFalse(BaseClass.isElementPresent(AIStudioPage.driver, aiUserNameLink));
        Assert.assertFalse(BaseClass.isElementPresent(AIStudioPage.driver, aiUserDescription));
        Assert.assertFalse(BaseClass.isElementPresent(AIStudioPage.driver, aiUserTryAIVoice));
    }

    public void verifyAIVoiceSectionIsDisplayedOnProfilePageForAITalentUsers() {
        AIStudioPage.driver.get("https://www.voices.systems/profile/davidkaplan");
        BaseClass.waitForVisibility(aiUserNameLink, 30, AIStudioPage.driver);
        Assert.assertTrue(BaseClass.isElementPresent(AIStudioPage.driver, aiUserNameLink));
        Assert.assertTrue(BaseClass.isElementPresent(AIStudioPage.driver, aiUserDescription));
        Assert.assertTrue(BaseClass.isElementPresent(AIStudioPage.driver, aiUserTryAIVoice));

    }

    public void verifyClientUserAbleToNavigateToAIStudioPageViaTalentProfilePage() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
    }

    public void verifyClientUserAbleToNavigateToAIStudioPageViaSubNav() {
        AIStudioPage.driver.get("https://www.voices.systems/profile/davidkaplan");
        BaseClass.waitForVisibility(aiUserNameLink, 30, AIStudioPage.driver);
        aiUserNameLink.click();
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
    }

    public void verifyWelcomeToAIStudioModalCategoryInitialSelectionUpdates() {
        Assert.assertEquals("Validate Description", "Which category best describes how your voice over will be used?", welcomeToAIStudioDescription.getText().trim());
        Assert.assertEquals("Validate SUB Description", "If you cannot find an option that describes your project, choose the most similar and provide further detail later on.", welcomeToAIStudioSubDescription.getText().trim());
        List<String> actualCategoryOptions = BaseClass.getColumnDataInList(AIStudioPage.driver, "//div[@class='radio-input-group d-flex flex-wrap']//label");
        List<String> expectedCategoryOptions = BaseClass.addStringValueInList("Online Ad", "Radio Ad", "Television Ad", "Animation", "Audiobooks", "Documentaries", "Elearning", "Movie Trailers", "Podcasting", "Telephone", "Video Narration", "Videogames", "Voice Assistant");
        Assert.assertEquals("Validate category Options", expectedCategoryOptions, actualCategoryOptions);
        Assert.assertEquals("Validate License Text", "We assign licensing based on the category selected.", licenceText.getText().trim());
        Assert.assertTrue("validate Project Name Text Filed Present", BaseClass.isElementPresent(AIStudioPage.driver, projectNameTextFiled));
        Assert.assertFalse("Validate Confirm button is disabled", confirmButton.isEnabled());
    }

    public void verifyTheFunctionalityOfConfirmButtonBySelectingCategoryInWelcomeToAIStudioModalCategoryInitialSelectionUpdates() {
        onlineAdCategoryRadioButton.click();
        Assert.assertTrue("Validate Online Add licensing Details line 1", onlineAdLicensingDetails01.getText().trim().contains("Your job will include Non-Broadcast Licensing - "));
        Assert.assertTrue("Validate Online Add licensing Details line 1", onlineAdLicensingDetails01.getText().trim().contains("In Perpetuity"));
        Assert.assertTrue("Validate Online Add licensing Details line 2", onlineAdLicensingDetails02.getText().trim().contains("Your job will include Broadcast Licensing - "));
        Assert.assertTrue("Validate Online Add licensing Details line 2", onlineAdLicensingDetails02.getText().trim().contains("Online Ad • Worldwide • 1 year"));
        Assert.assertTrue("Validate Confirm button is disabled", confirmButton.isEnabled());
    }

    public void verifyTheErrorMessageForProjectNameFieldInWelcomeToAIStudioModalCategoryInitialSelectionUpdates() {
        projectNameTextFiled.sendKeys("P");
        BaseClass.staticWaitForVisibility(2000);
        confirmButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate error message", "Project Name must be at least 3 characters", errorMessage.getText().trim());
    }

    public void verifyTheFunctionalityOfConfirmButtonBySelectingCategoryAndEnteringValidProjectNameInWelcomeToAIStudioModalCategoryInitialSelectionUpdates() {
        projectNameTextFiled.sendKeys("roject");
        confirmButton.click();
        BaseClass.staticWaitForVisibility(8000);
        Assert.assertEquals("validate Project Name", "Project", projectName.getText().trim());
    }

    public void verifyGoToDraftsButtonIsNotDisplayed() {
        AIStudioPage.driver.get("https://www.voices.systems/studio");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
    }

    public void verifyGoToDraftsButtonIsDisplayed() {
        AIStudioPage.driver.get("https://www.voices.systems/studio");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate Go To Draft Button displayed", BaseClass.isElementPresent(AIStudioPage.driver, goToDraftButton));
    }

    public void userLogoutFromUser() {
        AIStudioPage.driver.navigate().back();
        BaseClass.waitForVisibility(meIcon, 30, AIStudioPage.driver);
        BaseClass.mouseOverOnElement(AIStudioPage.driver, meIcon);
        BaseClass.waitForVisibility(logoutLink, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, logoutLink);
        BaseClass.staticWaitForVisibility(3000);
        AIStudioPage.driver.navigate().back();
    }

    public void verifyTheUIInStudioPageViaAITalentProfilePage() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.staticWaitForVisibility(8000);
        Assert.assertEquals("validate Project Name", "Project", projectName.getText().trim());
        Assert.assertTrue("Validate Project Edit Button", BaseClass.isElementPresent(AIStudioPage.driver, projectEditIcon));
        Assert.assertTrue("Validate Project Category Icon", BaseClass.isElementPresent(AIStudioPage.driver, projectCategoryIcon));
        Assert.assertTrue("Validate Project Category Name", BaseClass.isElementPresent(AIStudioPage.driver, projectCategoryName));
        Assert.assertTrue("Validate Project Voice clone avatar", BaseClass.isElementPresent(AIStudioPage.driver, projectAvtarIcon));
        Assert.assertTrue("Validate Change Voice Link", BaseClass.isElementPresent(AIStudioPage.driver, changeVoiceLink));
        Assert.assertTrue("Validate Save Draft Button", BaseClass.isElementPresent(AIStudioPage.driver, saveDraftButton));
        Assert.assertTrue("Validate Project Duration", BaseClass.isElementPresent(AIStudioPage.driver, projectDuration));
        Assert.assertTrue("Validate Project Word Count", BaseClass.isElementPresent(AIStudioPage.driver, projectWordCount));
        Assert.assertTrue("Validate Project Price", BaseClass.isElementPresent(AIStudioPage.driver, projectTotalPrice));
        Assert.assertTrue("Validate Continue To Download button", BaseClass.isElementPresent(AIStudioPage.driver, continueToDownloadButton));
        Assert.assertTrue("Validate Exit button", BaseClass.isElementPresent(AIStudioPage.driver, exitButton));
        Assert.assertTrue("Validate Tone Dropdown", BaseClass.isElementPresent(AIStudioPage.driver, toneDropdown));
        Assert.assertTrue("Validate Project Text box", BaseClass.isElementPresent(AIStudioPage.driver, projectTextBox));
        Assert.assertTrue("Validate Move Up Button", BaseClass.isElementPresent(AIStudioPage.driver, moveUpButton));
        Assert.assertTrue("Validate Move Down Button", BaseClass.isElementPresent(AIStudioPage.driver, moveDownButton));
        Assert.assertTrue("Validate Delete Button", BaseClass.isElementPresent(AIStudioPage.driver, deleteButton));
        Assert.assertTrue("Validate Audio Play Button", BaseClass.isElementPresent(AIStudioPage.driver, audioPlayButton));
        Assert.assertTrue("Validate Audio Player Speed", BaseClass.isElementPresent(AIStudioPage.driver, audioPlayerSpeed));
        Assert.assertTrue("Validate Word Counter", BaseClass.isElementPresent(AIStudioPage.driver, wordCounter));
        Assert.assertTrue("Validate Add Text Block Button", BaseClass.isElementPresent(AIStudioPage.driver, addTextBlockButton));
        Assert.assertTrue("Validate Voice Clone Header", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneHeader));
        Assert.assertTrue("Validate Voice Clone Avtar", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneAvtar));
        Assert.assertTrue("Validate Voice Clone Avtar Name", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneAvtarName));
        Assert.assertTrue("Validate Voice Clone Edit Icon", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneEditIcon));
        Assert.assertTrue("Validate Voice Clone Accent", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneAccent));
        Assert.assertTrue("Validate Voice Clone Age", BaseClass.isElementPresent(AIStudioPage.driver, voiceCloneAge));
        Assert.assertTrue("Validate Voice Clone Price Per Word", BaseClass.isElementPresent(AIStudioPage.driver, voiceClonePricePerWord));
        Assert.assertTrue("Validate Voice Speed Slider", BaseClass.isElementPresent(AIStudioPage.driver, speedSlider));
        List<String> actualSpeedRanges = BaseClass.getColumnDataInList(AIStudioPage.driver, "//ul[@id='speed-markers']/li");
        List<String> expectedSpeedRanges = BaseClass.addStringValueInList("0.75x", "1x", "1.25x", "1.5x", "1.75x", "2x");
        Assert.assertEquals("Validate Speed ranges", expectedSpeedRanges, actualSpeedRanges);
        Assert.assertTrue("Validate Pronunciation Header", BaseClass.isElementPresent(AIStudioPage.driver, pronunciationHeader));
        Assert.assertTrue("Validate Manage Pronunciation Button", BaseClass.isElementPresent(AIStudioPage.driver, managePronunciationsButton));
        Assert.assertTrue("Validate Highlight A Word TextBox", BaseClass.isElementPresent(AIStudioPage.driver, highlightAWordTextBox));
        Assert.assertTrue("Validate Change To TextField", BaseClass.isElementPresent(AIStudioPage.driver, changeToTextField));
        Assert.assertTrue("Validate Preview Link", BaseClass.isElementPresent(AIStudioPage.driver, previewLink));
        Assert.assertTrue("Validate Save Link", BaseClass.isElementPresent(AIStudioPage.driver, saveLink));
        Assert.assertTrue("Validate Add Pause Text box", BaseClass.isElementPresent(AIStudioPage.driver, addPauseTextBox));
        Assert.assertTrue("Validate Add Pause Button", BaseClass.isElementPresent(AIStudioPage.driver, addPauseButton));
        Assert.assertTrue("Validate Pause +0.25s Button", BaseClass.isElementPresent(AIStudioPage.driver, pauseButton01));
        Assert.assertTrue("Validate Pause +1s Button", BaseClass.isElementPresent(AIStudioPage.driver, pauseButton02));
        Assert.assertTrue("Validate Pause +1.5s Button", BaseClass.isElementPresent(AIStudioPage.driver, pauseButton03));
    }

    public void verifyByClickingOnVoicesLogo() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voicesStudioLogo, 30, AIStudioPage.driver);
        voicesStudioLogo.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
    }

    public void verifyUserAbleToSaveTheAIStudioByClickingOnVoicesLogoButtonSaveAndExitButton() {
        BaseClass.staticWaitForVisibility(3000);
        saveAndExitButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate project name in draft", firstDraftProjectName.getText().trim().contains("Project"));
    }

    public void verifyByClickingOnExitButton() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(exitButton, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, exitButton);
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
    }

    public void verifySaveExitModalIsNotDisplayedIfUserClicksOnExitButton() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        exitButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate project name in draft", firstDraftProjectName.getText().trim().contains("Project"));

    }

    public void confirmTextBlockIsDisplayedWithDefaultScript() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        String actualTextBoxText = firstProjectTextBlock.getText().trim();
        String expectedTextBoxText = "As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not.";
        Assert.assertEquals("Validate Text Block text", expectedTextBoxText, actualTextBoxText);
        int actualWordCount = BaseClass.countWordInString(firstProjectTextBlock.getText().trim());
        Assert.assertEquals("Validate Word Count", 50, actualWordCount);
    }

    public void moveUpDownAndDeleteButtonsShouldBeDisabled() {
        Assert.assertFalse("Validate Move Up Button Disabled", moveUpButton.isEnabled());
        Assert.assertFalse("Validate Move Down Button Disabled", moveDownButton.isEnabled());
        Assert.assertFalse("Validate Delete Button Disabled", deleteButton.isEnabled());
    }

    public void verifyUserAbleToPlayAudioPlayerWithinTextBlock() {
        audioPlayButton.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertNotEquals("validate play time not zero", "0.00", audioCurrentTime.getText().trim());
        BaseClass.staticWaitForVisibility(35000);
    }

    public void verifyWordCountWithinTextBlock() {
        BaseClass.staticWaitForVisibility(3000);
        int actualWordCount = BaseClass.countWordInString(firstProjectTextBlock.getText().trim());
        int expectedWordCount = Integer.parseInt(wordCount.getText().trim().replaceAll("/150", ""));
        Assert.assertEquals("Validate Word Count", expectedWordCount, actualWordCount);
    }

    public void verifyUserShouldNotAbleToPlayAudioPlayerIfTextBlockDoesNotHaveAnyWords() {
        firstProjectTextBlock.clear();
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Error Message for blank", blankErrorMessage.getText().trim().contains("You must fill out at least one script."));

    }

    public void verifyErrorMessageForDirtyWordSingleTextBlock() {
        firstProjectTextBlock.clear();
        firstProjectTextBlock.sendKeys("shit");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.waitForVisibility(shitErrorMessage, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate Error Message 01", shitErrorMessage.getText().trim().contains("Script contains words or terms that violate Voices "));
        Assert.assertTrue("Validate Error Message 02", shitErrorMessage.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03", shitErrorMessage.getText().trim().contains("(shit)"));
        Assert.assertFalse("Validate Continue to Download button is disabled", continueToDownloadButton.isEnabled());
        Assert.assertFalse("Validate Save Draft button is disabled", saveDraftButton.isEnabled());
    }

    public void confirmErrorMessageGetsClearedIfUserRemoveTheDirtyWordFilter() {
        firstProjectTextBlock.clear();
        BaseClass.staticWaitForVisibility(3000);
        firstProjectTextBlock.sendKeys("As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not.");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertFalse("Validate Error Message not present", BaseClass.isElementPresent(AIStudioPage.driver, shitErrorMessage));
        Assert.assertTrue("Validate Continue to Download button is Enabled", continueToDownloadButton.isEnabled());
        Assert.assertTrue("Validate Save Draft button is Enabled", saveDraftButton.isEnabled());
    }

    public void verifyErrorMessageForRestrictedWordSingleTextBlock() {
        firstProjectTextBlock.clear();
        BaseClass.staticWaitForVisibility(3000);
        firstProjectTextBlock.sendKeys("test");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.waitForVisibility(shitErrorMessage, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate Error Message 01", shitErrorMessage.getText().trim().contains("Script contains words or terms that the talent has excluded from their AI voice"));
        Assert.assertTrue("Validate Error Message 02", shitErrorMessage.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03", shitErrorMessage.getText().trim().contains("(test)"));
        Assert.assertFalse("Validate Continue to Download button is disabled", continueToDownloadButton.isEnabled());
        Assert.assertFalse("Validate Save Draft button is disabled", saveDraftButton.isEnabled());
    }

    public void confirmUserAbleToAddMultipleTextBlock() {
        Assert.assertFalse("validate single text block is present", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));
        addTextBlockButton.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        Assert.assertTrue("validate two text block is present", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));

    }

    public void moveUpDownAndDeleteButtonsShouldBeEnabled() {
        Assert.assertTrue("Validate Move Up Button Enabled", moveUpButton.isEnabled());
        Assert.assertTrue("Validate Move Down Button Enabled", moveDownButton.isEnabled());
        Assert.assertTrue("Validate Delete Button Enabled", deleteButton.isEnabled());
        Assert.assertTrue("Validate Move Up Button 2 Enabled", moveUpButton2.isEnabled());
        Assert.assertTrue("Validate Move Down Button 2 Enabled", moveDownButton2.isEnabled());
        Assert.assertTrue("Validate Delete Button 2 Enabled", deleteButton2.isEnabled());
    }

    public void verifyMoveUpIconWithinTextBlock() {
        String firstBlockId = firstTextBlock.getAttribute("id");
        String secondBlockId = secondTextBlock.getAttribute("id");
        moveUpButton2.click();
        BaseClass.staticWaitForVisibility(4000);
        Assert.assertEquals("validate First Block Id", secondBlockId, firstTextBlock.getAttribute("id"));
        Assert.assertEquals("validate Second Block Id", firstBlockId, secondTextBlock.getAttribute("id"));
    }

    public void verifyMoveDownIconWithinTextBlock() {
        String firstBlockId = firstTextBlock.getAttribute("id");
        String secondBlockId = secondTextBlock.getAttribute("id");
        moveDownButton2.click();
        BaseClass.staticWaitForVisibility(4000);
        Assert.assertEquals("validate First Block Id", secondBlockId, firstTextBlock.getAttribute("id"));
        Assert.assertEquals("validate Second Block Id", firstBlockId, secondTextBlock.getAttribute("id"));
    }

    public void verifyErrorMessageForDirtyWordMultipleTextBlock() {
        firstProjectTextBlock.clear();
        secondProjectTextBlock.clear();
        firstProjectTextBlock.sendKeys("shit");
        secondProjectTextBlock.sendKeys("shit");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.waitForVisibility(shitErrorMessage, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate Error Message 01 for first block", shitErrorMessage.getText().trim().contains("Script contains words or terms that violate Voices "));
        Assert.assertTrue("Validate Error Message 02 for first block", shitErrorMessage.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03 for first block", shitErrorMessage.getText().trim().contains("(shit)"));
        Assert.assertTrue("Validate Error Message 01 for Second block", shitErrorMessage2.getText().trim().contains("Script contains words or terms that violate Voices "));
        Assert.assertTrue("Validate Error Message 02 for Second block", shitErrorMessage2.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03 for Second block", shitErrorMessage2.getText().trim().contains("(shit)"));
        Assert.assertFalse("Validate Continue to Download button is disabled", continueToDownloadButton.isEnabled());
        Assert.assertFalse("Validate Save Draft button is disabled", saveDraftButton.isEnabled());
    }

    public void verifyErrorMessageForRestrictedWordMultipleTextBlock() {
        firstProjectTextBlock.clear();
        secondProjectTextBlock.clear();
        firstProjectTextBlock.sendKeys("test");
        secondProjectTextBlock.sendKeys("test");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.waitForVisibility(shitErrorMessage, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate Error Message 01 for first block", shitErrorMessage.getText().trim().contains("Script contains words or terms that the talent has excluded from their AI voice"));
        Assert.assertTrue("Validate Error Message 02 for first block", shitErrorMessage.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03 for first block", shitErrorMessage.getText().trim().contains("(test)"));
        Assert.assertTrue("Validate Error Message 01 for Second block", shitErrorMessage2.getText().trim().contains("Script contains words or terms that the talent has excluded from their AI voice"));
        Assert.assertTrue("Validate Error Message 02 for Second block", shitErrorMessage2.getText().trim().contains("Terms of Service"));
        Assert.assertTrue("Validate Error Message 03 for Second block", shitErrorMessage2.getText().trim().contains("(test)"));
        Assert.assertFalse("Validate Continue to Download button is disabled", continueToDownloadButton.isEnabled());
        Assert.assertFalse("Validate Save Draft button is disabled", saveDraftButton.isEnabled());
    }

    public void confirmUserAbleToDeleteTextBlock() {
        Assert.assertTrue("Validate second block is present", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));
        deleteButton2.click();
        BaseClass.waitForVisibility(deleteBlockButton, 30, AIStudioPage.driver);
        deleteBlockButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertFalse("Validate second block is not present", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));
    }

    public void verifyUserNotAbleToAddMoreThanOneFiftyWordsInSingleTextBlock() {
        Assert.assertFalse("validate second block not present", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));
        firstProjectTextBlock.clear();
        firstProjectTextBlock.sendKeys("As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not. As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not. As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not. More Word two three");
        projectDuration.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        Assert.assertTrue("validate second block generated after 150 word", BaseClass.isElementPresent(AIStudioPage.driver, secondProjectTextBlock));
    }

    public void confirmDefaultSpeedShouldBe1x() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(speedSlider, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate text block default audio speed", "1", firstTextBlockAudioSpeed.getText().trim());
        Assert.assertEquals("Validate slider default audio speed", "--step: 0.25; --min: 0.75; --max: 2; --val: 1;", audioSpeedSlider.getAttribute("style"));

    }

    public void verifySpeedAdjustmentForSingleBlock() {
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, 0.75);
        Assert.assertEquals("Validate Speed slider for single block", "0.75", firstTextBlockAudioSpeed.getText().trim());
    }

    public void verifySpeedAdjustmentForMultipleBlock() {
        addTextBlockButton.click();
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, 2.0);
        Assert.assertEquals("Validate Speed slider for multiple block", "2", firstTextBlockAudioSpeed.getText().trim());
        Assert.assertEquals("Validate Speed slider for multiple block", "2", secondTextBlockAudioSpeed.getText().trim());
    }

    public void verifySpeedAdjustmentForAnySpeed(double inputSpeed, String outputSpeed) {
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, inputSpeed);
        Assert.assertEquals("Validate Speed slider for single block", outputSpeed, firstTextBlockAudioSpeed.getText().trim());
    }

    public void verifySpeedAdjustmentBetweenTwoPoint(double firstInputSpeed, String firstOutputSpeed, double secondInputSpeed, String secondOutputSpeed) {
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, 0.75);
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, firstInputSpeed);
        Assert.assertEquals("Validate first Speed slider for single block", firstOutputSpeed, firstTextBlockAudioSpeed.getText().trim());
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, secondInputSpeed);
        Assert.assertEquals("Validate second Speed slider for single block", secondOutputSpeed, firstTextBlockAudioSpeed.getText().trim());
    }

    public void verifyPricePerWordForBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForNonBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        animationCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForNonBroadcastToNonBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        animationCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(movieTrailersCategoryRadioButton, 30, AIStudioPage.driver);
        movieTrailersCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(davidSelectButton, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForNonBroadcastToBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        animationCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(televisionCategoryRadioButton, 30, AIStudioPage.driver);
        televisionCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(davidSelectButton, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForBroadcastToNonBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(movieTrailersCategoryRadioButton, 30, AIStudioPage.driver);
        movieTrailersCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(davidSelectButton, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForBroadcastToBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(televisionCategoryRadioButton, 30, AIStudioPage.driver);
        televisionCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(davidSelectButton, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForDavidToRachaelBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(rachaelSelectButton, 30, AIStudioPage.driver);
        if (rachaelSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            rachaelSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.30/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPricePerWordForDavidToRachaelNonBroadcastWithinAIStudio() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        animationCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());
        BaseClass.waitForVisibility(voiceCloneEditIcon, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(rachaelSelectButton, 30, AIStudioPage.driver);
        if (rachaelSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            rachaelSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Price per word", "$0.15/word", voiceClonePricePerWord.getText().trim());
    }

    public void verifySaveDraftButtonIsDisabledIfAIStudioHasZeroWords() {
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys("Project");
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        firstProjectTextBlock.clear();
        projectDuration.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertFalse("Validate save draft button is disabled for 0 word", saveDraftButton.isEnabled());
    }

    public void verifySaveDraftButtonIsDisabledIfAIStudioHasDirtyWords() {
        firstProjectTextBlock.sendKeys("shit");
        projectDuration.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertFalse("Validate save draft button is disabled for dirty word", saveDraftButton.isEnabled());
    }

    public void verifySaveDraftButtonIsDisabledIfAIStudioHasRestrictedWords() {
        firstProjectTextBlock.clear();
        projectDuration.click();
        firstProjectTextBlock.sendKeys("test");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertFalse("Validate save draft button is disabled for restricted word", saveDraftButton.isEnabled());
    }

    public void verifyFunctionalityOfSaveDraftButton() {
        firstProjectTextBlock.clear();
        projectDuration.click();
        firstProjectTextBlock.sendKeys("As a parent, I want to know that my kids are safe wherever they are. That includes riding in the car. With the new Carpool Optic from Solar I can breathe easy knowing my kids will arrive where they need to safely – whether I am the driver or not.");
        projectDuration.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertTrue("Validate save draft button is Enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
    }

    public void verifyFunctionalityOfSaveDraftButtonByEditingAIStudio() {
        firstProjectTextBlock.sendKeys("As a parent");
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, 1.25);
        addTextBlockButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is Enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("Validate first Speed slider for single block", "1.25", firstTextBlockAudioSpeed.getText().trim());
        Assert.assertEquals("Validate second Speed slider for single block", "1.25", secondTextBlockAudioSpeed.getText().trim());
    }


    public void verifyErrorIfUserTriesToAccessDeletedDraftAIStudio(Integer errorCode) {
        String projectName = "Project For Delete";
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(7000);
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement projectCodeElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']/following-sibling::span"));
        BaseClass.waitForVisibility(projectCodeElement, 30, AIStudioPage.driver);
        String[] codeArray = projectCodeElement.getText().trim().split(" ");
        String projectCode = codeArray[1].replaceAll("#", "");
        WebElement projectCheckbox = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']/../../div/input"));
        BaseClass.javaScriptClick(AIStudioPage.driver, projectCheckbox);
        BaseClass.waitForElementClickable(deleteBulkJobButton, 30, AIStudioPage.driver);
        deleteBulkJobButton.click();
        BaseClass.waitForVisibility(confirmDeleteJobButton, 30, AIStudioPage.driver);
        confirmDeleteJobButton.click();
        BaseClass.staticWaitForVisibility(4000);
        AIStudioPage.driver.get("https://www.voices.systems/studio?edit=" + projectCode);
        BaseClass.waitForVisibility(pageStatus, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Page Status as 404", "404", pageStatus.getText().trim());
    }

    public void verifyFunctionalityOfEditDraftButton() {
        String projectName = "Project For Edit";
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(7000);
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']/../../../div[2]/a")).click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        firstProjectTextBlock.sendKeys("As a parent");
        BaseClass.clickOnAudioSpeedSlider(AIStudioPage.driver, speedSlider, 1.25);
        addTextBlockButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is Enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("Validate first Speed slider for single block", "1.25", firstTextBlockAudioSpeed.getText().trim());
        Assert.assertEquals("Validate second Speed slider for single block", "1.25", secondTextBlockAudioSpeed.getText().trim());
    }

    public void verifyAIStudioIsSavedAsDraft() {
        String projectName = "Project Test" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(7000);
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
        BaseClass.waitForVisibility(projectNameElement, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Project Name", projectName, projectNameElement.getText().trim());
        String actualProjectStatus = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']/../following-sibling::div/span")).getText().trim();
        Assert.assertEquals("Validate project status as Draft", "Draft", actualProjectStatus);
    }

    public void verifyByDeletingDraftAIStudioViaDraftsTab() {
        String projectName = "Mayur" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(7000);
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
        Assert.assertTrue("validate Project Present", BaseClass.isElementPresent(AIStudioPage.driver, projectNameElement));
        WebElement projectCheckbox = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']/../../div/input"));
        BaseClass.javaScriptClick(AIStudioPage.driver, projectCheckbox);
        BaseClass.waitForElementClickable(deleteBulkJobButton, 30, AIStudioPage.driver);
        deleteBulkJobButton.click();
        BaseClass.waitForVisibility(confirmDeleteJobButton, 30, AIStudioPage.driver);
        confirmDeleteJobButton.click();
        BaseClass.staticWaitForVisibility(5000);
        aiStudioTab.click();
        BaseClass.waitForVisibility(projectDuration, 30, AIStudioPage.driver);
        draftTab.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertFalse("validate Project Not Present", BaseClass.isElementPresent(AIStudioPage.driver, projectNameElement));
    }

    public void verifySearchFunctionality() {
        BaseClass.waitForVisibility(firstDraftProject, 30, AIStudioPage.driver);
        String expectedProjectName = firstDraftProject.getText().trim();
        draftSearchField.sendKeys(expectedProjectName);
        BaseClass.staticWaitForVisibility(2000);
        searchIcon.click();
        BaseClass.waitForVisibility(firstDraftProject, 30, AIStudioPage.driver);
        String actualProjectName = firstDraftProject.getText().trim();
        Assert.assertEquals("Validate Draft Search function for project name", expectedProjectName, actualProjectName);
        BaseClass.javaScriptClick(AIStudioPage.driver, clearSearchField);
        BaseClass.staticWaitForVisibility(4000);
        BaseClass.waitForVisibility(firstDraftProjectCode, 30, AIStudioPage.driver);
        String[] codeArray = firstDraftProjectCode.getText().trim().split(" ");
        String expectedProjectCode = codeArray[1].replaceAll("#", "");
        draftSearchField.sendKeys(expectedProjectCode);
        BaseClass.staticWaitForVisibility(2000);
        searchIcon.click();
        BaseClass.waitForVisibility(firstDraftProjectCode, 30, AIStudioPage.driver);
        String[] codeArray01 = firstDraftProjectCode.getText().trim().split(" ");
        String actualProjectCode = codeArray01[1].replaceAll("#", "");
        Assert.assertEquals("Validate Draft Search function for project code", expectedProjectCode, actualProjectCode);
        BaseClass.waitForVisibility(clearSearchField, 30, AIStudioPage.driver);
        BaseClass.javaScriptClick(AIStudioPage.driver, clearSearchField);
        BaseClass.staticWaitForVisibility(4000);
    }

    public void verifySortFunctionality() {
        projectSortButton.click();
        List<String> actualSortList = BaseClass.getColumnDataInList(AIStudioPage.driver, "//div[@class='action-list-dropdown']//button");
        List<String> expectedSortList = BaseClass.addStringValueInList("Newest", "Oldest");
        Assert.assertEquals("Validate Sort Option", expectedSortList, actualSortList);
    }

    public void verifySavedAsDraftNavigatesToCheckOutPageAndBackAIStudioPage() {
        String projectName = "My Test Project" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(continueToDownloadButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        continueToDownloadButton.click();
        BaseClass.waitForVisibility(secureCheckoutPageTitle, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Checkout Page", "Secure Checkout", secureCheckoutPageTitle.getText().trim());
        AIStudioPage.driver.navigate().back();
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        goToDraftButton.click();
        WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
        BaseClass.waitForVisibility(projectNameElement, 30, AIStudioPage.driver);
        Assert.assertTrue("validate Project Present", BaseClass.isElementPresent(AIStudioPage.driver, projectNameElement));
    }

    public void verifyUserLandsOnHomePageIfUserClicksExitButtonForAlreadySaved() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        saveDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        exitButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        Assert.assertTrue("Validate landed on home page", welcomeBackHeader.getText().trim().contains("Welcome back"));
    }

    public void verifyExitModalShowsIfClickExitButtonForNotSavedJob() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        exitButton.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));

    }

    public void verifyAIStudioIsSavedIfClickExitButtonForNotSavedJob() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        exitButton.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        saveAndExitButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        goToDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
        BaseClass.waitForVisibility(projectNameElement, 30, AIStudioPage.driver);
        Assert.assertTrue("validate Project is saved", BaseClass.isElementPresent(AIStudioPage.driver, projectNameElement));
    }


    public void verifyAIStudioIsNotSavedIfClickExitButtonForNotSavedJob() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(exitButton, 30, AIStudioPage.driver);
        exitButton.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        discardChangesButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        goToDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        boolean projectStatus;
        try {
            WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
            projectStatus = true;
        } catch (Exception e) {
            projectStatus = false;
        }

        Assert.assertFalse("validate Project Not Saves", projectStatus);
    }

    public void verifyAIStudioIsNotSavedIfClickCloseButtonForNotSavedJob() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(exitButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        exitButton.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        closeButtonInExitModel.click();
        BaseClass.waitForVisibility(projectDuration, 30, AIStudioPage.driver);
        draftTab.click();
        BaseClass.staticWaitForVisibility(5000);
        boolean projectStatus;
        try {
            WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
            projectStatus = true;
        } catch (Exception e) {
            projectStatus = false;
        }

        Assert.assertFalse("validate Project Not Saves", projectStatus);
    }

    public void verifyExitModalShowsIfClickExitButtonForNotSavedJobVoicesLogo() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        voicesStudioLogo.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));

    }

    public void verifyAIStudioIsSavedIfClickExitButtonForNotSavedJobVoicesLogo() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(saveDraftButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate save draft button is enabled", saveDraftButton.isEnabled());
        voicesStudioLogo.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        saveAndExitButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        goToDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
        BaseClass.waitForVisibility(projectNameElement, 30, AIStudioPage.driver);
        Assert.assertTrue("validate Project is saved", BaseClass.isElementPresent(AIStudioPage.driver, projectNameElement));
    }

    public void verifyAIStudioIsNotSavedIfClickExitButtonForNotSavedJobVoicesLogo() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(exitButton, 30, AIStudioPage.driver);
        voicesStudioLogo.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        discardChangesButton.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, AIStudioPage.driver);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        goToDraftButton.click();
        BaseClass.staticWaitForVisibility(5000);
        boolean projectStatus;
        try {
            WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
            projectStatus = true;
        } catch (Exception e) {
            projectStatus = false;
        }

        Assert.assertFalse("validate Project Not Saves", projectStatus);
    }

    public void verifyAIStudioIsNotSavedIfClickCloseButtonForNotSavedJobVoicesLogo() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(exitButton, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        voicesStudioLogo.click();
        BaseClass.waitForVisibility(saveAndExitHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("validate save and exit header", "Save and Exit", saveAndExitHeader.getText().trim());
        Assert.assertTrue("validate Save and exit button present", BaseClass.isElementPresent(AIStudioPage.driver, saveAndExitButton));
        Assert.assertTrue("validate Discard Changes button present", BaseClass.isElementPresent(AIStudioPage.driver, discardChangesButton));
        closeButtonInExitModel.click();
        BaseClass.waitForVisibility(projectDuration, 30, AIStudioPage.driver);
        draftTab.click();
        BaseClass.staticWaitForVisibility(5000);
        boolean projectStatus;
        try {
            WebElement projectNameElement = AIStudioPage.driver.findElement(By.xpath("//a[text()='" + projectName + "']"));
            projectStatus = true;
        } catch (Exception e) {
            projectStatus = false;
        }

        Assert.assertFalse("validate Project Not Saves", projectStatus);
    }

    public void verifyAIDraftsJobShouldNotDisplayedInJobFormPublicJob() {
        AIStudioPage.driver.get("https://www.voices.systems/client/account");
        BaseClass.waitForVisibility(postAJobButton, 30, AIStudioPage.driver);
        postAJobButton.click();
        BaseClass.waitForVisibility(editExistingDraftJobLink, 30, AIStudioPage.driver);
        editExistingDraftJobLink.click();
        BaseClass.waitForVisibility(jobIdDropdown, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Job Id dropdown is disabled", "false", jobIdDropdown.getAttribute("aria-expanded"));
    }

    public void verifyPriceShouldBeZeroIfWordCountIsZero() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "0.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "0", totalWordCount.getText().trim());
    }

    public void verifyPriceForDefaultScriptForBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
    }

    public void verifyPriceGetsIncreasedForAddingWordsToDefaultScriptForBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());

        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "c");
        firstProjectTextBlock.sendKeys(Keys.END);
        firstProjectTextBlock.sendKeys(Keys.SPACE);
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "v");
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for increase word count", "52.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "100", totalWordCount.getText().trim());
    }

    public void verifyPriceGetsIncreasedIfAddWordsToTextBlock2ForBroadCastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        BaseClass.javaScriptClick(AIStudioPage.driver, voiceCloneEditIcon);
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());

        addTextBlockButton.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        secondProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(25));
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for 2 blocks word count", "39.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "75", totalWordCount.getText().trim());
    }

    public void verifyPriceIfRemovesWordsFromDefaultScriptWithinTextBlockForBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());

        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(43));
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "22.36", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "43", totalWordCount.getText().trim());
    }

    public void verifyPriceIfAddRemoveWordsAndDeleteTextBlockForBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate zero price for zero word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        addTextBlockButton.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        secondProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(25));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for 2 blocks word count", "39.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "75", totalWordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(40));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "33.80", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "65", totalWordCount.getText().trim());
        deleteButton.click();
        BaseClass.waitForVisibility(deleteBlockButton, 30, AIStudioPage.driver);
        deleteBlockButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "13.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "25", totalWordCount.getText().trim());
    }

    public void verifyPriceForDefaultScriptForNonBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate price for default word count for non broadcast", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
    }

    public void verifyPriceGetsIncreasedForAddingWordsToDefaultScriptForNonBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate price for default word count for non broadcast", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());

        firstProjectTextBlock.sendKeys(Keys.END);
        firstProjectTextBlock.sendKeys(Keys.SPACE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(50));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for increase word count", "8.11", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "78", totalWordCount.getText().trim());
    }

    public void verifyPriceGetsIncreasedIfAddWordsToTextBlock2ForNonBroadCastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate price for default word count for non broadcast", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());

        addTextBlockButton.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        secondProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(22));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for 2 blocks word count non broad cast", "5.20", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
    }

    public void verifyPriceIfRemovesWordsFromDefaultScriptWithinTextBlockForNonBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate price for default word count for non broadcast", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());

        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(20));
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "2.08", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "20", totalWordCount.getText().trim());
    }

    public void verifyPriceIfAddRemoveWordsAndDeleteTextBlockForNonBroadcastCategory() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();

        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate price for default word count for non broadcast", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());

        addTextBlockButton.click();
        BaseClass.waitForVisibility(secondProjectTextBlock, 30, AIStudioPage.driver);
        secondProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(22));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for 2 blocks word count", "5.20", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(18));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "4.16", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "40", totalWordCount.getText().trim());
        deleteButton.click();
        BaseClass.waitForVisibility(deleteBlockButton, 30, AIStudioPage.driver);
        deleteBlockButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate decrease price word count", "2.29", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "22", totalWordCount.getText().trim());
    }

    public void verifyPriceWhenUserSelectsDifferentVoiceCloneNonBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (kristySelectButton.getText().trim().equalsIgnoreCase("Select")) {
            kristySelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "10.19", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.35/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPriceWhenUserSelectsDifferentVoiceCloneBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (kristySelectButton.getText().trim().equalsIgnoreCase("Select")) {
            kristySelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "39.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.75/word", voiceClonePricePerWord.getText().trim());

    }

    public void verifyPriceIfUserEditsCategoryFromBroadcastToNonBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(podcastingCategoryRadioButton, 30, AIStudioPage.driver);
        podcastingCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for default blocks word count", "5.20", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());
    }

    public void verifyPriceIfUserEditsCategoryFromBroadcastToBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(podcastingCategoryRadioButton, 30, AIStudioPage.driver);
        radioAdCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for default blocks word count", "26.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "50", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());
    }

    public void verifyPriceIfUserEditsCategoryFromNonBroadcastToBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(onlineAdCategoryRadioButton, 30, AIStudioPage.driver);
        onlineAdCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for default blocks word count", "14.56", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.50/word", voiceClonePricePerWord.getText().trim());
    }

    public void verifyPriceIfUserEditsCategoryFromNonBroadcastToNonBroadcast() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate price for default blocks word count", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        editDetailsLink.click();
        BaseClass.waitForVisibility(onlineAdCategoryRadioButton, 30, AIStudioPage.driver);
        animationCategoryRadioButton.click();
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate price for default blocks word count", "2.91", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "28", totalWordCount.getText().trim());
        Assert.assertEquals("validate price per word", "$0.10/word", voiceClonePricePerWord.getText().trim());
    }

    public void verifyPriceCalculationForBroadcastPricePerWordTotalWordCount() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(150));
        projectDuration.click();
        Assert.assertEquals("Validate price for default blocks word count", "78.00", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "150", totalWordCount.getText().trim());
    }

    public void verifyPriceCalculationForNonBroadcastPricePerWordTotalWordCount() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        podcastingCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(2000);
        voiceCloneEditIcon.click();
        BaseClass.waitForVisibility(editYourVoiceHeader, 30, AIStudioPage.driver);
        if (davidSelectButton.getText().trim().equalsIgnoreCase("Select")) {
            davidSelectButton.click();
        } else {
            BaseClass.javaScriptClick(AIStudioPage.driver, editYourVoiceCloseButton);
        }
        BaseClass.waitForVisibility(voiceClonePricePerWord, 30, AIStudioPage.driver);
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(150));
        projectDuration.click();
        Assert.assertEquals("Validate price for default blocks word count", "15.60", projectTotalPrice.getText().trim());
        Assert.assertEquals("validate total words", "150", totalWordCount.getText().trim());
    }

    public void verifyTopNavWordCountMatchesWithDefaultTextBlockScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
    }

    public void verifyTopNavWordsCountMatchesIfUserAddsWordsToDefaultScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.END);
        firstProjectTextBlock.sendKeys(Keys.SPACE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(10));
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for extra word", "60 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for extra word", "60/150", wordCount.getText().trim());

    }

    public void verifyTopNavWordsCountMatchesIfUserRemoveFewWordsFromDefaultScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        BaseClass.staticWaitForVisibility(2000);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(40));
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove word", "40 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove word", "40/150", wordCount.getText().trim());
    }

    public void verifyTopNavWordCountByRemovingEntireDefaultScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove all word", "0 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove all word", "0/150", wordCount.getText().trim());
    }

    public void verifyTopNavWordCountByRemovingEntireDefaultScriptAndAddingEntireNewScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        BaseClass.staticWaitForVisibility(2000);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(10));
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove all and add word", "10 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove all and add word", "10/150", wordCount.getText().trim());
    }

    public void verifyRemovingEntireDefaultScriptAndRemovingFewWordsForNewlyAddedScript() {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        BaseClass.staticWaitForVisibility(2000);
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove all word", "0 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove word", "0/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(10));
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove all and add new word", "10 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove and add new word", "10/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        BaseClass.staticWaitForVisibility(2000);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(5));
        projectDuration.click();
        Assert.assertEquals("Validate Project Word Count for remove from new word", "5 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block for remove from new word", "5/150", wordCount.getText().trim());
    }

    public void verifyUserShouldAbleToEnterWordsWithinTextBlock(Integer expectedCount) {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.END);
        firstProjectTextBlock.sendKeys(Keys.SPACE);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(100));
        projectDuration.click();
        Assert.assertEquals("Validate full Project Word Count", "150 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate full Word Count display in first Text block", "150/150", wordCount.getText().trim());

    }

    public void verifyTextBlockShouldNotContainMoreThanWords(Integer expectedCount) {
        String projectName = "Test Job" + RandomStringUtils.randomAlphanumeric(15);
        AIStudioPage.driver.get("https://www.voices.systems/studio?talent=182");
        BaseClass.waitForVisibility(welcomeToAIStudioHeader, 30, AIStudioPage.driver);
        Assert.assertEquals("Validate Welcome to AI Studio Header", "Welcome to AI Studio", welcomeToAIStudioHeader.getText().trim());
        onlineAdCategoryRadioButton.click();
        projectNameTextFiled.sendKeys(projectName);
        confirmButton.click();
        BaseClass.waitForVisibility(firstProjectTextBlock, 30, AIStudioPage.driver);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Word Count in first Text block", 50, BaseClass.getTotalWordCount(firstProjectTextBlock));
        Assert.assertEquals("Validate Project Word Count", "50 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate Word Count display in first Text block", "50/150", wordCount.getText().trim());
        firstProjectTextBlock.sendKeys(Keys.CONTROL + "a");
        firstProjectTextBlock.sendKeys(Keys.DELETE);
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate zero Project Word Count", "0 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate zero Word Count display in first Text block", "0/150", wordCount.getText().trim());
        BaseClass.staticWaitForVisibility(3000);
        firstProjectTextBlock.sendKeys(BaseClass.generateRandomParagraph(200));
        projectDuration.click();
        BaseClass.staticWaitForVisibility(7000);
        Assert.assertTrue("Validate Text Block 2 is display", secondProjectTextBlock.isDisplayed());
        Assert.assertEquals("Validate full Project Word Count", "200 words", projectWordCount.getText().trim());
        Assert.assertEquals("Validate full Word Count display in first Text block", "150/150", wordCount.getText().trim());
        Assert.assertEquals("Validate remaining Word Count display in second Text block", "50/150", secondBlockWordCount.getText().trim());
    }

}
