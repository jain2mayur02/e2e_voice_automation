package com.voices.pageObjects.AIStudioPageObj;

import com.voices.baseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @FindBy(xpath = "//button[@class='caret-up action-btns']")
    private WebElement moveUpButton;
    @FindBy(xpath = "//button[@class='caret-down action-btns']")
    private WebElement moveDownButton;
    @FindBy(xpath = "//button[@class='trash-icon action-btns']")
    private WebElement deleteButton;
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
//        Assert.assertFalse("Validate Go To Draft Button not displayed", BaseClass.isElementPresent(AIStudioPage.driver, goToDraftButton));
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

}
