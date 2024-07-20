@TalentProfile
Feature: Validate Talent Profile Functionality

  Background: Open Main URL
    Given User Open Home Page


  Scenario: Verify MyHome page for Talent Profile
    When User login with prime user credentials
    Then Verify me drop down option for talent profile
    Then Verify Talent user is able to navigate to My Home page
    Then Verify Project Marketplace Banner
    Then Verify Manual closing of Project Marketplace Banner
    Then Verify Jobs Section
    Then Verify Shortlist Section
    Then Verify Profile Section
    Then Verify Career Section
    Then Verify Customer Support Section

  Scenario: Verify talent account setting for Talent Profile
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Account Settings Page
    Then Verify General Settings
    Then Verify Notifications
    Then Verify SurePay
    Then Verify Membership
    Then Verify Billing History
    Then Verify Change Password


  Scenario: Verify statistics
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Statistics Page
    Then Verify Components in Statistics section
    Then Verify Components in Audition History Section
    Then Verify Components in Demo History section
    Then Verify Helpful Resources


  Scenario: Verify review section
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Reviews Page
    Then Verify Pending Reviews section
    Then Verify Received Compliments section
    Then VerifyMy Reviews section
    Then Verify Leave a Review CTA functionality


  Scenario: Verify Response Template
    When User login with prime user credentials
    Then Verify Client user is able to navigate to Response Templates page
    Then Verify Add Your Live Directed Session Policy banner
    Then Verify User is able to dismiss the Add Your Live Directed Session Policy banner manually
    Then Verify Drag to Reorder functionality
    Then Verify Response Template Record in the list
    Then Verify Down arrow functionality
    Then Verify Up arrow functionality


  Scenario: Validate manage package
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages Page
    Then Verify Draft Tab
    Then Verify Delete Functionality of A Draft Tab record
    Then Verify Search Functionality of A Draft Tab record
    Then Verify Pending Review Tab
    Then Verify Delete Functionality of A Pending Review Tab record
    Then Verify Search Functionality of A Pending Review record
    Then Verify Approved Tab
    Then Verify Deactivate Functionality of Approved Tab record
    Then Verify Activate Functionality of Approved Tab record
    Then Verify Search Functionality of Approved tab record


  Scenario: Validate Edit Profile
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Edit Profile Page
    Then Verify Talent Member Section
    Then Verify File Upload section
    Then Verify Member Container section
    Then Verify View Profile
    Then Verify Personal Info tab
    Then Verify Overview tab
    Then Verify Demos Tab
    Then Verify Each record in Demo Samples list
    Then Verify Add Demo button
    Then Verify Exit Demo button functionality
    Then Verify Cancel button in Add Demo page
    Then Verify Edit Demo button functionality
    Then Verify Cancel button in Edit Demo Page
    Then Verify Delete button in Edit Demo Page
    Then Verify Exit button in Edit Demo Page
    Then Verify Drag To Reorder button functionality
    Then Verify Play button of Demo Sample


  Scenario: Validate Public Profile
    When User login with prime user credentials
    Then Verify Talent user is able to navigate to Edit Profile Page
    Then Verify Navigation to Public Profile page
    Then Verify Profile Top Header
    Then Verify Talent Profile Container
    Then Verify Profile content
    Then Verify Share button
    Then Verify Portfolio tab
    Then Verify About Talent tab
    Then Verify Packages
    Then Verify Demos
    Then Verify Reviews Container
    Then Verify Invite To Job and Message Talent buttons
    Then Verify Past Clients section and Profile Metadata Section
