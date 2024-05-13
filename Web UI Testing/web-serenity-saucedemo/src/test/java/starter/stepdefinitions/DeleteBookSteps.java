package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.pages.DeleteBookPage;

public class DeleteBookSteps {
    @Steps
    DeleteBookPage deleteBookPage;

    @When("I click on the Delete Book Icon")
    public void clickDeleteBook() {
        deleteBookPage.clickDeleteIcon();
    }

    @And("I click yes button")
    public void clickYesButton() {
        deleteBookPage.clickYesButton();
    }
}
