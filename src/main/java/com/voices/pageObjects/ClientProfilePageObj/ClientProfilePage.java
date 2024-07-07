package com.voices.pageObjects.ClientProfilePageObj;

import com.voices.baseClass.BaseClass;
import io.cucumber.java.en.Then;
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
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[text()='Draft']")
    private WebElement draftTabUnderMyHome;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[text()='Working']")
    private WebElement workingTabUnderMyHome;
    @FindBy(xpath = "//nav[@id='main-tab-nav']//a[text()='Done']")
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
    @FindBy(xpath = "//h4[normalize-space()='Your Dedicated Support']")
    private WebElement customerSupportHeader;
    @FindBy(xpath = "//p[@class='text-sm text-grey1 margin-bottom-zero']")
    private WebElement customerSupportDescription;
    @FindBy(xpath = "//strong[text()='Toll free:']/../following-sibling::a")
    private WebElement customerSupportCallTollFree;
    @FindBy(xpath = "//strong[text()='Email:']/../following-sibling::a")
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
    @FindBy(xpath = "//h1[normalize-space()='License Management']")
    private WebElement licenseManagementHeader;
    @FindBy(xpath = "//a[normalize-space()='All Licenses']")
    private WebElement allLicensesTab;
    @FindBy(xpath = "//a[normalize-space()='Quotes Requested']")
    private WebElement quotesRequestedTab;
    @FindBy(xpath = "//p[@id='pagination-number']")
    private WebElement manageLicensePagination;
    @FindBy(xpath = "//input[@id='action_bar_search_keyword']")
    private WebElement licenseSearchField;
    @FindBy(xpath = "//div[@id='filter-action-list']")
    private WebElement licenseFilterButton;
    @FindBy(xpath = "//div[@id='sort-action-list']//button[@type='button']")
    private WebElement licenseSortButton;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='job-details'])[1]")
    private WebElement allLicenseTabJobDescription;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='license-expiry'])[1]")
    private WebElement allLicenseTabLicenseExpiryDetails;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='license-terms'])[1]")
    private WebElement allLicenseTabLicenseTerms;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='text-xs text-dark'])[1]")
    private WebElement allLicenseTabTalentName;
    @FindBy(xpath = "//div[contains(@class,'status-col text-xs license-cta btn-primary btn btn-sm hidden-xs')]//a[contains(text(),'Get Renewal Quote')]")
    private WebElement allLicenseTabGetRenewalQuoteButton;
    @FindBy(xpath = "(//div[@id='pagination-container']//a[contains(text(),'View')])[2]")
    private WebElement allLicenseTabviewLink;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='job-details'])[1]//a")
    private WebElement allLicenseJobId;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='job-details'])[1]//span[@class='license-id']")
    private WebElement licenseId;
    @FindBy(xpath = "(//div[@id='pagination-container']//div[@class='job-details'])[1]//span[@class='description text-xs text-dark font-bold']")
    private WebElement allLicenseJobTitle;
    @FindBy(xpath = "//button[contains(@data-action,'submit_search')]")
    private WebElement licenseSearchSubmitButton;
    @FindBy(xpath = "//button[contains(@title,'Clear Search')]")
    private WebElement licenseSearchClearButton;
    @FindBy(xpath = "//h3[normalize-space()='Licenses Renewal History']")
    private WebElement licensesRenewalHistoryHeader;
    @FindBy(xpath = "//div[@id='license-items-group']//div[@id='license']")
    private WebElement viewLicensingDetails;
    @FindBy(xpath = "//div[@id='license-items-group']//p[@id='start']")
    private WebElement viewStartDate;
    @FindBy(xpath = "//div[@id='license-items-group']//p[@id='end']")
    private WebElement viewEndDate;
    @FindBy(xpath = "//div[@id='talent-licenses-modal']//button[@type='button'][normalize-space()='Close']")
    private WebElement viewCloseButton;
    @FindBy(xpath = "//button[@id='renewal-quote']")
    private WebElement viewGetRenewalQuoteButton;
    @FindBy(xpath = "(//div[@id='pagination-container']//a[text()='Edit Request'])[2]")
    private WebElement editRequestButton;
    @FindBy(xpath = "(//div[@id='pagination-container']//a[contains(text(),'Cancel Request')])[2]")
    private WebElement cancelRequestButton;
    @FindBy(xpath = "//div[@class='license-details-container']/div[1]")
    private WebElement licensingDetailsUnderRenewal;
    @FindBy(xpath = "//div[@class='license-details-container']/div[2]")
    private WebElement startDateUnderRenewal;
    @FindBy(xpath = "//div[@class='license-details-container']/div[3]")
    private WebElement endDatesUnderRenewal;
    @FindBy(xpath = "//button[@id='cancel']")
    private WebElement cancelButtonUnderRenewal;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitButtonUnderRenewal;
    @FindBy(xpath = "//h3[contains(text(),'Are you sure you want to cancel your licensing quo')]")
    private WebElement cancelRequestHeader;
    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement cancelRequestTextArea;
    @FindBy(xpath = "//form[@id='delete-license-quote-request-form']//button[@type='button'][normalize-space()='Close']")
    private WebElement cancelRequestCloseButton;
    @FindBy(xpath = "//button[@id='cancel-quote']")
    private WebElement cancelRequestConfirmButton;
    @FindBy(xpath = "//h1[normalize-space()='Reviews']")
    private WebElement reviewsHeader;
    @FindBy(xpath = "//h4[normalize-space()='Pending Reviews']")
    private WebElement pendingReviewHeader;
    @FindBy(xpath = "(//a[normalize-space()='Leave a Review'])[2]")
    private WebElement leaveAReviewLink;
    @FindBy(xpath = "//h4[normalize-space()='My Reviews']")
    private WebElement myReviewsHeader;
    @FindBy(xpath = "//a[normalize-space()='Received']")
    private WebElement receivedTab;
    @FindBy(xpath = "//a[normalize-space()='Given']")
    private WebElement givenTab;
    @FindBy(xpath = "//p[@class='reviews-pagination-text text-center']")
    private WebElement pendingReviewPagination;
    @FindBy(xpath = "//h4[normalize-space()='Overall Experience']")
    private WebElement overallExperienceHeader;
    @FindBy(xpath = "//label[@for='star-005']")
    private WebElement fiveStarRating;
    @FindBy(xpath = "//textarea[@id='note']")
    private WebElement reviewTextArea;
    @FindBy(xpath = "//a[@id='cancel-btn']")
    private WebElement reviewCancelButton;
    @FindBy(xpath = "//button[@id='submit-review-btn']")
    private WebElement submitReviewButton;
    @FindBy(xpath = "//h1[normalize-space()='Billing History']")
    private WebElement billingHistoryHeader;
    @FindBy(xpath = "//button[@id='calendar-filter-btn']")
    private WebElement billingHistoryCalenderButton;
    @FindBy(xpath = "//button[@class='action-list-btn btn-default hidden-xs billing-history-csv-download']")
    private WebElement billingHistoryDownloadCSVButton;
    @FindBy(xpath = "//div[@id='filter-action-list']//button[@type='button']")
    private WebElement billingHistoryShowButton;
    @FindBy(xpath = "//input[@id='action_bar_search_keyword']")
    private WebElement billingHistorySearchTextField;
    @FindBy(xpath = "//p[@id='results-total']")
    private WebElement billingHistoryPagination;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[1]")
    private WebElement billingHistoryFirstRecordDate;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[2]")
    private WebElement billingHistoryFirstRecordDescription;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[4]")
    private WebElement billingHistoryFirstRecordAmount;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[5]/span")
    private WebElement billingHistoryFirstRecordStatus;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[6]/a[1]")
    private WebElement billingHistoryFirstRecordDownloadPDF;
    @FindBy(xpath = "//div[@class='billing-list-group-items ']/div/div[1]/div[6]/a[1]")
    private WebElement billingHistoryFirstRecordViewDetails;
    @FindBy(xpath = "(//span[text()='Paid'])[2]/../../div[2]/span")
    private WebElement billingHistoryPaidDescriptionTitle;
    @FindBy(xpath = "(//span[text()='Unpaid'])[2]/../../div[2]/span")
    private WebElement billingHistoryUnPaidDescriptionTitle;
    @FindBy(xpath = "(//span[text()='Paid'])[2]/../../div[2]/div/div[1]")
    private WebElement billingHistoryPaidDescriptionJobId;
    @FindBy(xpath = "(//span[text()='Unpaid'])[2]/../../div[2]/div/div[1]")
    private WebElement billingHistoryUnPaidDescriptionJobId;
    @FindBy(xpath = "(//span[text()='Paid'])[2]/../../div[6]/a[2]")
    private WebElement billingHistoryPaidViewDetailsLink;
    @FindBy(xpath = "(//span[text()='Unpaid'])[2]/../../div[6]/a[2]")
    private WebElement billingHistoryUnpaidViewDetailsLink;
    @FindBy(xpath = "//h1[normalize-space()='Invoice']")
    private WebElement invoiceHeader;
    @FindBy(xpath = "//h2[@class='transaction-description']")
    private WebElement paidDescriptionTitle;
    @FindBy(xpath = "//h2[@class='transaction-description']/following-sibling::a")
    private WebElement paidJobId;
    @FindBy(xpath = "(//span[normalize-space()='Add (Optional)'])[1]")
    private WebElement addOptionalLink1;
    @FindBy(xpath = "(//span[normalize-space()='Add (Optional)'])[2]")
    private WebElement addOptionalLink2;
    @FindBy(xpath = "//a[normalize-space()='Pay Now']")
    private WebElement payNowButton;
    @FindBy(xpath = "//h3[normalize-space()='Add Additional Invoice Details']")
    private WebElement addAdditionalDetailsHeader;
    @FindBy(xpath = "//button[@id='edit-invoice-modal-cancel-btn']")
    private WebElement editInvoiceCancelButton;
    @FindBy(xpath = "//div[@class='d-md-flex d-none flex-table-heading amount-col text-xs sort-header align-items-center']//i[@class='fas fa-sort']")
    private WebElement amountSortingButton;
    @FindBy(xpath = "//div[@class='d-md-flex d-none flex-table-heading amount-col text-xs sort-header align-items-center']")
    private WebElement amountTableHeader;
    @FindBy(xpath = "//button[normalize-space()='Paid']")
    private WebElement paidViewOptionButton;
    @FindBy(xpath = "//button[normalize-space()='All']")
    private WebElement allViewOptionButton;
    @FindBy(xpath = "//span[@id='date-range-text']")
    private WebElement defaultDataRange;
    @FindBy(xpath = "//input[@id='date-range-min']")
    private WebElement startDateInputField;
    @FindBy(xpath = "//input[@id='date-range-max']")
    private WebElement endDateInputField;
    @FindBy(xpath = "//input[@id='quick-date-year']/parent::div")
    private WebElement thisYearRadioButton;
    @FindBy(xpath = "//input[@id='quick-date-month']/parent::div")
    private WebElement thisMonthRadioButton;
    @FindBy(xpath = "//input[@id='quick-date-all']/parent::div")
    private WebElement allTimeRadioButton;
    @FindBy(xpath = "//button[@id='clear-date-pickers']")
    private WebElement timeClearButton;
    @FindBy(xpath = "//button[@id='submit-date-pickers']")
    private WebElement timeApplyButton;
    @FindBy(xpath = "//div[@class='d-md-flex d-none flex-table-heading date-col first-header text-xs sort-header align-items-center']//i[@class='fas fa-sort']")
    private WebElement dateFilterButton;
    @FindBy(xpath = "//span[normalize-space()='Owner']/../..//h3")
    private WebElement ownerName;
    @FindBy(xpath = "//span[normalize-space()='Owner']/following-sibling::span")
    private WebElement ownerStatus;
    @FindBy(xpath = "//span[normalize-space()='Owner']/../../following-sibling::span")
    private WebElement ownerEmailAddress;
    @FindBy(xpath = "//span[normalize-space()='Owner']/../../../../div/a/div")
    private WebElement ownerPhoto;
    @FindBy(xpath = "//span[normalize-space()='Manager']/../..//h3")
    private WebElement managerName;
    @FindBy(xpath = "//span[normalize-space()='Manager']/following-sibling::span")
    private WebElement managerStatus;
    @FindBy(xpath = "//span[normalize-space()='Manager']/../../following-sibling::span")
    private WebElement managerEmailAddress;
    @FindBy(xpath = "//span[normalize-space()='Manager']/../../../../div/a/div")
    private WebElement managerPhoto;
    @FindBy(xpath = "(//span[normalize-space()='Manager'])[2]/../../../../div[3]/div/button")
    private WebElement managerButton;
    @FindBy(xpath = "(//span[normalize-space()='Manager'])[2]/../../../../div[3]/div/div/ul/li[3]/a")
    private WebElement managerLearnMoreAboutRole;
    @FindBy(xpath = "(//span[normalize-space()='Manager'])[2]/../../../../div[3]/div[2]")
    private WebElement managerOptionsButton;
    @FindBy(xpath = "(//span[normalize-space()='Member']/../..//h3)[1]")
    private WebElement memberName;
    @FindBy(xpath = "(//span[normalize-space()='Member']/following-sibling::span)[3]")
    private WebElement memberStatus;
    @FindBy(xpath = "(//span[normalize-space()='Member']/../../following-sibling::span)[1]")
    private WebElement memberEmailAddress;
    @FindBy(xpath = "(//span[normalize-space()='Member']/../../../../div/a/div)[1]")
    private WebElement memberPhoto;
    @FindBy(xpath = "(//span[normalize-space()='Member'])[3]/../../../following-sibling::div/div/button")
    private WebElement memberButton;
    @FindBy(xpath = "(//span[normalize-space()='Member'])[3]/../../../following-sibling::div/div[1]/div/ul/li[3]/a")
    private WebElement memberLearnMoreAboutRole;
    @FindBy(xpath = "(//span[normalize-space()='Member'])[3]/../../../following-sibling::div/div[2]")
    private WebElement memberOptionsButton;
    @FindBy(xpath = "(//h1[contains(text(),'Team Account')])[1]")
    private WebElement teamAccountHeader;
    @FindBy(xpath = "//h2[normalize-space()='Invite New Team Member']")
    private WebElement inviteNewJobMemberHeader;
    @FindBy(xpath = "//div[@class='circle-avatar circle-avatar-upload circle-avatar-default']")
    private WebElement profilePhoto;
    @FindBy(xpath = "//label[normalize-space()='Full Name']")
    private WebElement fullNameLabel;
    @FindBy(xpath = "//label[normalize-space()='Title']")
    private WebElement titleLabel;
    @FindBy(xpath = "//label[normalize-space()='Work Email']")
    private WebElement workEmailLabel;
    @FindBy(xpath = "//label[normalize-space()='Phone']")
    private WebElement phoneLabel;
    @FindBy(xpath = "//label[normalize-space()='Username']")
    private WebElement usernameLabel;
    @FindBy(xpath = "//label[normalize-space()='Role']")
    private WebElement roleLabel;
    @FindBy(xpath = "//button[normalize-space()='Owner']")
    private WebElement ownerRole;
    @FindBy(xpath = "//span[@class='action-list-btn-selection-text font-regular']")
    private WebElement managerRole;
    @FindBy(xpath = "//span[@class='action-list-btn-selection-text font-regular']")
    private WebElement memberRole;
    @FindBy(xpath = "//span[normalize-space()='Active']/span")
    private WebElement activeStatus;
    @FindBy(xpath = "//button[normalize-space()='Reset Password']")
    private WebElement resetPasswordButton;
    @FindBy(xpath = "//button[normalize-space()='Remove']")
    private WebElement removeButton;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//a[normalize-space()='Cancel']")
    private WebElement cancelButton1;
    @FindBy(xpath = "//input[@id='member_email_tags_input']")
    private WebElement memberEmailTextField;
    @FindBy(xpath = "//button[@class='action-list-btn']")
    private WebElement inviteAMemberButton;


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
        Assert.assertTrue("Validate Job Tab List", expectedJobTabList.containsAll(actualJobTabList));
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
        BaseClass.waitForVisibility(firstJobNameUnderWorkingTab, 30, ClientProfilePage.driver);
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
        Assert.assertEquals("Validate Customer Support Header", "Your Dedicated Support", customerSupportHeader.getText().trim());
        Assert.assertEquals("Validate Customer Support Description", "We’re here to help. Contact Kelly with any questions and they will follow up.", customerSupportDescription.getText().trim());
        Assert.assertEquals("Validate Customer Support Toll free", "1-888-359-3472 x068", customerSupportCallTollFree.getText().trim());
        Assert.assertEquals("Validate Customer Support Email", "kelly.o'shaughnessy@voices.com", customerSupportEmail.getText().trim());
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

    public void verifyClientUserIsAbleToNavigateToManageLicencesPage() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(manageLicensesLink, 30, ClientProfilePage.driver);
        manageLicensesLink.click();
        BaseClass.waitForVisibility(licenseManagementHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate navigate to mange license page", "License Management", licenseManagementHeader.getText().trim());
        Assert.assertEquals("Validate All Licenses tab", "All Licenses", allLicensesTab.getText().trim());
        Assert.assertEquals("Validate Quotes Requested tab", "Quotes Requested", quotesRequestedTab.getText().trim());
        Assert.assertTrue("Validate Pagination present", BaseClass.isElementPresent(ClientProfilePage.driver, manageLicensePagination));
    }

    public void verifyAllLicensesTab() {
        int licenseCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='pagination-container']//span[@class='description text-xs text-dark font-bold']")).size();
        Assert.assertTrue("Validate All License Count", licenseCount >= 1);
        Assert.assertTrue("Validate License Search Field", BaseClass.isElementPresent(ClientProfilePage.driver, licenseSearchField));
        Assert.assertTrue("Validate License filter button", BaseClass.isElementPresent(ClientProfilePage.driver, licenseFilterButton));
        Assert.assertTrue("Validate License Sort button", BaseClass.isElementPresent(ClientProfilePage.driver, licenseSortButton));
    }

    public void verifyQuotesRequestedTab() {
        BaseClass.waitForVisibility(quotesRequestedTab, 30, ClientProfilePage.driver);
        quotesRequestedTab.click();
        BaseClass.staticWaitForVisibility(5000);
        List<String> actualQuoteRequestedTableHeader = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='detail-table']//div");
        List<String> expectedQuoteRequestedTableHeader = BaseClass.addStringValueInList("Job Description", "Licensing Details", "Talent");
        Assert.assertEquals("validate quote requested table header", actualQuoteRequestedTableHeader, expectedQuoteRequestedTableHeader);
    }

    public void verifyEachRecordInAllLicensesTab() {
        List<String> actualAllLicensesTableHeader = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='detail-table']//div");
        List<String> expectedAllLicensesTableHeader = BaseClass.addStringValueInList("Job Description", "Licensing Details", "Talent");
        Assert.assertEquals("validate All License table header", expectedAllLicensesTableHeader, actualAllLicensesTableHeader);
        Assert.assertTrue("Validate All License Tab Job Description", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabJobDescription));
        Assert.assertTrue("Validate All License Tab License Expiry Details", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabLicenseExpiryDetails));
        Assert.assertTrue("Validate All License Tab License Terms", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabLicenseTerms));
        Assert.assertTrue("Validate All License Tab Talent Name", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabTalentName));
        Assert.assertTrue("Validate All License Tab Get Rnewal Quote Button", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabGetRenewalQuoteButton));
        Assert.assertTrue("Validate All License Tab view Link", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabviewLink));
    }

    public void verifySearchFunctionalityInAllLicensesTab() {
        String actualJobId = allLicenseJobId.getText().trim().substring(5);
        licenseSearchField.sendKeys(actualJobId);
        licenseSearchSubmitButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertTrue("Validate Search function for Job Id", allLicenseJobId.getText().trim().contains(actualJobId));
        licenseSearchClearButton.click();
        BaseClass.staticWaitForVisibility(3000);

        String actualLicenseId = licenseId.getText().trim().replaceAll("- License #", "");
        licenseSearchField.sendKeys(actualLicenseId);
        licenseSearchSubmitButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertTrue("Validate Search function for License Id", licenseId.getText().trim().contains(actualLicenseId));
        licenseSearchClearButton.click();
        BaseClass.staticWaitForVisibility(3000);

        String actualTalentName = allLicenseTabTalentName.getText().trim();
        licenseSearchField.sendKeys(actualTalentName);
        licenseSearchSubmitButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate Search function for Talent Name", actualTalentName, allLicenseTabTalentName.getText().trim());
        licenseSearchClearButton.click();
        BaseClass.staticWaitForVisibility(3000);

        String actualJobTitle = allLicenseJobTitle.getText().trim();
        licenseSearchField.sendKeys(actualJobTitle);
        licenseSearchSubmitButton.click();
        BaseClass.staticWaitForVisibility(2000);
        Assert.assertEquals("Validate Search function for Talent Name", actualJobTitle, allLicenseJobTitle.getText().trim());
        licenseSearchClearButton.click();
        BaseClass.staticWaitForVisibility(3000);
    }

    public void verifyShowFilterFunctionalityInAllLicensesTab() {
        BaseClass.waitForVisibility(licenseFilterButton, 30, ClientProfilePage.driver);
        licenseFilterButton.click();
        List<String> actualLicenseFilterOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='filter-action-list']//div[@class='action-list-dropdown']//button");
        List<String> expectedLicenseFilterOptions = BaseClass.addStringValueInList("All", "Expired", "Not Expired");
        Assert.assertEquals("Validate License Filter options", expectedLicenseFilterOptions, actualLicenseFilterOptions);
    }

    public void verifySortFunctionalityInAllLicenses_tab() {
        BaseClass.waitForVisibility(licenseSortButton, 30, ClientProfilePage.driver);
        licenseSortButton.click();
        List<String> actualLicenseSortOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='sort-action-list']//div[@class='action-list-dropdown']//button");
        List<String> expectedLicenseSortOptions = BaseClass.addStringValueInList("Newest", "Oldest", "Expiry Date (Earliest)", "Expiry Date (Latest)");
        Assert.assertEquals("Validate License Sort options", expectedLicenseSortOptions, actualLicenseSortOptions);
        licenseSortButton.click();
    }

    public void verifyViewButtonFunctionalityInAllLicensesTab() {
        BaseClass.waitForVisibility(allLicenseTabviewLink, 30, ClientProfilePage.driver);
        allLicenseTabviewLink.click();
        BaseClass.waitForVisibility(licensesRenewalHistoryHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Licenses Renewal History Header", "Licenses Renewal History", licensesRenewalHistoryHeader.getText().trim());
        Assert.assertTrue("validate View Licensing Details is present", BaseClass.isElementPresent(ClientProfilePage.driver, viewLicensingDetails));
        Assert.assertTrue("validate View Start date is present", BaseClass.isElementPresent(ClientProfilePage.driver, viewStartDate));
        Assert.assertTrue("validate View End date is present", BaseClass.isElementPresent(ClientProfilePage.driver, viewEndDate));
        Assert.assertTrue("validate View Close button is present", BaseClass.isElementPresent(ClientProfilePage.driver, viewCloseButton));
        Assert.assertTrue("validate View Get Renewal Quote Button is present", BaseClass.isElementPresent(ClientProfilePage.driver, viewGetRenewalQuoteButton));
        viewCloseButton.click();
        BaseClass.staticWaitForVisibility(3000);
    }

    public void verifyEachRecordInQuotesRequestedTab() {
        Assert.assertTrue("Validate License Tab Job Description", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabJobDescription));
        Assert.assertTrue("Validate License Tab License Expiry Details", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabLicenseExpiryDetails));
        Assert.assertTrue("Validate License Tab License Terms", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabLicenseTerms));
        Assert.assertTrue("Validate License Tab Talent Name", BaseClass.isElementPresent(ClientProfilePage.driver, allLicenseTabTalentName));
        Assert.assertTrue("Validate Edit Request Button", BaseClass.isElementPresent(ClientProfilePage.driver, editRequestButton));
        Assert.assertTrue("Validate Cancel request button", BaseClass.isElementPresent(ClientProfilePage.driver, cancelRequestButton));
    }

    public void verifyGetRenewalQuoteButtonFunctionalityInAllLicensesTab() {
        BaseClass.waitForVisibility(allLicenseTabGetRenewalQuoteButton, 30, ClientProfilePage.driver);
        allLicenseTabGetRenewalQuoteButton.click();
        BaseClass.waitForVisibility(licensingDetailsUnderRenewal, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate License Details present", BaseClass.isElementPresent(ClientProfilePage.driver, licensingDetailsUnderRenewal));
        Assert.assertTrue("Validate start date present", BaseClass.isElementPresent(ClientProfilePage.driver, startDateUnderRenewal));
        Assert.assertTrue("Validate end date present", BaseClass.isElementPresent(ClientProfilePage.driver, endDatesUnderRenewal));
        Assert.assertTrue("Validate cancel button present", BaseClass.isElementPresent(ClientProfilePage.driver, cancelButtonUnderRenewal));
        Assert.assertTrue("Validate Send License Terms to Talent button present", BaseClass.isElementPresent(ClientProfilePage.driver, submitButtonUnderRenewal));
        ClientProfilePage.driver.navigate().back();
        BaseClass.waitForVisibility(licenseManagementHeader, 30, ClientProfilePage.driver);

    }

    public void verifyEditRequestButtonFunctionalityInQuotesRequestedTab() {
        BaseClass.waitForVisibility(quotesRequestedTab, 30, ClientProfilePage.driver);
        quotesRequestedTab.click();
        BaseClass.staticWaitForVisibility(5000);
        editRequestButton.click();
        BaseClass.waitForVisibility(licensingDetailsUnderRenewal, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate License Details present", BaseClass.isElementPresent(ClientProfilePage.driver, licensingDetailsUnderRenewal));
        Assert.assertTrue("Validate start date present", BaseClass.isElementPresent(ClientProfilePage.driver, startDateUnderRenewal));
        Assert.assertTrue("Validate end date present", BaseClass.isElementPresent(ClientProfilePage.driver, endDatesUnderRenewal));
        Assert.assertTrue("Validate cancel button present", BaseClass.isElementPresent(ClientProfilePage.driver, cancelButtonUnderRenewal));
        Assert.assertTrue("Validate Send License Terms to Talent button present", BaseClass.isElementPresent(ClientProfilePage.driver, submitButtonUnderRenewal));
        ClientProfilePage.driver.navigate().back();
        BaseClass.waitForVisibility(licenseManagementHeader, 30, ClientProfilePage.driver);
    }

    public void verifyCancelRequestButtonFunctionalityInQuotesRequestedTab() {
        BaseClass.waitForVisibility(quotesRequestedTab, 30, ClientProfilePage.driver);
        quotesRequestedTab.click();
        BaseClass.waitForVisibility(cancelRequestButton, 30, ClientProfilePage.driver);
        cancelRequestButton.click();
        BaseClass.waitForVisibility(cancelRequestHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Cancel Request Page", "Are you sure you want to cancel your licensing quote request?", cancelRequestHeader.getText().trim());
        cancelRequestTextArea.sendKeys("Cancel My Request");
        Assert.assertTrue("Validate Cancel Close Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, cancelRequestCloseButton));
        Assert.assertTrue("Validate Cancel Confirm Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, cancelRequestConfirmButton));
        cancelRequestCloseButton.click();

    }

    public void verifyClientUserIsAbleToNavigateToReviewsPage() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(reviewsLink, 30, ClientProfilePage.driver);
        reviewsLink.click();
        BaseClass.waitForVisibility(reviewsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate able to navigate to reviews page", "Reviews", reviewsHeader.getText().trim());
    }

    public void verifyPendingReviewsSectionForClient() {
        Assert.assertEquals("Validate Pending Reviews header", "Pending Reviews", pendingReviewHeader.getText().trim());
        int pendingReviewCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='pending-reviews']/div/div")).size();
        Assert.assertTrue("Validate Pending review count", pendingReviewCount >= 1);
        Assert.assertEquals("Validate Leave a Review link", "Leave a Review", leaveAReviewLink.getText().trim());
    }

    public void verifyMyReviewsSection() {
        Assert.assertEquals("Validate My Reviews header", "My Reviews", myReviewsHeader.getText().trim());
        Assert.assertEquals("Validate Received tab", "Received", receivedTab.getText().trim());
        int receivedReviewCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='profile-reviews']/div/div")).size();
        Assert.assertTrue("Validate Received review count", receivedReviewCount >= 1);
        Assert.assertTrue("Validate Received pagination present", BaseClass.isElementPresent(ClientProfilePage.driver, pendingReviewPagination));
        givenTab.click();
        BaseClass.staticWaitForVisibility(4000);
        Assert.assertEquals("Validate Given tab", "Given", givenTab.getText().trim());
        int givenReviewCount = ClientProfilePage.driver.findElements(By.xpath("//div[@id='profile-reviews']/div/div")).size();
        Assert.assertTrue("Validate Given review count", givenReviewCount >= 1);
        Assert.assertTrue("Validate Given pagination present", BaseClass.isElementPresent(ClientProfilePage.driver, pendingReviewPagination));

    }


    public void verifyLeaveReviewCTAFunctionalityForClient() {
        leaveAReviewLink.click();
        BaseClass.waitForVisibility(overallExperienceHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate overall experience header", "Overall Experience", overallExperienceHeader.getText().trim());
        fiveStarRating.click();
        reviewTextArea.sendKeys("My Review");
        Assert.assertTrue("Validate Review Cancel button present", BaseClass.isElementPresent(ClientProfilePage.driver, reviewCancelButton));
        Assert.assertTrue("Validate Submit Review button present", BaseClass.isElementPresent(ClientProfilePage.driver, submitReviewButton));

    }


    public void verifyClientUserIsAbleToNavigateToBillingHistoryPage() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(billingHistoryLink, 30, ClientProfilePage.driver);
        billingHistoryLink.click();
        BaseClass.waitForVisibility(billingHistoryHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate able to navigate to Billing History page", "Billing History", billingHistoryHeader.getText().trim());
        int billingHistoryList = ClientProfilePage.driver.findElements(By.xpath("//div[contains(@class,'billing-list-group-items')]/div/div")).size();
        Assert.assertTrue("Validate billing history list present", billingHistoryList >= 1);
        Assert.assertTrue("Validate calender button present", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryCalenderButton));
        Assert.assertTrue("Validate Download CSV button present", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryDownloadCSVButton));
        Assert.assertTrue("Validate Show button present", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryShowButton));
        Assert.assertTrue("Validate Search Text Field present", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistorySearchTextField));
        Assert.assertTrue("Validate Billing History Pagination", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryPagination));

    }

    public void verifyBillingHistoryList() {
        List<String> actualBillingHistoryTableHeader = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='d-flex table-heading text-grey1 font-medium']/div");
        List<String> expectedBillingHistoryTableHeader = BaseClass.addStringValueInList("Date", "Description", "Amount", "Status", "");
        Assert.assertEquals("Validate Billing History Table Header", expectedBillingHistoryTableHeader, actualBillingHistoryTableHeader);
    }

    public void verifyEachRecord() {
        Assert.assertTrue("Validate Billing History First Record date", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordDate));
        Assert.assertTrue("Validate Billing History First Record Description", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordDescription));
        Assert.assertTrue("Validate Billing History First Record Amount", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordAmount));
        Assert.assertTrue("Validate Billing History First Record Status", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordStatus));
        Assert.assertTrue("Validate Billing History First Record Download PDF", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordDownloadPDF));
        Assert.assertTrue("Validate Billing History First Record View Details", BaseClass.isElementPresent(ClientProfilePage.driver, billingHistoryFirstRecordViewDetails));
        if (billingHistoryFirstRecordStatus.getText().trim().equalsIgnoreCase("Paid"))
            Assert.assertTrue("Validate Status as Paid Or Unpaid", billingHistoryFirstRecordStatus.getText().trim().equalsIgnoreCase("Paid"));
        else if (billingHistoryFirstRecordStatus.getText().trim().equalsIgnoreCase("UnPaid"))
            Assert.assertTrue("Validate Status as Paid Or Unpaid", billingHistoryFirstRecordStatus.getText().trim().equalsIgnoreCase("UnPaid"));
        else
            Assert.assertTrue("Validate Status as Paid Or Unpaid", false);
    }

    public void verifyTransactionDetailsOfPaidBill() {
        String expectedDescription = billingHistoryPaidDescriptionTitle.getText().trim();
        String expectedJobId = billingHistoryPaidDescriptionJobId.getText().trim();
        billingHistoryPaidViewDetailsLink.click();
        BaseClass.waitForVisibility(invoiceHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Invoice Header", "Invoice", invoiceHeader.getText().trim());
        Assert.assertEquals("validate Paid Description Title", expectedDescription, paidDescriptionTitle.getText().trim());
        Assert.assertTrue("validate Paid Job Id", expectedJobId.contains(paidJobId.getText().trim()));
        addOptionalLink1.click();
        BaseClass.waitForVisibility(addAdditionalDetailsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Add Additional Invoice Details Header", "Add Additional Invoice Details", addAdditionalDetailsHeader.getText().trim());
        editInvoiceCancelButton.click();
        BaseClass.waitForVisibility(addOptionalLink2, 30, ClientProfilePage.driver);
        addOptionalLink2.click();
        BaseClass.waitForVisibility(addAdditionalDetailsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Add Additional Invoice Details Header", "Add Additional Invoice Details", addAdditionalDetailsHeader.getText().trim());
        editInvoiceCancelButton.click();
        BaseClass.waitForVisibility(addOptionalLink1, 30, ClientProfilePage.driver);
    }

    public void verifyTransactionDetailsOfUnPaidBill() {
        String expectedDescription = billingHistoryUnPaidDescriptionTitle.getText().trim();
        String expectedJobId = billingHistoryUnPaidDescriptionJobId.getText().trim();
        billingHistoryUnpaidViewDetailsLink.click();
        BaseClass.waitForVisibility(invoiceHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Invoice Header", "Invoice", invoiceHeader.getText().trim());
        Assert.assertEquals("validate UnPaid Description Title", expectedDescription, paidDescriptionTitle.getText().trim());
        Assert.assertTrue("validate UnPaid Job Id", expectedJobId.contains(paidJobId.getText().trim()));
        Assert.assertEquals("Validate pay now button", "Pay Now", payNowButton.getText().trim());
    }

    public void verifyAmountSortUpAndSortDownFunctionality() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(billingHistoryLink, 30, ClientProfilePage.driver);
        billingHistoryLink.click();
        BaseClass.waitForVisibility(billingHistoryHeader, 30, ClientProfilePage.driver);
        List<String> defaultAmountList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']//div[contains(text(),'$')]");
        Collections.sort(defaultAmountList);
        amountSortingButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> sort1AmountList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']//div[contains(text(),'$')]");
        Assert.assertEquals("Validate Amount Sort Up and Down Functionality", defaultAmountList, sort1AmountList);

    }

    public void verifySearchFunctionalityForBillingHistory() {
        String expectedJobId = billingHistoryPaidDescriptionJobId.getText().trim().substring(5, 11);
        billingHistorySearchTextField.sendKeys(expectedJobId);
        previouslyHiredTalentSearchIcon.click();
        BaseClass.staticWaitForVisibility(4000);
        String actuallyJobId = billingHistoryPaidDescriptionJobId.getText().trim().substring(5, 11);
        Assert.assertEquals("Validate search functionality for job ID", expectedJobId, actuallyJobId);
        previouslyHiredTalentClearSearchIcon.click();
        BaseClass.staticWaitForVisibility(4000);
    }

    public void verifyDownloadCsvFunctionality() {
        billingHistoryDownloadCSVButton.click();
        BaseClass.staticWaitForVisibility(10000);
    }

    public void verifyShowFilterFunctionalityForBillingHistory() {
        BaseClass.waitForVisibility(billingHistoryShowButton, 30, ClientProfilePage.driver);
        billingHistoryShowButton.click();
        List<String> actualShowOptions = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@id='filter-action-list']//button[@type='button']/parent::div/div//button");
        List<String> expectedShowOptions = BaseClass.addStringValueInList("All", "Add-Ons", "Hired Talent", "Paid", "Unpaid", "Overdue", "Subscriptions", "Closed");
        Assert.assertEquals("Validate View Options list", expectedShowOptions, actualShowOptions);
        paidViewOptionButton.click();
        BaseClass.staticWaitForVisibility(4000);
        List<String> paidStatusList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']/div/div/div[5]/span");
        for (String paidStatus : paidStatusList)
            Assert.assertEquals("Validate pais status", "Paid", paidStatus);
        billingHistoryShowButton.click();
        BaseClass.waitForVisibility(allViewOptionButton, 30, ClientProfilePage.driver);
        allViewOptionButton.click();
    }

    public void verifyDateFilterFunctionality() {
        String defaultDateRange = defaultDataRange.getText().trim();
        billingHistoryCalenderButton.click();
        BaseClass.waitForVisibility(startDateInputField, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Start Date Input Field Present", BaseClass.isElementPresent(ClientProfilePage.driver, startDateInputField));
        Assert.assertTrue("Validate End Date Input Field Present", BaseClass.isElementPresent(ClientProfilePage.driver, endDateInputField));
        Assert.assertTrue("Validate This Year Radio Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, thisYearRadioButton));
        Assert.assertTrue("Validate This Month Radio Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, thisMonthRadioButton));
        Assert.assertTrue("Validate All Time Radio Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, allTimeRadioButton));
        Assert.assertTrue("Validate Clear Time Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, timeClearButton));
        Assert.assertTrue("Validate Apply Time Button Present", BaseClass.isElementPresent(ClientProfilePage.driver, timeApplyButton));
        thisYearRadioButton.click();
        timeApplyButton.click();
        BaseClass.staticWaitForVisibility(3000);
        Assert.assertEquals("validate This year date range", "Jan 1, 2024 - Dec 31, 2024", defaultDataRange.getText().trim());
        List<String> dateList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']/div/div/div[1]");
        for (String date : dateList)
            Assert.assertTrue("Validate date Range", date.contains("2024"));
        billingHistoryCalenderButton.click();
        BaseClass.waitForVisibility(startDateInputField, 30, ClientProfilePage.driver);
        timeClearButton.click();
    }

    @FindBy(xpath = "//h2[normalize-space()='Invoice Payment']")
    private WebElement invoicePaymentHeader;
    @FindBy(xpath = "//h3[normalize-space()='1. Billing Address']")
    private WebElement billingAddressHeader;
    @FindBy(xpath = "//h3[normalize-space()='2. Payment Method']")
    private WebElement paymentMethodHeader;
    @FindBy(xpath = "//button[@id='submit-button']")
    private WebElement confirmAndPayButton;

    public void verifyPayNowButtonFunctionality() {
        BaseClass.waitForVisibility(payNowButton, 30, ClientProfilePage.driver);
        payNowButton.click();
        BaseClass.waitForVisibility(invoicePaymentHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate Invoice Payment Header", "Invoice Payment", invoicePaymentHeader.getText().trim());
        Assert.assertEquals("Validate Billing Address Header", "1. Billing Address", billingAddressHeader.getText().trim());
        Assert.assertEquals("Validate Payment Method Header", "2. Payment Method", paymentMethodHeader.getText().trim());
        Assert.assertEquals("Validate Confirm and Pay button", "Confirm and Pay", confirmAndPayButton.getText().trim());
        ClientProfilePage.driver.navigate().back();
        BaseClass.waitForVisibility(payNowButton, 30, ClientProfilePage.driver);
    }

    public void verifyAddOptionalButtonFunctionality() {
        addOptionalLink1.click();
        BaseClass.waitForVisibility(addAdditionalDetailsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Add Additional Invoice Details Header", "Add Additional Invoice Details", addAdditionalDetailsHeader.getText().trim());
        editInvoiceCancelButton.click();
        BaseClass.waitForVisibility(addOptionalLink2, 30, ClientProfilePage.driver);
        addOptionalLink2.click();
        BaseClass.waitForVisibility(addAdditionalDetailsHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("validate Add Additional Invoice Details Header", "Add Additional Invoice Details", addAdditionalDetailsHeader.getText().trim());
        editInvoiceCancelButton.click();
        BaseClass.waitForVisibility(addOptionalLink1, 30, ClientProfilePage.driver);
    }

    @FindBy(xpath = "//a[@title='Back']")
    private WebElement backButton;

    public void verifyBackButtonFunctionality() {
        BaseClass.waitForVisibility(backButton, 30, ClientProfilePage.driver);
//        backButton.click();
        BaseClass.javaScriptClick(ClientProfilePage.driver, backButton);
        BaseClass.waitForVisibility(billingHistoryHeader, 30, ClientProfilePage.driver);
        Assert.assertEquals("Validate able to navigate to Billing History page", "Billing History", billingHistoryHeader.getText().trim());

    }

    public void verifyPagination() {
        String[] paginationArray = billingHistoryPagination.getText().trim().split(" ");
        int paginationCount = Integer.parseInt(paginationArray[3]);
        int actualListCount = ClientProfilePage.driver.findElements(By.xpath("//div[@class='billing-list-group-items ']/div/div")).size();
        Assert.assertEquals("Validate Pagination count", paginationCount, actualListCount);
    }

    public void verifyDateSortUpAndSortDownFunctionality() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(billingHistoryLink, 30, ClientProfilePage.driver);
        billingHistoryLink.click();
        BaseClass.waitForVisibility(billingHistoryHeader, 30, ClientProfilePage.driver);
        List<String> defaultDateList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']/div/div/div[1]");
        Collections.sort(defaultDateList);
        List<String> expectedDateList = BaseClass.sortDateStringAscendingOrder(defaultDateList);
        dateFilterButton.click();
        BaseClass.staticWaitForVisibility(3000);
        List<String> actualDateList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//div[@class='billing-list-group-items ']/div/div/div[1]");
        Assert.assertEquals("Validate Date filter function", expectedDateList, actualDateList);
    }

    public void verifyClientUserIsAbleToNavigateToManageTeamPage() {
        BaseClass.waitForVisibility(meIconLink, 30, ClientProfilePage.driver);
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        BaseClass.waitForVisibility(manageTeamLink, 30, ClientProfilePage.driver);
        manageTeamLink.click();
        BaseClass.waitForVisibility(teamAccountHeader, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate user navigate to mange team page", teamAccountHeader.getText().trim().contains("Team Account"));
        Assert.assertEquals("Validate Invite New Team Member header", "Invite New Team Member", inviteNewJobMemberHeader.getText().trim());

    }

    public void verifyOwnerRecord() {
        Assert.assertTrue("Validate Owner name present", BaseClass.isElementPresent(ClientProfilePage.driver, ownerName));
        Assert.assertTrue("Validate Owner status present", BaseClass.isElementPresent(ClientProfilePage.driver, ownerStatus));
        Assert.assertTrue("Validate Owner email present", BaseClass.isElementPresent(ClientProfilePage.driver, ownerEmailAddress));
        Assert.assertTrue("Validate Owner photo present", BaseClass.isElementPresent(ClientProfilePage.driver, ownerPhoto));
    }

    public void verifyManagerRecord() {
        Assert.assertTrue("Validate Manager name present", BaseClass.isElementPresent(ClientProfilePage.driver, managerName));
        Assert.assertTrue("Validate Manager status present", BaseClass.isElementPresent(ClientProfilePage.driver, managerStatus));
        Assert.assertTrue("Validate Manager email present", BaseClass.isElementPresent(ClientProfilePage.driver, managerEmailAddress));
        Assert.assertTrue("Validate Manager photo present", BaseClass.isElementPresent(ClientProfilePage.driver, managerPhoto));
        managerButton.click();
        List<String> actualManagerDropdownOption = BaseClass.getColumnDataInList(ClientProfilePage.driver, "(//span[normalize-space()='Manager'])[2]/../../../../div[3]/div/div//span");
        List<String> expectedMangerDropdownOption = BaseClass.addStringValueInList("Member", "Can manage jobs", "Manager", "Can manage jobs, payments and members", "");
        Assert.assertEquals("validate Manager Dropdown Options", expectedMangerDropdownOption, actualManagerDropdownOption);
        Assert.assertEquals("Validate Manager Learn More About Roles and Permission", "Learn More About Roles And Permissions", managerLearnMoreAboutRole.getText().trim());
        managerOptionsButton.click();
        List<String> actualMangerDropdown = BaseClass.getColumnDataInList(ClientProfilePage.driver, "(//span[normalize-space()='Manager'])[2]/../../../../div[3]/div[2]/div//li");
        List<String> expectedManagerDropdown = BaseClass.addStringValueInList("Edit Details", "Reset Password", "Delete User");
        Assert.assertEquals("Validate Manger dropdown", expectedManagerDropdown, actualMangerDropdown);
        managerOptionsButton.click();
    }

    public void verifyMemberRecord() {
        Assert.assertTrue("Validate Member name present", BaseClass.isElementPresent(ClientProfilePage.driver, memberName));
        Assert.assertTrue("Validate Member status present", BaseClass.isElementPresent(ClientProfilePage.driver, memberStatus));
        Assert.assertTrue("Validate Member email present", BaseClass.isElementPresent(ClientProfilePage.driver, memberEmailAddress));
        Assert.assertTrue("Validate Member photo present", BaseClass.isElementPresent(ClientProfilePage.driver, memberPhoto));
        memberButton.click();
        List<String> actualMemberDropdownOption = BaseClass.getColumnDataInList(ClientProfilePage.driver, "(//span[normalize-space()='Member'])[3]/../../../following-sibling::div/div/div//span");
        List<String> expectedMemberDropdownOption = BaseClass.addStringValueInList("Member", "Can manage jobs", "Manager", "Can manage jobs, payments and members", "");
        Assert.assertEquals("validate Member Dropdown Options", expectedMemberDropdownOption, actualMemberDropdownOption);
        Assert.assertEquals("Validate Member Learn More About Roles and Permission", "Learn More About Roles And Permissions", memberLearnMoreAboutRole.getText().trim());
        memberOptionsButton.click();
        List<String> actualMemberDropdown = BaseClass.getColumnDataInList(ClientProfilePage.driver, "(//span[normalize-space()='Member'])[3]/../../../following-sibling::div/div[2]//li");
        List<String> expectedMemberDropdown = BaseClass.addStringValueInList("Edit Details", "Reset Password", "Delete User");
        Assert.assertEquals("Validate Member dropdown", expectedMemberDropdown, actualMemberDropdown);

    }


    public void verifyOwnerNameMemberNameManagerNameLinkNavigation() {
        ownerName.click();
        BaseClass.waitForVisibility(profilePhoto, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Owner profile photo", BaseClass.isElementPresent(ClientProfilePage.driver, profilePhoto));
        Assert.assertEquals("Validate Owner Full Name", "Full Name", fullNameLabel.getText().trim());
        Assert.assertEquals("Validate Owner Title", "Title", titleLabel.getText().trim());
        Assert.assertEquals("Validate Owner Work Email", "Work Email", workEmailLabel.getText().trim());
        Assert.assertEquals("Validate Owner Phone", "Phone", phoneLabel.getText().trim());
        Assert.assertEquals("Validate Owner Username", "Username", usernameLabel.getText().trim());
        Assert.assertEquals("Validate Owner Role", "Role", roleLabel.getText().trim());
        Assert.assertEquals("Validate Owner as Role", "Owner", ownerRole.getText().trim());
        Assert.assertEquals("Validate Active as Status", "ACTIVE", activeStatus.getText().trim());
        Assert.assertEquals("Validate Submit button", "Submit", submitButton.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton1.getText().trim());
        cancelButton1.click();
        BaseClass.waitForVisibility(managerName, 30, ClientProfilePage.driver);
        managerName.click();
        BaseClass.waitForVisibility(profilePhoto, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Manager profile photo", BaseClass.isElementPresent(ClientProfilePage.driver, profilePhoto));
        Assert.assertEquals("Validate Manager Full Name", "Full Name", fullNameLabel.getText().trim());
        Assert.assertEquals("Validate Manager Title", "Title", titleLabel.getText().trim());
        Assert.assertEquals("Validate Manager Work Email", "Work Email", workEmailLabel.getText().trim());
        Assert.assertEquals("Validate Manager Phone", "Phone", phoneLabel.getText().trim());
        Assert.assertEquals("Validate Manager Username", "Username", usernameLabel.getText().trim());
        Assert.assertEquals("Validate Manager Role", "Role", roleLabel.getText().trim());
        Assert.assertEquals("Validate Manager as Role", "Manager", managerRole.getText().trim());
        Assert.assertEquals("Validate Active as Status", "ACTIVE", activeStatus.getText().trim());
        Assert.assertEquals("Validate Reset Password button", "Reset Password", resetPasswordButton.getText().trim());
        Assert.assertEquals("Validate Remove button", "Remove", removeButton.getText().trim());
        Assert.assertEquals("Validate Submit button", "Submit", submitButton.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton1.getText().trim());
        cancelButton1.click();
        BaseClass.waitForVisibility(memberName, 30, ClientProfilePage.driver);
        memberName.click();
        BaseClass.waitForVisibility(profilePhoto, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate Member profile photo", BaseClass.isElementPresent(ClientProfilePage.driver, profilePhoto));
        Assert.assertEquals("Validate Member Full Name", "Full Name", fullNameLabel.getText().trim());
        Assert.assertEquals("Validate Member Title", "Title", titleLabel.getText().trim());
        Assert.assertEquals("Validate Member Work Email", "Work Email", workEmailLabel.getText().trim());
        Assert.assertEquals("Validate Member Phone", "Phone", phoneLabel.getText().trim());
        Assert.assertEquals("Validate Member Username", "Username", usernameLabel.getText().trim());
        Assert.assertEquals("Validate Member Role", "Role", roleLabel.getText().trim());
        Assert.assertEquals("Validate Member as Role", "Member", memberRole.getText().trim());
        Assert.assertEquals("Validate Active as Status", "ACTIVE", activeStatus.getText().trim());
        Assert.assertEquals("Validate Reset Password button", "Reset Password", resetPasswordButton.getText().trim());
        Assert.assertEquals("Validate Remove button", "Remove", removeButton.getText().trim());
        Assert.assertEquals("Validate Submit button", "Submit", submitButton.getText().trim());
        Assert.assertEquals("Validate Cancel button", "Cancel", cancelButton1.getText().trim());
        cancelButton1.click();
        BaseClass.waitForVisibility(managerName, 30, ClientProfilePage.driver);
    }

    public void verifyInviteToTeamFunctionality() {
        BaseClass.waitForVisibility(memberEmailTextField, 30, ClientProfilePage.driver);
        memberEmailTextField.sendKeys("Test@gmail.com");
        inviteAMemberButton.click();
        List<String> actualInviteDropdownOption = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//button[@class='action-list-btn']/following-sibling::div//span");
        List<String> expectedInviteDropdownOption = BaseClass.addStringValueInList("Member", "Can manage jobs", "Manager", "Can manage jobs, payments and members", "");
        Assert.assertEquals("validate Invite Dropdown Options", expectedInviteDropdownOption, actualInviteDropdownOption);

    }


}