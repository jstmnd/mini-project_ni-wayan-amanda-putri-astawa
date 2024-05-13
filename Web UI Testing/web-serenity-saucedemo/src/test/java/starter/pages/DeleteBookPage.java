package starter.pages;

import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class DeleteBookPage extends PageObject  {
    private By deleteIcon() {
        return By.cssSelector("#root > div > table > tbody > tr:nth-child(24) > td:nth-child(5) > div > a:nth-child(3)");
    }

    private By yesButton() {
        return By.xpath("//*[@id=\"root\"]/div/div[2]/button");
    }

    @Step
    public void clickDeleteIcon() {
        $(deleteIcon()).click();
    }

    @Step
    public void clickYesButton() {
        $(yesButton()).click();
    }
}
