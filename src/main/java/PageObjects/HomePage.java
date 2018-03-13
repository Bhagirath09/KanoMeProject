package PageObjects;

import KanoMeProj.Utils;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Utils {

    private By _computerKitBundle = By.xpath("//*[@id=\"ButtonLink--34\"]/div");
//    private By _computerKitBundleUS = By.xpath("//nav[@id=\"StickyHomeNav\"]/div/div/ul/li[2]/div/a/div/span");
    private By _computerKitBundleUS = By.linkText("Computer Kit Complete");

    private By _clickOnCountryDropDown = By.xpath("//span[@class=\"ApplicationHeader-regionLabel\"]");
    private By _clickOnCountryUK = By.xpath("//ul[@class=\"ApplicationHeader-allRegions\"]/li/span");
    private By _clickOnCountryUS = By.xpath("//ul[@class=\"ApplicationHeader-allRegions\"]/li[2]/span");
    private By _clickOnCountryEU = By.xpath("//ul[@class=\"ApplicationHeader-allRegions\"]/li[3]/span");
    private By _clickOnCountryROW = By.xpath("//ul[@class=\"ApplicationHeader-allRegions\"]/li[4]/span");
    private By _continueToUK = By.xpath("//div[@class=\"LocationModal-footer\"]/a");
    private By _closePopUpWhenChangeCountry = By.xpath("//div[@class=\"LocationModal-close\"]");


    public void navigateToKanoMeHomepage(){
        driver.get("https://kano.me");
    }

    //click on computer kit bundle
    public void clickOnComputerKitBundleFromHomepage(){

        scrollPage(0, 250);
        click(_computerKitBundle);
    }

    public void clickOnComputerKitBundleFromHomepageUS(){
        scrollPage(0, 250);
        click(_computerKitBundleUS);

    }

    public void changeCountryFromHomepage(String country){

        click(_clickOnCountryDropDown);

        if(country.contains("UK")){
            click(_clickOnCountryUK);
        }
        else if(country.contains("EU")){
            click(_clickOnCountryEU);
        }
        else if(country.contains("US")){
            click(_clickOnCountryUS);
        }
        else if(country.contains("ROW")){
            click(_clickOnCountryROW);
        }
    }

    public void clickContinueToUKStorePopUp(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(_continueToUK));
        click(_continueToUK);
    }
}
