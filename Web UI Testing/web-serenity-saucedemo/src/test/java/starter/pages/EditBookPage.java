package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditBookPage extends PageObject {
    private By editIcon() {
        return By.xpath("//*[@id=\"root\"]/div/table/tbody/tr[1]/td[5]/div/a[2]");
    }

    private By editedTitleField() {
        return By.xpath("//*[@id=\"title\"]");
    }

    private By editedAuthorField() {
        return By.id("author");
    }

    private By editedYearField() {
        return By.id("publishYear");
    }

    private By editButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    @Step
    public void clickEditIcon() {
        $(editIcon()).click();
    }

    @Step
    public void inputEditedTitle(String title) {
        $(editedTitleField()).type(title);
    }

    @Step
    public void inputEditedAuthor(String author) {
        $(editedAuthorField()).type(author);
    }

    @Step
    public void inputEditedYear(String year) {
        $(editedYearField()).type(year);
    }

    @Step
    public void clickEditButton() {
        $(editButton()).click();
    }
}
