import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;

public class C08_XPath {
    WebDriver driver;

    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");



    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void absolutedXPathTest(){

        WebElement signUpButton = driver.findElement(By.xpath("/html/body/div[3]/form/p[3]/button"));
        signUpButton.click();


    }


    @Test
    public void relativeXPathNegativeTest() throws InterruptedException {

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("incorrect@hotmail.com");


        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("WrongPassword");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Thread.sleep(3000);
        String errorMessage = driver.findElement(By.xpath("//span[@id='error']")).getText();
        String expectedMessage = "Incorrect username or password";
        assertEquals(expectedMessage, errorMessage );



    }
}
