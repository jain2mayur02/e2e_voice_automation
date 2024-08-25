@AIStudio
Feature: Validate AI Studio Functionality

  Background: Open Main URL
    Given User Open Home Page


  Scenario: Validate Non AI Studio Capability Functionality
    When User login with client credentials
    Then Verify AI Voice section is not displayed on Profile page for Non AI talent users


  Scenario: Validate AI Studio Capability Functionality
    When User login with AI user credentials
    Then Verify AI Voice section is displayed on Profile page for AI talent users
    Then Verify client user able to navigate to AI Studio page via Talent profile page
    Then Verify client user able to navigate to AI Studio page via Sub Nav
    Then Verify Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the Error Message for Project Name field in Welcome to AI Studio modal Category Initial Selection Updates
    Then Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category Initial Selection Updates


  Scenario: Validate Studio page via talent profile
    When User login with AI user credentials
    Then Verify that client user able to navigate to AI Studio page via Talent profile page
    Then Verify Welcome to AI Studio modal Category Initial Selection Updates via AI Talent profile page
    Then Verify the functionality of Confirm button by selecting category in Welcome to AI Studio modal Category via AI Talent profile page
    Then Verify the Error Message for Project Name field in Welcome to AI Studio modal Category via AI Talent profile page
    Then Verify the functionality of Confirm button by selecting category and entering valid project name in Welcome to AI Studio modal Category via AI Talent profile page


  Scenario: Validate Welcome Modal Go to Drafts cta
    When User login with client credentials
    Then Verify Go to Drafts button is not displayed in welcome modal if client account does not have at least 1 or more AI job in draft or done status
    When User re login with AI user credentials
    Then Verify Go to Drafts button is displayed in welcome modal if client account have at least 1 or more AI job in draft or done status


  Scenario: Validate UI Page
    When User login with AI user credentials
    Then Verify the UI in studio page via AI Talent profile page

  Scenario: Validate Top Navigation functionality
    When User login with AI user credentials
    Then Verify by clicking on Voices logo
    Then Verify user able to Save the AI studio by clicking on Voices logo button Save and Exit button
    Then Verify by clicking on Exit button
    Then Verify user able to Save the AI studio by clicking on Exit button Save and Exit button
    Then Verify Save & Exit modal is not displayed if user clicks on exit button

  Scenario: Validate Text Block functionality
    When User login with AI user credentials
    Then Confirm text block is displayed with default script
    Then Confirm if there is only one text block move up down and delete buttons should be disabled
    Then Verify user able to play Audio player within text block
    Then Verify Word count within text block
    Then Verify user should not able to play Audio player if text block does not have any words
    Then Verify error message is displayed and audio player is not clickable if user enters dirty word filter within text block single text block
    Then Confirm Error Message gets cleared if user remove the dirty word filter
    Then Verify error message is displayed and audio player is not clickable if user enters restriction word filter within text block single text block
    Then Confirm Error Message gets cleared if user remove the restricted word filter
    Then Confirm user able to add multiple text block
    Then Confirm if there is more than one text block move up down and delete buttons should be enabled
    Then Verify Move up icon within text block
    Then Verify Move down icon within text block
    Then Verify error message is displayed and audio player is not clickable if user enters dirty word filter within text block multiple text block
    Then Verify error message is displayed and audio player is not clickable if user enters restriction word filter within text block multiple text block
    Then Confirm user able to delete text block
    Then Verify user should not able to add more than one fifty words in single text block


  Scenario: Validate Speed Slider functionality
    When User login with AI user credentials
    Then Confirm Default speed should be 1x
    Then Verify Speed adjustment for single text block
    Then Verify Speed adjustment for multiple text block
    Then Confirm User able to adjust speed zero 75x
    Then Confirm User able to adjust speed Onex
    Then Confirm User able to adjust speed One 25x
    Then Confirm User able to adjust speed One 5x
    Then Confirm User able to adjust speed One 75x
    Then Confirm User able to adjust speed Twox
    Then Confirm User able to adjust speed Twox to One 25x
    Then Confirm User able to adjust speed One 5x to Zero 75x
    Then Confirm User able to adjust speed One x to One 5x
    Then Confirm User able to adjust speed Zero 75x to Twox
    Then Confirm User able to adjust speed One 5x to One 5x


  Scenario: Validate Edit Voice Clone functionality
    When User login with AI user credentials
    Then Verify Price Per word is displayed correctly for Broadcast within AI Studio
    Then Verify Price Per word is displayed correctly for Non-Broadcast within AI Studio
    Then Verify Price Per word is displayed correctly if user edit Category Non broadcast to Non broadcast
    Then Verify Price Per word is displayed correctly if user edit Category Non-broadcast to broadcast
    Then Verify Price Per word is displayed correctly if user edit Category broadcast to Non broadcast
    Then Verify Price Per word is displayed correctly if user edit Category Broadcast to broadcast
    Then Verify Price Per word is displayed correctly if user edit Voice Clone David to Rachael Broadcast
    Then Verify Price Per word is displayed correctly if user edit Voice Clone David to Rachael Non Broadcast


  Scenario: Validate Save draft functionality
    When User login with AI user credentials
    Then Verify Save Draft button is disabled if AI studio has zero words
    Then Verify Save Draft button is disabled if text block contains error message dirty word
    Then Verify Save Draft button is disabled if text block contains error message restriction word
    Then Verify Functionality of Save Draft button
    Then Verify Functionality of Save Draft button by editing the AI Studio
    Then Verify 404 Error if user tries to access deleted draft AI studio
    Then Verify Functionality of Edit Draft button
    Then Verify AI Studio is saved as Draft My Home Jobs All Jobs Draft Draft tab within AI Studio
    Then Verify by deleting the Draft AI studio via Drafts tab within AI Studio
    Then Verify by deleting the Draft AI studio via Drafts tab within Jobs page Draft tab
    Then Verify Search functionality within AI Studio Draft Tab
    Then Verify Sort functionality within AI Studio Draft Tab
    Then Verify Ai studio is saved as Draft if user navigates to check out page and land back on AI Studio page
    Then Verify user lands on Home page if user clicks on Exit button if AI studio is already saved
    Then Verify Exit modal shows up if user clicks on Exit button if AI Studio is not saved
    Then Verify AI Studio is saved as Draft and if user clicks on Save and Exit button within AI studio Exit modal
    Then Verify AI Studio is not saved as Draft and if user clicks on Discard changes button within AI studio Exit modal
    Then Verify AI Studio is not saved as Draft and if user clicks on close icon within AI studio Exit modal
    Then Verify Exit modal shows up if user clicks on Voices logo if AI Studio is not saved Voices logo
    Then Verify AI Studio is saved as Draft and if user clicks on Save and Exit button within AI studio Exit modal Voices logo
    Then Verify AI Studio is not saved as Draft and if user clicks on Discard changes button within AI studio Exit modal Voices logo
    Then Verify AI Studio is not saved as Draft and if user clicks on close icon within AI studio Exit modal Voices logo
    Then Verify AI Drafts job should not be displayed in Job form public job

  Scenario: Validate Price functionality
    When User login with AI user credentials
    Then Verify the Price should be 0 if word count is 0
    Then Verify the Price for the default script for Broadcast category
    Then Verify Price gets increased if user add the words to the default script within text block for Broadcast category
    Then Verify Price gets increased if user add the words to the text block2 for Broadcast category
    Then Verify Price gets decreased if user removes words from the default script within text block for Broadcast category
    Then Verify Price gets decreased if user add the words and remove the words and delete the text block for Broadcast category
    Then Verify the Price for the default script for Non Broadcast category
    Then Verify Price gets increased if user add the words to the default script within text block for Non Broadcast category
    Then Verify Price gets increased if user add the words to the text block2 for Non Broadcast category
    Then Verify Price gets decreased if user removes words from the default script within text block for Non Broadcast category
    Then Verify Price gets decreased if user add the words and remove the words and delete the text block for Non Broadcast category
    Then Verify the price of AI studio when user selects different voice clone Non Broadcast
    Then Verify the price of AI studio when user selects different voice clone Broadcast
    Then Verify the price of AI studio if user edits the category from broadcast to non broadcast
    Then Verify the price of AI studio if user edits the category from broadcast to broadcast
    Then Verify the price of AI studio if user edits the category from non broadcast to broadcast
    Then Verify the price of AI studio if user edits the category from non broadcast to non broadcast
    Then Verify the price calculation is working as expected based on broadcast price per word total word count
    Then Verify the price calculation is working as expected based on non broadcast price per word total word count

  Scenario: Validate Word count functionality
    When User login with AI user credentials
    Then Verify Top nav word count matches with the default text block script
    Then Verify Top Nav words count matches if user adds words to default script
    Then Verify Top Nav words count matches if user remove few words from default script
    Then Verify Top Nav word count by removing entire default script
    Then Verify Top Nav word count by removing entire default script and adding entire new script
    Then Verify Top Nav word count by removing entire default script and by removing few words for newly added script
    Then Verify Word count within text block with default script
    Then Verify Word count within text block by adding additional words to default script
    Then Verify Word count within text block by removing few words from default script
    Then Verify word count within text block by removing entire default script
    Then Verify word count within text block by removing entire default script and adding entire new script
    Then Verify word count within text block by removing entire default script and by removing few words for newly added script
    Then Verify user should able to enter 150 words within text block
    Then Verify text block should not contain more than 150 words










