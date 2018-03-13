package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WorldKanoHomePage extends Utils {

    private By _headerMenuElement = By.id("primary-nav-items");
    private By _footerMenuElement = By.xpath("//div[@class=\"stats style-scope kw-app\"]/kw-stat-card/div/div/p");
    private By _iWantSuperPowerElement = By.xpath("//button[@class='style-scope kw-view-start']");

    StringBuilder storage = new StringBuilder();

    public String headerMenu, footerMenu;

    public void navigateToWorldKanoMeProjectsHomepage(){
        driver.get("https://world.kano.me/projects");
    }

    public void navigateToWorldKanoMeSuperPowerHomepage(){
        driver.get("https://world.kano.me");
    }

    public void clickOnIWantSuperPower(){
        click(_iWantSuperPowerElement);
    }

    public void getTextOfHeaderMenus(){

        List<WebElement> elements = driver.findElements(_headerMenuElement);

        for (WebElement e : elements) {
            storage.append(e.getText());
        }
        headerMenu = storage.toString();
        System.out.println(headerMenu);

    }


    public void getTextofFooterMenus(){
        List<WebElement> elements = driver.findElements(_footerMenuElement);

        for (WebElement e : elements) {
            storage.append(e.getText());
        }
        footerMenu = storage.toString();
        System.out.println(footerMenu);
    }
}
