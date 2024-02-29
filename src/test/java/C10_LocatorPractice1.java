import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C10_LocatorPractice1 {

    private static WebDriver driver;
    WebElement searchBox;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }


    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();

    }

    @Test
    public void test1() {
        driver.get("https://google.com");
        searchBox.sendKeys("Green Mile");



    }

    @Test
    public void test2() {

        driver.get("https://google.com");
        searchBox.sendKeys("Premonition");



    }@Test
    public void test3() {

        driver.get("https://google.com");
        searchBox.sendKeys("The Curious Case of Benjamin Button");




    }
    @Before
    public void beforeMethod(){
        driver.get("https://google.com");
        driver.manage().getCookies();
    }

    @After
    public void afterMethod() throws InterruptedException {
        searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
        Thread.sleep(3000);
        String result = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println("result = " + result);
    }

}