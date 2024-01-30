package com.trustwallet.pages;

import com.microsoft.playwright.*;
import com.trustwallet.utils.WebActions;

public class TrustWalletPage {
    private Page page;
    private BrowserContext context;
    private Frame chatFrame;
    private final FrameLocator chatFrameLocator;
    private final Locator inputField;
    private final Locator submitButton;
    private final Locator greetingMessage;
    private  final Locator hereLink;
    private  final Locator otherBtn;
    private  final Locator moreBtn;
    private  final Locator selectSubCategory;
    private  final Locator subCategoryResponse;

    public TrustWalletPage(Page page) {
        this.page = page;
        this.chatFrameLocator = page.frameLocator("#kodif-chat-widget");
        this.chatFrame = page.frame("#kodif-chat-widget");
        this.inputField = chatFrameLocator.getByPlaceholder("Tell us something...");
        this.submitButton = chatFrameLocator.locator("//div[@class='makeStyles-submitBtn-21']");
        this.greetingMessage = chatFrameLocator.locator("//p[text() = 'What can I help you with today?']");

        this.hereLink = chatFrameLocator.locator("//a[contains(text(),'here')]");
        this.moreBtn = chatFrameLocator.locator("//button[text()='More']");
        this.otherBtn = chatFrameLocator.locator("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(2)");
        this.selectSubCategory = chatFrameLocator.locator("//div/p[contains(text(),'Please select sub-category:')]");
        this.subCategoryResponse = chatFrameLocator.locator("//button[normalize-space()='General/ How To's/ Guides']");

    }
    public void navigateToUrl(String url) {
        this.page.navigate(WebActions.getProperty(url));
    }


    public void waitForLoadState() {
        WebActions.waitUntilElementDisplayed(greetingMessage, 60);
    }

    public ChatbotFrame getChatbotFrame() {
        return new ChatbotFrame(page);
    }

    public boolean isChatbotDisplayed() {
        return inputField.isVisible() &&
               submitButton.isVisible();
    }
    public boolean isGreetingMessageVisible() {
        //return greetingMessage.isVisible();
        return page.frameLocator("#kodif-chat-widget").getByText("What can I help you with today?").isVisible();
    }
//    public boolean isMessageVisible(String message) {
//        return this.chatFrameLocator.textContent().contains(message);
//    }
    public void theUserAskToTalkWithAgentAndUseCorrectEmail() {
    }

}








