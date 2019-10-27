package TestTD;

import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuOptionView;

public class SmokeTest extends MobileAPI {
    HomePage homePage;
    LoginPage loginPage;
    MenuOptionView menuOptionView;

    @BeforeMethod
    public void init(){
        homePage= PageFactory.initElements(appiumDriver,HomePage.class);
        loginPage=PageFactory.initElements(appiumDriver,LoginPage.class);
        menuOptionView=PageFactory.initElements(appiumDriver,MenuOptionView.class);
    }
    @Test(enabled = false)
    public void testUI(){
        homePage.UIvalidations();
    }
    @Test(enabled = false)
    public void validateClickAccount(){
            homePage.clickAccount();
    }
    @Test(enabled = false)
    public void validateClickTransfer(){
        homePage.clickTransfer();
    }
    @Test(enabled = false)
    public void validateClickDeposit(){
        homePage.clickDeposit();
    }
    @Test(enabled = false)
    public void validateClickSendMoney(){
        homePage.clickSendMoney();
    }
    @Test(enabled = false)
    public void login(){
        homePage.clickAccount();
        loginPage.fillUpDate("RandomTest","abd1234");
    }
    @Test(enabled = false)
    public void validateContactUs(){
        homePage.clickOnContactUs();
        homePage.validateCustomerService();
    }
    @Test(enabled = false)
    public void swipeTest(){
        homePage.scrollHomepage();
    }
    @Test(enabled = false)
    public void validateMenuBar(){
        menuOptionView.menuBarDisplayed();
    }
    @Test(enabled = false)
    public void validateMenuBarListView(){
        menuOptionView.menuBarDisplayed();
        menuOptionView.menuBarClickable();
    }
    @Test(enabled = false)
    public void validateTdBankLogo(){
        homePage.TdBankLogo();
    }
    @Test
    public void validateNavigatingToProducts(){
        homePage.scrollHomepage();
        homePage.viewProducts();
    }
}
