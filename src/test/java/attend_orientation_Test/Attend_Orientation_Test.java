package attend_orientation_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.attend_orientation.Attend_Orientation;
import pages.webinar_registration.Enter_Room_Button;
import pages.webinar_registration.Ph_Num_Field;

import java.awt.*;
import java.io.IOException;

public class Attend_Orientation_Test extends BaseClass {

    Attend_Orientation attend;
    Ph_Num_Field phone;
    Enter_Room_Button enter_room;

    public Attend_Orientation_Test() throws IOException {
        super();
    }
    @BeforeMethod
    public void setup() throws IOException {
        initialization(prop.getProperty("Orientation_Url"));
        attend = new Attend_Orientation(driver);
        phone = new Ph_Num_Field(driver);
        enter_room = new Enter_Room_Button(driver);
    }
    @Test
    public void start_Broadcast_Test() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        boolean text = attend.start_Broadcast();
        Assert.assertTrue(text);
    }

@Test
    public void request_To_Speak_And_Cancelling_Request() throws InterruptedException {
        boolean text1 = attend.request_To_Speak();
        Assert.assertTrue(text1);
        Thread.sleep(3000);
        boolean text2 = attend.cancel_request();
        Assert.assertTrue(text2);
    }
    @Test
    public void user_Send_Msg_To_Everyone_Test() throws InterruptedException {
        String text = attend.user_Send_Msg_To_Everyone(prop.getProperty("Msg"));
        Assert.assertEquals(text,prop.getProperty("Msg"));
    }
    @Test
    public void user_Send_Msg_To_AdminOnly_Test() throws InterruptedException {
        String text = attend.user_Send_Msg_To_AdminOnly(prop.getProperty("Msg"));
        Assert.assertEquals(text,prop.getProperty("Msg"));
    }

}
