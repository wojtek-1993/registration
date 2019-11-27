package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;
import static utils.Actions.waitForElementToBeClickable;

public class EditRefferralPage extends BasePage {

    private final WebDriver driver;

    public EditRefferralPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "nfz_platnik")
    private WebElement nfzPayerInput;

    @FindBy(css = "#nfz_platnik > option[value=\"05\"]")
    private WebElement payerLodzkiRegionalDepartmentNFZ;

    @FindBy(id = "zmien")
    private WebElement updateButton;

    public EditRefferralPage selectPayer() {

        click(nfzPayerInput);
        click(payerLodzkiRegionalDepartmentNFZ);
        return this;
    }

    public EditRefferralPage updateButtonClick() {

        waitForElementToBeClickable(updateButton);
        click(updateButton);
        return this;
    }
}
