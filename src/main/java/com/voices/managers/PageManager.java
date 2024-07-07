package com.voices.managers;

import com.voices.baseClass.BaseClass;
import com.voices.pageObjects.AIStudioPageObj.AIStudioPage;
import com.voices.pageObjects.ClientProfilePageObj.ClientProfilePage;
import com.voices.pageObjects.HyperLinkPageObj.HyperLinkPage;
import com.voices.pageObjects.LoginPageObj.LoginPage;
import com.voices.pageObjects.MarketPlacePageObj.MarketPlacePage;
import com.voices.pageObjects.SearchPageObj.SearchPage;
import com.voices.pageObjects.TalentProfilePageObj.TalentProfilePage;
import org.openqa.selenium.WebDriver;

public class PageManager {
    private WebDriver driver;
    private BaseClass baseclass;
    private LoginPage loginPage;
    private HyperLinkPage hyperLinkPage;
    private SearchPage searchPage;
    private MarketPlacePage marketPlacePage;

    private TalentProfilePage talentProfilePage;
    private ClientProfilePage clientProfilePage;
    private AIStudioPage aiStudioPage;

    public PageManager(WebDriver driver) {
        this.driver = driver;
    }

    public BaseClass getBaseClass() {
        return (baseclass == null) ? baseclass = new BaseClass(driver) : baseclass;
    }

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
    }

    public HyperLinkPage getHomePage() {
        return (hyperLinkPage == null) ? hyperLinkPage = new HyperLinkPage(driver) : hyperLinkPage;
    }

    public SearchPage getSearchPage() {
        return (searchPage == null) ? searchPage = new SearchPage(driver) : searchPage;
    }

    public MarketPlacePage getMarketPlacePage() {
        return (marketPlacePage == null) ? marketPlacePage = new MarketPlacePage(driver) : marketPlacePage;
    }

    public TalentProfilePage getTalentProfilePage() {
        return (talentProfilePage == null) ? talentProfilePage = new TalentProfilePage(driver) : talentProfilePage;
    }

    public ClientProfilePage getClientProfilePage() {
        return (clientProfilePage == null) ? clientProfilePage = new ClientProfilePage(driver) : clientProfilePage;
    }

    public AIStudioPage getAIStudioPage() {
        return (aiStudioPage == null) ? aiStudioPage = new AIStudioPage(driver) : aiStudioPage;
    }

}

