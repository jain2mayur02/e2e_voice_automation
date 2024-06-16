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


  Scenario: Verify Favorites talent
    When User login with client credentials
    Then Verify Client user is able to navigate to Favorites page
    Then Verify Talent Tab
    Then Verify Packages Tab
    Then Verify Create New List CTA functionality
    Then Verify Invite All To Job CTA functionality


  Scenario: Verify Manage Licence for client
    When User login with client credentials
    Then Verify Client user is able to navigate to Manage Licences page
    Then Verify All Licenses Tab
    Then Verify each record in All Licenses Tab
    Then Verify Search Functionality in All Licenses Tab
    Then Verify Show filter Functionality in All Licenses Tab
    Then Verify Sort Functionality in All Licenses Tab
    Then Verify View button Functionality in All Licenses Tab
    Then Verify Get Renewal Quote button Functionality in All Licenses Tab
    Then Verify Quotes Requested Tab
    Then Verify each record in Quotes Requested Tab
#    Then Verify Search Functionality in Quotes Requested Tab
#    Then Verify Show filter Functionality in Quotes Requested Tab
#    Then Verify Sort Functionality in Quotes Requested Tab
    Then Verify Edit Request button Functionality in Quotes Requested Tab
    Then Verify Cancel Request button Functionality in Quotes Requested Tab


  Scenario: Verify Review for client
    When User login with client credentials
    Then Verify Client user is able to navigate to Reviews Page
    Then Verify Pending Reviews section for client
    Then Verify My Reviews section
    Then Verify Leave a Review CTA functionality for client


  @ClientProfile
  Scenario: Verify Billing History for client
    When User login with client credentials
    Then Verify Client user is able to navigate to Billing History page
    Then Verify Billing History list
    Then Verify Each record
#    Then Verify Transaction Details of Unpaid bill
    Then Verify Transaction Details of Paid bill
    Then Verify Date Sort Up and Sort Down functionality
    Then Verify Amount Sort Up and Sort Down functionality
    Then Verify Search functionality for billing history
    Then Verify Download CSV Functionality
    Then Verify Show filter Functionality for billing history
    Then Verify Date filter Functionality
#    Then Verify Pay Now button Functionality
#    Then Verify Add Optional button Functionality
#    Then Verify Back button functionality
    Then Verify Pagination









