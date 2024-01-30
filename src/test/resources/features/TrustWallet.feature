@smoke
Feature: Kodif Chatbot Widget interactions on TrustWallet page

Background:
    Given user on the Trust Wallet support page "url"

  Scenario: Verify Chatbot is initialized and welcome message is displayed
    When chatbot is initialized
    Then User should see a greeting message
    #Then Verify "Hello!" text is displayed

#  Scenario: user is trying to interact with the chatbot agent
#    When the user ask to talk with agent and use correct email
#    And the chatbot will ask to select the issue and provide More, Other option buttons
#    And user clicks Other option
#    And user selects sub-category issue and provide more detail
#    Then user select yes or no and the conversation will end
