package registerInsta_Test.popup_Registration_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.registerInsta.popup_RegisterInsta.Education_Qualification;
import pages.registerInsta.popup_RegisterInsta.Register_By_Popup;


import java.awt.*;
import java.io.IOException;

public class Popup_Education_Qualification_Test extends BaseClass {
    Register_By_Popup reg_popup;

    Education_Qualification qualification;

    public Popup_Education_Qualification_Test() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization(prop.getProperty("RegistrationInsta"));
        qualification = new Education_Qualification(driver);
        reg_popup = new Register_By_Popup(driver);
        reg_popup.click_eligibility_Scholarship_btn();
        Thread.sleep(5000);
    }
    @Test
    public void select_Engineering_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_Qualification(prop.getProperty("Engineering_Cs_Or_It"));
        Assert.assertEquals(msg,"Engineering (CS/IT)");
    }
    @Test
    public void select_Engineering_Non_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_Qualification(prop.getProperty("Engineering_Non_Cs_Or_It"));
        Assert.assertEquals(msg,"Engineering (Non IT)");
    }
    @Test
    public void select_Masters_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_Qualification(prop.getProperty("Masters_Cs_Or_It"));
        Assert.assertEquals(msg,"Masters (CS/IT)");
    }
    @Test
    public void select_Masters_Non_Cs_Or_It() throws InterruptedException, AWTException {
        String msg=qualification.eduction_Qualification(prop.getProperty("Masters_Non_Cs_Or_It"));
        Assert.assertEquals(msg,"Masters (Non IT)");
    }
    @Test
    public void select_Other() throws InterruptedException, AWTException {
        String msg=qualification.eduction_Qualification(prop.getProperty("Other"));
        Assert.assertEquals(msg,"Others (Non Engineering and Non MSc/MCA)");
    }
    @Test
    public void not_select_passOut_Year() throws InterruptedException, AWTException {
        String msg = qualification.empty_Value();
        Assert.assertEquals(msg,"Stream Required");
    }
//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
