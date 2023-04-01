package basePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public Properties prop;

    public BaseClass() throws IOException {


        prop = new Properties();
        FileInputStream ip;
        ip = new FileInputStream(
                "src/main/java/config/Webinar.properties");
        prop.load(ip);

    }
    public void  initialization(String url){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        //driver = WebDriverManager.edgedriver().create();
        if(url.equals(prop.getProperty("Reg_Url"))){
            driver.get(prop.getProperty("Reg_Url"));
        }else if (url.equals(prop.getProperty("Orientation_Url"))){
            driver.get(prop.getProperty("Orientation_Url"));
        }else if(url.equals(prop.getProperty("RegistrationInsta"))){
            driver.get(prop.getProperty("RegistrationInsta"));
        }else if(url.equals(prop.getProperty("RegisterWebsiteLateral"))){
            driver.get(prop.getProperty("RegisterWebsiteLateral"));
        }else if(url.equals(prop.getProperty("CodingClubRegisterURL"))){
            driver.get(prop.getProperty("CodingClubRegisterURL"));
        }else if(url.equals(prop.getProperty("CodingClub_Workshop"))){
            driver.get(prop.getProperty("CodingClub_Workshop"));
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
