package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CreateBookPage;

public class CreateBookSteps {
    @Steps
    CreateBookPage createBookPage;

    @Given("I am on the home page")
    public void onTheHomePage() {
        createBookPage.openUrl("https://mini-book-store-fe.vercel.app/");
        Assertions.assertTrue(createBookPage.validateOnHomePage());
    }

    @When("I click on the Create Book Icon")
    public void clickCreateBook() {
        createBookPage.clickCreateIcon();
    }

    @And("I input valid book title")
    public void inputValidTitle() {
        createBookPage.inputTitle("enchanted");
    }

    @And("I input valid author")
    public void inputValidAuthor() {
        createBookPage.inputAuthor("taylor");
    }

    @And("I input valid publish year")
    public void inputValidYear() {
        createBookPage.inputYear("2010");
    }

    @And("I click Save Book button")
    public void clickSaveBook() {
        createBookPage.clickSaveButton();
    }

    @Then("I am on the home page and see success alert {string}")
    public void bookAdded(String message) {
        Assertions.assertTrue(createBookPage.validateOnHomePage());
        Assertions.assertTrue(createBookPage.validateSuccessAlertIsDisplayed());
        Assertions.assertTrue(createBookPage.validateEqualSuccessMessage(message));
    }

    @Then("I can see error alert {string}")
    public void bookFailed(String message) {
        Assertions.assertTrue(createBookPage.validateFailedAlertIsDisplayed());
        Assertions.assertTrue(createBookPage.validateEqualFailedMessage(message));
    }
}