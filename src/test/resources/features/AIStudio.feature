Feature: Validate Talent Profile Functionality

  Background: Open Main URL
    Given User Open Home Page

  @AIStudio
  Scenario: Validate Non AI Studio Capability Functionality
    When User login with client credentials
    Then Verify AI Voice section is not displayed on Profile page for Non AI talent users

  @AIStudio
  Scenario: Validate AI Studio Capability Functionality
    When User login with AI user credentials
    Then Verify AI Voice section is displayed on Profile page for AI talent users
    Then Verify client user able to navigate to AI Studio page via Talent profile page
    Then Verify client user able to navigate to AI Studio page via Sub Nav
    Then Verify Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the Error Message for Project Name field in Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category Initial Selection Updates

  @AIStudio
  Scenario: Validate Studio page via talent profile
    When User login with AI user credentials
    Then Verify that client user able to navigate to AI Studio page via Talent profile page
    Then Verify Welcome to AI Studio modal Category Initial Selection Updates via AI Talent profile page
    Then Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category via AI Talent profile page
    Then Verify the Error Message for Project Name field in Welcome to AI Studio modal Category via AI Talent profile page
    Then Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category via AI Talent profile page
#    Then Verify the Category and Project name is displayed correctly in studio page via AI Talent profile page

  @AIStudio
  Scenario: Validate Welcome Modal Go to Drafts cta
    When User login with client credentials
    Then Verify Go to Drafts button is not displayed in welcome modal if client account does not have at least 1 or more AI job in draft or done status
    When User re login with AI user credentials
    Then Verify Go to Drafts button is displayed in welcome modal if client account have at least 1 or more AI job in draft or done status


  @AIStudio
  Scenario: Validate UI Page
    When User login with AI user credentials
    Then Verify the UI in studio page via AI Talent profile page
