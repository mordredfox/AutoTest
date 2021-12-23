package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MainPage;
import test.BaseDriver;

public class MainSteps extends BaseDriver {

    @Before
    public void Init() {
        start();
    }

    @When("I go to the {string} application page")
    public void iGoToTheApplicationPage(String page) {
       main.goTo();
    }

    @Then("The left-side bar elements is displayed correctly")
    public void theLeftSideBarElementsIsDisplayedCorrectly() {
       MainPage.dropdownElements.isDisplayed();
       MainPage.dropdownContainers.isDisplayed();
       MainPage.dropdownMedia.isDisplayed();
       MainPage.dropdownText.isDisplayed();
       MainPage.dropdownOther.isDisplayed();
    }

    @And("The right-side bar elements is displayed correctly")
    public void theRightSideBarElementsIsDisplayedCorrectly() {
        MainPage.dropdownParameters.isDisplayed();
    }

    @And("The {string}, {string}, {string} buttons are displayed correctly")
    public void theButtonsAreDisplayedCorrectly(String arg0, String arg1, String arg2) {
        MainPage.buttonCanvas.isDisplayed();
        MainPage.buttonHtml.isDisplayed();
        MainPage.buttonCss.isDisplayed();
        MainPage.buttonCanvas.isEnabled();
        MainPage.buttonHtml.isEnabled();
        MainPage.buttonCss.isEnabled();
    }

    @And("The {string}, {string} icons are displayed correctly")
    public void theIconsAreDisplayedCorrectly(String arg0, String arg1) {
        MainPage.buttonClean.isDisplayed();
        MainPage.buttonDownload.isDisplayed();
        MainPage.buttonClean.isEnabled();
        MainPage.buttonDownload.isEnabled();
    }

    @And("The main workspace is displayed correctly")
    public void theMainWorkspaceIsDisplayedCorrectly() {
        new PendingException();
    }

    @After
    public void Finish() {
        driver.close();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String button) {
        switch (button) {
            case "canvas":
                MainPage.buttonCanvas.click();
                break;
            case "html":
                MainPage.buttonHtml.click();
                break;
        }
    }

    @Then("The {string} area is displayed correctly")
    public void theAreaIsDisplayedCorrectly(String area) {
        switch (area){
            case "canvas":
                MainPage.areaCanvas.isDisplayed();
                break;
            case "html":
                MainPage.areaHtml.isDisplayed();
                break;
        }
    }

    @And("I see empty block for any elements")
    public void iSeeEmptyBlockForAnyElements() {
        new PendingException();
    }

    @And("I see the default html-body text")
    public void iSeeTheDefaultHtmlBodyText() {
        new PendingException();
    }
}
