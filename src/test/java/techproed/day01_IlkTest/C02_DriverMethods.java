package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;

public class C02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//bu sayede driver methodları geldi. örn: driver.getTitle

        driver.get("http://amazon.com");
        //getTitle Sayfa Başlığını verir.
        System.out.println("Amazon Sayfa Başlığı : " +driver.getTitle());//hemen altına yazdığımız için algılıyor. O an hangi site açıksa mantıken onun başlığını getirecek.
        System.out.println("Amazon Actual Url : " +driver.getCurrentUrl());
        String amazonWindowHandle = driver.getWindowHandle();//bu demek değilki her bunu yazdığımda amazonun sitesini handle edecek bu neyin altındaysa o siteyi hande eder.
        System.out.println("Amazın Window Handle Degeri : " +amazonWindowHandle);

        driver.get("http://techproeducation.com");
        System.out.println("Techproeducation Actual Tittle : " +driver.getTitle()); //getTittle başlığı verir.

        //getCurrentUrl() Gidilen sayfanın Url'ini verir.
        System.out.println("Techproed Actual Url :" +driver.getCurrentUrl());

        //getPageSource() Açılan sayfanın kaynak kodlarını verir
        //System.out.println(driver.getPageSource()); yoruma aldım çok fazla çıktı veriyor.

        //getWindoHabdle() Gidilen sayfanın handle değerini(hashKod) verir. Bu handle degerini sayfalar arası geçişi için kullanırız.
        System.out.println("Techpro hande değeri: " +driver.getWindowHandle());  //FA2A98EF8B692509F343ED4C0DD07D2D
        //webelemnt unic olma degeri var.

    }
}
