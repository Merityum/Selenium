package techpoed.day07_MavenJUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeAfterClass {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test1() {
        driver.get("https://amazon.com");
    }
    @Test
    public void test2() {
        driver.get("https://techproeducation.com");
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her classtan önce bir kez çalışır");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her classtan sonra bir kez çalışır");
    }
}