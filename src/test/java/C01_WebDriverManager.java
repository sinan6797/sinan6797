import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManager {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();//Selenium 4.6 öncesi direkt olarak Selnium kütüphanesi ile driver objesi olusturalilanimyor

        driver.get("https://www.clarusway.com/");



        driver.quit();
    }
}
