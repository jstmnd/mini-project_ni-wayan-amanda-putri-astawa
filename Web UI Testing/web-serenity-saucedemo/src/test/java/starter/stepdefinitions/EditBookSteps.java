package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.CreateBookPage;
import starter.pages.EditBookPage;
import starter.pages.ShowBookPage;

public class EditBookSteps {
    @Steps
    EditBookPage editBookPage;

    @Steps
    ShowBookPage showBookPage;
    CreateBookPage createBookPage;

    @When("I click on the Edit Book Icon")
    public void clickEditBook() {
        editBookPage.clickEditIcon();
    }

    @And("I input valid edited book title")
    public void inputValidEditedTitle() {
        editBookPage.inputEditedTitle("hunter");
    }

    @And("I input valid edited author")
    public void inputValidEditedAuthor() {
        editBookPage.inputEditedAuthor("kafka");
    }

    @And("I input valid edited publish year")
    public void inputValidEditedYear() {
        editBookPage.inputEditedYear("2023");
    }

    @And("I click Edit Book button")
    public void clickEditBookButton() {
        editBookPage.clickEditButton();
    }

    @Then("I am on the show book page and see see success alert {string}")
    public void onTheShowBookPage(String message) {
        Assertions.assertTrue(showBookPage.validateOnShowBookPage());
        Assertions.assertTrue(createBookPage.validateSuccessAlertIsDisplayed());
        Assertions.assertTrue(createBookPage.validateEqualSuccessMessage(message));
    }
}
