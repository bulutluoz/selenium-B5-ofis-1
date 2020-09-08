package com.ofis01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//1- SeleniumOfis isimli bir proje olusturun
//2- com.ofis01 isimli bir package olusturun
//3-Test01 isimli bir class olusturun
//4- Gerekli ayarlari yapin ve driver olusturun
//5- https://www.google.com/ adresine gidin
//6- sayfayi tam sayfa yapin
//7- https://www.walmart.com/ adresine gidin
//8- google sayfasina geri donunuz
//9-Sayfayi refresh yapin
//10-Sayfayi kapatin

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
        //5- https://www.google.com/ adresine gidin

        driver.get("https://www.google.com");
        //6- sayfayi tam sayfa yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //7- https://www.walmart.com/ adresine gidin

        driver.navigate().to("https://www.walmart.com");
        Thread.sleep(3000);

        //8- google sayfasina geri donunuz

        driver.navigate().back();
        Thread.sleep(3000);
        //9-Sayfayi refresh yapin

        driver.navigate().refresh();
        Thread.sleep(3000);
        //10-Sayfayi kapatin
        driver.close();


    }
}
