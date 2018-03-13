package PageObjects;

import KanoMeProj.Utils;
import org.openqa.selenium.By;

public class CartPage extends Utils {

    private By _productTitleInCart = By.xpath(".//*[@class='CartPage-item']/td[2]/div/h3/a");
    private By _productPriceInCart = By.xpath(".//*[@class='CartPage-item']/td[3]/div");


    public String productTitleInCart, productPriceInCart;

    public void computerBundleKitTitleAndPriceInCart(){

        productTitleInCart = getText(_productTitleInCart);
        System.out.println("cart title==> "+productTitleInCart);

        productPriceInCart = getText(_productPriceInCart);
        System.out.println("cart price==> "+productPriceInCart);

        productPriceInCart = productPriceInCart.substring(1);
        System.out.println("cart price2==> "+productPriceInCart);

    }
}
