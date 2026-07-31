package auto4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JsAlertPage {
    private final WebDriver driver;

    public JsAlertPage(WebDriver driver) {
        this.driver = driver;
    }


    private By results = By.id("result");

    //dynamic locator using String Format
    /*
    Use this dynamic locator to hold all alerts buttons
     */

    int index;
    String xpathTemplate = "//ul/li[%d]/button";

    //method to handle dynamic locator
    public void clickButtonByIndex(int index)
    {
        driver.findElement(By.xpath(String.format(xpathTemplate, index))).click();
    }

    //methods
    private void clickAlertButton()
    {
        clickButtonByIndex(1);
    }

    private void clickConfirmButton()
    {
        clickButtonByIndex(2);
    }

    private void clickPromptButton()
    {
        clickButtonByIndex(3);
    }

    public JsAlertPage clickOnOkButton()
    {
        clickAlertButton();
        driver.switchTo().alert().accept();
        return this;
    }

    public JsAlertPage clickOnCancelButton()
    {
        clickConfirmButton();
        driver.switchTo().alert().dismiss();
        return this;
    }

    public JsAlertPage alertSetText(String value)
    {
        clickPromptButton();
        driver.switchTo().alert().sendKeys(value);
        driver.switchTo().alert().accept();
        return this;
    }

    //assertions
    public JsAlertPage assertOnTextInput(String expectedText)
    {
        Assert.assertEquals(driver.findElement(results).getText(), expectedText, "bla bla bla");
        return this;
    }
}