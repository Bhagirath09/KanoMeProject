package KanoMeProj;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;

public class Utils extends BasePage {

    public static void myClick(By by) {
        driver.findElement(by).click();
    }


    //Get text method
    public static String getText(By by){
        String text = driver.findElement(by).getText();
        return text;
    }

    //scroll page up or down (up is minus i.e. -250)
    public static void scrollPage(int x, int y){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy("+x+","+y+")", "");
    }

    //Handle alert if presented
    public static void ifAlertIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 5 /*timeout in seconds*/);
        if (wait.until(ExpectedConditions.alertIsPresent()) !=null) {driver.switchTo().alert().dismiss();
        System.out.println("alert was present");
        }
        else
        {
            System.out.println("alert was not present");
        }
    }

    public static void captureScreenShot(WebDriver ldriver){
        // Take screenshot and store as a file format
        File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile method
            FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
        } catch (IOException e)

        {
            System.out.println(e.getMessage());
        }
    }

    public static void tearDown(ITestResult result)
    {
        // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus())
        {
            try
            {// Create refernce of TakesScreenshot
                TakesScreenshot ts=(TakesScreenshot)driver;

                // Call method to capture screenshot
                File source=ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));

                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        // close application
        driver.quit();
    }
}
