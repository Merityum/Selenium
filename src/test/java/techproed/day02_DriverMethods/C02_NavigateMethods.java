package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Tehproeducation sayfasına gidelim
        driver.navigate().to("https://techproeducation.com"); //get() methodu ile aynı mantıkta çalışır. get methoduda kullanabbiliriz navigate.to yerine
        Thread.sleep(3000);//Java kodlarını bekletmek için kullanılan method.

        //sonra amazon sayfasına gidelim
        driver.navigate().to("http://amazon.com");

        //amazon sayfasının baslıgını yazdıralım
        System.out.println("Amazon Sayfa başlığı : " +driver.getTitle());

        //Techpro sayfasına geri dönelim
        driver.navigate().back();

        //sayfa başlığını yazdıralım
        System.out.println("Techpro sayfa başlığı: " +driver.getTitle());

        //Amazon sayfasına tekrar gidip url'i yazdıralım
        driver.navigate().forward();
        System.out.println("Amazon url :" +driver.getCurrentUrl());

        //amazon sayfasındayken sayfayı yenileyelim
        driver.navigate().refresh();
        //sayfayi kapatalim
        driver.close();
    }
}
