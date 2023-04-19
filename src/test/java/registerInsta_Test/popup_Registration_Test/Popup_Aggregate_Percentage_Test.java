package registerInsta_Test.popup_Registration_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.registerInsta.popup_RegisterInsta.Aggregate_Percentage;
import pages.registerInsta.popup_RegisterInsta.Register_By_Popup;

import java.awt.*;
import java.io.IOException;

public class Popup_Aggregate_Percentage_Test extends BaseClass {
    Register_By_Popup reg_popup;
    Aggregate_Percentage aggregate;

    public Popup_Aggregate_Percentage_Test() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization(prop.getProperty("RegistrationInsta"));
        aggregate = new Aggregate_Percentage(driver);
        reg_popup = new Register_By_Popup(driver);
        reg_popup.click_eligibility_Scholarship_btn();
        Thread.sleep(5000);
    }
    @Test
    public void select_Below_Sixty() throws InterruptedException, AWTException {
        String msg=aggregate.aggregate_Per(prop.getProperty("Below_Sixty"));
        Assert.assertEquals(msg,"Below 60%");
    }
    @Test
    public void select_Sixty_To_Seventy() throws InterruptedException, AWTException {
        String msg=aggregate.aggregate_Per(prop.getProperty("Sixty_To_Seventy"));
        Assert.assertEquals(msg,"60% - 70%");
    }
    @Test
    public void select_Above_Seventy() throws InterruptedException, AWTException {
        String msg=aggregate.aggregate_Per(prop.getProperty("Above_Seventy"));
        Assert.assertEquals(msg,"70% and Above");
    }
    @Test
    public void not_select_passOut_Year() throws InterruptedException, AWTException {
        String msg = aggregate.empty_Value();
        Assert.assertEquals(msg,"CGPA Required");
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
