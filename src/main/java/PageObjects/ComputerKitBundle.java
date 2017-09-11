package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;

public class ComputerKitBundle extends Utils {

    private By _productTitle = By.xpath("//div[@class=\"BundleDisplay-details\"]/h2");
    private By _productPrice = By.xpath("//div[@class=\"BundleDisplay-price\"]/div/span[2]");
    private By _clickBuyNowComputerKit = By.id("BundleDisplay-actionPrimary--kano-complete");

    public String productTitleInComputerKitBundle, productPriceInComputerKitBundle;

    public void computerKitBundleInformationTitleAndPrice(){

        productTitleInComputerKitBundle = getText(_productTitle);
        System.out.println(productTitleInComputerKitBundle);

        productPriceInComputerKitBundle = getText(_productPrice);
        System.out.println(productPriceInComputerKitBundle);
    }

    public void clickComputerKitBundleBuyNow(){

        myClick(_clickBuyNowComputerKit);
    }
}
