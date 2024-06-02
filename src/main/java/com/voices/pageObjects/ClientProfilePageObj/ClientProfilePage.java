package com.voices.pageObjects.ClientProfilePageObj;

import com.voices.baseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collections;
import java.util.List;

public class ClientProfilePage {
    private static WebDriver driver;

    public ClientProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//div[contains(text(),'Me')])[2]/parent::a")
    private WebElement meIconLink;
    @FindBy(xpath = "//a[contains(text(),'My Home')]")
    private WebElement myHomeLink;
    @FindBy(xpath = "//a[normalize-space()='Favorites']")
    private WebElement favoritesLink;
    @FindBy(xpath = "//a[normalize-space()='Previously Hired Talent']")
    private WebElement previouslyHiredTalentLink;
    @FindBy(xpath = "//a[normalize-space()='Reviews']")
    private WebElement reviewsLink;
    @FindBy(xpath = "//a[normalize-space()='Manage Licenses']")
    private WebElement manageLicensesLink;
    @FindBy(xpath = "//a[normalize-space()='Manage Team']")
    private WebElement manageTeamLink;
    @FindBy(xpath = "//a[normalize-space()='Billing History']")
    private WebElement billingHistoryLink;
    @FindBy(xpath = "//a[normalize-space()='Account Settings']")
    private WebElement accountSettingLink;
    @FindBy(xpath = "(//a[normalize-space()='Log Out'])[1]")
    private WebElement logoutLink;
    @FindBy(xpath = "//a[normalize-space()='Help Center']")
    private WebElement helpCenterLink;
    @FindBy(xpath = "//a[normalize-space()='Contact Support']")
    private WebElement contactSupportLink;
    @FindBy(xpath = "//h1[contains(text(),'Welcome back')]")
    private WebElement welcomeBackHeader;
    @FindBy(xpath = "//img[@title='Search for Top Talent']")
    private WebElement bannerImage;
    @FindBy(xpath = "//a[text()=' Dismiss Banner']")
    private WebElement dismissBannerIcon;
    @FindBy(xpath = "//div[contains(text(),'Jobs')]/parent::a")
    private WebElement jobsIconLink;
    @FindBy(xpath = "//h4[normalize-space()='My Jobs']")
    private WebElement myJobsHeader;
    @FindBy(xpath = "(//nav[@id='main-tab-nav']//a)[1]")
    private WebElement draftTabUnderMyHome;
    @FindBy(xpath = "(//nav[@id='main-tab-nav']//a)[2]")
    private WebElement workingTabUnderMyHome;
    @FindBy(xpath = "(//nav[@id='main-tab-nav']//a)[3]")
    private WebElement doneTabUnderMyHome;
    @FindBy(xpath = "//span[normalize-space()='Post a job']")
    private WebElement postAJobUnderDraftTab;
    @FindBy(xpath = "//span[@class='margin-left-smaller text-grey1']")
    private WebElement onlineAddText;
    @FindBy(xpath = "//a[normalize-space()='Edit Draft']")
    private WebElement editDraftButtonUserDraftTab;
    @FindBy(xpath = "//div[@id='header-title']")
    private WebElement editJobTitle;
    @FindBy(xpath = "//h5[@class='margin-bottom-medium margin-top-large']/a[contains(text(),'View All')]")
    private WebElement viewAllLinkUnderWorkingTab;
    @FindBy(xpath = "(//div[@class='jobs-info-wrapper']//span[@class='job-title'])[1]")
    private WebElement firstJobNameUnderWorkingTab;
    @FindBy(xpath = "(//div[@class='job-category']//span[@class='margin-left-smaller text-grey1'])[1]")
    private WebElement firstJobCategoryUnderWorkingTab;
    @FindBy(xpath = "(//div[@class='job-button']//div[@class='working'])[1]")
    private WebElement firstJobProjectDeadLineSection;
    @FindBy(xpath = "(//div[@class='job-details'])[1]")
    private WebElement firstJobDetailsUnderDoneTab;
    @FindBy(xpath = "(//div[@class='hired-talents'])[1]//h5")
    private WebElement firstTalentHiredName;
    @FindBy(xpath = "(//button[@type='button'][normalize-space()='Invite to Job'])[1]")
    private WebElement firstInviteAJobButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='General Settings']")
    private WebElement generalSettingsTab;
    @FindBy(xpath = "//h1[normalize-space()='General Settings']")
    private WebElement generalSettingsHeader;
    @FindBy(xpath = "//h2[normalize-space()='Contact Information']")
    private WebElement contactInformationHeader;
    @FindBy(xpath = "//h2[normalize-space()='Mailing Address']")
    private WebElement mailingAddressHeader;
    @FindBy(xpath = "//h2[normalize-space()='Time Zone']")
    private WebElement timeZoneHeader;
    @FindBy(xpath = "//h2[normalize-space()='Connected Services']")
    private WebElement connectedServicesHeader;
    @FindBy(xpath = "//h2[normalize-space()='Additional Options']")
    private WebElement additionalOptionsHeader;
    @FindBy(xpath = "//button[@name='cancel']")
    private WebElement cancelButton;
    @FindBy(xpath = "//button[@name='submit']")
    private WebElement saveChangesButton;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Notifications']")
    private WebElement notificationsTab;
    @FindBy(xpath = "//h1[normalize-space()='Notifications']")
    private WebElement notificationsHeader;
    @FindBy(xpath = "//h3[normalize-space()='Notification Methods']")
    private WebElement notificationsMethodsHeader;
    @FindBy(xpath = "//h4[normalize-space()='Display Settings']")
    private WebElement displaySettingsHeader;
    @FindBy(xpath = "//a[@class='btn btn-primary btn-circular'][normalize-space()='Business Profile']")
    private WebElement businessProfileTab;
    @FindBy(xpath = "//h1[normalize-space()='Business Profile']")
    private WebElement businessProfileHeader;
    @FindBy(xpath = "//h2[normalize-space()='About Me']")
    private WebElement aboutMeHeader;
    @FindBy(xpath = "//h2[normalize-space()='Personalize Your Experience']")
    private WebElement personalizeYourExperienceHeader;
    @FindBy(xpath = "//h4[normalize-space()='Previously Hired Talent']")
    private WebElement previouslyHiredTalentHeader;
    @FindBy(xpath = "(//div[@class='talent-name']/a)[1]")
    private WebElement previouslyHiredTalentName;
    @FindBy(xpath = "(//div[@class='invite-button'])[1]")
    private WebElement previouslyHiredTalentInviteButton;
    @FindBy(xpath = "(//div[@class='job-details-container'])[1]")
    private WebElement previouslyHiredTalentJobDetails;
    @FindBy(xpath = "//h4[normalize-space()='Additional Resources']")
    private WebElement additionalResourcesHeader;
    @FindBy(xpath = "//h4[normalize-space()='Customer Support']")
    private WebElement customerSupportHeader;
    @FindBy(xpath = "//p[@class='text-sm text-grey1 margin-bottom-medium']")
    private WebElement customerSupportDescription;
    @FindBy(xpath = "//p[@class='margin-top-zero text-sm margin-bottom-smallest']/a")
    private WebElement customerSupportCallTollFree;
    @FindBy(xpath = "//p[@class='text-sm margin-bottom-zero']/a")
    private WebElement customerSupportEmail;
    @FindBy(xpath = "//p[@class='text-grey1 text-sm text-left']")
    private WebElement accountSettingHeader;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Subscription']")
    private WebElement subscriptionTab;
    @FindBy(xpath = "//h1[normalize-space()='Subscription']")
    private WebElement subscriptionHeader;
    @FindBy(xpath = "//h2[normalize-space()='Basic']")
    private WebElement basicSubscriptionHeader;
    @FindBy(xpath = "//h2[normalize-space()='Plus']")
    private WebElement plusSubscriptionHeader;
    @FindBy(xpath = "//h2[normalize-space()='Enterprise']")
    private WebElement enterpriseSubscriptionHeader;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Change Password']")
    private WebElement changePasswordTab;
    @FindBy(xpath = "//h1[normalize-space()='Change Password']")
    private WebElement changePasswordHeader;
    @FindBy(xpath = "//input[@id='old_password']")
    private WebElement currentPasswordField;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement newPasswordField;
    @FindBy(xpath = "//input[@id='confirm']")
    private WebElement reTypePasswordFiled;
    @FindBy(xpath = "//a[@class='btn btn-default btn-circular'][normalize-space()='Billing Information']")
    private WebElement billingInformationTab;
    @FindBy(xpath = "//h1[normalize-space()='Billing Information']")
    private WebElement billingInformationHeader;
    @FindBy(xpath = "//h2[normalize-space()='Payment Information']")
    private WebElement paymentInformationHeader;
    @FindBy(xpath = "//h2[normalize-space()='Invoice Information']")
    private WebElement invoiceInformationHeader;
    @FindBy(xpath = "//button[@id='add-email']")
    private WebElement addEmailButton;
    @FindBy(xpath = "//h1[text()='Previously Hired Talent']")
    private WebElement previouslyHiredTalentPageHeader;
    @FindBy(xpath = "//div[@class='talent-list-group list-group']/div[1]/div[1]/div[2]/a")
    private WebElement firstPreviouslyHiredTalentName;
    @FindBy(xpath = "//div[@class='talent-list-group list-group']/div[1]/div[2]/a")
    private WebElement firstPreviouslyHiredTalentJobTitle;
    @FindBy(xpath = "//div[@class='talent-list-group list-group']/div[1]/div[3]/button")
    private WebElement firstPreviouslyHiredTalentInviteToJobButton;
    @FindBy(xpath = "//p[@class='pagination-text text-center margin-zero text-grey1 text-xs']")
    private WebElement previouslyHiredPagination;
    @FindBy(xpath = "//input[@id='action_bar_search_keyword']")
    private WebElement previouslyHiredTalentSearchBox;
    @FindBy(xpath = "//button[@data-action='submit_search']")
    private WebElement previouslyHiredTalentSearchIcon;
    @FindBy(xpath = "//button[@title='Clear Search']")
    private WebElement previouslyHiredTalentClearSearchIcon;
    @FindBy(xpath = "//div[@id='sort-action-list']//button[@type='button']")
    private WebElement sortButton;
    @FindBy(xpath = "//div[@id='filter-action-list']//button[@type='button']")
    private WebElement filterButton;
    @FindBy(xpath = "//button[normalize-space()='Name (A-Z)']")
    private WebElement aToZTalentNameButton;
    @FindBy(xpath = "//button[normalize-space()='Name (Z-A)']")
    private WebElement zToATalentNameButton;
    @FindBy(xpath = "//button[normalize-space()='Job Title (A-Z)']")
    private WebElement aToZTalentJobTitleButton;
    @FindBy(xpath = "//button[normalize-space()='Job Title (Z-A)']")
    private WebElement zToATalentJobTitleButton;
    @FindBy(xpath = "(//div[normalize-space()='Post a Job'])[1]")
    private WebElement postAJobHeader;
    @FindBy(xpath = "//h1[normalize-space()='Favorite Talent']")
    private WebElement favoritesTalentHeader;
    @FindBy(xpath = "//a[normalize-space()='Create New List']")
    private WebElement createNewListButton;
    @FindBy(xpath = "//a[normalize-space()='Talent']")
    private WebElement talentTab;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[normalize-space()='Packages']")
    private WebElement packagesTab;
    @FindBy(xpath = "//h3[normalize-space()='New List']")
    private WebElement newListHeader;
    @FindBy(xpath = "//input[@id='favorite_list_name']")
    private WebElement newListInputTextField;
    @FindBy(xpath = "//div[@class='modal-footer padding-zero padding-top-large']//button[@type='button'][normalize-space()='Cancel']")
    private WebElement newListCancelButton;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    private WebElement newListCreateButton;
    @FindBy(xpath = "//button[normalize-space()='Invite All to Job']")
    private WebElement inviteAllToJobButton;
    @FindBy(xpath = "//button[normalize-space()='Invite All to Job']/parent::div/parent::div//div[@class='list-group-item-title']")
    private WebElement inviteAllToJobName;
    @FindBy(xpath = "//div[@id='private-invite-list']//p[1]")
    private WebElement jobNameOnPostAJobPage;


    public void verifyClientUserIsAbleToNavigateToMyHomePage() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        Assert.assertEquals("Validate My Home Link", "My Home", myHomeLink.getText().trim());
        Assert.assertEquals("Validate Favorites Link", "Favorites", favoritesLink.getText().trim());
        Assert.assertEquals("Validate Previously Hired Talent Link", "Previously Hired Talent", previouslyHiredTalentLink.getText().trim());
        Assert.assertEquals("Validate Reviews Link", "Reviews", reviewsLink.getText().trim());
        Assert.assertEquals("Validate Manage Licenses Link", "Manage Licenses", manageLicensesLink.getText().trim());
        Assert.assertEquals("Validate Manage Team Link", "Manage Team", manageTeamLink.getText().trim());
        Assert.assertEquals("Validate Billing History Link", "Billing History", billingHistoryLink.getText().trim());
        Assert.assertEquals("Validate Account Settings Link", "Account Settings", accountSettingLink.getText().trim());
        Assert.assertEquals("Validate Help Center Link", "Help Center", helpCenterLink.getText().trim());
        Assert.assertEquals("Validate Contact Support Link", "Contact Support", contactSupportLink.getText().trim());
        myHomeLink.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate User Navigate to Home Page", welcomeBackHeader.getText().trim().contains("Welcome back"));
    }

    public void verifyTopTalentHomeBanner() {
        Assert.assertTrue("Validate Project MarketPlace Banner present", BaseClass.isElementPresent(ClientProfilePage.driver, bannerImage));
        Assert.assertTrue("Validate Banner Dismiss Button present", BaseClass.isElementPresent(ClientProfilePage.driver, dismissBannerIcon));

    }

    public void verifyManualClosingProjectMarketplaceBanner() {
        dismissBannerIcon.click();
        ClientProfilePage.driver.navigate().refresh();
        BaseClass.staticWaitForVisibility(5000);
        Assert.assertFalse("Validate Project MarketPlace Banner not present", BaseClass.isElementPresent(ClientProfilePage.driver, bannerImage));
        Assert.assertFalse("Validate Banner Dismiss Button not present", BaseClass.isElementPresent(ClientProfilePage.driver, dismissBannerIcon));
    }

    public void verifyJobSection() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(myHomeLink, 30, ClientProfilePage.driver);
        myHomeLink.click();
        BaseClass.staticWaitForVisibility(4000);
        List<String> actualJobTabList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//nav[@id='main-tab-nav']//a");
        List<String> expectedJobTabList = BaseClass.addStringValueInList("Draft", "Working", "Done");
        Assert.assertEquals("Validate Job Tab List", expectedJobTabList, actualJobTabList);
    }


    public void verifyMyJobsDraftTab() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        myHomeLink.click();
        BaseClass.waitForVisibility(draftTabUnderMyHome, 30, ClientProfilePage.driver);
        draftTabUnderMyHome.click();
        BaseClass.waitForVisibility(postAJobUnderDraftTab, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Post A Job Header", "Post a job", postAJobUnderDraftTab.getText().trim());
        Assert.assertEquals("validate Online Add text", "Online Ad", onlineAddText.getText().trim());
        Assert.assertEquals("validate Edit Draft Button", "Edit Draft", editDraftButtonUserDraftTab.getText().trim());
        editDraftButtonUserDraftTab.click();
        BaseClass.waitForVisibility(editJobTitle, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate navigate to edit Job Page", "Edit Job", editJobTitle.getText().trim());
        ClientProfilePage.driver.navigate().back();
        BaseClass.staticWaitForVisibility(4000);
    }

    public void verifyMyJobsWorkingTab() {
        BaseClass.waitForVisibility(workingTabUnderMyHome, 30, ClientProfilePage.driver);
        workingTabUnderMyHome.click();
        BaseClass.waitForVisibility(viewAllLinkUnderWorkingTab, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate job name present under working tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstJobNameUnderWorkingTab));
        Assert.assertTrue("Validate job Category present under working tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstJobCategoryUnderWorkingTab));
        Assert.assertTrue("Validate job Project Dead Line under working tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstJobProjectDeadLineSection));

    }

    public void verifyMyJobsDoneTab() {
        BaseClass.waitForVisibility(doneTabUnderMyHome, 30, ClientProfilePage.driver);
        doneTabUnderMyHome.click();
        BaseClass.waitForVisibility(firstJobDetailsUnderDoneTab, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Job Details present under done tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstJobDetailsUnderDoneTab));
        Assert.assertTrue("Validate First Talent Hired present under done tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstTalentHiredName));
        Assert.assertTrue("Validate Invite A Job Button present under done tab", BaseClass.isElementPresent(ClientProfilePage.driver, firstInviteAJobButton));

    }

    public void verifyPreviouslyHiredTalentSection() {
        Assert.assertEquals("Validate Previously Hired Talent Header", "Previously Hired Talent", previouslyHiredTalentHeader.getText().trim());
        Assert.assertTrue("validate previously hired talent name is present", BaseClass.isElementPresent(ClientProfilePage.driver, previouslyHiredTalentName));
        Assert.assertTrue("validate previously hired talent Invite Button is present", BaseClass.isElementPresent(ClientProfilePage.driver, previouslyHiredTalentInviteButton));
        Assert.assertTrue("validate previously hired talent Job Details is present", BaseClass.isElementPresent(ClientProfilePage.driver, previouslyHiredTalentJobDetails));
    }

    public void verifyClientCareerSection() {
        Assert.assertEquals("Validate Additional Resources Header", "Additional Resources", additionalResourcesHeader.getText().trim());
        List<String> actualCareerSectionHeader = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//h4[normalize-space()='Additional Resources']/following-sibling::div//h5");
        List<String> expectedCareerSectionHeader = BaseClass.addStringValueInList("Voices Lessons", "Blog", "User Guide", "Resource Library");
        Assert.assertEquals("validate career section header", expectedCareerSectionHeader, actualCareerSectionHeader);
        List<String> actualCareerSectionLinks = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//h4[normalize-space()='Additional Resources']/following-sibling::div//a");
        List<String> expectedCareerSectionLinks = BaseClass.addStringValueInList("Start Learning Now", "Visit the Blog", "Read Now", "Start Learning Now");
        Assert.assertEquals("validate career section Links", expectedCareerSectionLinks, actualCareerSectionLinks);
    }

    public void verifyCustomerSupportSectionForClient() {
        Assert.assertEquals("Validate Customer Support Header", "Customer Support", customerSupportHeader.getText().trim());
        Assert.assertEquals("Validate Customer Support Description", "We're here to help you. Contact our Customer Support Team with any questions you may have.", customerSupportDescription.getText().trim());
        Assert.assertEquals("Validate Customer Support Toll free", "1-888-359-3472", customerSupportCallTollFree.getText().trim());
        Assert.assertEquals("Validate Customer Support Email", "support@voices.com", customerSupportEmail.getText().trim());
    }

    public void verifyClientUserIsAbleToNavigateToAccountSettingsPage() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(accountSettingLink, 30, ClientProfilePage.driver);
        accountSettingLink.click();
        BaseClass.waitForVisibility(accountSettingHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Account Setting Header", "Account Settings", accountSettingHeader.getText().trim());
        List<String> actualAccountSettingOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//p[@class='text-grey1 text-sm text-left']/following-sibling::div/a");
        List<String> expectedAccountSettingOptions = BaseClass.addStringValueInList("Business Profile", "General Settings", "Notifications", "Billing Information", "Subscription", "Change Password");
        Assert.assertEquals("Validate Account setting option", expectedAccountSettingOptions, actualAccountSettingOptions);

    }

    public void verifyBusinessProfileForClient() {
        BaseClass.waitForVisibility(businessProfileTab, 30, ClientProfilePage.driver);
        businessProfileTab.click();
        BaseClass.waitForVisibility(businessProfileHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Business Profile Header", "Business Profile", businessProfileHeader.getText().trim());
        Assert.assertEquals("Validate About Me Header", "About Me", aboutMeHeader.getText().trim());
        Assert.assertEquals("Validate Personalize Your Experience Header", "Personalize Your Experience", personalizeYourExperienceHeader.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes button", "Save Changes", saveChangesButton.getText().trim());

    }


    public void verifyGeneralSettingsForClient() {
        BaseClass.waitForVisibility(generalSettingsTab, 30, ClientProfilePage.driver);
        generalSettingsTab.click();
        BaseClass.waitForVisibility(generalSettingsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate General Settings Header", "General Settings", generalSettingsHeader.getText().trim());
        Assert.assertEquals("Validate Contact Information Header", "Contact Information", contactInformationHeader.getText().trim());
        Assert.assertEquals("Validate Mailing Address Header", "Mailing Address", mailingAddressHeader.getText().trim());
        Assert.assertEquals("Validate Time Zone Header", "Time Zone", timeZoneHeader.getText().trim());
        Assert.assertEquals("Validate Connected Services Header", "Connected Services", connectedServicesHeader.getText().trim());
        Assert.assertEquals("Validate Additional Options Header", "Additional Options", additionalOptionsHeader.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes button", "Save Changes", saveChangesButton.getText().trim());
    }

    public void verifyNotificationsForClient() {
        BaseClass.waitForVisibility(notificationsTab, 30, ClientProfilePage.driver);
        notificationsTab.click();
        BaseClass.waitForVisibility(notificationsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Notifications Header", "Notifications", notificationsHeader.getText().trim());
        Assert.assertEquals("Validate Notification Methods Header", "Notification Methods", notificationsMethodsHeader.getText().trim());
        Assert.assertEquals("Validate Display Settings Header", "Display Settings", displaySettingsHeader.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes button", "Save Changes", saveChangesButton.getText().trim());
    }

    public void verifySubscriptionForClient() {
        BaseClass.waitForVisibility(subscriptionTab, 30, ClientProfilePage.driver);
        subscriptionTab.click();
        BaseClass.waitForVisibility(subscriptionHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Subscription Header", "Subscription", subscriptionHeader.getText().trim());
        Assert.assertEquals("Validate Basic Subscription Header", "Basic", basicSubscriptionHeader.getText().trim());
        Assert.assertEquals("Validate Plus Subscription Header", "Plus", plusSubscriptionHeader.getText().trim());
        Assert.assertEquals("Validate Enterprise Subscription Header", "Enterprise", enterpriseSubscriptionHeader.getText().trim());

    }

    public void verifyBillingInformationForClient() {
        BaseClass.waitForVisibility(billingInformationTab, 30, ClientProfilePage.driver);
        billingInformationTab.click();
        BaseClass.waitForVisibility(billingInformationHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Billing Information Header", "Billing Information", billingInformationHeader.getText().trim());
        Assert.assertEquals("Validate Payment Information Header", "Payment Information", paymentInformationHeader.getText().trim());
        Assert.assertEquals("Validate Invoice Information Header", "Invoice Information", invoiceInformationHeader.getText().trim());
        Assert.assertTrue("Validate Email Add button present", BaseClass.isElementPresent(ClientProfilePage.driver, addEmailButton));
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes button", "Save Changes", saveChangesButton.getText().trim());
    }

    public void verifyChangePasswordForClient() {
        BaseClass.waitForVisibility(changePasswordTab, 30, ClientProfilePage.driver);
        changePasswordTab.click();
        BaseClass.waitForVisibility(changePasswordHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Change Password Header", "Change Password", changePasswordHeader.getText().trim());
        Assert.assertTrue("Validate Current Password Field present", BaseClass.isElementPresent(ClientProfilePage.driver, currentPasswordField));
        Assert.assertTrue("Validate New Password Field present", BaseClass.isElementPresent(ClientProfilePage.driver, newPasswordField));
        Assert.assertTrue("Validate ReType Password Field present", BaseClass.isElementPresent(ClientProfilePage.driver, reTypePasswordFiled));
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton.getText().trim());
        Assert.assertEquals("Validate Save Changes button", "Save Changes", saveChangesButton.getText().trim());
    }

    public void verifyTalentUserIsAbleToNavigateToPreviouslyHiredTalentPage() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(previouslyHiredTalentLink, 30, ClientProfilePage.driver);
        previouslyHiredTalentLink.click();
        BaseClass.waitForVisibility(previouslyHiredTalentPageHeader, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Previously Hired Talent Header", previouslyHiredTalentPageHeader.getText().trim().contains("Previously Hired Talent"));

    }

    public void verifyPreviouslyHiredTalentList() {
        int hiredTalentListCount = ClientProfilePage.driver.findElements(By.xpath("//div[@class='talent-list-group list-group']/div")).size();
        Assert.assertTrue("Validate Hired Talent List Count", hiredTalentListCount >= 1);
    }

    public void verifyPreviouslyHiredTalentRecord() {
        Assert.assertTrue("validate Previously Hired talent Name present", BaseClass.isElementPresent(ClientProfilePage.driver, firstPreviouslyHiredTalentName));
        Assert.assertTrue("validate Previously Hired talent Job Title present", BaseClass.isElementPresent(ClientProfilePage.driver, firstPreviouslyHiredTalentJobTitle));
        Assert.assertTrue("validate Previously Hired Invite To Job Button present", BaseClass.isElementPresent(ClientProfilePage.driver, firstPreviouslyHiredTalentInviteToJobButton));
        String[] paginationSplit = previouslyHiredPagination.getText().trim().split(" ");
        int expectedPaginationCount = Integer.parseInt(paginationSplit[3]);
        int actualPaginationCount = ClientProfilePage.driver.findElements(By.xpath("//div[@class='talent-list-group list-group']/div")).size();
        Assert.assertEquals("validate Pagination Count for Previously Hired Talent", expectedPaginationCount, actualPaginationCount);
    }

    public void verifySearchFunctionality() {
        String expectedTalentName = firstPreviouslyHiredTalentName.getText().trim();
        previouslyHiredTalentSearchBox.sendKeys(expectedTalentName);
        previouslyHiredTalentSearchIcon.click();
        BaseClass.staticWaitForVisibility(2000);
        String actualTalentName = firstPreviouslyHiredTalentName.getText().trim();
        Assert.assertEquals("validate Search Function for Talent Name", expectedTalentName, actualTalentName);
        previouslyHiredTalentClearSearchIcon.click();
        BaseClass.staticWaitForVisibility(2000);

        String expectedTalentJobTitle = firstPreviouslyHiredTalentJobTitle.getText().trim();
        previouslyHiredTalentSearchBox.sendKeys(expectedTalentName);
        previouslyHiredTalentSearchIcon.click();
        BaseClass.staticWaitForVisibility(2000);
        String actualTalentJobTitle = firstPreviouslyHiredTalentJobTitle.getText().trim();
        Assert.assertEquals("validate Search Function for Talent Job Title", expectedTalentJobTitle, actualTalentJobTitle);
        previouslyHiredTalentClearSearchIcon.click();
        BaseClass.staticWaitForVisibility(2000);
    }

    public void verifyShowFilterFunctionality() {
        filterButton.click();
        BaseClass.staticWaitForVisibility(2000);
        List<String> actualFilterOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='filter-action-list']//div[@class='action-list-dropdown']//button");
        List<String> expectedFilterOptions = BaseClass.addStringValueInList("All", "Self Service Jobs", "Managed Services Jobs", "Male Hires", "Female Hires");
        Assert.assertEquals("Validate Previously Hired Talent Filter options", expectedFilterOptions, actualFilterOptions);
    }

    public void verifySortByFunctionality() {
        sortButton.click();
        List<String> actualSortOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='sort-action-list']//div[@class='action-list-dropdown']//button");
        List<String> expectedSortOptions = BaseClass.addStringValueInList("Newest", "Oldest", "Name (A-Z)", "Name (Z-A)", "Job Title (A-Z)", "Job Title (Z-A)");
        Assert.assertEquals("Validate All Sort options", expectedSortOptions, actualSortOptions);

        List<String> expectedOrderTalentName = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='talent-member-details']/a[@class='h6 talent-list-group-item-heading']");
        Collections.sort(expectedOrderTalentName, String.CASE_INSENSITIVE_ORDER);

        BaseClass.waitForVisibility(aToZTalentNameButton, 30, ClientProfilePage.driver);
        aToZTalentNameButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> actualAscendingOrderTalentName = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='talent-member-details']/a[@class='h6 talent-list-group-item-heading']");
        Assert.assertEquals("Validate A-Z talent Name sorting", expectedOrderTalentName, actualAscendingOrderTalentName);

        Collections.reverse(expectedOrderTalentName);
        sortButton.click();
        BaseClass.waitForVisibility(zToATalentNameButton, 30, ClientProfilePage.driver);
        zToATalentNameButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> actualDescendingOrderTalentName = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='talent-member-details']/a[@class='h6 talent-list-group-item-heading']");
        Assert.assertEquals("Validate Z-A talent Name sorting", expectedOrderTalentName, actualDescendingOrderTalentName);

        List<String> expectedOrderJobTitle = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='job-details-col']/a[@class='h6 talent-list-group-item-heading']");
        Collections.sort(expectedOrderJobTitle, String.CASE_INSENSITIVE_ORDER);
        sortButton.click();
        BaseClass.waitForVisibility(aToZTalentJobTitleButton, 30, ClientProfilePage.driver);
        aToZTalentJobTitleButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> actualAscendingOrderJobTitle = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='job-details-col']/a[@class='h6 talent-list-group-item-heading']");
        Assert.assertEquals("Validate A-Z talent Job title sorting", expectedOrderJobTitle, actualAscendingOrderJobTitle);

        Collections.reverse(expectedOrderJobTitle);
        sortButton.click();
        BaseClass.waitForVisibility(zToATalentJobTitleButton, 30, ClientProfilePage.driver);
        zToATalentJobTitleButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> actualDescendingOrderJobTitle = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='job-details-col']/a[@class='h6 talent-list-group-item-heading']");
        Assert.assertEquals("Validate Z-A talent Job Title sorting", expectedOrderJobTitle, actualDescendingOrderJobTitle);
    }

    public void verifyInviteToJobCTAFunctionality() {
        firstPreviouslyHiredTalentInviteToJobButton.click();
        BaseClass.waitForVisibility(postAJobHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate user navigate to post a job page", "Post a Job", postAJobHeader.getText().trim());
    }

    public void verifyClientUserIsAbleToNavigateToFavoritesPage() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(favoritesLink, 30, ClientProfilePage.driver);
        favoritesLink.click();
        BaseClass.waitForVisibility(favoritesTalentHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Favorites Talent Header", "Favorite Talent", favoritesTalentHeader.getText().trim());
        Assert.assertEquals("Validate Create New List button", "Create New List", createNewListButton.getText().trim());
        Assert.assertEquals("Validate Talent Tab", "Talent", talentTab.getText().trim());
        Assert.assertEquals("Validate Packages Tab", "Packages", packagesTab.getText().trim());
    }

    public void verifyTalentTab() {
        talentTab.click();
        BaseClass.staticWaitForVisibility(4000);
        int totalTalentCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='favorite-lists-container']//a")).size();
        Assert.assertTrue("Validate Talent is present", totalTalentCount >= 1);

    }

    public void verifyPackagesTab() {
        packagesTab.click();
        BaseClass.staticWaitForVisibility(4000);
        int totalPackageCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='favorite-lists-container']//a")).size();
        Assert.assertTrue("Validate Package is present", totalPackageCount >= 1);
    }

    public void verifyCreateNewListCTAFunctionality() {
        createNewListButton.click();
        BaseClass.waitForVisibility(newListHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate New List Header", "New List", newListHeader.getText().trim());
        newListInputTextField.sendKeys("Demo New List");
        Assert.assertTrue("Validate New List Cancel button Present", BaseClass.isElementPresent(ClientProfilePage.driver, newListCancelButton));
        Assert.assertTrue("Validate New List Create button Present", BaseClass.isElementPresent(ClientProfilePage.driver, newListCreateButton));
        newListCancelButton.click();
    }

    public void verifyInviteAllToJobCTAFunctionality() {
        talentTab.click();
        BaseClass.waitForVisibility(inviteAllToJobButton, 30, ClientProfilePage.driver);
        inviteAllToJobButton.click();
        BaseClass.waitForVisibility(postAJobHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate user navigate to post a job page", "Post a Job", postAJobHeader.getText().trim());

    }


}
