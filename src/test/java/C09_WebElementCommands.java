import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

import static org.junit.Assert.assertTrue;

public class C09_WebElementCommands {




    private WebDriver driver;

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
    public void webElementCommands(){
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");


        WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        usernameInput.sendKeys("john_doe");
        passwordInput.sendKeys("123");

        WebElement textArea = driver.findElement(By.xpath("//textarea[@name='comments']"));
        textArea.clear();
        textArea.sendKeys("Hello World");


        WebElement cancelButton = driver.findElement(By.xpath("//input[@type='reset']"));
        boolean isDisplayed = cancelButton.isDisplayed();
        System.out.println("isDisplayed = " + isDisplayed);
        assertTrue(isDisplayed);


    }


}
