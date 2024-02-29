import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C13_DynamicXpath {



    private static WebDriver driver;


    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

    @Test
    public void dynamicXpath() throws InterruptedException {

        //go to Facebook
        driver.get("https://facebook.com");
        Thread.sleep(3000);



        //Enter email
        driver.findElement(By.id("email")).sendKeys("johndoe@gmail.com");

        //Enter password
        driver.findElement(By.id("pass")).sendKeys("123");

        //Click on login/Use Dynamic Xpath)
        //driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5_')]")).click();
        driver.findElement(By.xpath("//button[contains(@id, 'u_0_5_')]")).click();

        //create new account
        driver.findElement(By.xpath("//a[.='Create new account']")).click();





    }
}
