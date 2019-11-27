package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class MenuPage extends BasePage {

    private final WebDriver driver; 

    public MenuPage(WebDriver driver) {super (driver); this.driver = driver; }

    @FindBy(css = "#newUserMenu a[href=\"/***/***.php\"]")
    private WebElement refferralInput;

    public MenuPage clickRefferral(){ 

        waitForElementToBeClickable(refferralInput);
        click(refferralInput);
        return this;
    }
}
