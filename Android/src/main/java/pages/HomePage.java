package pages;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class HomePage extends MobileAPI {
    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement accounts;
    @FindBy(xpath = "//android.widget.Button[@text='TRANSFER']")
    WebElement transfer;
    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    WebElement deposit;
    @FindBy(xpath = "//android.widget.Button[@text='SEND MONEY']")
    WebElement sendMoney;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement product;
    @FindBy(xpath = "//android.widget.TextView[@text='Contact us']")
    WebElement contactUs;
    @FindBy(xpath = "//android.widget.TextView[@text='LIVE CUSTOMER SERVICE 24/7']")
    WebElement customerService;
    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.tdbank:id/action_bar_icon']")
    WebElement logo;
    @FindBy(xpath = "//android.widget.TextView[@text='Products']")
    WebElement products;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.tdbank:id/action_bar_title']")
    WebElement viewProducts;
    SoftAssert softAssert=new SoftAssert();

    public void UIvalidations(){
        sleepFor(10);
        //SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(accounts.isDisplayed(),true,"accounts isn't displayed");
        softAssert.assertEquals(transfer.isDisplayed(),true,"transfer isn't displayed");
        softAssert.assertEquals(deposit.isDisplayed(),true,"deposit isn't displayed");
        softAssert.assertEquals(sendMoney.isDisplayed(),true,"sendMoney isn't displayed");
        softAssert.assertAll();
    }
    public void TdBankLogo(){
        softAssert.assertEquals(logo.isDisplayed(),true,"TD Bank logo isn't displayed");
    }
    public void clickAccount(){
        sleepFor(10);
        accounts.click();
    }
    public void clickTransfer(){
        sleepFor(10);
        transfer.click();
    }
    public void clickDeposit(){
        sleepFor(10);
        deposit.click();
    }
    public void clickSendMoney(){
        sleepFor(10);
        sendMoney.click();
    }
    //contact us click and validate
    public void clickOnContactUs(){
        contactUs.click();
    }
    public void validateCustomerService(){
        softAssert.assertEquals(customerService.isDisplayed(),true,"Customer service isn't displayed");
    }
    //Scroll homepage
    public void scrollHomepage(){
        sleepFor(5);
        functionSwipe("up",200,200);
        sleepFor(5);
    }
    public void viewProducts(){
        sleepFor(5);
        functionSwipe("up",200,200);
        sleepFor(5);
        products.click();
        softAssert.assertEquals(viewProducts.isDisplayed(),true,"Products page isn't displayed");
    }


}
