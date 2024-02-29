import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_JUnit {
    @Test
    public void test01(){

        //Create driver object
        WebDriver driver = new ChromeDriver();

        //Mamimize window
        driver.manage().window().maximize();

        //Got to Google
        driver.get("https://www.google.de");

        //Close Window
        driver.close();


    }

    @Test
    public void test02(){
        //Create driver object
        WebDriver driver = new ChromeDriver();

        //Mamimize window
        driver.manage().window().maximize();

        //Got to Clarusway
        driver.get("https://www.Clarusway.com/");

        //Close Window
        driver.close();







    }

    @Test
    public void test03(){
        //Create driver object
        WebDriver driver = new ChromeDriver();

        //Mamimize window
        driver.manage().window().maximize();

        //Got to Google
        driver.get("https://www.Facebook.com");

        //Close Window
        driver.close();







    }



}
