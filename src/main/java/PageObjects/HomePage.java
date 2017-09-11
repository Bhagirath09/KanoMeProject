package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _computerKitBundle = By.xpath("//*[@id=\"ButtonLink--30\"]/div");
    private By _computerKitBundleUS = By.xpath("//nav[@id=\"StickyHomeNav\"]/div/div/ul/li[2]/div/a");
    private By _clickOnCountryDropDown = By.xpath("//span[@class=\"region-label style-scope kano-cart\"]");
    private By _clickOnCountryUS = By.xpath("//ul[@class=\"all-regions style-scope kano-cart\"]/li[2]/span");
    private By _closePopUpWhenChangeCountry = By.xpath("//div[@class=\"LocationModal-close\"]");


    public void navigateToKanoMeHomepage(){
        driver.get("https://kano.me");
    }

    //click on computer kit bundle
    public void clickOnComputerKitBundleFromHomepage(){

        scrollPage(0, 250);
        myClick(_computerKitBundle);
    }

    public void clickOnComputerKitBundleFromHomepageUS(){
        scrollPage(0, 250);
        myClick(_computerKitBundleUS);

    }

    public void changeCountryFromHomepage(){

        myClick(_clickOnCountryDropDown);
        myClick(_clickOnCountryUS);
        myClick(_closePopUpWhenChangeCountry);
    }
}
