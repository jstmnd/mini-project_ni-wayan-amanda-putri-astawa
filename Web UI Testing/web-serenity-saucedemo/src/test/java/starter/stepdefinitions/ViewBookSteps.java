package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.ViewBookPage;

public class ViewBookSteps {
    @Steps
    ViewBookPage viewBookPage;

    @When("I click on the Table button")
    public void clickTable() {
        viewBookPage.clickTableButton();
    }

    @Then("I can see the entire list of books in the table")
    public void seeTable() {
        Assertions.assertTrue(viewBookPage.validateOnTableView());
    }

    @When("I click on the Card button")
    public void clickCard() {
        viewBookPage.clickCardButton();
    }

    @Then("I can see the entire list of books in the card")
    public void seeCard() {
        Assertions.assertTrue(viewBookPage.validateOnCardView());
    }
}
