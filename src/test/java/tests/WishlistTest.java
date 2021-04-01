package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static constants.CommonConstants.SIGN_IN_URL;

public class WishlistTest extends BaseTest{
    @Test(groups = "Sasha", description = "Addition Wishlist")
    public void WishlistTest() {
        signInPage.openPage(SIGN_IN_URL);
        signInPage.fillInSignInForm(EMAIL_ADDRESS_RIGHT_SIGN_IN_S, PASSWORD);
        headerPage.clickOnMyWishlist();
        headerPage.inputTextInFieldsNewWishlist(FIELD_NEW_WISHLIST);
        headerPage.clickWishlistButton();
        Assert.assertTrue(headerPage.isNewWishlistNameDisplayed(FIELD_NEW_WISHLIST));
    }
}