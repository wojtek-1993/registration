package tests;

import org.junit.Assert;
import org.junit.Test;

public class TestRegistration extends TestBase {


    @Test
    public void popTest(){

        loginPage.loginForm("***","***");
        loginPage.clickButton();
        menuPage.clickRefferral();
        listRefferralPage.refferalLinkClick();
        editRefferralPage.selectPayer();
        editRefferralPage.updateButtonClick();

        String url = "https://***";
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
