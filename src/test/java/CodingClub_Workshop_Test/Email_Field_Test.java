package CodingClub_Workshop_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CodingClub_Workshop.Email_Field;


import java.awt.*;
import java.io.IOException;

public class Email_Field_Test extends BaseClass {

    Email_Field email;

    public Email_Field_Test() throws IOException {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException {
        initialization(prop.getProperty("CodingClub_Workshop"));
        email = new Email_Field(driver);
    }
    @Test
    public void enter_Valid_EmailId() throws InterruptedException, AWTException {
        boolean msg=email.valid_email_id(prop.getProperty("Valid_EmailId"));
        Assert.assertFalse(msg);
    }
    @Test
    public void enter_EmptyString_EmailId() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(" ");
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Without_UserName() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Without_userName"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_EmailId_With_Space() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Space_Between_UserName"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Valid_Email_After_Space() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(" "+prop.getProperty("Valid_EmailId"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Space_After_EmailId() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Valid_EmailId") + " ");
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Email_Without_Dot() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Email_Without_Dot"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Email_Without_At() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Email_Without_At"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_Email_Without_Dotcom() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Email_Without_DotCom"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void enter_EmailId_Without_AtGmailDotCom() throws InterruptedException, AWTException {
        boolean msg=email.invalid_email_id(prop.getProperty("Email_Username"));
        Assert.assertTrue(msg,"Invalid Email");
    }
    @Test
    public void removing_Valid_Email_From_EmailField() throws InterruptedException, AWTException {
        boolean msg=email.user_remove_emailid_From_Field(prop.getProperty("Valid_EmailId"));
        Assert.assertTrue(msg,"Email Required");
    }
    @Test
    public void removing_Invalid_Email_From_EmailField() throws InterruptedException, AWTException {
        boolean msg=email.user_remove_emailid_From_Field(prop.getProperty("Email_Username"));
        Assert.assertTrue(msg,"Email Required");
    }
//    @AfterTest
//    public void tearDown(){
//        driver.close();
//    }

}