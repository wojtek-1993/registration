package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class ListRefferralPage extends BasePage {

    private final WebDriver driver;

    public ListRefferralPage(WebDriver driver) {super(driver); this.driver = driver;}

    @FindBy(id = "NXT_FormLink")
    private WebElement refferralLink;

    public ListRefferralPage refferalLinkClick(){

        waitForElementToBeClickable(refferralLink);
        click(refferralLink);
        return this;
    }
}
