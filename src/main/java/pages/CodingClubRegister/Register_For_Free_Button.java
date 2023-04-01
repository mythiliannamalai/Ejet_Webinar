package pages.CodingClubRegister;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class Register_For_Free_Button extends BaseClass {
    @FindBy(id="poptsbtn")
    WebElement btn_room;
    public Register_For_Free_Button(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void click_enable_Button() throws InterruptedException, AWTException {
        if(!btn_room.isDisplayed()){
            JavascriptExecutor jsexe = (JavascriptExecutor)driver;
            jsexe.executeScript("window.scrollBy(0,500)");
        }
        String classValue = btn_room.getAttribute("class");
        Thread.sleep(3000);
        btn_room.click();
        System.out.println(classValue);

    }
    public void click_disable_Button() throws InterruptedException, AWTException {

        JavascriptExecutor jsexe = (JavascriptExecutor)driver;
        jsexe.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        String classValue = btn_room.getAttribute("class");
        btn_room.click();
        System.out.println(classValue);

    }


}