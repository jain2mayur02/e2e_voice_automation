package com.voices.stepDefinition.MarketPlaceStepDef;

import com.voices.controlManager.TestContext;
import com.voices.pageObjects.HyperLinkPageObj.HyperLinkPage;
import com.voices.pageObjects.MarketPlacePageObj.MarketPlacePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;


public class MarketPlaceStep {
    TestContext testContext;
    private List<Map<String, String>> data;

    MarketPlacePage marketPlacePage;

    public MarketPlaceStep(TestContext testContext) {
        this.testContext = testContext;
        marketPlacePage = testContext.getPageManager().getMarketPlacePage();
    }

    @Then("Verify Talent user is able to navigate to Manage Packages page")
    public void verify_Talent_user_is_able_to_navigate_to_Manage_Packages_page() {
        marketPlacePage.validateUserNavigateToManagePackagesPage();
    }

    @Then("Verify required fields on Create a Package page")
    public void Verify_required_fields_on_Create_a_Package_page() {
        marketPlacePage.verifyRequiredFieldsOnCreatePackagePage();
    }

    @Then("Verify Talent user is able to abandon Package creation")
    public void Verify_Talent_user_is_able_to_abandon_Package_creation() {
        marketPlacePage.userAbleToAbandonPackageCreation();
    }


    @Then("Verify Talent user is able to create Package Overview step {string}")
    public void verify_talent_user_is_able_to_create_a_package_overview_step(String packageTitle, DataTable dataTable) {
        List<Map<String, String>> packageDetails = dataTable.asMaps(String.class, String.class);
        String category = packageDetails.get(0).get("Category");
        String language = packageDetails.get(0).get("Language");
        String accent = packageDetails.get(0).get("Accent");
        String voiceGender = packageDetails.get(0).get("Voice Gender");
        String voiceAge = packageDetails.get(0).get("Voice Age");
        marketPlacePage.userAbleToCreatePackageOverView(packageTitle, category, language, accent, voiceGender, voiceAge);
    }


    @Then("Verify Talent user is able to create a Package Pricing step")
    public void Verify_Talent_user_is_able_to_create_a_Package_Pricing_step(DataTable dataTable) {
        List<Map<String, String>> packageDetails = dataTable.asMaps(String.class, String.class);
        String essentialWord = packageDetails.get(0).get("Essential Word");
        String enhancedWord = packageDetails.get(0).get("Enhanced Word");
        String eliteWord = packageDetails.get(0).get("Elite Word");
        String essentialDeliveryDays = packageDetails.get(0).get("Essential Delivery Days");
        String enhancedDeliveryDays = packageDetails.get(0).get("Enhanced Delivery Days");
        String eliteDeliveryDays = packageDetails.get(0).get("Elite Delivery Days");
        String essentialRevisions = packageDetails.get(0).get("Essential Revisions");
        String enhancedRevisions = packageDetails.get(0).get("Enhanced Revisions");
        String eliteRevisions = packageDetails.get(0).get("Elite Revisions");
        String essentialPackagePrice = packageDetails.get(0).get("Essential Package Price");
        String enhancedPackagePrice = packageDetails.get(0).get("Enhanced Package Price");
        String elitePackagePrice = packageDetails.get(0).get("Elite Package Price");
        marketPlacePage.userAbleToCreatePackagePricing(essentialWord, enhancedWord, eliteWord, essentialDeliveryDays, enhancedDeliveryDays, eliteDeliveryDays, essentialRevisions, enhancedRevisions, eliteRevisions, essentialPackagePrice, enhancedPackagePrice, elitePackagePrice);
    }

    @Then("Verify Talent user is able to create a Package Description step")
    public void Verify_Talent_user_is_able_to_create_a_Package_Description_step() {
        marketPlacePage.createPackageDescriptionStep();
    }

    @Then("Verify Talent user is able to create a Package Media step")
    public void Verify_Talent_user_is_able_to_create_a_Package_Media_step() {
        marketPlacePage.createPackageMediaStep();
    }

    @Then("Verify Talent user is able to create a Package Requirements step")
    public void Verify_talent_user_is_able_to_create_a_Package_Requirements_step() {
        marketPlacePage.PackageRequirementsStep();
    }

    @Then("Verify Talent user is able to create a Package Preview step")
    public void Verify_Talent_user_is_able_to_create_a_Package_Preview_step() {
        marketPlacePage.createPackagePreviewStep();
    }

    @Then("Verify Talent user is able to create and approve a Package")
    public void Verify_Talent_user_is_able_to_create_and_approve_a_Package() {
        marketPlacePage.createPackagePreviewStepAndApprovePackage();
    }


    @Then("Verify Talent user is able to edit Draft Package {string} {string}")
    public void verify_talent_user_is_able_to_edit_a_draft_package(String packageName, String packageNewName) {
        marketPlacePage.editDraftPackage(packageName, packageNewName);
    }

    @Then("Verify Talent user is able to delete a Draft Package {string}")
    public void verify_talent_user_is_able_to_delete_draft_package(String packageNewName) {
        marketPlacePage.deleteDraftPackage(packageNewName);
    }

    @Then("Verify Talent user is able to delete a Pending Review Packages {string}")
    public void verify_talent_user_is_able_to_delete_pending_review_packages(String packageName) {
        marketPlacePage.deletePendingReviewPackage(packageName);
    }

    @Then("Verify Talent user is able to Deactivate an Approved Package")
    public void Verify_Talent_user_is_able_to_Deactivate_an_Approved_Package() {
        marketPlacePage.activateDeactivateApprovedPackage();
    }

    @Then("Verify Talent user is able to duplicate an Approved Package {string}")
    public void verify_talent_user_is_able_to_duplicate_an_approved_package(String packageName) {
        marketPlacePage.duplicateApprovedPackage(packageName);
    }

    @Then("Verify Talent user is able to edit an Approved Package {string} {string}")
    public void Verify_Talent_user_is_able_to_edit_an_Approved_Package(String packageName, String editPackageName) {
        marketPlacePage.editApprovedPackage(packageName, editPackageName);
    }

    @Then("Verify Talent user is able to delete an Approved Package {string}")
    public void Verify_Talent_user_is_able_to_delete_an_Approved_Package(String packageName) {
        marketPlacePage.deleteApprovedPackage(packageName);
    }

    @Then("User logout from talent prime account")
    public void User_logout_from_talent_prime_account() {
        marketPlacePage.logoutFromAnyUser();
    }

    @Then("User purchase the package from talent user {string}")
    public void User_purchase_the_package_from_talent_user(String packageName) {
        marketPlacePage.userPurchasePackageFromTalentUser(packageName);
    }

    @Then("User logout from client account")
    public void User_logout_from_client_account() {
        marketPlacePage.logoutFromAnyUser();
    }

    @Then("Verify Talent user is able to view and Accept Awarded Job {string}")
    public void Verify_Talent_user_is_able_to_view_and_Accept_Awarded_Job(String packageName) {
        marketPlacePage.viewAndAcceptAwardedJob(packageName);
    }

    @Then("Verify Talent user is able to view and Decline Awarded Job {string}")
    public void Verify_Talent_user_is_able_to_view_and_Decline_Awarded_Job(String packageName) {
        marketPlacePage.viewAndDeclinedAwardedJob(packageName);
    }

}
