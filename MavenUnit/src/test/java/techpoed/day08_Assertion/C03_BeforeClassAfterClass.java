package techpoed.day08_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeClassAfterClass {
    static WebDriver driver;
    @BeforeClass
    public static void before() throws Exception {//Bir kez çalıştı
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void setUp() throws Exception {//test01 methodundan önce 1 kez çalıştı
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
    }

    @Test
    public void test01() throws InterruptedException {//test01 methodu çalıştı ve browser açık kaldı
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("qa", Keys.ENTER);

    }

    @Test
    public void test02() throws InterruptedException {//yeni bir browser'da test02 methodu çalıştı. Bu method'dan önce before methodu olduğu için önce before çalıştı
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("developer", Keys.ENTER);
    }

    @AfterClass
    public static void tearDown() throws Exception {//en son bir kez AfterClass methodu çalıştığı için son açılan browser kapandı
        driver.close();
    }


}