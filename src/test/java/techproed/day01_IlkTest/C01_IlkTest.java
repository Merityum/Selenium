package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        //Java uygulamalarında sistem özelliklerini ayarlamak için setProperty methodu ile kullanırız.

        System.out.println(System.getProperty("chromeDriver"));
        //getProperty ile "Key" değerini girerek "values" 'ya ulaşabilirim

        WebDriver driver = new ChromeDriver();
        //ChromeDriver türünde yeni web objesi oluşturduk. bu sayede metodlarımızı kullanabilicez mesela (driver.get)
        driver.get("http://techproeducation.com"); //get() methodu ile String olarak girilen ulr'e gideriz.
    }

}
