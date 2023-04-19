package Experieced_Engineer_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CodingClubRegister.Ph_Num_Field;
import pages.Experieced_Engineer.Experieced_Engineers;

import java.io.IOException;

public class Experieced_Engineers_Test extends BaseClass {

    Experieced_Engineers Exp_Eng;

    public Experieced_Engineers_Test() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization(prop.getProperty("Experieced_Engineer"));
        Exp_Eng = new Experieced_Engineers(driver);
    }
    @Test
    public void click_registration() throws InterruptedException {
        String text = Exp_Eng.click_registration_btn();
        Assert.assertEquals(text,"Welcome To BridgeLabz!");
    }
    @Test
    public void click_our_team(){
        String text = Exp_Eng.click_Our_Team();
        Assert.assertEquals(text,"ABOUT US");
    }
    @Test
    public void click_for_Business() throws InterruptedException {
        String text = Exp_Eng.click_For_Business();
        Assert.assertEquals(text,"Checkout Our Credentials Deck");
    }

}
