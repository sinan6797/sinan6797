import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class C06_AssertionTest {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://clarusway.com");

    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    //Go to Clarusway
    @Test
    public void test01UrlTest() {
        String url= driver.getCurrentUrl();//Actual Result
        boolean isContain= url.contains("clarusway");
        assertTrue(isContain);



    }


    @Test
    public void test02TitleTest(){
        //TEst if the title does not contain Facebook
        String title = driver.getTitle();
        title.contains("Facebook");
        boolean isContain = title.contains("Facebook");
        Assert.assertFalse(isContain);


    }

    @Test
    public void test03UrlTest(){
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://clarusway.com/";
        assertEquals("Url did not match", expectedUrl,actualUrl);



    }


}
