import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_BeforeClassAfterClass {

    static WebDriver driver;

    @BeforeClass //Tüm Class öncesi bir kez calisir
    public static void beforeClass(){

        System.out.println("Before Class");
        driver  = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @AfterClass// tüm class sonrasi bir kez calisir
    public static void afterClass() throws InterruptedException {

        System.out.println("After Class");
        Thread.sleep(3000);
        driver.quit();
    }


    @Test
    public void test01(){
        System.out.println("Test 1");
        driver.get("https://google.com");

    }
    @Test
    public void test02(){
        System.out.println("Test 2");
        driver.get("https://LinkedIn.com");

    }
    @Test
    public void test03(){
        System.out.println("Test 3");
        driver.get("https://youtube.com");

    }
}
