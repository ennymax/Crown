package CROWN.utility;

import CROWN.Base.TestBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import static org.testng.AssertJUnit.assertEquals;

public class ExcelUtil extends TestBase {

    WebDriver driver;

    public ExcelUtil(WebDriver driver) {
        this.driver = driver;
    }

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    static {
        try {
            workbook = new XSSFWorkbook(System.getProperty("user.dir") + "\\Config\\TestData.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String GetCellDataString(String sheetName, int Row, int Column) {
        sheet = workbook.getSheet(sheetName);
        String mm = sheet.getRow(Row).getCell(Column).getStringCellValue();
        return mm;
    }

    public int GetCellDataNumber(String sheetName, int Row, int Column) {
        sheet = workbook.getSheet(sheetName);
        int mm = (int) sheet.getRow(Row).getCell(Column).getNumericCellValue();
        return mm;
    }

    //**********************Send Keys ********************

    public void DosendKeysRandomNumberFluentWait(String locator, int span, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int resourcetype = rn.nextInt(span) + 1;
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "";
        element.sendKeys(a + resourcetype);
    }

    public void DosendKeysRandomEmailsFluentWait(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(locator, timeOut);
        Randomstuff randomstuff = new Randomstuff();
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "@gmail.com";
        element.sendKeys(randomstuff.ListRandom() + a);
    }

    public void DosendKeyRRFluentWait(String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(locator, timeOut);
        WebElement mcj = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        mcj.clear();
        mcj.sendKeys(actualText);
    }

    public void DoSendKeysFluentWait(String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText));
    }

    public void DosendKeysRandomListwordsFluentWait(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        Randomstuff randomstuff = new Randomstuff();
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "";
        element.sendKeys(a + randomstuff.ListRandom());
    }

    public void DosendKeyRRWhenReady(String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement mcj = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        mcj.clear();
        mcj.sendKeys(actualText);
    }

    public void DoClearActionclassWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Actions ac = new Actions(driver);
        ac.sendKeys((locat), Keys.DELETE ).perform();
    }

    public void DoSendKeysWhenReady(String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText));
    }

    public void DoSendKeysWhenReadyEnter(String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText) + Keys.ENTER + Keys.ENTER + Keys.ENTER );
    }

    public void DosendKeysRandomEmailsWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        Randomstuff randomstuff = new Randomstuff();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "@gmail.com";
        element.sendKeys(randomstuff.ListRandom() + a );
    }

    public void DosendKeysRandomNumberWhenReady(String locator, int span, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int resourcetype = rn.nextInt(span) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "";
        element.sendKeys(a + resourcetype);
    }

    public void DosendKeysRandomListwordsWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        Randomstuff randomstuff = new Randomstuff();
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "";
        element.sendKeys(a + randomstuff.ListRandom());
    }

    //**********************Special ********************
    public void DoFileUpWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(3200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click().build().perform();
    }

    public void DoswitchtoframeWhenReady(int frameIndex, int sleepindex ) throws IOException, InterruptedException {
        Thread.sleep(sleepindex);
        driver.switchTo().frame(frameIndex);
    }

    //**********************Clicks ********************

    public void DoscrolltoViewClickFluentWait(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        DowaitForElementWithFluentWait(locator, timeOut);
        WebElement ti11 = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", ti11);
        ti11.click();
    }

    public void DoclickFluentWait(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        DowaitForElementWithFluentWait(locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.click();
    }

    public void DoclickWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.click();
    }

    public void DoscrolltoViewClickWhenReady(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1100);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement ti11 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", ti11);
        ti11.click();
    }

    //**********************Assertion********************
    public void DoAssertEqualWhenReady(String locator, String assertionString, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement msg11 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        assertEquals(assertionString, driver.findElement(By.xpath(Utility.fetchLocator(locator))).getText());
    }

    //********************drop down utils **************************
    public void DoSelectValuesByVisibleText(String locator, String value, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement locat = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        Select select = new Select(locat);
        select.selectByVisibleText(Utility.fetchLocator(value));
    }

    public void DoSelectValuesByIndex(String locator, int index, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByIndex(index);
    }

    public void DoSelectValuesByIndexRandom(String locator, int Range, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int stt = rn.nextInt(Range) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));        Select select = new Select(locat);
        select.selectByIndex(stt);
    }

    public void DoSelectValuesByValue(String locator, String value, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByValue(Utility.fetchLocator(value));
    }

    public String DoGetPageCurrentUrl(int timeOut, String urlValue) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.urlContains(Utility.fetchLocator(urlValue)));
        return driver.getCurrentUrl();
    }

    //***************************wait utils ******************************
    public WebElement DowaitForElementPresent(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
    }

    public WebElement DowaitForElementToBeVisible(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //******************* FluentWait Utils ***********************
    public WebElement DowaitForElementWithFluentWaitConcept(String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
    }

    public WebElement DowaitForElementWithFluentWait(final String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                try {
                    return driver.findElement(By.xpath(Utility.fetchLocator(locator)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        });

        return element;
    }

}
