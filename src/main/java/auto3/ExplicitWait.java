package auto3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ExplicitWait {

    private WebDriver driver;
    private WebDriverWait wait;

    public ExplicitWait(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By startButton = By.id("start");
    private By finishText = By.id("finish");
    private By loadingBar = By.id("loading");

    public ExplicitWait clickStartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        return this;
    }

    public ExplicitWait waitForLoadingToDisappear() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
        return this;
    }

    public ExplicitWait assertFinishText() {
        WebElement finish =
                wait.until(ExpectedConditions.visibilityOfElementLocated(finishText));

        Assert.assertEquals(finish.getText(), "Hello World!");
        return this;
    }
}
