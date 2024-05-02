package com.solvd.carina.demo.gui.pages;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    private ExtendedWebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    private ExtendedWebElement passwordInput;
    @FindBy(xpath = "//input[@id='login-button']")
    private ExtendedWebElement loginBtn;

    public CatalogPage login(String username, String password){
        usernameInput.type(username);
        passwordInput.type(password);
        loginBtn.click();
        return new CatalogPage(getDriver());
    }
}
