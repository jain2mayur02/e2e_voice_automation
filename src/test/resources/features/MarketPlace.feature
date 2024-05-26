@MarketPlace
Feature: Verify the manage packages market place flow

  Background: Open Main URL
    Given User Open Home Page

  Scenario Outline: Verify the create package in market place
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify required fields on Create a Package page
    Then Verify Talent user is able to abandon Package creation
    Then Verify Talent user is able to create Package Overview step "<Package Title>"
      | Category      | Language | Accent | Voice Gender | Voice Age    |
      | Documentaries | Arabic   | Afghan | Male         | Child (5-12) |
    Then Verify Talent user is able to create a Package Pricing step
      | Essential Word | Enhanced Word | Elite Word | Essential Delivery Days | Enhanced Delivery Days | Elite Delivery Days | Essential Revisions | Enhanced Revisions | Elite Revisions | Essential Package Price | Enhanced Package Price | Elite Package Price |
      | Up to 400      | Up to 300     | Up to 200  | 4                       | 3                      | 2                   | 3                   | 2                  | 1               | 100                     | 200                    | 300                 |
    Then Verify Talent user is able to create a Package Description step
    Then Verify Talent user is able to create a Package Media step
    Then Verify Talent user is able to create a Package Requirements step
    Then Verify Talent user is able to create a Package Preview step
    Examples:
      | Package Title                  |
      | AutomationPackagePendingReview |

  Scenario Outline: Verify Talent user is able to edit a 'Draft' Package
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify Talent user is able to edit Draft Package "<DraftPackageName>" "<DraftPackageNewName>"
    Then Verify Talent user is able to delete a Draft Package "<DraftPackageNewName>"
    Then Verify Talent user is able to delete a Pending Review Packages "<PendingPreviewPackageName>"
    Examples:
      | DraftPackageName      | DraftPackageNewName      | PendingPreviewPackageName      |
      | AutomationDemoPackage | AutomationDemoNewPackage | AutomationPackagePendingReview |

  Scenario Outline: Verify Talent user is able to Deactivate, Duplicate and Edit an Approved Package
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify Talent user is able to create Package Overview step "<Package Title>"
      | Category      | Language | Accent | Voice Gender | Voice Age    |
      | Documentaries | Arabic   | Afghan | Male         | Child (5-12) |
    Then Verify Talent user is able to create a Package Pricing step
      | Essential Word | Enhanced Word | Elite Word | Essential Delivery Days | Enhanced Delivery Days | Elite Delivery Days | Essential Revisions | Enhanced Revisions | Elite Revisions | Essential Package Price | Enhanced Package Price | Elite Package Price |
      | Up to 400      | Up to 300     | Up to 200  | 4                       | 3                      | 2                   | 3                   | 2                  | 1               | 100                     | 200                    | 300                 |
    Then Verify Talent user is able to create a Package Description step
    Then Verify Talent user is able to create a Package Media step
    Then Verify Talent user is able to create a Package Requirements step
    Then Verify Talent user is able to create and approve a Package
    Then Verify Talent user is able to Deactivate an Approved Package
    Then Verify Talent user is able to duplicate an Approved Package "<Package Title>"
    Then Verify Talent user is able to edit an Approved Package "<Package Title>" "<Edit Package Title>"
    Examples:
      | Package Title                 | Edit Package Title                |
      | AutomationDemoPackageApproved | EditAutomationDemoPackageApproved |

  Scenario Outline: Verify Talent user is able to delete an Approved Package
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify Talent user is able to create Package Overview step "<Package Title>"
      | Category      | Language | Accent | Voice Gender | Voice Age    |
      | Documentaries | Arabic   | Afghan | Male         | Child (5-12) |
    Then Verify Talent user is able to create a Package Pricing step
      | Essential Word | Enhanced Word | Elite Word | Essential Delivery Days | Enhanced Delivery Days | Elite Delivery Days | Essential Revisions | Enhanced Revisions | Elite Revisions | Essential Package Price | Enhanced Package Price | Elite Package Price |
      | Up to 400      | Up to 300     | Up to 200  | 4                       | 3                      | 2                   | 3                   | 2                  | 1               | 100                     | 200                    | 300                 |
    Then Verify Talent user is able to create a Package Description step
    Then Verify Talent user is able to create a Package Media step
    Then Verify Talent user is able to create a Package Requirements step
    Then Verify Talent user is able to create and approve a Package
    Then Verify Talent user is able to delete an Approved Package "<Package Title>"
    Examples:
      | Package Title               |
      | AutomationDemoPackageDelete |

  Scenario Outline: Verify Talent user is able to view and Accept Awarded Job
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify Talent user is able to create Package Overview step "<Package Title>"
      | Category      | Language | Accent | Voice Gender | Voice Age    |
      | Documentaries | Arabic   | Afghan | Male         | Child (5-12) |
    Then Verify Talent user is able to create a Package Pricing step
      | Essential Word | Enhanced Word | Elite Word | Essential Delivery Days | Enhanced Delivery Days | Elite Delivery Days | Essential Revisions | Enhanced Revisions | Elite Revisions | Essential Package Price | Enhanced Package Price | Elite Package Price |
      | Up to 400      | Up to 300     | Up to 200  | 4                       | 3                      | 2                   | 3                   | 2                  | 1               | 100                     | 200                    | 300                 |
    Then Verify Talent user is able to create a Package Description step
    Then Verify Talent user is able to create a Package Media step
    Then Verify Talent user is able to create a Package Requirements step
    Then Verify Talent user is able to create and approve a Package
    Then User logout from talent prime account
    Then User login with client credentials
    Then User purchase the package from talent user "<Package Title>"
    Then User logout from client account
    And User login with prime user credentials
    Then Verify Talent user is able to view and Accept Awarded Job "<Package Title>"
    Examples:
      | Package Title                |
      | AutomationPackageAcceptAward |

  Scenario Outline: Verify Talent user is able to view and Decline Awarded Job
    And User login with prime user credentials
    Then Verify Talent user is able to navigate to Manage Packages page
    Then Verify Talent user is able to create Package Overview step "<Package Title>"
      | Category      | Language | Accent | Voice Gender | Voice Age    |
      | Documentaries | Arabic   | Afghan | Male         | Child (5-12) |
    Then Verify Talent user is able to create a Package Pricing step
      | Essential Word | Enhanced Word | Elite Word | Essential Delivery Days | Enhanced Delivery Days | Elite Delivery Days | Essential Revisions | Enhanced Revisions | Elite Revisions | Essential Package Price | Enhanced Package Price | Elite Package Price |
      | Up to 400      | Up to 300     | Up to 200  | 4                       | 3                      | 2                   | 3                   | 2                  | 1               | 100                     | 200                    | 300                 |
    Then Verify Talent user is able to create a Package Description step
    Then Verify Talent user is able to create a Package Media step
    Then Verify Talent user is able to create a Package Requirements step
    Then Verify Talent user is able to create and approve a Package
    Then User logout from talent prime account
    Then User login with client credentials
    Then User purchase the package from talent user "<Package Title>"
    Then User logout from client account
    And User login with prime user credentials
    Then Verify Talent user is able to view and Decline Awarded Job "<Package Title>"
    Examples:
      | Package Title                |
      | AutomationPackageDeclinedAward |