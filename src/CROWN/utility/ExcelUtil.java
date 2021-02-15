package CROWN.utility;

import CROWN.Base.TestBase;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

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

    public static void DosendKeysRandomNumberFluentWait(WebDriver driver, String locator, int span, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int resourcetype = rn.nextInt(span) + 1;
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "";
        element.sendKeys(a + resourcetype);
    }

    public static void DosendKeysRandomEmailsFluentWait(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(driver, locator, timeOut);
        Randomstuff randomstuff = new Randomstuff();
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "@gmail.com";
        element.sendKeys(randomstuff.ListRandom() + a);
    }

    public static void DosendKeyRRFluentWait(WebDriver driver, String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement mcj = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        mcj.clear();
        mcj.sendKeys(actualText);
    }

    public static void DoSendKeysFluentWait(WebDriver driver, String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText));
    }

    public static void DosendKeysRandomListwordsFluentWait(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        Randomstuff randomstuff = new Randomstuff();
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.clear();
        String a = "";
        element.sendKeys(a + randomstuff.ListRandom());
    }

    public static void DosendKeyRRWhenReady(WebDriver driver, String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement mcj = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        mcj.clear();
        mcj.sendKeys(actualText);
    }

    public static void DoClearActionclassWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Actions ac = new Actions(driver);
        ac.sendKeys((locat), Keys.DELETE ).perform();
    }

    public static void DoSendKeysWhenReady(WebDriver driver, String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText));
    }

    public static void DoSendKeysWhenReadyEnter(WebDriver driver, String locator, String actualText, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        element.sendKeys(Utility.fetchLocator(actualText) + Keys.ENTER + Keys.ENTER + Keys.ENTER );
    }

    public static void DosendKeysRandomEmailsWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        Randomstuff randomstuff = new Randomstuff();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "@gmail.com";
        element.sendKeys(randomstuff.ListRandom() + a );
    }

    public static void DosendKeysRandomNumberWhenReady(WebDriver driver, String locator, int span, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int resourcetype = rn.nextInt(span) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "";
        element.sendKeys(a + resourcetype);
    }

    public static void DosendKeysRandomListwordsWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        Randomstuff randomstuff = new Randomstuff();
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.clear();
        String a = "";
        element.sendKeys(a + randomstuff.ListRandom());
    }

    //**********************Special ********************
    public static void DoFileUpWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(3200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
        Actions builder = new Actions(driver);
        builder.moveToElement(element).click().build().perform();
    }

    //**********************Clicks ********************
    public static void DoscrolltoViewClickFluentWait(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement ti11 = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", ti11);
        ti11.click();
    }

    public static void DoclickFluentWait(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        DowaitForElementWithFluentWait(driver, locator, timeOut);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        element.click();
    }

    public static void DoclickWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        element.click();
    }

    public static void DoscrolltoViewClickWhenReady(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1100);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement ti11 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", ti11);
        ti11.click();
    }

    //********************drop down utils **************************
    public static void DoSelectValuesByVisibleTextLinkText(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement locat = driver.findElement(By.linkText(Utility.fetchLocator(locator)));
        Select select = new Select(locat);
        select.selectByVisibleText(Utility.fetchLocator(value));
    }

    public static void DoSelectValuesByIndexLinkText(WebDriver driver, String locator, int index, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByIndex(index);
    }

    public static void DoSelectValuesByIndexRandomLinkText(WebDriver driver, String locator, int Range, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int stt = rn.nextInt(Range) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(Utility.fetchLocator(locator)))));        Select select = new Select(locat);
        select.selectByIndex(stt);
    }

    public static void DoSelectValuesByValueLinkText(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByValue(Utility.fetchLocator(value));
    }



    public static void DoSelectValuesByVisibleTextName(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement locat = driver.findElement(By.name(Utility.fetchLocator(locator)));
        Select select = new Select(locat);
        select.selectByVisibleText(Utility.fetchLocator(value));
    }

    public static void DoSelectValuesByIndexName(WebDriver driver, String locator, int index, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByIndex(index);
    }

    public static void DoSelectValuesByIndexRandomName(WebDriver driver, String locator, int Range, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int stt = rn.nextInt(Range) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(Utility.fetchLocator(locator)))));        Select select = new Select(locat);
        select.selectByIndex(stt);
    }

    public static void DoSelectValuesByValueName(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByValue(Utility.fetchLocator(value));
    }



    public static void DoSelectValuesByVisibleText(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement locat = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        Select select = new Select(locat);
        select.selectByVisibleText(Utility.fetchLocator(value));
    }

    public static void DoSelectValuesByIndex(WebDriver driver, String locator, int index, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByIndex(index);
    }

    public static void DoSelectValuesByIndexRandom(WebDriver driver, String locator, int Range, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        SecureRandom rn = new SecureRandom();
        int stt = rn.nextInt(Range) + 1;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));        Select select = new Select(locat);
        select.selectByIndex(stt);
    }

    public static void DoSelectValuesByValue(WebDriver driver, String locator, String value, int timeOut) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(1200);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        WebElement locat = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
        Select select = new Select(locat);
        select.selectByValue(Utility.fetchLocator(value));
    }


    //***************************wait utils ******************************
    public static WebElement DowaitForElementPresent(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
    }

    public static WebElement DowaitForElementToBeVisible(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator(locator)));
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    //******************* FluentWait Utils ***********************
    public static WebElement DowaitForElementWithFluentWaitConcept(WebDriver driver, String locator, int timeOut) throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeOut))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        return wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath(Utility.fetchLocator(locator)))));
    }

    public static WebElement DowaitForElementWithFluentWait(WebDriver driver, final String locator, int timeOut) throws IOException, InterruptedException {
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

