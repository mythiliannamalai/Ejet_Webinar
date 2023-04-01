package Register_Website_Lateral_Test;

import basePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.RegisterWebsiteLateral.Experience_Field;

import java.awt.*;
import java.io.IOException;

public class Experience_Field_Test extends BaseClass {

    Experience_Field experience;

    public Experience_Field_Test() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization(prop.getProperty("RegisterWebsiteLateral"));
        experience = new Experience_Field(driver);
    }
    @Test
    public void select_None() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("None"));
        Assert.assertEquals(msg,"None");
    }
    @Test
    public void select_Zero_To_Six_Month() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("Zero_To_Six_Month"));
        Assert.assertEquals(msg,"0 to 6 months");
    }
    @Test
    public void select_Seven_To_Twelve_Month() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("Seven_To_Twelve_Month"));
        Assert.assertEquals(msg,"7 to 12 months");
    }
    @Test
    public void select_One_To_Two_Year() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("One_To_Two_Year"));
        Assert.assertEquals(msg,"1 - 2 Years");
    }
    @Test
    public void select_Two_To_Three_Year() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("Two_To_Three_Year"));
        Assert.assertEquals(msg,"2 - 3 Years");
    }
    @Test
    public void select_Above_Three_Year() throws InterruptedException, AWTException {
        String msg=experience.experience_Year(prop.getProperty("Above_Three_Year"));
        Assert.assertEquals(msg,"3+ Years");
    }
    @Test
    public void not_select_passOut_Year() throws InterruptedException, AWTException {
        String msg = experience.empty_Value();
        Assert.assertEquals(msg,"Experience(Years) Required");
    }
}
