Feature: Validate Client Profile Functionality

  Background: Open Main URL
    Given User Open Home Page

  @ClientProfile
  Scenario: Verify MyHome page for Client Profile
    When User login with client credentials
    Then Verify Client user is able to navigate to My Home page
    Then Verify Top Talent Home Banner
    Then Verify Manual closing of Top Talent Home Banner
    Then Verify My Jobs Section
    Then Verify My Jobs Draft tab
    Then Verify My Jobs Hiring tab
    Then Verify My Jobs Working tab
    Then Verify My Jobs Done tab
    Then Verify Previously Hired Talent Section
    Then Verify Client Career Section
    Then Verify Customer Support Section

