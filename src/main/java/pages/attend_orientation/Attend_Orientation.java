package pages.attend_orientation;

import basePackage.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Attend_Orientation extends BaseClass {
    @FindBy(xpath = "//img[@class='js_handle_reconnect_btn w-100 h-100']")
    WebElement btn_Start;
//    @FindBy(partialLinkText = " Please book your slot")
//    WebElement link_book_spot;
    @FindBy(xpath="//i[@class='wji-dots_horizontal ml-2']")
    WebElement msg_To_option;
    @FindBy(xpath="//li[@class='v-dropdown-item selected']]")
    WebElement msg_everybody;
    @FindBy(xpath="//li[normalize-space()='To admin only']")
    WebElement msg_admin;
    @FindBy(xpath = "//input[@placeholder='Type your comment...']")
    WebElement chatbox;
    @FindBy(xpath = "//span[contains(text(),'Request to speak')]")
    WebElement req_speak;
    @FindBy(xpath = "//span[contains(text(),'Cancel request')]")
    WebElement cancel_req;
    @FindBy(xpath = "//span[contains(text(),'Q&A only')]")
    WebElement qa_only;
    @FindBy(xpath = "//span[contains(text(),'Chat')]")
    WebElement chat_only;


public Attend_Orientation(WebDriver driver)throws IOException {
    this.driver=driver;
    PageFactory.initElements(driver, this);
}

public boolean start_Broadcast() throws InterruptedException {
    Thread.sleep(3000);
    boolean startbtn = btn_Start.isDisplayed();
    btn_Start.click();
    return startbtn;
}

public boolean request_To_Speak() throws InterruptedException {
    Thread.sleep(3000);
    boolean msg = req_speak.isDisplayed();
    req_speak.click();
    return msg;
    }

    public boolean cancel_request() throws InterruptedException {
        Thread.sleep(3000);
        boolean msg = cancel_req.isDisplayed();
        cancel_req.click();
        return msg;
    }
public String user_Send_Msg_To_Everyone(String msg) throws InterruptedException {
    Thread.sleep(3000);
    chat_only.click();
    msg_To_option.click();
    msg_everybody.click();
    chatbox.click();
    chatbox.sendKeys(msg);
    chatbox.sendKeys(Keys.ENTER);
    return msg;
}
    public String user_Send_Msg_To_AdminOnly(String msg) throws InterruptedException {
        Thread.sleep(3000);
        chat_only.click();
        msg_To_option.click();
        msg_admin.click();
        chatbox.click();
        chatbox.sendKeys(msg);
        chatbox.sendKeys(Keys.ENTER);
        return msg;
    }
    public void user_Send_Question_To_Everyone(String msg) throws InterruptedException {
        Thread.sleep(3000);
        qa_only.click();
        msg_To_option.click();
        msg_everybody.click();
        chatbox.click();
        chatbox.sendKeys(msg);
        chatbox.sendKeys(Keys.ENTER);
    }
    public void user_Send_Question_To_AdminOnly(String msg) throws InterruptedException {
        Thread.sleep(3000);
        qa_only.click();
        msg_To_option.click();
        msg_admin.click();
        chatbox.click();
        chatbox.sendKeys(msg);
        chatbox.sendKeys(Keys.ENTER);
    }
    
}
