package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTest extends BaseTest{

    @Test(groups = "Katia", description = "Sign out of my account")
    public void signOutTest() {
        signInPage.openSignInPage();
        signInPage.fillInEmailAndClickSignInBtn(REGISTERED_EMAIL_ADDRESS, FIELD_PASSWORD);
        headerPage.waitForMyAccountPageOpened();
        headerPage.clickSignOutBtn();
        Assert.assertTrue(myAccountPage.isSignInHeaderButtonShown());
    }
}