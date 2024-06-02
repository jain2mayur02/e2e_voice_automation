Feature: Validate Client Profile Functionality

  Background: Open Main URL
    Given User Open Home Page


  Scenario: Verify MyHome page for Client Profile
    When User login with client credentials
    Then Verify Client user is able to navigate to My Home page
    Then Verify Top Talent Home Banner
    Then Verify Manual closing of Top Talent Home Banner
    Then Verify My Jobs Section
    Then Verify My Jobs Draft tab
#    Then Verify My Jobs Hiring tab
    Then Verify My Jobs Working tab
    Then Verify My Jobs Done tab
    Then Verify Previously Hired Talent Section
    Then Verify Client Career Section
    Then Verify Customer Support Section for client


  Scenario: Verify Account setting
    When User login with client credentials
    Then Verify Client user is able to navigate to Account Settings Page
    Then Verify Business Profile for client
    Then Verify General Settings for client
    Then Verify Notifications for client
    Then Verify Subscription for client
    Then Verify Billing Information for client
    Then Verify Change Password for client


  Scenario: Verify Previously hired talent
    When User login with client credentials
    Then Verify Talent user is able to navigate to Previously Hired Talent Page
    Then Verify Previously Hired Talent list
    Then Verify Previously Hired Talent record
    Then Verify Search Functionality
    Then Verify Show filter functionality
    Then Verify Sort By functionality
    Then Verify Invite To Job CTA functionality


  @ClientProfile
  Scenario: Verify Favorites talent
    When User login with client credentials
    Then Verify Client user is able to navigate to Favorites page
    Then Verify Talent Tab
    Then Verify Packages Tab
    Then Verify Create New List CTA functionality
    Then Verify Invite All To Job CTA functionality



