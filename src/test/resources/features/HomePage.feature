@HomePageLink
Feature: Home Page Validation

  Background: Open Main URL
    Given User Open Home Page

  Scenario: Validate How It Works Log In and Sign In link for Non sign in user
    And User click on How it works link and validate url
    And User click on log in link and validate url
    And User click on sign up link and validate url


