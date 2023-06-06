package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //siteye gidis
        driver.get("https://www.amazon.com/");

        //arama kutusna "city bike" yazıp aratma


       /*
       --ARAMA KUTUSU HTML KODLARI

       <
        input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="Search Amazon"
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search Amazon" spellcheck="false"
        >
        */
        WebElement aramakutusu =driver.findElement(By.xpath("//*[@name='field-keywords']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);

        //Hybird Bikes bölümüne tıklatma
        driver.findElement(By.xpath("//*[text()='Hybrid Bikes']")).click(); //xpathexpression kısmını  //*[.='Hybrid Bikes'] olarak da yazabiliriz.

        //sonuc sayisini yazdirma
        WebElement sonucYazisi = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        String [] sonucSayisi = sonucYazisi.getText().split(" ");
        System.out.println("Sonuc Sayisi = " +sonucSayisi[0]);


        //hybridbikes kısmandan sonraki 1.elemente giriş
        WebElement bisikletfeneri = driver.findElement(By.xpath("//h2//a[1]"));
        bisikletfeneri.click();

        //Sayfayı kapatma
        driver.close();

//GENEL KULLANIM
        //driver.findElement(By.xpath(“// * [@type=‘text’]” ));

    }
}
