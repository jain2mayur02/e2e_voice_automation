package com.voices.pageObjects.TalentProfilePageObj;

import com.voices.baseClass.BaseClass;
import com.voices.managers.ReaderManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Set;

public class TalentProfilePage {
    private static WebDriver driver;
    String memberProfilePhoto = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\Voices_Profile_Photo.jpg";
    String demoMediaMP4 = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\AutomationTestMP3File.mp3";

    public TalentProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[contains(text(),'Me')])[2]/parent::a")
    private WebElement meIconLink;
    @FindBy(xpath = "//div[contains(text(),'Edit Profile')]")
    private WebElement editProfileLink;
    @FindBy(xpath = "//a[contains(text(),'My Home')]")
    private WebElement myHomeLink;
    @FindBy(xpath = "//a[contains(text(),'Response Templates')]")
    private WebElement responseTemplateLink;
    @FindBy(xpath = "//a[contains(text(),'Statistics')]")
    private WebElement statisticsLink;
    @FindBy(xpath = "//a[contains(text(),'Reviews')]")
    private WebElement reviewLink;
    @FindBy(xpath = "//a[contains(text(),'Account Settings')]")
    private WebElement accountSettingLink;
    @FindBy(xpath = "(//a[contains(text(),'Log Out')])[1]")
    private WebElement logoutLink;
    @FindBy(xpath = "//h1[contains(text(),'Welcome back')]")
    private WebElement welcomeBackHeader;
    @FindBy(xpath = "//img[@title='Top Talent Status']")
    private WebElement bannerImage;
    @FindBy(xpath = "//a[text()=' Dismiss Banner']")
    private WebElement dismissBannerIcon;
    @FindBy(xpath = "//div[contains(text(),'Jobs')]/parent::a")
    private WebElement jobsIconLink;
    @FindBy(xpath = "//a[contains(text(),'Manage Packages')]")
    private WebElement managePackageLink;
    @FindBy(xpath = "(//a[text()='Overview'])[1]")
    private WebElement overviewTabLink;
    @FindBy(xpath = "//a[contains(text(),'View All (9)')]")
    private WebElement viewAllExpansionLink;
    @FindBy(xpath = "//h4[text()='Customer Support']")
    private WebElement customerSupportText;
    @FindBy(xpath = "//p[text()='Call Toll Free:']")
    private WebElement callTollFreeText;
    @FindBy(xpath = "//span[text()='Email:']")
    private WebElement emailText;
    @FindBy(xpath = "//h1[normalize-space()='Change Password']")
    private WebElement changePasswordHeader;
    @FindBy(xpath = "//input[@id='old_password']")
    private WebElement currentPasswordTextFiled;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement newPasswordTextField;
    @FindBy(xpath = "//input[@id='confirm']")
    private WebElement reEnterPasswordTextField;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-circular']")
    private WebElement generalSettingButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Notifications']")
    private WebElement notificationButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][contains(text(),'SurePay™')]")
    private WebElement surePayButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Membership']")
    private WebElement membershipButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Billing History']")
    private WebElement billingHistoryButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Change Password']")
    private WebElement changePasswordButton;
    @FindBy(xpath = "//h1[normalize-space()='General Settings']")
    private WebElement generalSettingsHeading;
    @FindBy(xpath = "//h2[normalize-space()='Contact Information']")
    private WebElement contactInformationHeader;
    @FindBy(xpath = "//h2[normalize-space()='Mailing Address']")
    private WebElement mailingAddressHeader;
    @FindBy(xpath = "//h2[normalize-space()='Time Away']")
    private WebElement timeAwayHeader;
    @FindBy(xpath = "//h2[normalize-space()='Time Zone']")
    private WebElement timeZoneHeader;
    @FindBy(xpath = "//h2[normalize-space()='Connected Services']")
    private WebElement connectedServicesHeader;
    @FindBy(xpath = "//h2[normalize-space()='Additional Options']")
    private WebElement additionalOptionsHeader;
    @FindBy(xpath = "//button[@name='cancel']")
    private WebElement cancelButton;
    @FindBy(xpath = "//button[@name='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//h1[normalize-space()='Notifications']")
    private WebElement notificationsHeader;
    @FindBy(xpath = "//h4[normalize-space()='Job Invitation Settings']")
    private WebElement jobInvitationSettingsHeader;
    @FindBy(xpath = "//h4[normalize-space()='Email Settings']")
    private WebElement emailSettingsHeader;
    @FindBy(xpath = "//h1[contains(text(),'SurePay™')]")
    private WebElement surePayHeader;
    @FindBy(xpath = "//label[normalize-space()='PayPal Email Address']")
    private WebElement payPalEmailAddressHeader;
    @FindBy(xpath = "//h1[normalize-space()='Membership']")
    private WebElement membershipHeader;
    @FindBy(xpath = "//h2[normalize-space()='Premium']")
    private WebElement premiumHeader;
    @FindBy(xpath = "//span[normalize-space()='Payment Information']")
    private WebElement paymentInformation;
    @FindBy(xpath = "//h1[normalize-space()='Billing History']")
    private WebElement billingHistoryHeader;
    @FindBy(xpath = "//div[contains(text(),'Date')]")
    private WebElement dateTableHeader;
    @FindBy(xpath = "//div[contains(text(),'Description')]")
    private WebElement descriptionTableHeader;
    @FindBy(xpath = "//div[contains(text(),'Amount')]")
    private WebElement amountTableHeader;
    @FindBy(xpath = "//div[contains(text(),'Status')]")
    private WebElement statusTableHeader;
    @FindBy(xpath = "(//a[@class='text-blue1 text-sm font-medium'])[2]")
    private WebElement viewLink;
    @FindBy(xpath = "//p[@id='results-total']")
    private WebElement pagination;
    @FindBy(xpath = "(//a[text()='Statistics'])[1]/parent::li")
    private WebElement statisticsTabLink;
    @FindBy(xpath = "//button[@class='action-list-btn btn-outline-default']")
    private WebElement statisticsFilterButton;
    @FindBy(xpath = "//h2[normalize-space()='Audition History']")
    private WebElement auditionHistoryHeader;
    @FindBy(xpath = "//h2[normalize-space()='Demo History']")
    private WebElement demoHistoryHeader;
    @FindBy(xpath = "//h2[normalize-space()='Helpful Resources']")
    private WebElement helpfulResourcesHeader;
    @FindBy(xpath = "//a[normalize-space()='How do I improve my statistics?']")
    private WebElement helpfulResourcesFirstLink;
    @FindBy(xpath = "//a[normalize-space()='What are the statistics of successful talent?']")
    private WebElement helpfulResourcesSecondLink;
    @FindBy(xpath = "//a[normalize-space()='What do these statistics mean?']")
    private WebElement helpfulResourcesThirdLink;

    @FindBy(xpath = "//h1[normalize-space()='Reviews']")
    private WebElement reviewHeader;
    @FindBy(xpath = "//h4[normalize-space()='Pending Reviews']")
    private WebElement pendingReviewHeader;
    @FindBy(xpath = "//a[normalize-space()='Leave a Review']")
    private WebElement leaveReviewLink;
    @FindBy(xpath = "//h4[normalize-space()='Received Compliments']")
    private WebElement receivedComplimentsHeader;
    @FindBy(xpath = "//h4[normalize-space()='My Reviews']")
    private WebElement myReviewsHeader;
    @FindBy(xpath = "//p[@class='reviews-pagination-text text-center']")
    private WebElement reviewPagination;
    @FindBy(xpath = "//a[normalize-space()='Given']")
    private WebElement givenTab;
    @FindBy(xpath = "//div[text()='Share Your Experience']")
    private WebElement shareYourExperienceHeader;
    @FindBy(xpath = "//h4[normalize-space()='Your Review']")
    private WebElement yourReviewHeader;
    @FindBy(xpath = "//a[normalize-space()='Cancel']")
    private WebElement reviewCancelButton;
    @FindBy(xpath = "//label[@for='star-001']")
    private WebElement singleStarRating;
    @FindBy(xpath = "//span[@id='star-text']")
    private WebElement starRatingText;
    @FindBy(xpath = "//textarea[@id='note']")
    private WebElement yourReviewTextBox;
    @FindBy(xpath = "//span[@class='template-title']")
    private WebElement responseTemplateName;
    @FindBy(xpath = "//span[@class='text-xs text-grey1 font-regular template-date']")
    private WebElement responseTemplateLastUpdatedDate;
    @FindBy(xpath = "//div[@class='action-buttons']//a[@role='button']")
    private WebElement responseTemplateDownArrow;
    @FindBy(xpath = "//button[@class='btn btn-default duplicate-member-template-btn']")
    private WebElement responseTemplateDuplicateButton;
    @FindBy(xpath = "//form[@id='sortable']//a[1]")
    private WebElement responseTemplateEditButton;
    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement responseTemplateDeleteButton;
    @FindBy(xpath = "//h5[normalize-space()='Proposal']")
    private WebElement proposalHeader;
    @FindBy(xpath = "//h5[@class='margin-top-zero']")
    private WebElement proposalRevisionPolicy;
    @FindBy(xpath = "//span[@class='text-grey1 font-bold']")
    private WebElement proposalNotes;
    @FindBy(xpath = "//h1[normalize-space()='Response Templates']")
    private WebElement responseTemplateHeader;
    @FindBy(xpath = "(//a[contains(text(),'Create Template')])[1]")
    private WebElement createTemplateButton;
    @FindBy(xpath = "//strong[@class='margin-bottom-zero']")
    private WebElement policyBanner;
    @FindBy(xpath = "//button[@data-dismiss='alert']")
    private WebElement policyBannerDismissButton;
    @FindBy(xpath = "(//h1[text()='Edit Profile'])[1]")
    private WebElement editProfileHeader;
    @FindBy(xpath = "((//nav[@id='main-tab-nav'])[1]//li/a)[1]")
    private WebElement personalInfoTab;
    @FindBy(xpath = "((//nav[@id='main-tab-nav'])[1]//li/a)[2]")
    private WebElement overviewTab;
    @FindBy(xpath = "((//nav[@id='main-tab-nav'])[1]//li/a)[3]")
    private WebElement demosTab;
    @FindBy(xpath = "((//nav[@id='main-tab-nav'])[1]//li/a)[4]")
    private WebElement statisticsTab;
    @FindBy(xpath = "(//form[@id='editProfileForm']//h2)[1]")
    private WebElement fullNameHeader;
    @FindBy(xpath = "//strong[@class='member-name h5 flyout-popover-parent']")
    private WebElement memberNameLeftTop;
    @FindBy(xpath = "//small[@class='member-username text-grey1 text-sm']")
    private WebElement memberUserNameLeftTop;
    @FindBy(xpath = "//a[normalize-space()='View Profile']")
    private WebElement viewProfileButton;
    @FindBy(xpath = "//div[@class='single-star-rating']")
    private WebElement memberStarRating;
    @FindBy(xpath = "//a[@id='reviews-link']")
    private WebElement memberReviewLink;
    @FindBy(xpath = "//h2[normalize-space()='Profile Link']")
    private WebElement profileLinkHeader;
    @FindBy(xpath = "//h2[normalize-space()='Displayed Address']")
    private WebElement displayedAddressHeader;
    @FindBy(xpath = "//h2[normalize-space()='Profile Photo']")
    private WebElement profilePhotoHeader;
    @FindBy(xpath = "//button[@name='cancel']")
    private WebElement profileCancelButton;
    @FindBy(xpath = "//button[normalize-space()='Save Edits']")
    private WebElement profileSaveEditButton;
    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement memberFirstNameTextField;
    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement memberLastNameTextField;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement memberUsernameTextField;
    @FindBy(xpath = "//label[normalize-space()='City']")
    private WebElement memberCityHeader;
    @FindBy(xpath = "//label[normalize-space()='Country']")
    private WebElement memberCountryHeader;
    @FindBy(xpath = "//label[normalize-space()='State / Province']")
    private WebElement memberStateHeader;
    @FindBy(xpath = "//button[normalize-space()='Upload Photo']")
    private WebElement memberUploadPhotoButton;
    @FindBy(xpath = "//div[@class='panel panel-body']//input[@id='file-upload-input']")
    private WebElement memberUploadPhoto;
    @FindBy(xpath = "//h5[normalize-space()='Complete Your Skill']")
    private WebElement completeYourSkillHeader;
    @FindBy(xpath = "//h2[normalize-space()='About Me']")
    private WebElement aboutMeHeader;
    @FindBy(xpath = "//h2[normalize-space()='Categories']")
    private WebElement categoryHeader;
    @FindBy(xpath = "//h2[normalize-space()='Vocal Characteristics']")
    private WebElement vocalCharacteristicsHeader;
    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement femaleGenderRadioButton;
    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement maleGenderRadioButton;
    @FindBy(xpath = "//select[@id='language_ids']")
    private WebElement languageDropdown;
    @FindBy(xpath = "//select[@id='native_language_ids']")
    private WebElement nativeLanguageDropdown;
    @FindBy(xpath = "//select[@id='accent_ids']")
    private WebElement accentDropdown;
    @FindBy(xpath = "//div[@href='#live-directed-session-accordion']//h2[@class='h4']")
    private WebElement liveDirectedSessionHeader;
    @FindBy(xpath = "//h2[normalize-space()='Studio']")
    private WebElement studioHeader;
    @FindBy(xpath = "//label[normalize-space()='Turnaround Time']")
    private WebElement turnAroundTimeLabel;
    @FindBy(xpath = "//label[normalize-space()='Microphone']")
    private WebElement microphoneLabel;
    @FindBy(xpath = "//label[normalize-space()='Computer & Software']")
    private WebElement computerSoftwareLabel;
    @FindBy(xpath = "//label[normalize-space()='Special Equipment']")
    private WebElement specialEquipmentLabel;
    @FindBy(xpath = "//h2[normalize-space()='Past Clients']")
    private WebElement pastClientHeader;
    @FindBy(xpath = "//button[normalize-space()='Add']")
    private WebElement addPastClientButton;
    @FindBy(xpath = "//a[normalize-space()='View All (10)']")
    private WebElement viewAllEmptySkillLink;
    @FindBy(xpath = "//h4[normalize-space()='Demo Samples']")
    private WebElement demoSamplesHeader;
    @FindBy(xpath = "//a[@id='btn-add-demo']")
    private WebElement addADemoButton;
    @FindBy(xpath = "(//div[@class='editable move-item full-width'])[1]")
    private WebElement firstDemoDragToRecorderButton;
    @FindBy(xpath = "(//h3[@class='heading h4 text-dark'])[1]")
    private WebElement firstDemoName;
    @FindBy(xpath = "(//p[@class='text-grey1 text-sm margin-bottom-medium'])[1]")
    private WebElement firstDemoCategoryName;
    @FindBy(xpath = "(//div[@class='portfolio-item-body-metadata-tag'])[1]")
    private WebElement firstDemoFavoriteCount;
    @FindBy(xpath = "(//div[@class='portfolio-item-body-metadata-tag'])[1]")
    private WebElement firstDemoPreviewCount;
    @FindBy(xpath = "(//div[@class='portfolio-item-body-action-btns'])[1]/a")
    private WebElement firstDemoEditButton;
    @FindBy(xpath = "//input[@id='category-cartoons']/parent::div")
    private WebElement animationCategoryRadioButton;
    @FindBy(xpath = "//input[@id='title']")
    private WebElement overviewTitleInputTextField;
    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement overviewDescriptionTextField;
    @FindBy(xpath = "//input[@id='file-uploader-input']")
    private WebElement uploadMediaDemoFile;
    @FindBy(xpath = "//select[@id='profile-form-demo-language']/parent::div")
    private WebElement demoLanguageDropdown;
    @FindBy(xpath = "(//input[@placeholder='Search...'])[1]")
    private WebElement demoLanguageInputTextField;
    @FindBy(xpath = "//select[@id='demo-accents']/parent::div")
    private WebElement demoAccentDropdown;
    @FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
    private WebElement demoAccentInputTextField;
    @FindBy(xpath = "//select[@id='demo-styles']/parent::div")
    private WebElement demoStyleDropdown;
    @FindBy(xpath = "(//input[@placeholder='Search...'])[3]")
    private WebElement demoStyleInputTextField;
    @FindBy(xpath = "//select[@id='demo-roles']/parent::div")
    private WebElement demoRoleDropdown;
    @FindBy(xpath = "(//input[@placeholder='Search...'])[4]")
    private WebElement demoRoleInputTextField;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement addDemoButton;
    @FindBy(xpath = "//a[normalize-space()='Exit']")
    private WebElement demoExitButton;
    @FindBy(xpath = "(//div[@class='editable move-item full-width'])[2]")
    private WebElement secondDemoDragToRecorderButton;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement demoSaveEditButton;
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    private WebElement demoCancelEditButton;
    @FindBy(xpath = "//button[@name='delete']")
    private WebElement demoDeleteEditButton;
    @FindBy(xpath = "//input[@id='category-audiobooks']/parent::div")
    private WebElement audioBooksDemoCategory;
    @FindBy(xpath = "//button[@id='delete_demo_sample_submit_button']")
    private WebElement demoEditDeleteConfirmButton;
    @FindBy(xpath = "(//div[@class='play-pause-btn'])[1]")
    private WebElement demoPlayPauseButton;
    @FindBy(xpath = "(//span[@class='current-time'])[1]")
    private WebElement demoPlayCurrentTime;

    @FindBy(xpath = "//h1[normalize-space()='Manage Packages']")
    private WebElement managePackageHeader;
    @FindBy(xpath = "//a[normalize-space()='Create a Package']")
    private WebElement createPackageButton;
    @FindBy(xpath = "//a[normalize-space()='Draft']")
    private WebElement draftTab;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[normalize-space()='Pending Review']")
    private WebElement pendingReviewTab;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[normalize-space()='Approved']")
    private WebElement approvedTab;

    @FindBy(xpath = "(//p[@class='project-title h4'])[1]")
    private WebElement firstPackageName;
    @FindBy(xpath = "(//p[@class='project-id'])[1]")
    private WebElement firstPackageId;
    @FindBy(xpath = "(//span[@class='tag'])[1]")
    private WebElement firstPackageCategory;
    @FindBy(xpath = "(//span[contains(@class,'status status')])[1]")
    private WebElement firstPackageStatus;
    @FindBy(xpath = "(//a[contains(@class,'project-action-btn btn btn-circular btn-default edit-project-btn')])[1]")
    private WebElement firstPackageEditButton;
    @FindBy(xpath = "(//a[contains(@class,'project-action-btn btn btn-circular btn-default delete-project-btn')])[1]")
    private WebElement firstPackageDeleteButton;
    @FindBy(xpath = "(//a[contains(@class,'project-action-btn btn btn-circular btn-default enable-disable-btn')])[1]")
    private WebElement firstPackageActiveInactiveButton;
    @FindBy(xpath = "(//a[contains(@class,'project-action-btn btn btn-circular btn-default duplicate-project')])[1]")
    private WebElement firstPackageDuplicateButton;
    @FindBy(xpath = "//p[@id='projects-count']")
    private WebElement packagePagination;
    @FindBy(xpath = "//button[@id='delete-project-list-submit-btn']")
    private WebElement packageDeleteButton;
    @FindBy(xpath = "//button[@title='Clear Search']")
    private WebElement clearSearchFieldButton;
    @FindBy(xpath = "//input[@id='action_bar_search_keyword']")
    private WebElement searchFiledTextBox;
    @FindBy(xpath = "(//button[@title='Submit Search'])[2]")
    private WebElement submitSearchField;

    @FindBy(xpath = "//h2[@id='project-title']")
    private WebElement packageHeader;
    @FindBy(xpath = "//h2[@id='portfolio-title']")
    private WebElement demosHeader;
    @FindBy(xpath = "//span[@class='d-flex align-items-center']/h1")
    private WebElement profileNameHeader;
    @FindBy(xpath = "//a[normalize-space()='Portfolio']")
    private WebElement portfolioTab;
    @FindBy(xpath = "//a[normalize-space()='About Talent']")
    private WebElement aboutTalentTab;
    @FindBy(xpath = "//div[@class='circle-avatar-container']/img")
    private WebElement profileAvtarPhoto;
    @FindBy(xpath = "//p[@class='public-address-and-timezone']")
    private WebElement profileLocation;
    @FindBy(xpath = "//div[@class='single-star-rating']")
    private WebElement profileStarRating;
    @FindBy(xpath = "//div[@class='stars-text']/span[1]")
    private WebElement profileRatingReview;
    @FindBy(xpath = "//a[@id='reviews-link']")
    private WebElement profileReviewsLink;
    @FindBy(xpath = "//button[@class='Profile-share']")
    private WebElement profileShareIcon;

    @FindBy(xpath = "//h3[normalize-space()='Share Talent Profile']")
    private WebElement shareTalentProfileHeader;
    @FindBy(xpath = "//button[normalize-space()='Copy']")
    private WebElement shareTalentProfileCopyButton;
    @FindBy(xpath = "//footer[@class='ShareModal-footer']//button[@type='button'][normalize-space()='Close']")
    private WebElement shareTalentProfileCloseButton;

    @FindBy(xpath = "//h3[normalize-space()='Language']")
    private WebElement vocalCharLanguageHeader;
    @FindBy(xpath = "//h3[normalize-space()='Voice Ages']")
    private WebElement vocalCharAgeHeader;
    @FindBy(xpath = "//h3[normalize-space()='Categories']")
    private WebElement vocalCharCategoriesHeader;
    @FindBy(xpath = "(//div[@id='profile-projects']//a[@class='profile-project-title'])[1]")
    private WebElement firstPackageUnderPortfolio;
    @FindBy(xpath = "//div[@class='package-title-section']/h1")
    private WebElement packageNameOnPackagePage;

    @FindBy(xpath = "(//div[@id='profile-portfolio']//a[@class='talent-demo-title'])[1]")
    private WebElement firstDemosUnderPortfolio;
    @FindBy(xpath = "//div[@id='demo-details-heading']/h1")
    private WebElement demosNameOnDemosPage;

    @FindBy(xpath = "//h2[contains(normalize-space(),'Reviews')]")
    private WebElement profileReviewHeader;
    @FindBy(xpath = "//div[@class='aggregated-star-rating']")
    private WebElement reviewStarRating;
    @FindBy(xpath = "//div[@class='profile-reviewer']//p")
    private WebElement profileReviewerName;
    @FindBy(xpath = "//span[@class='text-grey2 text-xs']")
    private WebElement profileReviewerReviewTime;
    @FindBy(xpath = "//div[@class='margin-top-smallest margin-bottom-small']")
    private WebElement profileReviewerReviewText;

    public void verifyMeIconOption() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        Assert.assertEquals("Validate Edit Profile link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, editProfileLink));
        Assert.assertEquals("Validate My Home link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, myHomeLink));
        Assert.assertEquals("Validate Response Templates link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateLink));
        Assert.assertEquals("Validate Statistics link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, statisticsLink));
        Assert.assertEquals("Validate Reviews link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, reviewLink));
        Assert.assertEquals("Validate Account Settings link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, accountSettingLink));
        Assert.assertEquals("Validate Log Out link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, logoutLink));
        Assert.assertEquals("Validate Manage Packages link present", true, BaseClass.isElementPresent(TalentProfilePage.driver, managePackageLink));
    }

    public void verifyTalentUserNavigateToHomePage() {
        myHomeLink.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate User Navigate to Home Page", true, welcomeBackHeader.getText().trim().contains("Welcome back"));
    }

    public void verifyProjectMarketplaceBanner() {
        Assert.assertEquals("Validate Project MarketPlace Banner present", true, BaseClass.isElementPresent(TalentProfilePage.driver, bannerImage));
        Assert.assertEquals("Validate Banner Dismiss Button present", true, BaseClass.isElementPresent(TalentProfilePage.driver, dismissBannerIcon));
    }

    public void verifyManualClosingProjectMarketplaceBanner() {
        dismissBannerIcon.click();
        TalentProfilePage.driver.navigate().refresh();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("Validate Project MarketPlace Banner not present", false, BaseClass.isElementPresent(TalentProfilePage.driver, bannerImage));
        Assert.assertEquals("Validate Banner Dismiss Button not present", false, BaseClass.isElementPresent(TalentProfilePage.driver, dismissBannerIcon));
    }

    public void verifyJobSection() {
        BaseClass.waitForVisibility(jobsIconLink, 30, TalentProfilePage.driver);
        jobsIconLink.click();
        BaseClass.staticWaitForVisibility(4000);
        int actualJobCount = BaseClass.getTotalTableRowCount(TalentProfilePage.driver, "//div[@id='pagination-container']/div");
        Assert.assertEquals("Validate Job Count", 1, actualJobCount);
    }

    public void verifyShortlistSection() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        myHomeLink.click();
        BaseClass.staticWaitForVisibility(3000);
        int shortListCount = BaseClass.getTotalTableRowCount(TalentProfilePage.driver, "//div[@id='shortlist-section']//a");
        Assert.assertEquals("Validate Short List Count", 1, shortListCount);
    }

    public void verifyProfileSection() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        editProfileLink.click();
        BaseClass.waitForVisibility(overviewTabLink, 30, TalentProfilePage.driver);
        overviewTabLink.click();
        BaseClass.scrollToElement(TalentProfilePage.driver, viewAllExpansionLink);
        BaseClass.javaScriptClick(TalentProfilePage.driver, viewAllExpansionLink);
        List<String> actualEmptyFieldList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@id='empty-fields-list']/p/a");
        List<String> expectedEmptyFieldList = BaseClass.addStringValueInList("Client List", "Talent Description", "Gender", "Accents", "Turnaround Time", "Microphone", "Software", "Special Equipment", "Live Directed Session Softwares");
        Assert.assertEquals("Validate Empty Fields List", expectedEmptyFieldList, actualEmptyFieldList);
    }

    public void verifyCareerSection() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        myHomeLink.click();
        int actualCareerCount = BaseClass.getTotalTableRowCount(TalentProfilePage.driver, "//h4[text()='Grow Your Career']/following-sibling::div//div");
        Assert.assertEquals("Validate Career Block Count", 4, actualCareerCount);
        List<String> actualCareerBlockList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h4[text()='Grow Your Career']/following-sibling::div//div/h5");
        List<String> expectedCareerBlockList = BaseClass.addStringValueInList("Voices Blog", "Webinars", "Voices Resource Library", "Become a Voices Insider");
        Assert.assertEquals("Validate Career Block list", expectedCareerBlockList, actualCareerBlockList);
    }

    public void verifyCustomerSupportSection() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        myHomeLink.click();
        BaseClass.waitForVisibility(customerSupportText, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Customer Support Text", "Customer Support", customerSupportText.getText().trim());
        Assert.assertEquals("Validate Call Toll Free Text", "Call Toll Free:", callTollFreeText.getText().trim());
        Assert.assertEquals("Validate Email Text", "Email:", emailText.getText().trim());
    }

    public void navigateToAccountSettingPage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(notificationButton, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate General Setting button", true, BaseClass.isElementPresent(TalentProfilePage.driver, generalSettingButton));
        Assert.assertEquals("Validate Notification button", true, BaseClass.isElementPresent(TalentProfilePage.driver, notificationButton));
        Assert.assertEquals("Validate SurePay button", true, BaseClass.isElementPresent(TalentProfilePage.driver, surePayButton));
        Assert.assertEquals("Validate Membership button", true, BaseClass.isElementPresent(TalentProfilePage.driver, membershipButton));
        Assert.assertEquals("Validate Billing History button", true, BaseClass.isElementPresent(TalentProfilePage.driver, billingHistoryButton));
        Assert.assertEquals("Validate Change Password button", true, BaseClass.isElementPresent(TalentProfilePage.driver, changePasswordButton));
    }

    public void verifyGeneralSetting() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(generalSettingButton, 30, TalentProfilePage.driver);
        generalSettingButton.click();
        BaseClass.waitForVisibility(generalSettingsHeading, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate General Settings", "General Settings", generalSettingsHeading.getText().trim());
        Assert.assertEquals("Validate Contact Information", "Contact Information", contactInformationHeader.getText().trim());
        Assert.assertEquals("Validate Mailing Address", "Mailing Address", mailingAddressHeader.getText().trim());
        Assert.assertEquals("Validate Time Away", "Time Away", timeAwayHeader.getText().trim());
        Assert.assertEquals("Validate Time Zone", "Time Zone", timeZoneHeader.getText().trim());
        Assert.assertEquals("Validate Connected Services", "Connected Services", connectedServicesHeader.getText().trim());
        Assert.assertEquals("Validate Additional Options", "Additional Options", additionalOptionsHeader.getText().trim());
        Assert.assertEquals("Validate cancel", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes", "Save Changes", submitButton.getText().trim());

    }

    public void verifyNotification() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(notificationButton, 30, TalentProfilePage.driver);
        notificationButton.click();
        BaseClass.waitForVisibility(notificationsHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Notifications", "Notifications", notificationsHeader.getText().trim());
        Assert.assertEquals("Validate Job Invitation Settings", "Job Invitation Settings", jobInvitationSettingsHeader.getText().trim());
        Assert.assertEquals("Validate Email Settings", "Email Settings", emailSettingsHeader.getText().trim());
        Assert.assertEquals("Validate cancel", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes", "Save Changes", submitButton.getText().trim());
    }


    public void verifySurePay() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(surePayButton, 30, TalentProfilePage.driver);
        surePayButton.click();
        BaseClass.waitForVisibility(surePayHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate SurePay™", "SurePay™", surePayHeader.getText().trim());
        Assert.assertEquals("Validate PayPal Email Address", "PayPal Email Address", payPalEmailAddressHeader.getText().trim());
        Assert.assertEquals("Validate cancel", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes", "Save Changes", submitButton.getText().trim());
    }

    public void verifyMembership() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(membershipButton, 30, TalentProfilePage.driver);
        membershipButton.click();
        BaseClass.waitForVisibility(membershipHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Membership", "Membership", membershipHeader.getText().trim());
        Assert.assertEquals("Validate Premium", "Premium", premiumHeader.getText().trim());
        Assert.assertEquals("Validate Payment Information", "Payment Information", paymentInformation.getText().trim());
    }

    public void verifyBillingHistory() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(billingHistoryButton, 30, TalentProfilePage.driver);
        billingHistoryButton.click();
        BaseClass.waitForVisibility(billingHistoryHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Billing History", "Billing History", billingHistoryHeader.getText().trim());
        Assert.assertEquals("Validate Date", "Date", dateTableHeader.getText().trim());
        Assert.assertEquals("Validate Description", "Description", descriptionTableHeader.getText().trim());
        Assert.assertEquals("Validate Amount", "Amount", amountTableHeader.getText().trim());
        Assert.assertEquals("Validate Status", "Status", statusTableHeader.getText().trim());
        Assert.assertEquals("Validate View Link", true, BaseClass.isElementPresent(TalentProfilePage.driver, viewLink));
        Assert.assertEquals("Validate Pagination", true, BaseClass.isElementPresent(TalentProfilePage.driver, pagination));

    }

    public void verifyChangePassword() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, TalentProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(changePasswordButton, 30, TalentProfilePage.driver);
        changePasswordButton.click();
        BaseClass.waitForVisibility(changePasswordHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Change Password", "Change Password", changePasswordHeader.getText().trim());
        Assert.assertTrue("Validate Old Password Text Field", BaseClass.isElementPresent(TalentProfilePage.driver, currentPasswordTextFiled));
        Assert.assertTrue("Validate new Password Text Field", BaseClass.isElementPresent(TalentProfilePage.driver, newPasswordTextField));
        Assert.assertTrue("Validate confirm Password Text Field", BaseClass.isElementPresent(TalentProfilePage.driver, reEnterPasswordTextField));
        Assert.assertEquals("Validate cancel", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes", "Save Changes", submitButton.getText().trim());
    }


    public void userAbleToNavigateToStatisticPage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(statisticsLink, 30, TalentProfilePage.driver);
        statisticsLink.click();
        BaseClass.waitForVisibility(statisticsTabLink, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to statistics page", "active", statisticsTabLink.getAttribute("class").trim());
    }

    public void verifyComponentsInStatisticsSection() {
        List<String> actualStatisticsLabels = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@id='dynamic-stats-container']//div[@class='layout-body']//h5");
        List<String> expectedStatisticsLabels = BaseClass.addStringValueInList("Demo Listens", "Demo Favorites", "Audition Listens", "Invitations Received", "Auditions Submitted", "Auditions Shortlisted", "Hired Jobs", "Booking Ratio", "Avg. Earnings per Job");
        Assert.assertEquals("Verify statistics component label", expectedStatisticsLabels, actualStatisticsLabels);
        statisticsFilterButton.click();
        List<String> actualDurationList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@class='action-list-dropdown']//button");
        List<String> expectedDurationList = BaseClass.addStringValueInList("All Time", "This Year", "This Month", "This Week");
        Assert.assertEquals("Validate Duration List", expectedDurationList, actualDurationList);

    }

    public void verifyComponentsInAuditionHistorySection() {
        Assert.assertEquals("Validate Audition History Header", "Audition History", auditionHistoryHeader.getText().trim());
        List<String> actualAuditionHistoryTableHeader = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@aria-label='Audition History']//div[@role='columnheader']/div");
        List<String> expectedAuditionHistoryTableHeader = BaseClass.addStringValueInList("Job", "Audition Date", "Listened", "Shortlisted");
        Assert.assertEquals("Validate Audition History table header", expectedAuditionHistoryTableHeader, actualAuditionHistoryTableHeader);
        int actualAuditionHistoryRowCount = TalentProfilePage.driver.findElements(By.xpath("//div[@aria-label='Audition History']//div[@class='table-body']/div")).size();
        int expectedAuditionHistoryRowCount = 2;
        Assert.assertEquals("Validate Audition History Table Count", expectedAuditionHistoryRowCount, actualAuditionHistoryRowCount);
    }

    public void verifyComponentsInDemoHistorySection() {
        Assert.assertEquals("Validate Demo History Header", "Demo History", demoHistoryHeader.getText().trim());
        List<String> actualDemoHistoryTableHeader = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@aria-label='Demo History']//div[@class='h6 text-grey1']");
        List<String> expectedDemoHistoryTableHeader = BaseClass.addStringValueInList("Demo", "Upload Date", "Listened", "Favorited");
        Assert.assertEquals("Validate Demo History table header", expectedDemoHistoryTableHeader, actualDemoHistoryTableHeader);
        int actualDemoHistoryRowCount = TalentProfilePage.driver.findElements(By.xpath("//div[@aria-label='Demo History']//div[@class='table-body']/div")).size();
        int expectedDemoHistoryRowCount = 8;
        Assert.assertEquals("Validate Demo History Table Count", expectedDemoHistoryRowCount, actualDemoHistoryRowCount);

    }

    public void verifyHelpfulResources() {
        Assert.assertEquals("Validate Helpful Resources Header", "Helpful Resources", helpfulResourcesHeader.getText().trim());
        Assert.assertEquals("Validate Helpful Resources First Link", "How do I improve my statistics?", helpfulResourcesFirstLink.getText().trim());
        Assert.assertEquals("Validate Helpful Resources Second Link", "What are the statistics of successful talent?", helpfulResourcesSecondLink.getText().trim());
        Assert.assertEquals("Validate Helpful Resources Third Link", "What do these statistics mean?", helpfulResourcesThirdLink.getText().trim());
        List<WebElement> resourcesLinkList = null;
        resourcesLinkList = TalentProfilePage.driver.findElements(By.xpath("//h2[normalize-space()='Helpful Resources']/following-sibling::div//a"));
        for (int i = 0; i < resourcesLinkList.size(); i++) {
            WebElement resourceLink = resourcesLinkList.get(i);
            String count = String.valueOf(i + 1);
            String parentWindow = TalentProfilePage.driver.getWindowHandle();
            resourcesLinkList = TalentProfilePage.driver.findElements(By.xpath("//h2[normalize-space()='Helpful Resources']/following-sibling::div//a"));
            BaseClass.javaScriptClick(TalentProfilePage.driver, resourceLink);
            BaseClass.staticWaitForVisibility(3000);
            Set<String> allWindows = TalentProfilePage.driver.getWindowHandles();
            for (String childWindow : allWindows) {
                if (!childWindow.equalsIgnoreCase(parentWindow)) {
                    TalentProfilePage.driver.switchTo().window(childWindow);
                    BaseClass.validateURLresponse(TalentProfilePage.driver.getCurrentUrl());
                    String keyLinkText = "ResourcesLink" + count;
                    Assert.assertEquals("Validate Resource Page URL", ReaderManager.getInstance().getConfigReader().getUrlEndPoint(keyLinkText), TalentProfilePage.driver.getCurrentUrl());
                    TalentProfilePage.driver.close();
                }
                TalentProfilePage.driver.switchTo().window(parentWindow);
            }
        }
    }

    public void userAbleToNavigateToReviewPage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(reviewLink, 30, TalentProfilePage.driver);
        reviewLink.click();
        BaseClass.waitForVisibility(reviewHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to Reviews page", "Reviews", reviewHeader.getText().trim());
    }

    public void verifyPendingReviewsSection() {
        Assert.assertEquals("Validate navigate to Pending Reviews Header", "Pending Reviews", pendingReviewHeader.getText().trim());
        Assert.assertEquals("Validate navigate to Leave a Review Link", "Leave a Review", leaveReviewLink.getText().trim());
        int expectedPendingReviewCount = 1;
        int actualPendingReviewCount = TalentProfilePage.driver.findElements(By.xpath("//div[@id='pending-reviews']/div")).size();
        Assert.assertEquals("Validate Pending Review Count", expectedPendingReviewCount, actualPendingReviewCount);
    }

    public void verifyReceivedComplimentsSection() {
        Assert.assertEquals("Validate navigate to Received Compliments Header", "Received Compliments", receivedComplimentsHeader.getText().trim());
        int expectedReceivedComplimentsCount = 1;
        int actualReceivedComplimentsCount = TalentProfilePage.driver.findElements(By.xpath("//div[@class='col-12 padding-bottom-large']/div/div")).size();
        Assert.assertEquals("Validate Received Compliments Count", expectedReceivedComplimentsCount, actualReceivedComplimentsCount);
    }

    public void verifyMyReviewsSection() {
        Assert.assertEquals("Validate navigate to My Reviews Header", "My Reviews", myReviewsHeader.getText().trim());
        int receivedTableCount = TalentProfilePage.driver.findElements(By.xpath("//div[@id='profile-reviews']/div")).size();
        String[] receivedArray = reviewPagination.getText().trim().split(" ");
        int receivedPaginationCount = Integer.parseInt(receivedArray[1]);
        Assert.assertEquals("Validate Received count with pagination", receivedTableCount, receivedPaginationCount);
        givenTab.click();
        BaseClass.staticWaitForVisibility(3000);
        int givenTableCount = TalentProfilePage.driver.findElements(By.xpath("//div[@id='profile-reviews']/div")).size();
        String[] givenArray = reviewPagination.getText().trim().split(" ");
        int givenPaginationCount = Integer.parseInt(givenArray[1]);
        Assert.assertEquals("Validate Given count with pagination", givenTableCount, givenPaginationCount);

    }

    public void verifyLeaveReviewCTAFunctionality() {
        BaseClass.javaScriptClick(TalentProfilePage.driver, leaveReviewLink);
        BaseClass.waitForVisibility(shareYourExperienceHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to Share Your Experience Header", "Share Your Experience", shareYourExperienceHeader.getText().trim());
        Assert.assertEquals("Validate navigate to Your Review Header", "Your Review", yourReviewHeader.getText().trim());
        Assert.assertTrue("Verify Cancel button", BaseClass.isElementPresent(TalentProfilePage.driver, reviewCancelButton));
        singleStarRating.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("Validate Star rating Message", "It was bad.", starRatingText.getText().trim());
        yourReviewTextBox.sendKeys("My Demo Review");
    }

    public void userAbleToNavigateToResponseTemplatePage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(responseTemplateLink, 30, TalentProfilePage.driver);
        responseTemplateLink.click();
        BaseClass.waitForVisibility(responseTemplateHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to Response Templates page", "Response Templates", responseTemplateHeader.getText().trim());
    }

    public void verifyAddYourLiveDirectedSessionPolicyBanner() {
        Assert.assertEquals("Validate Create Template Button", "Create Template", createTemplateButton.getText().trim());
        if (BaseClass.isElementPresent(TalentProfilePage.driver, policyBannerDismissButton)) {
            Assert.assertEquals("Validate Policy Banner", "Add Your Live Directed Session Policy", policyBanner.getText().trim());
            Assert.assertTrue("Validate Policy Banner Dismiss button", BaseClass.isElementPresent(TalentProfilePage.driver, policyBannerDismissButton));
        } else {
            System.out.println("Policy Banner is not present");
        }
    }

    public void verifyUserIsAbleToDismissPolicyBannerManually() {
        if (BaseClass.isElementPresent(TalentProfilePage.driver, policyBannerDismissButton)) {
            policyBannerDismissButton.click();
            BaseClass.staticWaitForVisibility(2000);
            TalentProfilePage.driver.navigate().refresh();
            BaseClass.staticWaitForVisibility(3000);
            Assert.assertFalse("Validate Policy Banner Dismiss button Not Present", BaseClass.isElementPresent(TalentProfilePage.driver, policyBanner));
            Assert.assertFalse("Validate Policy Banner Not Present", BaseClass.isElementPresent(TalentProfilePage.driver, policyBannerDismissButton));
        } else {
            System.out.println("Policy Banner is not present");
        }
    }


    public void verifyResponseTemplateRecordInList() {
        Assert.assertTrue("Validate Response Template name Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateName));
        Assert.assertTrue("Validate Response Template Last Updated Date Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateLastUpdatedDate));
        Assert.assertTrue("Validate Response Template Down Arrow Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateDownArrow));
        Assert.assertTrue("Validate Response Template Duplicate Button Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateDuplicateButton));
        Assert.assertTrue("Validate Response Template Edit Button Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateEditButton));
        Assert.assertTrue("Validate Response Template Delete Button Present", BaseClass.isElementPresent(TalentProfilePage.driver, responseTemplateDeleteButton));
    }

    public void verifyDownArrowFunctionality() {
        responseTemplateDownArrow.click();
        BaseClass.waitForVisibility(proposalHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Down Arrow Function", "true", responseTemplateDownArrow.getAttribute("aria-expanded").trim());
        Assert.assertEquals("Validate Proposal Header", "Proposal", proposalHeader.getText().trim());
        Assert.assertTrue("Validate Proposal Revision Policy", proposalRevisionPolicy.getText().trim().contains("Revision Policy"));
        Assert.assertTrue("Validate Proposal Note", proposalNotes.getText().trim().contains("Note"));
    }

    public void verifyUpArrowFunctionality() {
        responseTemplateDownArrow.click();
        Assert.assertEquals("Validate Up Arrow Function", "false", responseTemplateDownArrow.getAttribute("aria-expanded").trim());

    }



    public void userAbleToNavigateToManagePackagePage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(managePackageLink, 30, TalentProfilePage.driver);
        managePackageLink.click();
        BaseClass.waitForVisibility(managePackageHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to Manage Packages page", "Manage Packages", managePackageHeader.getText().trim());
        Assert.assertEquals("Validate navigate to Create a Package button", "Create a Package", createPackageButton.getText().trim());
        Assert.assertEquals("Validate navigate to Draft tab", "Draft", draftTab.getText().trim());
        Assert.assertEquals("Validate navigate to Pending Review tab", "Pending Review", pendingReviewTab.getText().trim());
        Assert.assertEquals("Validate navigate to Approved tab", "Approved", approvedTab.getText().trim());

    }



    public void verifyDraftTab() {
        Assert.assertEquals("Validate navigate to Draft tab", "Draft", draftTab.getText().trim());
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Package Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageName));
        Assert.assertTrue("Validate Package Id is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageId));
        Assert.assertTrue("Validate Package Category is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageCategory));
        Assert.assertTrue("Validate Package Status is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageStatus));
        Assert.assertTrue("Validate Package Edit Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageEditButton));
        Assert.assertTrue("Validate Package Delete Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageDeleteButton));
        Assert.assertTrue("Validate Package Pagination is present", BaseClass.isElementPresent(TalentProfilePage.driver, packagePagination));

    }

    public void verifyDeleteFunctionalityOfDraftTabRecord() {
        String[] paginationArray1 = packagePagination.getText().trim().split(" ");
        int beforeDeletePackageCount = Integer.parseInt(paginationArray1[5]);
        System.out.println("beforeDeletePackageCount " + beforeDeletePackageCount);
        firstPackageDeleteButton.click();
        BaseClass.waitForVisibility(packageDeleteButton, 30, TalentProfilePage.driver);
        packageDeleteButton.click();
        BaseClass.staticWaitForVisibility(3000);
        draftTab.click();
        BaseClass.staticWaitForVisibility(3000);
        String[] paginationArray2 = packagePagination.getText().trim().split(" ");
        int afterDeletePackageCount = Integer.parseInt(paginationArray2[5]);
        System.out.println("afterDeletePackageCount " + afterDeletePackageCount);
        Assert.assertEquals("Validate Pagination count after package delete", beforeDeletePackageCount - 1, afterDeletePackageCount);
    }

    public void verifySearchFunctionalityOfDraftTabRecord() {
        String expectedPackageName = firstPackageName.getText().trim();
        String expectedPackageId = firstPackageId.getText().trim().replaceAll("Package #", "");
        searchFiledTextBox.sendKeys(expectedPackageName);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package name", expectedPackageName, firstPackageName.getText().trim());
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
        searchFiledTextBox.sendKeys(expectedPackageId);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package Id", expectedPackageId, firstPackageId.getText().trim().replaceAll("Package #", ""));
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
    }

    public void verifyPendingReviewTab() {
        pendingReviewTab.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Package Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageName));
        Assert.assertTrue("Validate Package Id is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageId));
        Assert.assertTrue("Validate Package Category is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageCategory));
        Assert.assertTrue("Validate Package Status is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageStatus));
        Assert.assertTrue("Validate Package Delete Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageDeleteButton));
        Assert.assertTrue("Validate Package Pagination is present", BaseClass.isElementPresent(TalentProfilePage.driver, packagePagination));
    }

    public void verifyDeleteFunctionalityOfPendingReviewTabRecord() {
        String[] paginationArray1 = packagePagination.getText().trim().split(" ");
        int beforeDeletePackageCount = Integer.parseInt(paginationArray1[5]);
        System.out.println("beforeDeletePackageCount " + beforeDeletePackageCount);
        firstPackageDeleteButton.click();
        BaseClass.waitForVisibility(packageDeleteButton, 30, TalentProfilePage.driver);
        packageDeleteButton.click();
        BaseClass.staticWaitForVisibility(3000);
        pendingReviewTab.click();
        BaseClass.staticWaitForVisibility(3000);
        String[] paginationArray2 = packagePagination.getText().trim().split(" ");
        int afterDeletePackageCount = Integer.parseInt(paginationArray2[5]);
        System.out.println("afterDeletePackageCount " + afterDeletePackageCount);
        Assert.assertEquals("Validate Pagination count after package delete", beforeDeletePackageCount - 1, afterDeletePackageCount);
    }

    public void verifySearchFunctionalityOfPendingReviewRecord() {
        String expectedPackageName = firstPackageName.getText().trim();
        String expectedPackageId = firstPackageId.getText().trim().replaceAll("Package #", "");
        searchFiledTextBox.sendKeys(expectedPackageName);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package name", expectedPackageName, firstPackageName.getText().trim());
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
        searchFiledTextBox.sendKeys(expectedPackageId);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package Id", expectedPackageId, firstPackageId.getText().trim().replaceAll("Package #", ""));
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
    }

    public void verifyApprovedTab() {
        approvedTab.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertTrue("Validate Package Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageName));
        Assert.assertTrue("Validate Package Id is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageId));
        Assert.assertTrue("Validate Package Category is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageCategory));
        Assert.assertTrue("Validate Package Status is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageStatus));
        Assert.assertTrue("Validate Package Edit Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageEditButton));
        Assert.assertTrue("Validate Package Delete Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageDeleteButton));
        Assert.assertTrue("Validate Package Active De-active Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageActiveInactiveButton));
        Assert.assertTrue("Validate Package Duplicate Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageDuplicateButton));
        Assert.assertTrue("Validate Package Pagination is present", BaseClass.isElementPresent(TalentProfilePage.driver, packagePagination));
    }

    public void verifyDeactivateFunctionalityOfApprovedTabRecord() {
        String firstPackageStatusText = firstPackageStatus.getText().trim();
        if (firstPackageStatusText.equalsIgnoreCase("Inactive")) {
            firstPackageActiveInactiveButton.click();
            BaseClass.staticWaitForVisibility(5000);
        }
        firstPackageActiveInactiveButton.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("validate Inactive package status", "Inactive", firstPackageStatus.getText().trim());
    }

    public void verifyActivateFunctionalityOfApprovedTabRecord() {
        firstPackageActiveInactiveButton.click();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertEquals("validate Active package status", "Active", firstPackageStatus.getText().trim());
    }

    public void verifySearchFunctionalityOfApprovedTabRecord() {
        String expectedPackageName = firstPackageName.getText().trim();
        String expectedPackageId = firstPackageId.getText().trim().replaceAll("Package #", "");
        searchFiledTextBox.sendKeys(expectedPackageName);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package name", expectedPackageName, firstPackageName.getText().trim());
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
        searchFiledTextBox.sendKeys(expectedPackageId);
        submitSearchField.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate Search function for package Id", expectedPackageId, firstPackageId.getText().trim().replaceAll("Package #", ""));
        clearSearchFieldButton.click();
        BaseClass.staticWaitForVisibility(2000);
    }

    public void userAbleToNavigateToEditProfilePage() {
        BaseClass.mouseOverOnElement(TalentProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(editProfileLink, 30, TalentProfilePage.driver);
        editProfileLink.click();
        BaseClass.waitForVisibility(editProfileHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate navigate to Edit Profile page", "Edit Profile", editProfileHeader.getText().trim());
        Assert.assertEquals("Validate Personal Info tab", "Personal Info", personalInfoTab.getText().trim());
        Assert.assertEquals("Validate Overview tab", "Overview", overviewTab.getText().trim());
        Assert.assertEquals("Validate Demos tab", "Demos", demosTab.getText().trim());
        Assert.assertEquals("Validate Statistics Tab", "Statistics", statisticsTab.getText().trim());

    }

    public void verifyTalentMemberSection() {
        Assert.assertTrue("Verify Member Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberNameLeftTop));
        Assert.assertTrue("Verify Member User Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberUserNameLeftTop));
        Assert.assertEquals("Verify View Profile Button", "View Profile", viewProfileButton.getText().trim());
        viewProfileButton.click();
        Assert.assertTrue("Validate navigate to profile page", TalentProfilePage.driver.getCurrentUrl().contains("https://www.voices.systems/profile"));
        TalentProfilePage.driver.navigate().back();
        BaseClass.staticWaitForVisibility(5000);
    }

    public void verifyMemberContainerSection() {
        Assert.assertTrue("Verify Member Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberNameLeftTop));
        Assert.assertTrue("Verify Member User Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberUserNameLeftTop));
        Assert.assertTrue("Verify Member Star Rating is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberStarRating));
        Assert.assertTrue("Verify Member Review Link is present", BaseClass.isElementPresent(TalentProfilePage.driver, memberReviewLink));

    }


    public void verifyPersonalInfoTab() {
        personalInfoTab.click();
        Assert.assertEquals("Validate Full Name Header", "Full Name", fullNameHeader.getText().trim());
        Assert.assertEquals("Validate Profile Link Header", "Profile Link", profileLinkHeader.getText().trim());
        Assert.assertEquals("Validate Displayed Address Header", "Displayed Address", displayedAddressHeader.getText().trim());
        Assert.assertEquals("Validate Profile Photo Header", "Profile Photo", profilePhotoHeader.getText().trim());
        Assert.assertEquals("Validate cancel button", "Cancel", profileCancelButton.getText().trim());
        Assert.assertEquals("Validate Save Edits button", "Save Edits", profileSaveEditButton.getText().trim());
        String[] memberNameArray = memberNameLeftTop.getText().trim().split(" ");
        Assert.assertEquals("validate member first name", memberNameArray[0], memberFirstNameTextField.getAttribute("value").trim());
        Assert.assertEquals("validate member last name", memberNameArray[1], memberLastNameTextField.getAttribute("value").trim());
        Assert.assertEquals("validate member username", memberUserNameLeftTop.getText().trim(), "/" + memberUsernameTextField.getAttribute("value").trim());
        Assert.assertEquals("Validate member city label", "City", memberCityHeader.getText().trim());
        Assert.assertEquals("Validate member Country label", "Country", memberCountryHeader.getText().trim());
        Assert.assertEquals("Validate member state label", "State / Province", memberStateHeader.getText().trim());
        BaseClass.scrollToElement(TalentProfilePage.driver, memberCityHeader);
        Assert.assertEquals("Validate member upload photo button", "Upload Photo", memberUploadPhotoButton.getText().trim());
        memberUploadPhoto.sendKeys(memberProfilePhoto);
        BaseClass.staticWaitForVisibility(4000);
        profileSaveEditButton.click();
        BaseClass.staticWaitForVisibility(4000);
        profileCancelButton.click();
    }


    public void verifyOverviewTab() {
        BaseClass.javaScriptClick(TalentProfilePage.driver, overviewTab);
        BaseClass.waitForVisibility(completeYourSkillHeader, 30, TalentProfilePage.driver);
        viewAllEmptySkillLink.click();
        BaseClass.staticWaitForVisibility(2000);
        List<String> expectedEmptySkillList = BaseClass.addStringValueInList("Client List", "Talent Description", "Native Language", "Gender", "Accents", "Turnaround Time", "Microphone", "Software", "Special Equipment", "Live Directed Session Softwares");
        List<String> actualEmptySkillList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@id='empty-fields-list']//a");
        Assert.assertEquals("Validate Empty Skill list", expectedEmptySkillList, actualEmptySkillList);
        Assert.assertEquals("validate about me header", "About Me", aboutMeHeader.getText().trim());
        Assert.assertEquals("validate Categories header", "Categories", categoryHeader.getText().trim());
        List<String> expectedCategoryList = BaseClass.addStringValueInList("Animation", "Audiobooks", "Documentaries", "Elearning", "Movie Trailers", "Online Ad", "Podcasting", "Radio Ad", "Telephone", "Television Ad", "Video Narration", "Videogames", "Voice Assistant", "Datasets");
        List<String> actualCategoryList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@id='voiceover-categories-accordion']//input/following-sibling::label");
        Assert.assertEquals("Validate category option list", expectedCategoryList, actualCategoryList);
        Assert.assertEquals("validate Vocal Characteristics header", "Vocal Characteristics", vocalCharacteristicsHeader.getText().trim());
        Assert.assertTrue("validate female radio button present", BaseClass.isElementPresent(TalentProfilePage.driver, femaleGenderRadioButton));
        Assert.assertTrue("validate male radio button present", BaseClass.isElementPresent(TalentProfilePage.driver, maleGenderRadioButton));
        List<String> expectedAgeList = BaseClass.addStringValueInList("Child (5-12)", "Teen (13-17)", "Young Adult (18-35)", "Middle Aged (35-54)", "Senior (55+)");
        List<String> actualAgeList = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//div[@id='voice_age_ids']//label");
        Assert.assertEquals("Validate age list", expectedAgeList, actualAgeList);
        Assert.assertEquals("validate language dropdown tag as select", "select", languageDropdown.getTagName().trim());
        Assert.assertEquals("validate native language dropdown tag as select", "select", nativeLanguageDropdown.getTagName().trim());
        Assert.assertEquals("validate accent dropdown tag as select", "select", accentDropdown.getTagName().trim());
        Assert.assertTrue("Validate Live Directed Session header", liveDirectedSessionHeader.getText().contains("Live Directed Session"));
        List<String> expectedLiveDirectedSession = BaseClass.addStringValueInList("Yes, I offer live directed sessions", "No, I don’t offer live directed sessions");
        List<String> actualLiveDirectedSession = BaseClass.getColumnDataInList(TalentProfilePage.driver, "(//div[@id='live-directed-session-accordion']/div/div)[1]//label");
        Assert.assertEquals("Validate Live Directed Session", expectedLiveDirectedSession, actualLiveDirectedSession);
        List<String> expectedLiveDirectedSoftware = BaseClass.addStringValueInList("Zoom", "Google Meet", "Microsoft Teams", "Skype", "Phone Call", "FaceTime", "Source-Connect");
        List<String> actualLiveDirectedSoftware = BaseClass.getColumnDataInList(TalentProfilePage.driver, "(//div[@id='live-directed-session-accordion']/div/div)[2]//label");
        Assert.assertEquals("Validate Live Directed Session Software List", expectedLiveDirectedSoftware, actualLiveDirectedSoftware);
        Assert.assertEquals("Validate Studio Header", "Studio", studioHeader.getText().trim());
        Assert.assertEquals("Validate Turnaround Time Label", "Turnaround Time", turnAroundTimeLabel.getText().trim());
        Assert.assertEquals("Validate Microphone Label", "Microphone", microphoneLabel.getText().trim());
        Assert.assertEquals("Validate Computer & Software Label", "Computer & Software", computerSoftwareLabel.getText().trim());
        Assert.assertEquals("Validate Special Equipment Label", "Special Equipment", specialEquipmentLabel.getText().trim());
        Assert.assertEquals("Validate Past Clients Header", "Past Clients", pastClientHeader.getText().trim());
        Assert.assertTrue("Validate Add Past Client Button", BaseClass.isElementPresent(TalentProfilePage.driver, addPastClientButton));
        Assert.assertTrue("Validate Cancel Button", BaseClass.isElementPresent(TalentProfilePage.driver, profileCancelButton));
        Assert.assertTrue("Validate Save Edits Button", BaseClass.isElementPresent(TalentProfilePage.driver, profileSaveEditButton));
    }

    public void verifyDemosTab() {
        BaseClass.javaScriptClick(TalentProfilePage.driver, demosTab);
        BaseClass.waitForVisibility(demoSamplesHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Demo Samples Header", "Demo Samples", demoSamplesHeader.getText().trim());
        Assert.assertEquals("Validate Add A Demo Button", "Add a Demo", addADemoButton.getText().trim());
        Assert.assertTrue("Validate Demo Sample List", TalentProfilePage.driver.findElements(By.xpath("//form[@id='sortable']/div")).size() > 1);
    }

    public void verifyEachRecordInDemoSamplesList() {
        Assert.assertTrue("Validate Demo Drag To Recorder Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoDragToRecorderButton));
        Assert.assertTrue("Validate Demo Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoName));
        Assert.assertTrue("Validate Demo Category Name is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoCategoryName));
        Assert.assertTrue("Validate Demo Favorites Count is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoFavoriteCount));
        Assert.assertTrue("Validate Demo Preview Count is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoPreviewCount));
        Assert.assertTrue("Validate Demo Edit Button is present", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemoEditButton));
    }

    public void verifyAddDemoButton(String language, String accent, String style, String role, String age) {
        addADemoButton.click();
        BaseClass.waitForVisibility(animationCategoryRadioButton, 30, TalentProfilePage.driver);
        animationCategoryRadioButton.click();
        overviewTitleInputTextField.sendKeys("Demo Title");
        overviewDescriptionTextField.sendKeys("Demo Description");
        BaseClass.scrollToElement(TalentProfilePage.driver, overviewDescriptionTextField);
        uploadMediaDemoFile.sendKeys(demoMediaMP4);
        BaseClass.staticWaitForVisibility(5000);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        demoAccentDropdown.click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoAccentDropdown);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + accent + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoStyleDropdown);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoStyleDropdown);
        demoStyleInputTextField.sendKeys(style);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + style + "']")).click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoRoleDropdown);
        demoRoleInputTextField.sendKeys(role);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + role + "']")).click();
        TalentProfilePage.driver.findElement(By.xpath("//label[text()='" + age + "']/parent::div")).click();
        addDemoButton.click();
        BaseClass.staticWaitForVisibility(5000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertTrue("Validate demo not created", demoName.contains("Demo Title"));
    }

    public void verifyExitDemoButtonFunctionality(String language, String accent, String style, String role, String age) {
        addADemoButton.click();
        BaseClass.waitForVisibility(animationCategoryRadioButton, 30, TalentProfilePage.driver);
        animationCategoryRadioButton.click();
        overviewTitleInputTextField.sendKeys("Demo Exit Title");
        overviewDescriptionTextField.sendKeys("Demo Description");
        BaseClass.scrollToElement(TalentProfilePage.driver, overviewDescriptionTextField);
        uploadMediaDemoFile.sendKeys(demoMediaMP4);
        BaseClass.staticWaitForVisibility(5000);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        demoAccentDropdown.click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoAccentDropdown);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + accent + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoStyleDropdown);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoStyleDropdown);
        demoStyleInputTextField.sendKeys(style);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + style + "']")).click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoRoleDropdown);
        demoRoleInputTextField.sendKeys(role);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + role + "']")).click();
        TalentProfilePage.driver.findElement(By.xpath("//label[text()='" + age + "']/parent::div")).click();
        demoExitButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertFalse("Validate demo not created", demoName.contains("Demo Exit Title"));
    }

    public void verifyCancelDemoButtonFunctionality(String language, String accent, String style, String role, String age) {
        addADemoButton.click();
        BaseClass.waitForVisibility(animationCategoryRadioButton, 30, TalentProfilePage.driver);
        animationCategoryRadioButton.click();
        overviewTitleInputTextField.sendKeys("Demo Cancel Title");
        overviewDescriptionTextField.sendKeys("Demo Description");
        BaseClass.scrollToElement(TalentProfilePage.driver, overviewDescriptionTextField);
        uploadMediaDemoFile.sendKeys(demoMediaMP4);
        BaseClass.staticWaitForVisibility(5000);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        demoAccentDropdown.click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoAccentDropdown);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + accent + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoStyleDropdown);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoStyleDropdown);
        demoStyleInputTextField.sendKeys(style);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + style + "']")).click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoRoleDropdown);
        demoRoleInputTextField.sendKeys(role);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + role + "']")).click();
        TalentProfilePage.driver.findElement(By.xpath("//label[text()='" + age + "']/parent::div")).click();
        cancelButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertFalse("Validate demo not created", demoName.contains("Demo Cancel Title"));
    }


    public void verifyEditDemoButtonFunctionality(String language) {
        BaseClass.javaScriptClick(TalentProfilePage.driver, firstDemoEditButton);
        BaseClass.waitForVisibility(audioBooksDemoCategory, 30, TalentProfilePage.driver);
        overviewTitleInputTextField.clear();
        overviewTitleInputTextField.sendKeys("Edit Demo");
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoSaveEditButton);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoSaveEditButton);
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertTrue("Validate demo not created", demoName.contains("Edit Demo"));

    }

    public void verifyCancelButtonInEditDemoPage(String language) {
        BaseClass.javaScriptClick(TalentProfilePage.driver, firstDemoEditButton);
        BaseClass.waitForVisibility(audioBooksDemoCategory, 30, TalentProfilePage.driver);
        overviewTitleInputTextField.clear();
        overviewTitleInputTextField.sendKeys("Cancel Edit Demo");
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoCancelEditButton);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoCancelEditButton);
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertFalse("Validate demo not created", demoName.contains("Cancel Edit Demo"));
    }

    public void verifyDeleteButtonInEditDemoPage(String language) {
        BaseClass.javaScriptClick(TalentProfilePage.driver, firstDemoEditButton);
        BaseClass.waitForVisibility(audioBooksDemoCategory, 30, TalentProfilePage.driver);
        overviewTitleInputTextField.clear();
        overviewTitleInputTextField.sendKeys("Delete Edit Demo");
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        BaseClass.scrollToElement(TalentProfilePage.driver, demoDeleteEditButton);
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoDeleteEditButton);
        BaseClass.waitForVisibility(demoEditDeleteConfirmButton, 30, TalentProfilePage.driver);
        demoEditDeleteConfirmButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertFalse("Validate demo not created", demoName.contains("Delete Edit Demo"));
    }

    public void verifyExitButtonInEditDemoPage(String language) {
        BaseClass.javaScriptClick(TalentProfilePage.driver, firstDemoEditButton);
        BaseClass.waitForVisibility(audioBooksDemoCategory, 30, TalentProfilePage.driver);
        overviewTitleInputTextField.clear();
        overviewTitleInputTextField.sendKeys("Cancel Edit Demo");
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoLanguageDropdown);
        demoLanguageInputTextField.sendKeys(language);
        TalentProfilePage.driver.findElement(By.xpath("//div[text()='" + language + "']")).click();
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoExitButton);
        BaseClass.staticWaitForVisibility(3000);
        List<String> demoName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//h3[@class='heading h4 text-dark']");
        Assert.assertFalse("Validate demo not created", demoName.contains("Cancel Edit Demo"));
    }

    public void verifyDragToReorderButtonFunctionality() {
        Actions action = new Actions(TalentProfilePage.driver);
        BaseClass.scrollToElement(TalentProfilePage.driver, firstDemoDragToRecorderButton);
        BaseClass.staticWaitForVisibility(2000);
        action.dragAndDrop(firstDemoDragToRecorderButton, secondDemoDragToRecorderButton).build().perform();
        BaseClass.staticWaitForVisibility(3000);
    }

    public void verifyPlayButtonOfDemoSample() {
        Assert.assertEquals("Validate Initial Play time", "0:00", demoPlayCurrentTime.getText().trim());
        BaseClass.javaScriptClick(TalentProfilePage.driver, demoPlayPauseButton);
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertNotEquals("Validate Final Play time", "0:00", demoPlayCurrentTime.getText().trim());

    }




    public void verifyNavigationToPublicProfilePage() {
        BaseClass.waitForVisibility(viewProfileButton, 30, TalentProfilePage.driver);
        viewProfileButton.click();
        BaseClass.waitForVisibility(packageHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate able to navigate to public profile page", "Packages", packageHeader.getText().trim());
    }

    public void verifyProfileTopHeader() {
        Assert.assertTrue("Validate Profile Name Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileNameHeader));

    }

    public void verifyTalentProfileContainer() {
        Assert.assertEquals("Validate Portfolio tab", "Portfolio", portfolioTab.getText().trim());
        Assert.assertEquals("Validate About Talent tab", "About Talent", aboutTalentTab.getText().trim());
    }

    public void verifyProfileContent() {
        Assert.assertTrue("Validate Profile Name Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileNameHeader));
        Assert.assertTrue("Validate Profile Avtar Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileAvtarPhoto));
        Assert.assertTrue("Validate Profile Location Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileLocation));
        Assert.assertTrue("Validate Profile Star Rating Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileStarRating));
        Assert.assertTrue("Validate Profile Review Rating Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileRatingReview));
        Assert.assertTrue("Validate Profile Review Link Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileReviewsLink));
        Assert.assertTrue("Validate Profile Share Icon Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileShareIcon));

    }



    public void verifyShareButton() {
        Assert.assertTrue("Validate Profile Share Icon Present", BaseClass.isElementPresent(TalentProfilePage.driver, profileShareIcon));
        profileShareIcon.click();
        Assert.assertEquals("Validate Share Talent Profile header", "Share Talent Profile", shareTalentProfileHeader.getText().trim());
        Assert.assertTrue("Validate Share Talent Profile Copy Button", BaseClass.isElementPresent(TalentProfilePage.driver, shareTalentProfileCopyButton));
        Assert.assertTrue("Validate Share Talent Profile Close Button", BaseClass.isElementPresent(TalentProfilePage.driver, shareTalentProfileCloseButton));
        shareTalentProfileCopyButton.click();
        shareTalentProfileCloseButton.click();
    }

    public void verifyPortfolioTab() {
        portfolioTab.click();
        BaseClass.waitForVisibility(packageHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Package Header under Portfolio", "Packages", packageHeader.getText().trim());
        BaseClass.waitForVisibility(demosHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Demos Header under Portfolio", "Demos", demosHeader.getText().trim());

    }



    public void verifyAboutTalentTab() {
        aboutTalentTab.click();
        BaseClass.waitForVisibility(vocalCharacteristicsHeader, 30, TalentProfilePage.driver);
        Assert.assertEquals("Validate Vocal Characteristics Header", "Vocal Characteristics", vocalCharacteristicsHeader.getText().trim());
        Assert.assertEquals("Validate Vocal Characteristics Language Header", "Language", vocalCharLanguageHeader.getText().trim());
        Assert.assertEquals("Validate Vocal Characteristics Voice Ages Header", "Voice Ages", vocalCharAgeHeader.getText().trim());
        Assert.assertEquals("Validate Vocal Characteristics Categories Header", "Categories", vocalCharCategoriesHeader.getText().trim());
    }

    public void verifyPackages() {
        portfolioTab.click();
        BaseClass.waitForVisibility(packageHeader, 30, TalentProfilePage.driver);
        Assert.assertTrue("Validate Package Present under portfolio", BaseClass.isElementPresent(TalentProfilePage.driver, firstPackageUnderPortfolio));
        String packageNamePortfolioPage = firstPackageUnderPortfolio.getText().trim();
        firstPackageUnderPortfolio.click();
        BaseClass.waitForVisibility(packageNameOnPackagePage, 30, TalentProfilePage.driver);
        String packageNamePackagePage = packageNameOnPackagePage.getText().trim();
        Assert.assertEquals("Validate Package Name", packageNamePortfolioPage, packageNamePackagePage);
        List<String> actualPackageTabName = BaseClass.getColumnDataInList(TalentProfilePage.driver, "//nav[@id='main-tab-nav']//a");
        List<String> expectedPackageTabName = BaseClass.addStringValueInList("Overview", "What’s Included", "FAQ", "About Talent");
        Assert.assertEquals("validate Package Tab Name", expectedPackageTabName, actualPackageTabName);
        TalentProfilePage.driver.navigate().back();
        BaseClass.staticWaitForVisibility(4000);
    }



    public void verifyDemos() {
        portfolioTab.click();
        BaseClass.waitForVisibility(demosHeader, 30, TalentProfilePage.driver);
        Assert.assertTrue("Validate Demos Present under portfolio", BaseClass.isElementPresent(TalentProfilePage.driver, firstDemosUnderPortfolio));
        String demosNamePortfolioPage = firstDemosUnderPortfolio.getText().trim();
        firstDemosUnderPortfolio.click();
        BaseClass.waitForVisibility(demosNameOnDemosPage, 30, TalentProfilePage.driver);
        String demosNameDemosPage = demosNameOnDemosPage.getText().trim();
        Assert.assertEquals("Validate Demos Name", demosNamePortfolioPage, demosNameDemosPage);
        TalentProfilePage.driver.navigate().back();
        BaseClass.staticWaitForVisibility(4000);

    }



    public void verifyReviewsContainer() {
        BaseClass.waitForVisibility(profileReviewHeader, 30, TalentProfilePage.driver);
        Assert.assertTrue("Validate Reviews Header", profileReviewHeader.getText().trim().contains("Reviews"));
        Assert.assertTrue("Validate Profile Star Rating", BaseClass.isElementPresent(TalentProfilePage.driver, reviewStarRating));
        Assert.assertTrue("Validate Profile Reviewer Name", BaseClass.isElementPresent(TalentProfilePage.driver, profileReviewerName));
        Assert.assertTrue("Validate Profile Reviewer Review Time", BaseClass.isElementPresent(TalentProfilePage.driver, profileReviewerReviewTime));
        Assert.assertTrue("Validate Profile Reviewer Review Text", BaseClass.isElementPresent(TalentProfilePage.driver, profileReviewerReviewText));
    }

}
