package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid {

    static WebDriver driver;
    public static void main(String[] args)throws MalformedURLException {

        //driver=new RemoteWebDriver(new URL("http://192.168.0.101:4444"),new ChormeOptions());

        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
