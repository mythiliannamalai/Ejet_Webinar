package pages.RegisterWebsiteLateral;

import basePackage.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;

public class Reg_Submit extends BaseClass {
    @FindBy(id ="deftsbtn")
    WebElement btn_submit;

    public Reg_Submit(WebDriver driver) throws IOException {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void click_enable_EnterButton() throws InterruptedException, AWTException {
        String classValue = btn_submit.getAttribute("class");
        Thread.sleep(3000);
        btn_submit.click();
        System.out.println(classValue);

    }
    public void click_disable_EnterButton() throws InterruptedException, AWTException {
        JavascriptExecutor jsexe = (JavascriptExecutor)driver;
        jsexe.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
//        String classValue = btn_submit.getAttribute("class");
        btn_submit.click();


    }


}

