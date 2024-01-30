package com.trustwallet.stepDefinitions;


import com.trustwallet.factory.DriverFactory;
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


    @When("user clicks on Something else button")
    public void userClicksOnSomethingElseButton() {
        trustWalletPage.clickOnSomethingElseButton();
    }
}








