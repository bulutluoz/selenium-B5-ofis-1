package com.ofis01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test03 {

    //1-Test03 isimli bir class olusturun





    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //2- https://www.walmart.com/ adresine gidin
        driver.get("https://www.walmart.com");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-”Nutella” icin arama yapiniz
        WebElement aramaTextKutusu = driver.findElement(By.id("global-search-input"));
        String arananUrun ="Nutella";

        aramaTextKutusu.sendKeys(arananUrun, Keys.ENTER);
        //5- Kac sonuc bulundugunuresult-summary-container
        WebElement sonucYazisi = driver.findElement(By.className("result-summary-container"));
        System.out.println(sonucYazisi.getText());

        // sonucu Nutella icin bulunan sonuc sayisi : 57 results
        // 1 - 40
        //1 to 40
        //of 57 results
        // substring(baslangic indexi)
        System.out.println(arananUrun+ " icin bulunan sonuc sayisi : " + sonucYazisi.getText().substring(sonucYazisi.getText().indexOf("of")+3));

        //6-Wallmart ana sayfaya geri donun
        driver.navigate().back();
        Thread.sleep(3000);
        //7-Sayfayi kapatin
        driver.close();
    }

}
