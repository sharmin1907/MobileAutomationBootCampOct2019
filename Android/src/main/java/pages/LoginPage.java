package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginPage extends MobileAPI {
    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userField;

    @FindBy(xpath = "//android.widget.EditText[@text='Password']")
    WebElement passField;
    @FindBy(xpath = "//android.widget.Button[@text='Log in']")
    WebElement login;
    public void fillUpDate(String userName,String passWord) {
        sleepFor(4);
        userField.sendKeys(userName);
        TestLogger.log("userName entered");
        passField.sendKeys(passWord);
        TestLogger.log("password entered");
        login.click();
        sleepFor(5);
    }

}
