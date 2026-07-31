package auto4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class NotificationMessagesPage {
    private WebDriver driver;

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
    }

    private By link = By.linkText("Click here");
    private By notificationText = By.id("flash");

    public NotificationMessagesPage clickLink()
    {
        driver.findElement(link).click();
        return this;
    }

    public NotificationMessagesPage assertNotificationIsNotExist()
    {
        Assert.assertEquals(driver.findElement(notificationText).getText(), "Action unsuccesful, please try again", "Notification message is present");

        return this;
    }
}