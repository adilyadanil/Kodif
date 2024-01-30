package com.trustwallet.stepDefinitions;


import com.trustwallet.factory.DriverFactory;
import com.trustwallet.pages.ChatbotFrame;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.trustwallet.pages.TrustWalletPage;


public class TrustWalletSteps {
    TrustWalletPage trustWalletPage = new TrustWalletPage(DriverFactory.getPage());

    @Given("user on the Trust Wallet support page {string}")
    public void userOnTheTrustWalletSupportPage(String url) {
        trustWalletPage.navigateToUrl(url);
        trustWalletPage.waitForLoadState();
    }

    @When("chatbot is initialized")
    public void verifyChatbotWidget() {
        Assert.assertTrue(trustWalletPage.isChatbotDisplayed());
    }

    @Then("User should see a greeting message")
    public void verifyGreetingMessage() {
        Assert.assertTrue(trustWalletPage.isGreetingMessageVisible());
    }

//    @Then("Verify {string} text is displayed")
//    public void verifyTextIsDisplayed(String message) {
//        Assert.assertTrue(trustWalletPage.isMessageVisible(message));
//    }
    @When("the user ask to talk with agent and use correct email")
    public void theUserAskToTalkWithAgentAndUseCorrectEmail() {
    }

    @And("the chatbot will ask to select the issue and provide More, Other option buttons")
    public void theChatbotWillAskToSelectTheIssueAndProvideMoreOtherOptionButtons() {
    }

    @And("user clicks Other option")
    public void userClicksOtherOption() {
    }

    @And("user selects sub-category issue and provide more detail")
    public void userSelectsSubCategoryIssueAndProvideMoreDetail() {
    }

    @Then("user select yes or no and the conversation will end")
    public void userSelectYesOrNoAndTheConversationWillEnd() {
    }


}
