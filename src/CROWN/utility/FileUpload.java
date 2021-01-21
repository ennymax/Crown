package CROWN.utility;

import CROWN.Base.TestBase;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class FileUpload extends TestBase {

    public void UploadCarouselBanner(WebDriver driver) throws IOException, InterruptedException, AWTException {

        String fileAbsolutePath = System.getProperty("user.dir") + "\\Config\\cicodimg.jpg";
        StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

        try {
            //Robot Class
            Robot robot = new Robot();
            //Keyboard Action : CTRL+V

            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            Thread.sleep(2500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Keyboard Action : Enter
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println("An Error Occur but Test will continue");
        }
    }


    public void UploadXLSX1(WebDriver driver) throws IOException, InterruptedException, AWTException {

        String fileAbsolutePath = System.getProperty("user.dir") + "\\Config\\customer_template1.xlsx";
        StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

        try {
            //Robot Class
            Robot robot = new Robot();
            //Keyboard Action : CTRL+V
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            Thread.sleep(2500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Keyboard Action : Enter
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println("An Error Occur but Test will continue");
        }
    }

    public void UploadFileImage3MB(WebDriver driver) throws IOException, InterruptedException, AWTException {

        String fileAbsolutePath = System.getProperty("user.dir") + "\\Config\\cicodkb.jpg";
        StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

        try {
            //Robot Class
            Robot robot = new Robot();
            //Keyboard Action : CTRL+V
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            Thread.sleep(1000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Keyboard Action : Enter
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println("An Error Occur but Test will continue");
        }
        test.log(Status.PASS, "Profile Picture Of Resource Uploaded Successfully");
    }


    public void UploadXLSX(WebDriver driver) throws IOException, InterruptedException, AWTException {

        String fileAbsolutePath = System.getProperty("user.dir") + "\\Config\\product_template.xlsx";
        StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

        try {
            //Robot Class
            Robot robot = new Robot();
            //Keyboard Action : CTRL+V
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            Thread.sleep(2500);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Keyboard Action : Enter
            Thread.sleep(2500);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println("An Error Occur but Test will continue");
        }
    }

    public void UploadPDF(WebDriver driver) throws IOException, InterruptedException, AWTException {

        String fileAbsolutePath = "C:\\Users\\Ennymax\\Music\\01 Praises.mp3";
        StringSelection clipBoardPath = new StringSelection(fileAbsolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipBoardPath, null);

        try {
            //Robot Class
            Robot robot = new Robot();
            //Keyboard Action : CTRL+V
            Thread.sleep(5000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            Thread.sleep(5000);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Keyboard Action : Enter
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);

        } catch (StaleElementReferenceException e) {
            System.out.println("An Error Occur but Test will continue");
        }
    }
}
