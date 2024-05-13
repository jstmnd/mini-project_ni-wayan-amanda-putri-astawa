package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ViewBookPage extends PageObject {
    private By tableButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/button[1]");
    }

    private By tableView() {
        return By.xpath("//*[@id=\"root\"]/div/table");
    }

    private By cardButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[1]/button[2]");
    }

    private By cardView() {
        return By.cssSelector("#root > div > div.grid.sm\\:grid-cols-2.lg\\:grid-cols-3.xl\\:grid-cols-4");
    }

    @Step
    public void clickTableButton() {
        $(tableButton()).click();
    }

    @Step
    public boolean validateOnTableView() {
        return $(tableView()).isDisplayed();
    }

    @Step
    public void clickCardButton() {
        $(cardButton()).click();
    }

    @Step
    public boolean validateOnCardView() {
        return $(cardView()).isDisplayed();
    }
}
