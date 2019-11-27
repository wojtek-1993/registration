package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.Actions.click;
import static utils.Actions.sendKeys;

public class LoginPage extends BasePage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {super (driver); this.driver = driver;}

    @FindBy(className = "gwt-TextBox")
    private WebElement usernameInput;

    @FindBy(className = "gwt-PasswordTextBox")
    private WebElement passwordInput;

    @FindBy(className = "gwt-Button")
    private WebElement buttonInput;


    public LoginPage loginForm(String username, String password) {

        sendKeys(usernameInput, username);
        sendKeys(passwordInput, password);
        return this;

    }

    public LoginPage clickButton(){

        click(buttonInput);
        return this;

    }

}
