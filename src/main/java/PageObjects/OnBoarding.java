package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import static javax.swing.text.html.CSS.getAttribute;

public class OnBoarding extends Utils {

    protected By _sayChallenge1 = By.xpath("//*[@class=\"blocklyDraggable\"]");
    protected By _getAnotherPower = By.xpath("//*[@class=\"button button--primary style-scope kano-reward-modal\"]");
    protected By _sayInScottish = By.xpath("//*[@class=\"blocklyDraggable\"]");

    protected By _anyWhere = By.xpath("//*[@id='svg' and @class='style-scope kano-blockly']" +
                                      "/*[@class='blocklyWorkspace']/*[@class='blocklyBlockCanvas']" +
                                      "/*[@class='blocklyDraggable' and @transform='translate(235,306)']");

    protected By _anywhereFireworks = By.xpath("//*[@id='svg' and @class='style-scope kano-blockly']" +
                                                "/*[@class='blocklyWorkspace']/*[@class='blocklyBlockCanvas']" +
                                                "/*[@class='blocklyDraggable' and @transform='translate(335,206)']");

    public void goThroughOnboardingFlow() throws AWTException {

        //in first challenge join both puzzle
        WebElement challenge1 = driver.findElement(_sayChallenge1);
        new Actions(driver).clickAndHold(challenge1).moveByOffset(50,0)
                           .release(challenge1).perform();

        //click on Get Another Power
        driver.findElement(_getAnotherPower).click();

        //in second challenge join both puzzle (Say in Scottish + You now have Superpowers!)
        WebElement challenge2 = driver.findElement(_sayInScottish);
        new Actions(driver).clickAndHold(challenge2).moveByOffset(80,0)
                           .release(challenge2).perform();


        //click on Get Another Power
        driver.findElement(_getAnotherPower).click();

        //in third challenge first join two puzzle (anywhere + fireworks at)
       WebElement challenge3A = driver.findElement(_anyWhere);
        new Actions(driver).clickAndHold(challenge3A).moveByOffset(200,-100)
                           .release(challenge3A).perform();


        //in third challenge now join already combined puzzle with last remaining puzzle (anywhere-fireworks at + repeat 10 times)
        WebElement challenge3B = driver.findElement(_anywhereFireworks);
        new Actions(driver).clickAndHold(challenge3B).moveByOffset(-130,-70)
                           .release(challenge3B).perform();
    }


}
