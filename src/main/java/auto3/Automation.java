package auto3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Automation {

    private WebDriver driver;

    public Automation(WebDriver driver) {
        this.driver = driver;
    }

    private By firstExampleLink = By.partialLinkText("Example 1");
    private By secondExampleLink = By.partialLinkText("Example 2");
    private By contentHeader = By.xpath("content");
    public Automation clickFirstExample() {
        driver.findElement(firstExampleLink).click();
        return this;
    }

    public Automation assertOnPageContent() {
        String content = driver.findElement(contentHeader).getText();
        Assert.assertEquals(content, "Dynamic Loading");
        return this;
    }
}