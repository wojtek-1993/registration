package tests;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.EditRefferralPage;
import pages.ListRefferralPage;
import pages.LoginPage;
import pages.MenuPage;
import utils.WebDriverSingleton;

import java.io.File;

public class TestBase {

    protected WebDriver driver;
    LoginPage loginPage;
    MenuPage menuPage;
    ListRefferralPage listRefferralPage;
    EditRefferralPage editRefferralPage;


    @Before
    public void setUp() {
        driver = WebDriverSingleton.getInstance();
        driver.manage().window().maximize();
        driver.get("https://***.php");
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        listRefferralPage = new ListRefferralPage(driver);
        editRefferralPage = new EditRefferralPage(driver);


    }

    @After
    public void quit() throws Exception {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./picture/" + System.currentTimeMillis() + ".png"));

        WebDriverSingleton.quit();
    }
}
