package CROWN.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

public class ClickAll {

    WebDriver driver;

    public ClickAll(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAll(WebDriver driver, String locator) throws IOException, AWTException, InterruptedException {
        List<WebElement> checkBoxList = driver.findElements(By.className(Utility.fetchLocator(locator)));
        checkBoxList.forEach(ele -> ele.click());
    }
}
