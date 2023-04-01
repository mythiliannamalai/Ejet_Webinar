package pages.registerInsta.popup_RegisterInsta;

import basePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Submit_Btn extends BaseClass {
    @FindBy(id = "poptsbtn")
    WebElement submit_btn;

    public Submit_Btn(WebDriver driver) throws IOException {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click_Sumbit_Button(){
        submit_btn.click();
    }
}
