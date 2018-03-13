package KanoMeProj;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.awt.*;


public class TestSuite extends BaseTest {

    @Test
    public void m1(){


    }


@Test
public void addAComputerKitBundleAndCheckThatItIsCorrectlyInBasketWithCorrectInformation(){
        //loading homepage
        homePage.navigateToKanoMeHomepage();

        //change country to US
        homePage.changeCountryFromHomepage("UK");

        try {
        homePage.clickContinueToUKStorePopUp();
        } catch (Exception e){}


        //click on Computer Kit Bundle
        homePage.clickOnComputerKitBundleFromHomepage();

        //get text of product title and price
        computerKitBundle.computerKitBundleInformationTitleAndPrice();

        //click on order
        computerKitBundle.clickComputerKitBundleOrderNow();

        //click on order in pop up
        computerKitBundle.clickComputerKitBundleOrderInPopUp();

        //get text of product title and price from Basket
        cartPage.computerBundleKitTitleAndPriceInCart();

        //Assert product title
//        Assert.assertEquals(computerKitBundle.productTitleInComputerKitBundle, cartPage.productTitleInCart, "Product's title is not matching in Baseket");
        Assert.assertTrue(cartPage.productTitleInCart.contains("Complete"));

        //Assert product price
        Assert.assertEquals(computerKitBundle.productPriceInComputerKitBundle, cartPage.productPriceInCart, "Product's price is not matching in Baseket");
}

@Test
public void changeCountryAndAddAComputerKitBundleAndCheckThatItIsCorrectlyInBasketWithCorrectInformation(){
    //loading homepage
    homePage.navigateToKanoMeHomepage();

    //change country to US
    homePage.changeCountryFromHomepage("US");

    try {
        homePage.clickContinueToUKStorePopUp();
    } catch (Exception e){}

    //click on Computer Kit Bundle
    homePage.clickOnComputerKitBundleFromHomepageUS();

    //get text of product title and price
    computerKitBundle.computerKitBundleInformationTitleAndPrice();

    try {
        homePage.clickContinueToUKStorePopUp();
    } catch (Exception e){}

    //click on Buy Now
    computerKitBundle.clickComputerKitBundleOrderNow();

    //get text of product title and price from Basket
    cartPage.computerBundleKitTitleAndPriceInCart();

    //Assert product title
    Assert.assertEquals(computerKitBundle.productTitleInComputerKitBundle, cartPage.productTitleInCart, "Product's title is not matching in Baseket");

    //Assert product price
    Assert.assertEquals(computerKitBundle.productPriceInComputerKitBundle, cartPage.productPriceInCart, "Product's price is not matching in Baseket");

}

@Test
public void inWorldKanoMeProjectsCheckTheHeaderMenuIsCorrectWithWorldMakeShop(){

    //loading World Kano Me Homepage
    worldKanoHomePage.navigateToWorldKanoMeProjectsHomepage();

    //get text of Header Menus
    worldKanoHomePage.getTextOfHeaderMenus();

    //Assert text of menus
    Assert.assertTrue(worldKanoHomePage.headerMenu.contains("Make") &&
                          worldKanoHomePage.headerMenu.contains("learn") &&
                          worldKanoHomePage.headerMenu.contains("play"),
                         "Menus in header are not correct");

}

@Test
public void inWorldKanoMeProjectsCheckTheFooterMenuIsCorrectWithConnectedKanosLinesOfCodeCreationsShared(){
    //loading World Kano Me Homepage
   worldKanoHomePage.navigateToWorldKanoMeProjectsHomepage();

    //get text of Header Menus
    worldKanoHomePage.getTextofFooterMenus();

        //Assert text of menus
        Assert.assertTrue(worldKanoHomePage.footerMenu.contains("Connected Kanos") &&
                        worldKanoHomePage.footerMenu.contains("Lines of code") &&
                        worldKanoHomePage.footerMenu.contains("Creations shared"),
                       "Menus in footer are not correct");
}

@Test
public void usingWorldKanoMeClickTheKanoGivesYouSuperpowersAndGoThroughOnboardingFlow() throws AWTException {

    //loading World Kano Me Homepage
    worldKanoHomePage.navigateToWorldKanoMeSuperPowerHomepage();

    //click on I want Superpower
    worldKanoHomePage.clickOnIWantSuperPower();

    //Go Through Onboarding Flow
    onBoarding.goThroughOnboardingFlow();

}
}
