package com.voices.pageObjects.HomePageObj;

import com.voices.baseClass.BaseClass;
import com.voices.managers.ReaderManager;
import com.voices.pageObjects.LoginPageObj.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePage {
    private static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='find-talent']")
    private WebElement findTalentLink;
    // @FindBy(xpath = "//div[@class='megaMenu-talent-items megaMenu-talent-items-active']//div[@class='megaMenu-talent-items-text']")
    @FindBy(xpath = "//span[normalize-space()='Find Talent for Your Job']")
    private WebElement talentProfile;
    //@FindBy(xpath = "//a[@class='nav-main-submenu-link nav-main-submenu-link-line']")
    @FindBy(linkText = "Log In")
    private WebElement logInLink;
    @FindBy(xpath = "//input[@id='login-email']")
    private WebElement loginEmailTextBox;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//button[normalize-space()='Log In']")
    private WebElement logInButton;
    @FindBy(xpath = "//button[@title='Submit Search']")
    private WebElement searchIcon;
    @FindBy(xpath = "//h1[@id='keyword-heading']")
    private WebElement searchHeading;
    @FindBy(xpath = "//a[@class='header-btn header-btn-primary header-btn-postjob btn']")
    private WebElement postAJobButton;
    @FindBy(xpath = "//div[@id='header-title']")
    private WebElement postAJobText;

    @FindBy(xpath = "//a[@id='Jobs']")
    private WebElement jobsIcon;

    @FindBy(xpath = "//a[@id='Messages']")
    private WebElement messagesIcon;
    @FindBy(xpath = "//h1[normalize-space()='Messages']")
    private WebElement messagesIconText;


    @FindBy(xpath = "//a[@id='Notifications']")
    private WebElement notificationIcon;

    @FindBy(xpath = "//h1[normalize-space()='Notification Center']")
    private WebElement notificationIconText;

    @FindBy(xpath = "//li[@class='nav-main-submenu-list-item nav-main-submenu-list-item-desktop has-dropdown']//a[contains(@class,'nav-main-submenu-link-icon')]")
    private WebElement userIcon;
    @FindBy(xpath = "//a[normalize-space()='My Home']")
    private WebElement myHomeLink;
    @FindBy(xpath = "//h1[normalize-space()='Get Started']")
    private WebElement getStartedText;
    @FindBy(xpath = "//a[normalize-space()='Favorites']")
    private WebElement favoritesLink;
    @FindBy(xpath = "//h1[normalize-space()='Favorite Talent']")
    private WebElement favoriteTalentText;
    @FindBy(xpath = "//a[normalize-space()='Previously Hired Talent']")
    private WebElement previouslyHiredTalentLink;
    @FindBy(xpath = "//div[@class='page-header']/h1")
    private WebElement previouslyHiredTalentText;
    @FindBy(xpath = "//a[normalize-space()='Reviews']")
    private WebElement reviewsLink;
    @FindBy(xpath = "//h1[normalize-space()='Reviews']")
    private WebElement reviewsText;
    @FindBy(xpath = "//a[normalize-space()='Manage Licenses']")
    private WebElement manageLicensesLink;
    @FindBy(xpath = "//h1[normalize-space()='License Management']")
    private WebElement manageLicensesText;
    @FindBy(xpath = "//a[normalize-space()='Manage Team']")
    private WebElement manageTeamLink;
    @FindBy(xpath = "//h1[normalize-space()='Team Members']")
    private WebElement manageTeamText;
    @FindBy(xpath = "//a[normalize-space()='Billing History']")
    private WebElement billingHistoryLink;
    @FindBy(xpath = "//h1[normalize-space()='Billing History']")
    private WebElement billingHistoryText;
    @FindBy(xpath = "//a[normalize-space()='Account Settings']")
    private WebElement accountSettingsLink;
    @FindBy(xpath = "//h1[normalize-space()='Business Profile']")
    private WebElement accountSettingsText;
    @FindBy(xpath = "//a[normalize-space()='Help Center']")
    private WebElement helpCenterLink;
    @FindBy(xpath = "//h1[normalize-space()='How can we help?']")
    private WebElement helpCenterText;
    @FindBy(xpath = "//a[normalize-space()='Contact Support']")
    private WebElement contactSupportLink;
    @FindBy(xpath = "//h1[normalize-space()='How can we help?']")
    private WebElement contactSupportText;
    @FindBy(xpath = "//li[@class='nav-main-dropdown-list-item']//a[@class='nav-main-dropdown-link'][normalize-space()='Log Out']")
    private WebElement logOutLink;
    @FindBy(xpath = "//h2[@id='login-form-title']")
    private WebElement logoutText;
    @FindBy(xpath = "//i[@class='right']//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]")
    private WebElement rightScrollClick;
    @FindBy(xpath = "//a[@id='Payments']")
    private WebElement paymentIcon;
    @FindBy(xpath = "//a[@id='Messages']")
    private WebElement messageIcon;
    @FindBy(xpath = "//h1[normalize-space()='Messages']")
    private WebElement messageText;
    @FindBy(xpath = "//div[contains(text(),'Help')]/../../a")
    private WebElement helpIcon;
    @FindBy(xpath = "//div[@class='flexbox']/../div/a[1]")
    private WebElement userProfile;
    @FindBy(xpath = "//div[@class='flexbox']/../div/a[2]")
    private WebElement premiumLink;
    @FindBy(xpath = "//a[@class='nav-main-submenu-link nav-main-submenu-link-line d-flex justify-content-between']")
    private WebElement howItWorkLink;
    @FindBy(xpath = "//h1[normalize-space()='How It Works']")
    private WebElement howItWorksText;
    @FindBy(xpath = "//h2[normalize-space()='Log In to Voices']")
    private WebElement logInToVoicesText;
    @FindBy(xpath = "//a[@class='nav-main-submenu-btn header-btn header-btn-primary']")
    private WebElement signUpLink;
    @FindBy(xpath = "//h2[@id='signup-title']")
    private WebElement signUpWithVoicesText;


    public void userLaunchAndValidateHomePage() {
        HomePage.driver.get(ReaderManager.getInstance().getConfigReader().getApplicationUrl());
        BaseClass.staticWaitForVisibility(2000);
    }
    public void overOnJobAndValidateAllLinkForTalentUser() {
        BaseClass.waitForVisibility(jobsIcon, 60, HomePage.driver);
        BaseClass.mouseOverOnElement(HomePage.driver, jobsIcon);
        List<WebElement> jobsList = HomePage.driver.findElements(By.xpath("//a[@id='Jobs']/../div/ul/li/a"));
        for (int link = 0; link < jobsList.size(); link++) {
            BaseClass.waitForVisibility(jobsIcon, 60, HomePage.driver);
            BaseClass.mouseOverOnElement(HomePage.driver, jobsIcon);
            jobsList = HomePage.driver.findElements(By.xpath("//a[@id='Jobs']/../div/ul/li/a"));
            String jobLinkText = jobsList.get(link).getText();
            String keyLinkText = "Talent" + jobLinkText.replaceAll(" ", "");
            HomePage.driver.findElement(By.xpath("(//a[contains(text(),'" + jobLinkText + "')])[1]")).click();
            BaseClass.staticWaitForVisibility(2000);
            Assert.assertEquals("Validate Page URL", ReaderManager.getInstance().getConfigReader().getUrlEndPoint(keyLinkText), HomePage.driver.getCurrentUrl());
            WebElement jobsStatusElement = HomePage.driver.findElement(By.xpath("//a[text()='" + jobLinkText + "']/.."));
            Assert.assertEquals("Validate Jobs Status", "active", jobsStatusElement.getAttribute("class").trim());
        }
    }


    public void clickOnHowItWorkAndValidateUrl() {
        BaseClass.waitForVisibility(howItWorkLink, 60, HomePage.driver);
        howItWorkLink.click();
        BaseClass.waitForVisibility(howItWorksText, 60, HomePage.driver);
        Assert.assertEquals("Validate How It Work Text", "How It Works", howItWorksText.getText().trim());
        Assert.assertEquals("Validate Url", ReaderManager.getInstance().getConfigReader().getUrlEndPoint("HowItWorks"), HomePage.driver.getCurrentUrl());
        BaseClass.validateURLresponse(HomePage.driver.getCurrentUrl());
        HomePage.driver.navigate().refresh();

    }

    public void clickOnLogInAndValidateUrl() {
        BaseClass.waitForVisibility(logInLink, 60, HomePage.driver);
        logInLink.click();
        BaseClass.waitForVisibility(logInToVoicesText, 60, HomePage.driver);
        Assert.assertEquals("Validate Log In Text", "Log In to Voices", logInToVoicesText.getText().trim());
        Assert.assertEquals("Validate Url", ReaderManager.getInstance().getConfigReader().getUrlEndPoint("HowItWorks"), HomePage.driver.getCurrentUrl());
        BaseClass.validateURLresponse(HomePage.driver.getCurrentUrl());
        HomePage.driver.navigate().refresh();
    }

    public void clickOnSignUpAndValidateUrl() {
        BaseClass.waitForVisibility(signUpLink, 60, HomePage.driver);
        signUpLink.click();
        BaseClass.waitForVisibility(signUpWithVoicesText, 60, HomePage.driver);
        Assert.assertEquals("Validate Sign Up Text", "Sign Up with Voices", signUpWithVoicesText.getText().trim());
        Assert.assertEquals("Validate Url", ReaderManager.getInstance().getConfigReader().getUrlEndPoint("HowItWorks"), HomePage.driver.getCurrentUrl());
        BaseClass.validateURLresponse(HomePage.driver.getCurrentUrl());
        HomePage.driver.navigate().refresh();
    }
}
