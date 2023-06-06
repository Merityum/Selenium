package techproed.day05_Xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
     /*
        cssSelector ile xpath arasındaki farklar;
        1- cssSelector de @ işareti ve // işaretleri kullanılmaz
        2- xpath ile index alabiliriz ama cssSelector ile index alamayız
        3- xpath ile text olarak locate edebiliriz ama cssSelector ile bunu yapamayız
        4- cssSelector xpath'e göre daha hızlı çalışır
         */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1. https://the-internet.herokuapp.com/add_remove_elements/ adresine gidilsin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

          // 2. Add Element butonuna basin

        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        Thread.sleep(3000);
        addElementButton.click();


         //3. Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if (deleteButton.isDisplayed()){ //isDisplayed belirtiler nesnenin görünüp görünmediğini kontrol eden method.
            System.out.println("test passed");

        }else System.out.println("test failed");


        //4. Delete tusuna basin

        deleteButton.click();
        Thread.sleep(2000);

       // 5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveElements = driver.findElement(By.cssSelector("h3"));
        if (addRemoveElements.isDisplayed()){
            System.out.println("test passed");
        }else System.out.println("test failed");

        //6.sayfayi kapatma
        driver.close();



    }
}
