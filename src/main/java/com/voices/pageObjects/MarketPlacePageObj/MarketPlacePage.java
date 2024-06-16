package com.voices.pageObjects.MarketPlacePageObj;

import com.voices.baseClass.BaseClass;
import com.voices.enums.EnvironmentType;
import com.voices.managers.ReaderManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class MarketPlacePage {
    private static WebDriver driver;

    public static String environmentValue =  ReaderManager.getInstance().getConfigReader().getenvironmentValue();


    String jpgDemoFile = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AutomationTestJPEG.jpg";
    String mp3DemoFile = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AutomationTestMP3File.mp3";

    public MarketPlacePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='margin-bottom-sm-larger']")
    private WebElement welcomeBackText;
    //    @FindBy(xpath = "(//a[@class='nav-main-submenu-link-icon '])[5]")
    @FindBy(xpath = "//div[@class='circle-avatar-container circle-avatar-container-xs']/parent::a")
    private WebElement meIcon;
    @FindBy(xpath = "//a[normalize-space()='Manage Packages']")
    private WebElement managePackageLink;
    @FindBy(xpath = "//h1[normalize-space()='Manage Packages']")
    private WebElement managePackageText;
    @FindBy(xpath = "//a[normalize-space()='Create a Package']")
    private WebElement createPackageButton;
    @FindBy(xpath = "//div[@id='header-title']")
    private WebElement createPackageText;
    @FindBy(xpath = "//button[@id='save-project']")
    private WebElement saveAndNextButton;
    @FindBy(xpath = "//div[normalize-space()='Skill is required']")
    private WebElement skillIsRequiredText;
    @FindBy(xpath = "//div[normalize-space()='Project Title is required']")
    private WebElement projectTitleIsRequiredText;
    @FindBy(xpath = "//div[normalize-space()='Language is required']")
    private WebElement languageIsRequiredText;
    @FindBy(xpath = "//div[normalize-space()='Accent is required']")
    private WebElement accentIsRequiredText;
    @FindBy(xpath = "//div[normalize-space()='Voice Gender is required']")
    private WebElement genderIsRequiredText;
    @FindBy(xpath = "//button[@id='exit-button']")
    private WebElement exitButton;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[normalize-space()='Approved']")
    private WebElement approvedLink;
    @FindBy(xpath = "//label[text()='Category']/parent::div/div")
    private WebElement categoryDropdown;
    @FindBy(xpath = "//label[text()='Category']/parent::div/div/div[2]/input")
    private WebElement categorySearchBox;
    @FindBy(xpath = "//input[@id='project_title']")
    private WebElement projectTitleTextBox;
    @FindBy(xpath = "//label[text()='Language']/parent::div/div")
    private WebElement languageDropdown;
    @FindBy(xpath = "//label[text()='Language']/parent::div/div/div[2]/input")
    private WebElement languageSearchBox;
    @FindBy(xpath = "//label[text()='Accent']/parent::div/div")
    private WebElement accentDropdown;
    @FindBy(xpath = "//label[text()='Accent']/parent::div/div/div[2]/input")
    private WebElement accentSearchBox;
    @FindBy(xpath = "//h2[text()='Scope of Work']")
    private WebElement scopeOfWorkText;
    @FindBy(xpath = "//span[@class='tier-heading'][normalize-space()='Essential']")
    private WebElement essentialText;
    @FindBy(xpath = "//span[@class='tier-heading'][normalize-space()='Enhanced']")
    private WebElement enhancedText;
    @FindBy(xpath = "//span[@class='tier-heading'][normalize-space()='Elite']")
    private WebElement eliteText;
    @FindBy(xpath = "//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[1]/div")
    private WebElement essentialWordDropdown;
    @FindBy(xpath = "//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[2]/div")
    private WebElement enhancedWordDropdown;
    @FindBy(xpath = "//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[3]/div")
    private WebElement eliteWordDropdown;

    @FindBy(xpath = "//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[1]/div")
    private WebElement essentialDeliveryDayDropdown;
    @FindBy(xpath = "//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[2]/div")
    private WebElement enhancedDeliveryDayDropdown;
    @FindBy(xpath = "//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[3]/div")
    private WebElement eliteDeliveryDayDropdown;

    @FindBy(xpath = "//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[1]/div")
    private WebElement essentialRevisionDropdown;
    @FindBy(xpath = "//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[2]/div")
    private WebElement enhancedRevisionDropdown;
    @FindBy(xpath = "//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[3]/div")
    private WebElement eliteRevisionDropdown;
    @FindBy(xpath = "//label[@for='script_proofreading-1'][normalize-space()='Script Proofreading']/parent::div/following-sibling::div[1]")
    private WebElement scriptProofReadingEssentialCheckBox;
    @FindBy(xpath = "//label[@for='sound_effects-1'][normalize-space()='Sound Effects']/parent::div/following-sibling::div[1]")
    private WebElement soundEffectEssentialCheckBox;
    @FindBy(xpath = "//div[@class='order-attribute']//span[@class='order-attribute-name text-xs'][normalize-space()='Script Proofreading']")
    private WebElement scriptProofReadingEssentialText;
    @FindBy(xpath = "//div[@class='order-attribute']//span[@class='order-attribute-name text-xs'][normalize-space()='Sound Effects']")
    private WebElement soundEffectEssentialText;
    @FindBy(xpath = "//label[normalize-space()='Package Price']/parent::div/following-sibling::div[1]/div/input")
    private WebElement packagePriceEssentialTextBox;
    @FindBy(xpath = "//label[normalize-space()='Package Price']/parent::div/following-sibling::div[2]/div/input")
    private WebElement packagePriceEnhancedTextBox;
    @FindBy(xpath = "//label[normalize-space()='Package Price']/parent::div/following-sibling::div[3]/div/input")
    private WebElement packagePriceEliteTextBox;
    @FindBy(xpath = "//input[@id='live_directed_session-addon-show']/parent::div")
    private WebElement liveDirectedCheckBox;
    @FindBy(xpath = "//input[@id='live_directed_session-addon-1']")
    private WebElement liveDirectedEssentialTextBox;
    @FindBy(xpath = "//h2[normalize-space()='Included Package Options']")
    private WebElement includedPackagesOptions;
    @FindBy(xpath = "//h2[text()='Description']")
    private WebElement descriptionText;
    @FindBy(xpath = "//textarea[@id='project_summary']")
    private WebElement projectSummaryTextArea;
    @FindBy(xpath = "//h2[text()='Media']")
    private WebElement mediaText;
    @FindBy(xpath = "//span[normalize-space()='Upload Demos']")
    private WebElement uploadDemoText;
    @FindBy(xpath = "//input[@id='project_image-input']")
    private WebElement jpgInput;
    @FindBy(xpath = "//input[@id='reference_files-input']")
    private WebElement mp3Input;
    @FindBy(xpath = "//input[contains(@id,'custom-file-title')]")
    private WebElement mp3TextBox;
    @FindBy(xpath = "//h2[text()='Build Your Requirements Form']")
    private WebElement buildYourReqFormText;
    @FindBy(xpath = "//button[normalize-space()='Add Question']")
    private WebElement addQuestionButton;
    @FindBy(xpath = "//span[@class='toggle-input-off-text']")
    private WebElement requiredText;
    @FindBy(xpath = "//input[@id='custom_requirement']")
    private WebElement questionInputBox;
    @FindBy(xpath = "//button[@id='btn-inline-form-widget-add']")
    private WebElement questionAddButton;
    @FindBy(xpath = "//span[@class='h4 text-sm wrap']")
    private WebElement sampleQuestionText;
    @FindBy(xpath = "//button[@data-action='edit']")
    private WebElement questionEditButton;
    @FindBy(xpath = "//button[@data-action='delete']")
    private WebElement questionDeleteButton;
    @FindBy(xpath = "//h2[normalize-space()='Package Details']")
    private WebElement packageDetailsText;
    @FindBy(xpath = "//button[@id='save-project']")
    private WebElement submitForReviewButton;
    @FindBy(xpath = "//a[normalize-space()='Pending Review']")
    private WebElement pendingReviewLink;
    @FindBy(xpath = "(//p[@class='project-id'])[position()=1]")
    private WebElement packageHashText;
    @FindBy(xpath = "//h2[text()='Overview']")
    private WebElement overviewText;
    @FindBy(xpath = "//button[@id='exit-button']")
    private WebElement saveAndExitButton;
    @FindBy(xpath = "//div[@class='layout-body layout-body-group-item']//div[1]//div[4]//a[1]")
    private WebElement packageEditButton;
    @FindBy(xpath = "//a[normalize-space()='Draft']")
    private WebElement packageDraftLink;
    @FindBy(xpath = "//div[@class='layout-body layout-body-group-item']//div[1]//div[3]//div[1]//span[1]")
    private WebElement draftButtonForFirstPackage;
    @FindBy(xpath = "//div[@class='layout-body layout-body-group-item']//div[1]//div[4]//a[2]//i[1]")
    private WebElement firstDeletePackageButton;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    private WebElement deletePackageCancelButton;
    @FindBy(xpath = "//button[@id='delete-project-list-submit-btn']")
    private WebElement packageDeleteButton;
    @FindBy(xpath = "//p[@id='projects-count']")
    private WebElement packageCountString;
    @FindBy(xpath = "//span[normalize-space()='Sign in with Voices']")
    private WebElement signInWithVoicesButton;
    @FindBy(xpath = "//input[@name='login']")
    private WebElement approveUsernameField;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement approvePasswordField;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;
    @FindBy(xpath = "(//button[contains(text(),'Options')])[1]")
    private WebElement optionsDropdown;
    @FindBy(xpath = "(//button[contains(text(),'Approve Project')])[1]")
    private WebElement approvedProjectButton;
    @FindBy(xpath = "//a[@class='dropdown-toggle no-margin userdropdown']")
    private WebElement approvedSettingIcon;
    @FindBy(xpath = "(//a[@data-action='userLogout'])[1]")
    private WebElement approveLogoutLink;
    @FindBy(xpath = "//button[@id='bot2-Msg1']")
    private WebElement approveLogoutConfirmation;
    @FindBy(xpath = "//div[@class='layout-body layout-body-group-item']//div[1]//div[3]//div[1]//span[1]//span[1]")
    private WebElement packageActiveStatus;
    @FindBy(xpath = "//div[@class='project-labels']//span[@class='status status-grey'][normalize-space()='Inactive']")
    private WebElement packageInActiveStatus;
    @FindBy(xpath = "(//div[@class='project-actions']/a)[1]")
    private WebElement packageStatusButton;
    @FindBy(xpath = "//button[text()='Submit for Review']")
    private WebElement submitForReviewEditButton;
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    private WebElement editSubmitButton;

    @FindBy(xpath = "//li[@class='nav-main-dropdown-list-item']//a[@class='nav-main-dropdown-link'][normalize-space()='Log Out']")
    private WebElement logoutLink;
    @FindBy(xpath = "//button[@id='order_total_card_button']")
    private WebElement continueButton;
    @FindBy(xpath = "//button[@id='submit-addons-btn']")
    private WebElement addOnsContinueButton;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement confirmAndPayButton;
    @FindBy(xpath = "//input[@id='file-uploader-input']")
    private WebElement attachFilesForTalent;
    @FindBy(xpath = "//textarea[@id='talent_instructions']")
    private WebElement instructionsForTalentTextArea;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement sentToTalentButton;
    @FindBy(xpath = "//div[@class='alert-body-title']")
    private WebElement talentSuccessMessage;
    @FindBy(xpath = "//div[@class='alert-body-content']/p")
    private WebElement talentSuccessContent;
    @FindBy(xpath = "//label[@for='preview-order-1']//span[@class='preview-order-tier'][normalize-space()='Essential']")
    private WebElement essentialTab;

    @FindBy(xpath = "//a[@id='Jobs']")
    private WebElement jobIcon;
    @FindBy(xpath = "//a[normalize-space()='Awarded']")
    private WebElement awardedLink;
    @FindBy(xpath = "//a[@class='btn btn-lg btn-primary hidden-xs']")
    private WebElement viewJobAgreementButton;
    @FindBy(xpath = "//button[normalize-space()='Accept Job Agreement']")
    private WebElement acceptJobAgreement;
    @FindBy(xpath = "//span[@class='text-grey1 text-md']")
    private WebElement jobIdStringElement;
    @FindBy(xpath = "//strong[normalize-space()='Thank You']")
    private WebElement thankYouText;
    @FindBy(xpath = "//a[@id='decline-modal-trigger']")
    private WebElement declinedJobAgreement;
    @FindBy(xpath = "//textarea[@id='decline-reason']")
    private WebElement declinedReasonTextBox;

    @FindBy(xpath = "//button[normalize-space()='Nevermind']")
    private WebElement neverMindButton;
    @FindBy(xpath = "//button[@id='decline-btn']")
    private WebElement declinedJobAgreementButton;
    @FindBy(xpath = "//strong[normalize-space()='Job Agreement Declined']")
    private WebElement jobAgreementDeclinedMessage;

    @FindBy(xpath = "//*[@id='project_examples-custom_upload_project_examples']/parent::div")
    private WebElement uploadDemoButton;



    public void validateUserNavigateToManagePackagesPage() {
        MarketPlacePage.driver.navigate().to("https://www.voices.systems/talent/account");
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Url", ReaderManager.getInstance().getConfigReader().getUrlEndPoint("TalentLoginUrl"), MarketPlacePage.driver.getCurrentUrl());
        Assert.assertEquals("Validate WelCome Back text", true, welcomeBackText.getText().contains("Welcome back"));
        BaseClass.mouseOverOnElement(MarketPlacePage.driver, meIcon);
        Assert.assertEquals("Validate Manage Package text", "Manage Packages", managePackageLink.getText().trim());
        managePackageLink.click();
        BaseClass.waitForVisibility(managePackageText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate create package button", "Create a Package", createPackageButton.getText().trim());
        Assert.assertEquals("Validate Manage Package text", "Manage Packages", managePackageText.getText().trim());

    }

    public void verifyRequiredFieldsOnCreatePackagePage() {
        createPackageButton.click();
        BaseClass.waitForVisibility(createPackageText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Create Package text", "Create a Package", createPackageText.getText().trim());
        saveAndNextButton.click();
        Assert.assertEquals("Validate Skill Is Required text", "Skill is required", skillIsRequiredText.getText().trim());
        Assert.assertEquals("Validate Project Title Is Required text", "Project Title is required", projectTitleIsRequiredText.getText().trim());
        Assert.assertEquals("Validate Language Is Required text", "Language is required", languageIsRequiredText.getText().trim());
        Assert.assertEquals("Validate Accent Is Required text", "Accent is required", accentIsRequiredText.getText().trim());
       // Assert.assertEquals("Validate Voice Gender Is Required text", "Voice Gender is required", genderIsRequiredText.getText().trim());

    }

    public void userAbleToAbandonPackageCreation() {
        exitButton.click();
        BaseClass.waitForVisibility(managePackageText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate create package button", "Create a Package", createPackageButton.getText().trim());
        Assert.assertEquals("Validate Manage Package text", "Manage Packages", managePackageText.getText().trim());
        Assert.assertEquals("Validate Approved link text", "Approved", approvedLink.getText().trim());

    }


    public void userAbleToCreatePackageOverView(String projectTitle, String category, String language, String accent, String gender, String age) {
        BaseClass.waitForVisibility(createPackageButton, 150, MarketPlacePage.driver);
        createPackageButton.click();
        BaseClass.waitForVisibility(categoryDropdown, 30, MarketPlacePage.driver);
        categoryDropdown.click();
        categorySearchBox.sendKeys(category);
        MarketPlacePage.driver.findElement(By.xpath("//div[text()='" + category + "']")).click();
        BaseClass.scrollToElement(MarketPlacePage.driver, projectTitleTextBox);
        projectTitleTextBox.sendKeys(projectTitle);
        BaseClass.scrollToElement(MarketPlacePage.driver, languageDropdown);
        BaseClass.waitForVisibility(languageDropdown, 30, MarketPlacePage.driver);
        languageDropdown.click();
        languageSearchBox.sendKeys(language);
        MarketPlacePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();

        BaseClass.scrollToElement(MarketPlacePage.driver, accentDropdown);
        BaseClass.waitForVisibility(accentDropdown, 30, MarketPlacePage.driver);
        accentDropdown.click();
        accentSearchBox.sendKeys(accent);
        MarketPlacePage.driver.findElement(By.xpath("//div[text()='" + accent + "']")).click();

      /*  WebElement genderElement = MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='" + gender + "']/parent::div"));
        if (BaseClass.isElementPresent(MarketPlacePage.driver, genderElement)) {
            BaseClass.scrollToElement(MarketPlacePage.driver, genderElement);
            BaseClass.waitForVisibility(genderElement, 30, MarketPlacePage.driver);
            genderElement.click();
        }
*/
        WebElement ageElement = MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='" + age + "']/parent::div"));
        BaseClass.scrollToElement(MarketPlacePage.driver, ageElement);
        BaseClass.waitForVisibility(ageElement, 30, MarketPlacePage.driver);
        ageElement.click();

        saveAndNextButton.click();
        BaseClass.staticWaitForVisibility(5000);

    }


    public void userAbleToCreatePackagePricing(String essentialWord, String enhancedWord, String eliteWord, String essentialDeliveryDays, String enhancedDeliveryDays, String eliteDeliveryDays, String essentialRevisions, String enhancedRevisions, String eliteRevisions, String essentialPackagePrice, String enhancedPackagePrice, String elitePackagePrice) {
        BaseClass.waitForVisibility(scopeOfWorkText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Scope of Work text", "Scope of Work", scopeOfWorkText.getText().trim());
        Assert.assertEquals("Validate Essential text", "Essential", essentialText.getText().trim());
        Assert.assertEquals("Validate Enhanced text", "Enhanced", enhancedText.getText().trim());
        Assert.assertEquals("Validate Elite text", "Elite", eliteText.getText().trim());
        essentialWordDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[1]/div/div[2]/div/div[text()='" + essentialWord + "']")).click();
        enhancedWordDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[2]/div/div[2]/div/div[text()='" + enhancedWord + "']")).click();
        eliteWordDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Words']/parent::div/following-sibling::div[3]/div/div[2]/div/div[text()='" + eliteWord + "']")).click();

        essentialDeliveryDayDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[1]/div/div[2]/div/div[text()='" + essentialDeliveryDays + "']")).click();
        enhancedDeliveryDayDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[2]/div/div[2]/div/div[text()='" + enhancedDeliveryDays + "']")).click();
        eliteDeliveryDayDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Delivery Days']/parent::div/following-sibling::div[3]/div/div[2]/div/div[text()='" + eliteDeliveryDays + "']")).click();

        essentialRevisionDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[1]/div/div[2]/div/div[text()='" + essentialRevisions + "']")).click();
        enhancedRevisionDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[2]/div/div[2]/div/div[text()='" + enhancedRevisions + "']")).click();
        eliteRevisionDropdown.click();
        MarketPlacePage.driver.findElement(By.xpath("//label[normalize-space()='Number of Revisions']/parent::div/following-sibling::div[3]/div/div[2]/div/div[text()='" + eliteRevisions + "']")).click();

        BaseClass.scrollToElement(MarketPlacePage.driver, includedPackagesOptions);
        BaseClass.staticWaitForVisibility(2000);
        scriptProofReadingEssentialCheckBox.click();
        soundEffectEssentialCheckBox.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate Script ProofReading Essential text", "Script Proofreading", scriptProofReadingEssentialText.getText().trim());
        Assert.assertEquals("Validate Sound Effects Essential text", "Sound Effects", soundEffectEssentialText.getText().trim());

        packagePriceEssentialTextBox.sendKeys(essentialPackagePrice);
        packagePriceEnhancedTextBox.sendKeys(enhancedPackagePrice);
        packagePriceEliteTextBox.sendKeys(elitePackagePrice);

        BaseClass.scrollToElement(MarketPlacePage.driver, liveDirectedCheckBox);
        liveDirectedCheckBox.click();
        BaseClass.staticWaitForVisibility(3000);
        liveDirectedEssentialTextBox.sendKeys("100");
        saveAndNextButton.click();
        BaseClass.staticWaitForVisibility(5000);

    }

    public void createPackageDescriptionStep() {
        BaseClass.waitForVisibility(descriptionText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Description text", "Description", descriptionText.getText().trim());
        projectSummaryTextArea.sendKeys("AutomationTestData" + RandomStringUtils.randomAlphabetic(120));
        saveAndNextButton.click();
        BaseClass.staticWaitForVisibility(5000);

    }

    public void createPackageMediaStep() {
        BaseClass.waitForVisibility(mediaText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Media text", "Media", mediaText.getText().trim());
        Assert.assertEquals("Validate Upload Demos text", "Upload Demos", uploadDemoText.getText().trim());

        if(environmentValue.equals("remote")) {
            ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
            File jpgDemoFile = new File("src/test/resources/testData/AutomationTestJPEG.jpg");
            File mp3DemoFile = new File("src/test/resources/testData/AutomationTestMP3File.mp3");
            jpgInput.sendKeys(jpgDemoFile.getAbsolutePath());
            BaseClass.staticWaitForVisibility(5000);
            BaseClass.scrollUpToBottomOfPage(MarketPlacePage.driver);
            uploadDemoButton.click();
            BaseClass.staticWaitForVisibility(8000);
            mp3Input.sendKeys(mp3DemoFile.getAbsolutePath());
            BaseClass.staticWaitForVisibility(8000);
            mp3TextBox.sendKeys("Automation Demo");
            saveAndNextButton.click();
            BaseClass.staticWaitForVisibility(5000);
        }else{

            jpgInput.sendKeys(jpgDemoFile);
            BaseClass.staticWaitForVisibility(5000);
            BaseClass.scrollUpToBottomOfPage(MarketPlacePage.driver);
            uploadDemoButton.click();
            BaseClass.staticWaitForVisibility(8000);
            mp3Input.sendKeys(mp3DemoFile);
            BaseClass.staticWaitForVisibility(8000);
            mp3TextBox.sendKeys("Automation Demo");
            saveAndNextButton.click();
            BaseClass.staticWaitForVisibility(5000);

        }

    }


    public void PackageRequirementsStep() {
        BaseClass.waitForVisibility(buildYourReqFormText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Build Your Requirements Form text", "Build Your Requirements Form", buildYourReqFormText.getText().trim());
        Assert.assertEquals("Validate Add Question text", "Add Question", addQuestionButton.getText().trim());
        BaseClass.scrollUpToBottomOfPage(MarketPlacePage.driver);
        addQuestionButton.click();
        Assert.assertEquals("Validate Required text", "Required", requiredText.getText().trim());
        questionInputBox.sendKeys("Testing Question Field");
        questionAddButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Sample Question text", sampleQuestionText.getText().trim().contains("Testing Question Field"));
        Assert.assertTrue("Validate Question Edit button present", BaseClass.isElementPresent(MarketPlacePage.driver, questionEditButton));
        Assert.assertTrue("Validate Question Delete button present", BaseClass.isElementPresent(MarketPlacePage.driver, questionDeleteButton));
        saveAndNextButton.click();
        BaseClass.staticWaitForVisibility(5000);

    }

    public void createPackagePreviewStep() {
        BaseClass.waitForVisibility(packageDetailsText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Package Details text", "Package Details", packageDetailsText.getText().trim());
        Assert.assertTrue("Verify Submit For Review Button", submitForReviewButton.isDisplayed());
        submitForReviewButton.click();
        BaseClass.waitForVisibility(pendingReviewLink, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Pending Review Text", "Pending Review", pendingReviewLink.getText().trim());
        Assert.assertTrue("Validate Pending Review link present", pendingReviewLink.isDisplayed());
        Assert.assertTrue("Validate Package # text present", packageHashText.getText().trim().contains("Package #"));
        String[] packageArray = packageHashText.getText().split(" ");
        String packageUniqueNumber = packageArray[1];
        System.out.println(packageUniqueNumber);

    }


    public void editDraftPackage(String packageName, String packageNewName) {
        createPackageButton.click();
        BaseClass.waitForVisibility(createPackageText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Overview text", "Overview", overviewText.getText().trim());
        BaseClass.scrollToElement(MarketPlacePage.driver, projectTitleTextBox);
        projectTitleTextBox.sendKeys(packageName);
        Assert.assertTrue("Validate Save And Exit Button present", saveAndExitButton.isDisplayed());
        saveAndExitButton.click();
        BaseClass.waitForVisibility(packageEditButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Package Edit Button", packageEditButton.isDisplayed());
        Assert.assertEquals("Validate Draft Url", ReaderManager.getInstance().getConfigReader().getUrlEndPoint("DraftPackage"), MarketPlacePage.driver.getCurrentUrl());
        packageEditButton.click();
        BaseClass.waitForVisibility(projectTitleTextBox, 30, MarketPlacePage.driver);
        projectTitleTextBox.clear();
        projectTitleTextBox.sendKeys(packageNewName);
        saveAndExitButton.click();
        BaseClass.waitForVisibility(packageDraftLink, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Package Draft Link Present", packageDraftLink.isDisplayed());
        Assert.assertTrue("Validate Package Draft Button Present", draftButtonForFirstPackage.isDisplayed());

    }


    public void deleteDraftPackage(String packageName) {
        WebElement demoPackageDeleteButton = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[2]"));
        Assert.assertTrue("Validate Package Delete Button", demoPackageDeleteButton.isDisplayed());
        String[] packageCountArray01 = packageCountString.getText().split(" ");
        int totalDraftPackage = Integer.parseInt(packageCountArray01[packageCountArray01.length - 2]);
        System.out.println("totalDraftPackage " + totalDraftPackage);
        demoPackageDeleteButton.click();
        BaseClass.waitForVisibility(deletePackageCancelButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Cancel Package Delete Button", deletePackageCancelButton.isDisplayed());
        deletePackageCancelButton.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement demoPackageDeleteButton1 = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[2]"));
        BaseClass.waitForVisibility(demoPackageDeleteButton1, 30, MarketPlacePage.driver);
        demoPackageDeleteButton1.click();
        BaseClass.waitForVisibility(packageDeleteButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Delete Package Delete Button", packageDeleteButton.isDisplayed());
        packageDeleteButton.click();
        BaseClass.staticWaitForVisibility(5000);
        MarketPlacePage.driver.navigate().refresh();
        BaseClass.waitForVisibility(packageCountString, 30, MarketPlacePage.driver);
        String[] packageCountArray02 = packageCountString.getText().split(" ");
        int totalDraftPackageDelete = Integer.parseInt(packageCountArray02[packageCountArray02.length - 2]);
        System.out.println("totalDraftPackageDelete " + totalDraftPackageDelete);
        Assert.assertEquals("Validate Draft Delete package", totalDraftPackage - 1, totalDraftPackageDelete);

    }

    public void deletePendingReviewPackage(String packageName) {
        BaseClass.waitForVisibility(pendingReviewLink, 30, MarketPlacePage.driver);
        pendingReviewLink.click();
        BaseClass.staticWaitForVisibility(2000);
        WebElement demoPackageDeleteButton = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a"));
        String[] packageCountArray01 = packageCountString.getText().split(" ");
        int totalPendingReviewPackage = Integer.parseInt(packageCountArray01[packageCountArray01.length - 2]);
        System.out.println("totalPendingReviewPackage " + totalPendingReviewPackage);
        Assert.assertTrue("Validate Package Delete Button", demoPackageDeleteButton.isDisplayed());
        demoPackageDeleteButton.click();
        BaseClass.waitForVisibility(deletePackageCancelButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Cancel Package Delete Button", deletePackageCancelButton.isDisplayed());
        deletePackageCancelButton.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement demoPackageDeleteButton1 = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a"));
        BaseClass.waitForVisibility(demoPackageDeleteButton1, 30, MarketPlacePage.driver);
        demoPackageDeleteButton1.click();
        BaseClass.waitForVisibility(packageDeleteButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Delete Package Delete Button", packageDeleteButton.isDisplayed());
        packageDeleteButton.click();
        BaseClass.staticWaitForVisibility(5000);
        String[] packageCountArray02 = packageCountString.getText().split(" ");
        int totalPendingReviewPackageDelete = Integer.parseInt(packageCountArray02[packageCountArray02.length - 2]);
        System.out.println("totalPendingReviewPackageDelete " + totalPendingReviewPackageDelete);
        Assert.assertEquals("Validate Rending Review Delete package", totalPendingReviewPackage - 1, totalPendingReviewPackageDelete);
    }

    public void createPackagePreviewStepAndApprovePackage() {
        BaseClass.waitForVisibility(packageDetailsText, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Package Details text", "Package Details", packageDetailsText.getText().trim());
        Assert.assertTrue("Verify Submit For Review Button", submitForReviewButton.isDisplayed());
        submitForReviewButton.click();
        BaseClass.waitForVisibility(pendingReviewLink, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Pending Review Text", "Pending Review", pendingReviewLink.getText().trim());
        Assert.assertTrue("Validate Pending Review link present", pendingReviewLink.isDisplayed());
        Assert.assertTrue("Validate Package # text present", packageHashText.getText().trim().contains("Package #"));
        String[] packageArray = packageHashText.getText().split(" ");
        String packageUniqueNumber = packageArray[1].replaceAll("#", "");
        String approvePackageUrl = "https://admin.voices.systems/talent-projects/" + packageUniqueNumber + "/overview";
        MarketPlacePage.driver.get(approvePackageUrl);
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.waitForVisibility(signInWithVoicesButton, 30, MarketPlacePage.driver);
        signInWithVoicesButton.click();
        BaseClass.waitForVisibility(approveUsernameField, 30, MarketPlacePage.driver);
        approveUsernameField.sendKeys(ReaderManager.getInstance().getConfigReader().getApproveUserName());
        approvePasswordField.sendKeys(ReaderManager.getInstance().getConfigReader().getApprovePassword());
        loginButton.click();
        BaseClass.waitForVisibility(optionsDropdown, 30, MarketPlacePage.driver);
        optionsDropdown.click();
        BaseClass.waitForVisibility(approvedProjectButton, 30, MarketPlacePage.driver);
        approvedProjectButton.click();
        BaseClass.staticWaitForVisibility(3000);
        approvedSettingIcon.click();
        BaseClass.waitForVisibility(approveLogoutLink, 30, MarketPlacePage.driver);
        approveLogoutLink.click();
        BaseClass.waitForVisibility(approveLogoutConfirmation, 30, MarketPlacePage.driver);
        approveLogoutConfirmation.click();
        BaseClass.staticWaitForVisibility(3000);
        MarketPlacePage.driver.get("https://www.voices.systems/talent/projects/pending");

    }

    public void logoutFromAnyUser() {
        BaseClass.waitForVisibility(meIcon, 30, MarketPlacePage.driver);
        BaseClass.mouseOverOnElement(MarketPlacePage.driver, meIcon);
        BaseClass.waitForVisibility(logoutLink, 30, MarketPlacePage.driver);
//        logoutLink.click();
        BaseClass.javaScriptClick(MarketPlacePage.driver, logoutLink);
        MarketPlacePage.driver.get("https://www.voices.systems/");
    }


    public void activateDeactivateApprovedPackage() {
        BaseClass.waitForVisibility(approvedLink, 30, MarketPlacePage.driver);
        approvedLink.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Package # text present", packageHashText.getText().trim().contains("Package #"));
        Assert.assertEquals("Validate Active Package Status present", "Active", packageActiveStatus.getText().trim());
        Assert.assertTrue("Validate Deactivate Status button", packageStatusButton.isDisplayed());
        packageStatusButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate Inactive Package Status present", "Inactive", packageInActiveStatus.getText().trim());
        Assert.assertTrue("Validate Deactivate Status button", packageStatusButton.isDisplayed());
        packageStatusButton.click();

    }


    public void duplicateApprovedPackage(String packageName) {
        Assert.assertTrue("Validate Package # text present", packageHashText.getText().trim().contains("Package #"));
        WebElement packageDuplicateButton = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[3]"));
        Assert.assertTrue("Validate package duplicate button", packageDuplicateButton.isDisplayed());
        packageDuplicateButton.click();
        BaseClass.waitForVisibility(overviewText, 30, MarketPlacePage.driver);
        saveAndNextButton.click();
        BaseClass.waitForVisibility(scopeOfWorkText, 30, MarketPlacePage.driver);
        saveAndNextButton.click();
        BaseClass.waitForVisibility(descriptionText, 30, MarketPlacePage.driver);
        saveAndNextButton.click();
        BaseClass.waitForVisibility(mediaText, 30, MarketPlacePage.driver);
        saveAndNextButton.click();
        BaseClass.waitForVisibility(buildYourReqFormText, 30, MarketPlacePage.driver);
        saveAndNextButton.click();
        WebElement duplicatePackageElement = MarketPlacePage.driver.findElement(By.xpath("//h1[contains(text(),'Copy of " + packageName + "')]"));
        BaseClass.waitForVisibility(duplicatePackageElement, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate duplicate package", "Copy of " + packageName, duplicatePackageElement.getText());
        Assert.assertTrue("Verify Submit for review button", submitForReviewButton.isDisplayed());
        submitForReviewButton.click();
        WebElement duplicatePackageElement1 = MarketPlacePage.driver.findElement(By.xpath("//h1[contains(text(),'Copy of " + packageName + "')]"));
        BaseClass.waitForVisibility(duplicatePackageElement1, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate duplicate package name", "Copy of " + packageName, duplicatePackageElement1.getText());
        WebElement inReviewText = MarketPlacePage.driver.findElement(By.xpath("//p[text()='Copy of " + packageName + "']/../../div[3]/div/span"));
        Assert.assertEquals("Validate In Review Text", "In Review", inReviewText.getText().trim());

    }

    public void editApprovedPackage(String packageName, String editPackageName) {
        approvedLink.click();
        WebElement packageEditButton = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[2]"));
        BaseClass.waitForVisibility(packageEditButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Package Edit Button", packageEditButton.isDisplayed());
        packageEditButton.click();
        projectTitleTextBox.clear();
        projectTitleTextBox.sendKeys(editPackageName);
        Assert.assertTrue("Validate Submit for Review button", submitForReviewEditButton.isDisplayed());
        submitForReviewEditButton.click();
        BaseClass.waitForVisibility(editSubmitButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Submit Button", editSubmitButton.isDisplayed());
        editSubmitButton.click();

        WebElement editPackageElement = MarketPlacePage.driver.findElement(By.xpath("//p[contains(text(),'" + editPackageName + "')]"));
        BaseClass.waitForVisibility(editPackageElement, 30, MarketPlacePage.driver);
        Assert.assertEquals("Validate Edit package name", editPackageName, editPackageElement.getText());
        WebElement inReviewText = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + editPackageName + "']/../../div[3]/div/span"));
        Assert.assertEquals("Validate In Review Text", "In Review", inReviewText.getText().trim());

    }

    public void deleteApprovedPackage(String packageName) {
        approvedLink.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement approvedPackageDeleteButton = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[4]"));
        String[] packageCountArray01 = packageCountString.getText().split(" ");
        int totalApprovedPackage = Integer.parseInt(packageCountArray01[packageCountArray01.length - 2]);
        BaseClass.waitForVisibility(approvedPackageDeleteButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Approved Delete Package Button", approvedPackageDeleteButton.isDisplayed());
        approvedPackageDeleteButton.click();

        BaseClass.waitForVisibility(deletePackageCancelButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Cancel Package Delete Button", deletePackageCancelButton.isDisplayed());
        deletePackageCancelButton.click();
        BaseClass.staticWaitForVisibility(3000);
        WebElement approvedPackageDeleteButton1 = MarketPlacePage.driver.findElement(By.xpath("//p[text()='" + packageName + "']/../../div[4]/a[4]"));
        BaseClass.waitForVisibility(approvedPackageDeleteButton1, 30, MarketPlacePage.driver);
        approvedPackageDeleteButton1.click();
        BaseClass.waitForVisibility(packageDeleteButton, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Delete Package Delete Button", packageDeleteButton.isDisplayed());
        packageDeleteButton.click();
        BaseClass.staticWaitForVisibility(5000);
        String[] packageCountArray02 = packageCountString.getText().split(" ");
        int totalApprovedPackageDelete = Integer.parseInt(packageCountArray02[packageCountArray02.length - 2]);
        Assert.assertEquals("Validate Approved Delete package", totalApprovedPackage - 1, totalApprovedPackageDelete);

    }




    public void userPurchasePackageFromTalentUser(String packageName) {
        MarketPlacePage.driver.get("https://www.voices.systems/profile/qa-autotestpremium");
        BaseClass.staticWaitForVisibility(3000);
        WebElement packageLink = MarketPlacePage.driver.findElement(By.xpath("(//a[text()='" + packageName + "'])[1]"));
        BaseClass.waitForVisibility(packageLink, 30, MarketPlacePage.driver);
        packageLink.click();
        BaseClass.staticWaitForVisibility(4000);
        BaseClass.scrollToElement(MarketPlacePage.driver, essentialTab);
        continueButton.click();
        BaseClass.staticWaitForVisibility(4000);
        BaseClass.scrollToElement(MarketPlacePage.driver, addOnsContinueButton);
        addOnsContinueButton.click();
        BaseClass.staticWaitForVisibility(4000);
        BaseClass.scrollToElement(MarketPlacePage.driver, confirmAndPayButton);
        confirmAndPayButton.click();
        BaseClass.staticWaitForVisibility(4000);
        if(environmentValue.equals("remote")) {
            ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
            File jpgDemoFile = new File("src/test/resources/testData/AutomationTestJPEG.jpg");
         attachFilesForTalent.sendKeys(jpgDemoFile.getAbsolutePath());
        }else {
            attachFilesForTalent.sendKeys(jpgDemoFile);
        }
        BaseClass.staticWaitForVisibility(5000);
        instructionsForTalentTextArea.sendKeys("Instructions for Talent Demo");
        BaseClass.staticWaitForVisibility(3000);
        BaseClass.scrollToElement(MarketPlacePage.driver, sentToTalentButton);
        sentToTalentButton.click();
        BaseClass.waitForVisibility(talentSuccessMessage, 100, MarketPlacePage.driver);
        String expectedContent = "Thank you for placing an order. A Job Agreement has been created and sent to the Talent. You'll receive an email once the talent accepts and the work begins.";
        Assert.assertEquals("Validate Talent Purchase Success Message", "Success", talentSuccessMessage.getText().trim());
        Assert.assertEquals("Validate Talent Purchase Success Content", expectedContent, talentSuccessContent.getText().trim());
    }



    public void viewAndAcceptAwardedJob(String packageName) {
        BaseClass.waitForVisibility(jobIcon, 30, MarketPlacePage.driver);
        BaseClass.mouseOverOnElement(MarketPlacePage.driver, jobIcon);
        BaseClass.waitForVisibility(awardedLink, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Awarded link is present", BaseClass.isElementPresent(MarketPlacePage.driver, awardedLink));
        awardedLink.click();
        WebElement hashJobElement = MarketPlacePage.driver.findElement(By.xpath("//div[contains(text(),'" + packageName + "')]/../../../../div[2]/div[2]"));
        BaseClass.waitForVisibility(hashJobElement, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate #Job text present", hashJobElement.getText().contains("Job #"));
        WebElement offeringElement = MarketPlacePage.driver.findElement(By.xpath("//div[contains(text(),'" + packageName + "')]/../../../../../div[2]/div/span"));
        Assert.assertTrue("Validate Offer Text Present", BaseClass.isElementPresent(MarketPlacePage.driver, offeringElement));
        String[] jobIdStringArray = hashJobElement.getText().trim().split(" ");
        String jobId = jobIdStringArray[1].replaceAll("#", "");
        System.out.println("JobId " + jobId);
        String jobIdUrl = "https://www.voices.systems/talent/jobs/posting/" + jobId;
        MarketPlacePage.driver.get(jobIdUrl);
        BaseClass.waitForVisibility(viewJobAgreementButton, 100, MarketPlacePage.driver);
        Assert.assertTrue("Validate View Job Agreement button", viewJobAgreementButton.isDisplayed());
        viewJobAgreementButton.click();
        BaseClass.waitForVisibility(acceptJobAgreement, 100, MarketPlacePage.driver);
        String expectedJobId = "Job #" + jobId;
        Assert.assertEquals("Validate JobId String", expectedJobId, jobIdStringElement.getText().trim());
        Assert.assertTrue("Validate Accept Job Agreement button", acceptJobAgreement.isDisplayed());
        acceptJobAgreement.click();
        BaseClass.waitForVisibility(thankYouText, 100, MarketPlacePage.driver);
        String expectedContent = "You have successfully accepted the Job Agreement. Once you've completed the job, go to the Files tab and upload your final work.";
        Assert.assertEquals("Validate Talent Agreement Thank You Message", "Thank You", thankYouText.getText().trim());
        Assert.assertEquals("Validate Talent Agreement Thank You Content", expectedContent, talentSuccessContent.getText().trim());
        Assert.assertEquals("Validate JobId String", expectedJobId, jobIdStringElement.getText().trim());

    }

    public void viewAndDeclinedAwardedJob(String packageName) {
        BaseClass.waitForVisibility(jobIcon, 30, MarketPlacePage.driver);
        BaseClass.mouseOverOnElement(MarketPlacePage.driver, jobIcon);
        BaseClass.waitForVisibility(awardedLink, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate Awarded link is present", BaseClass.isElementPresent(MarketPlacePage.driver, awardedLink));
        awardedLink.click();
        WebElement hashJobElement = MarketPlacePage.driver.findElement(By.xpath("//div[contains(text(),'" + packageName + "')]/../../../../div[2]/div[2]"));
        BaseClass.waitForVisibility(hashJobElement, 30, MarketPlacePage.driver);
        Assert.assertTrue("Validate #Job text present", hashJobElement.getText().contains("Job #"));
        WebElement offeringElement = MarketPlacePage.driver.findElement(By.xpath("//div[contains(text(),'" + packageName + "')]/../../../../../div[2]/div/span"));
        Assert.assertTrue("Validate Offer Text Present", BaseClass.isElementPresent(MarketPlacePage.driver, offeringElement));
        String[] jobIdStringArray = hashJobElement.getText().trim().split(" ");
        String jobId = jobIdStringArray[1].replaceAll("#", "");
        System.out.println("JobId " + jobId);
        String jobIdUrl = "https://www.voices.systems/talent/jobs/posting/" + jobId;
        MarketPlacePage.driver.get(jobIdUrl);
        BaseClass.waitForVisibility(viewJobAgreementButton, 100, MarketPlacePage.driver);
        Assert.assertTrue("Validate View Job Agreement button", viewJobAgreementButton.isDisplayed());
        viewJobAgreementButton.click();
        BaseClass.waitForVisibility(declinedJobAgreement, 100, MarketPlacePage.driver);
        String expectedJobId = "Job #" + jobId;
        Assert.assertEquals("Validate JobId String", expectedJobId, jobIdStringElement.getText().trim());
        Assert.assertTrue("Validate Declined Job Agreement button", declinedJobAgreement.isDisplayed());
        declinedJobAgreement.click();
        BaseClass.waitForVisibility(declinedReasonTextBox, 100, MarketPlacePage.driver);
        declinedReasonTextBox.sendKeys("Automation Package Declined Reason");
        Assert.assertTrue("Validate Never Mind Button", neverMindButton.isDisplayed());
        Assert.assertTrue("Validate Declined Job Agreement Button", declinedJobAgreementButton.isDisplayed());
        declinedJobAgreementButton.click();
        BaseClass.waitForVisibility(jobAgreementDeclinedMessage, 30, MarketPlacePage.driver);
        String expectedContent = "The Job Agreement is now declined. The Client has been notified.";
        Assert.assertEquals("Validate Job Agreement Declined Message", "Job Agreement Declined", jobAgreementDeclinedMessage.getText().trim());
        Assert.assertEquals("Validate Job Agreement Declined  Content", expectedContent, talentSuccessContent.getText().trim());
        Assert.assertEquals("Validate JobId String", expectedJobId, jobIdStringElement.getText().trim());

    }



}
