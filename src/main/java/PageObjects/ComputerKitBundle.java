package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ComputerKitBundle extends Utils {

//    private By _productTitle = By.xpath("//div[@class=\"ProductDisplay-main ProductDisplay-mainStyleCkc\"]/div/div/span");
    private By _productTitle = By.xpath("//div[@class=\"ProductDisplay-details\"]/div/span");

//    private By _productPrice = By.xpath(".//*[@id='application']/div[3]/div/div/div/section[1]/div[2]/div/div[1]/div[3]/span[2]");
    private By _productPrice = By.xpath(".//*[@class='ProductDisplay-details']/div[3]/span[2]");

    private By _clickBuyNowComputerKit = By.xpath("//div[@class=\"ProductDisplay-actions\"]/button/span");
    private By _orderElements = By.xpath("//div[@class=\"ProductDisplay-actions\"]");
    private By _clickOrder = By.xpath("//div[@class=\"ProductDisplay-actions\"]/button/span");


    private By _clickBuyNowComputerKitInPopUp = By.xpath("//div[@class=\"DelayedModal\"]/div/div[2]/div[2]/div");
    private By _clickOrderInPopUp = By.xpath("//div[@class=\"DelayedModal-actions\"]/div");

    public String productTitleInComputerKitBundle, productPriceInComputerKitBundle;

    public void computerKitBundleInformationTitleAndPrice(){

        productTitleInComputerKitBundle = getText(_productTitle);
        productTitleInComputerKitBundle = productTitleInComputerKitBundle.replace("\n"," ");
        System.out.println("title==> "+productTitleInComputerKitBundle);

        productPriceInComputerKitBundle = getText(_productPrice);
        System.out.println("price==> "+productPriceInComputerKitBundle);
    }

    public void clickComputerKitBundleOrderNow(){

        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.elementToBeClickable(_clickOrder));
                click(_clickOrder);
    }
    public void clickComputerKitBundleOrderInPopUp(){

        click(_clickOrderInPopUp);
    }
}


