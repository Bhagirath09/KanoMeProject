package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;

public class CartPage extends Utils {

//    private By _productTitleInCart = By.xpath("//div[@class=\"CartPage-itemInfo\"]/h3/a");
    private By _productTitleInCart = By.linkText("Computer Kit Bundle");

    private By _productPriceInCart = By.xpath("//td[@class=\"CartPage-tableCell--price\"]/div");

    public String productTitleInCart, productPriceInCart;

    public void computerBundleKitTitleAndPriceInCart(){

        productTitleInCart = getText(_productTitleInCart);
        System.out.println(productTitleInCart);

        productPriceInCart = getText(_productPriceInCart);
        productPriceInCart = productPriceInCart.substring(1);
        System.out.println(productPriceInCart);

    }
}
