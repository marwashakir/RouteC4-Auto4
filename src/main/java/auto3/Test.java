package auto3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {

    private WebDriver driver;
    private WebDriverWait wait;
    public Test(WebDriver driver) throws Exception {
        this.driver = driver;

        // Implicit Wait
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // Locators
    private By startButton = By.id("start");
    private By finishText = By.id("finish");
    private By loadingBar = By.id("loading");

    public Test clickStartButton() {
        driver.findElement(startButton).click();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
        return this;
    }

}
