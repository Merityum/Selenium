package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_relativeLocators {
    public static void main(String[] args) throws InterruptedException {
        /*
        Benzer özelliklere sahip webelementler için relative locator kullanabiliriz
        SYNTAX;
        driver.findElement(with(By.tagname).below().above().to_left_of().to_right_of().near())
        gibi
        methotlar ile benzer özelliklere sahip webelementleri locatini almadan o web elemente ulaşabiliriz
         */
        System.setProperty("webdriver.edge.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona gidelim

        driver.get("https://www.amazon.com/");

        //city bike aratalım

        WebElement aramakutusu =driver.findElement(By.xpath("//*[@name='field-keywords']"));
        aramakutusu.sendKeys("city bike", Keys.ENTER);


        //relative locator kullanarak hybrid bikes altındaki elemente tıklayalım

        WebElement adultElement = driver.findElement(By.xpath("(//*[@class='a-list-item'])[11]"));
        WebElement completeCruiser = driver.findElement(with(By.tagName("a")).below(adultElement));
        WebElement mountainBikes = driver.findElement(with(By.tagName("a")).below(completeCruiser));
        mountainBikes.click();


       //sayfayı kapat
       //driver.close();





    }
}
