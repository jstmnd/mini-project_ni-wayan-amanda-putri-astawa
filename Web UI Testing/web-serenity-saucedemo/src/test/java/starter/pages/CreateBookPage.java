package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreateBookPage extends PageObject {
    private By homePage() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/h1");
    }
    private By createIcon() {
        return By.cssSelector("#root > div > div.flex.justify-between.items-center > a");
    }

    private By titleField() {
        return By.id("title");
    }

    private By authorField() {
        return By.id("author");
    }

    private By yearField() {
        return By.id("publishYear");
    }

    private By saveButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    private By successAlert() {
        return By.xpath("//*[@id=\"root\"]/div[2]/div/div/div");
    }

    private By failedAlert() {
        return By.xpath("//*[@id=\"root\"]/div[2]/div/div/div");
    }

    @Step
    public boolean validateOnHomePage() {
        return $(homePage()).isDisplayed();
    }

    @Step
    public void clickCreateIcon() {
        $(createIcon()).click();
    }

    @Step
    public void inputTitle(String title) {
        $(titleField()).type(title);
    }

    @Step
    public void inputAuthor(String author) {
        $(authorField()).type(author);
    }

    @Step
    public void inputYear(String year) {
        $(yearField()).type(year);
    }

    @Step
    public void clickSaveButton() {
        $(saveButton()).click();
    }

    @Step
    public boolean validateSuccessAlertIsDisplayed() {
        return $(successAlert()).isDisplayed();
    }

    @Step
    public boolean validateEqualSuccessMessage(String message) {
        return $(failedAlert()).isDisplayed();
    }

    @Step
    public boolean validateFailedAlertIsDisplayed() {
        return $(failedAlert()).isDisplayed();
    }

    @Step
    public boolean validateEqualFailedMessage(String message) {
        return $(failedAlert()).isDisplayed();
    }
}