package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class MenuOptionView extends MobileAPI {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Show Menu']")
    WebElement menuBar;
    @FindBy(xpath = "//android.widget.TextView[@text='Home']")
    WebElement home;
    SoftAssert softAssert=new SoftAssert();
    public void menuBarDisplayed(){
        softAssert.assertEquals(menuBar.isDisplayed(),true,"MenuBar isn't displayed");
    }
    public void menuBarClickable(){
        menuBar.click();
        sleepFor(5);
        softAssert.assertEquals(home.isDisplayed(),true,"Home menu isn't displayed");
    }
}
