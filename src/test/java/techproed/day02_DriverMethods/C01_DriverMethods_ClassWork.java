package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Sayfa başlağının Amazon içerdiğini test edelim
        String actualtitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualtitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //URL'in http://www.amazon.com olduğunu test edelim.
        String actualUrl= driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/";
        if (actualUrl.contains(expectedURL)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed :" +actualUrl);

        //Sayfayi kapatalim
        driver.close();//Browser'ı kapatır
        //driver.quit();--->Birden fazla browser varsa hepsini kapatır.

    }
}
