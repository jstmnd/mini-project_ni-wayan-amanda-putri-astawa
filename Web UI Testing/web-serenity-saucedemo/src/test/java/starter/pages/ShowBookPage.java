package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShowBookPage extends PageObject {
    private By title() {
        return By.xpath("//*[@id=\"root\"]/div[1]/h1");
    }

    @Step
    public boolean validateOnShowBookPage() {
        return $(title()).isDisplayed();
    }
}
