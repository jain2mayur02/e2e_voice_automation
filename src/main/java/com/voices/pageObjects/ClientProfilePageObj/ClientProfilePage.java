package com.voices.pageObjects.ClientProfilePageObj;

import com.voices.baseClass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        BaseClass.waitForVisibility(jobsIconLink, 30, ClientProfilePage.driver);
        jobsIconLink.click();
        BaseClass.staticWaitForVisibility(4000);
        List<String> actualJobTabList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//nav[@id='main-tab-nav']//a");
        List<String> expectedJobTabList = BaseClass.addStringValueInList("All Jobs", "Draft", "In Review", "Hiring", "Offering", "Working", "Done");
        Assert.assertEquals("Validate Job Tab List", expectedJobTabList, actualJobTabList);
    }


    public void verifyMyJobsDraftTab() {
        BaseClass.mouseOverOnElement(ClientProfilePage.driver, meIconLink);
        myHomeLink.click();
        BaseClass.waitForVisibility(welcomeBackHeader, 30, ClientProfilePage.driver);
        Assert.assertTrue("Validate User Navigate to Home Page", welcomeBackHeader.getText().trim().contains("Welcome back"));
        Assert.assertEquals("validate My Job Header", "My Jobs", myJobsHeader.getText().trim());
        List<String> actualJobTabList = BaseClass.getColumnDataInList(ClientProfilePage.driver, "//nav[@id='main-tab-nav']//a");
        List<String> expectedJobTabList = BaseClass.addStringValueInList("Draft", "Working");
        Assert.assertEquals("Validate Job Tab List", expectedJobTabList, actualJobTabList);

    }
}
