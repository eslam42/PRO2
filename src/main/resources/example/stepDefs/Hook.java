package example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook {

    public static WebDriver drivers = null;

    @Before
    public static void OpenBrowser() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","\\src\\main\\resources\\chromedriver.exe");
            // 2 create mew object from webdriver
            drivers = new ChromeDriver();
            // 3 Navigate to google.com + Maximize screen + Delay closing for 3seconds
            drivers.navigate().to("https://demo.nopcommerce.com/");
            drivers.manage().window().maximize();
            Thread.sleep(2000);
    }
    @After
    public static void closeDriver() throws InterruptedException {
        Thread.sleep(5000);
        drivers.quit();
    }
}
