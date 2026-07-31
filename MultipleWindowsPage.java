package auto4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {

    private WebDriver driver;

    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By linkText = By.linkText("Click Here");

    public MultipleWindowsPage clickLink()
    {
        driver.findElement(linkText).click();
        return this;
    }
}