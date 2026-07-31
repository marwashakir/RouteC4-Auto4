package auto4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    private By paragraph = By.className("jscroll-added");

    public void scrollToParagraph(int index)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        String script = "window.scrollBy(0, document.body.scrollHeight);";

        while(getNumberOfParagraph() < index)
        {
            js.executeScript(script);
        }
    }

    public int getNumberOfParagraph()
    {
        return driver.findElements(paragraph).size(); //number of paragraphs
    }

}