package com.trustwallet.pages;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.LoadState;

public class ChatbotFrame {
    private Page page;
    private BrowserContext context;
    private final Frame frame;
    private final FrameLocator iframeLocator;

    private final Locator inputField;
    private final Locator submitButton;
    private final Locator greetingMessage;


    public ChatbotFrame(Page page) {
        this.page = page;
        this.iframeLocator = page.frameLocator("kodif-chat-widget");
        this.frame = page.frame("kodif-chat-widget");
        //this.frame = iframeLocator.first().frame();
        this.inputField = frame.getByPlaceholder("Tell us something...");
        this.submitButton = frame.locator("//div[@class='makeStyles-submitBtn-21']");
        this.greetingMessage = frame.locator("text=Hello!");

    }
    public void waitForLoadState() {
        this.frame.waitForLoadState(LoadState.NETWORKIDLE);
        //this.page.waitForSelector(".makeStyles-bubbleContainer-30");
    }
    public boolean isChatbotDisplayed() {
        return inputField.isVisible() &&
                submitButton.isVisible();
    }
    public boolean isGreetingMessageVisible() {
        return greetingMessage.isVisible();
    }
}
