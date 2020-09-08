package com.ofis01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {
    public static void main(String[] args) {
        //Test Case 2
        //1-Test02 isimli bir class olusturun
        //2- https://www.walmart.com/ adresine gidin
        //3- Browseri tam sayfa yapin
        //4-Sayfayi “refresh” yapin
        //5- Sayfa basliginin “Save” ifadesi icerdigini control edin
        //6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz
        //7- URL in walmart.com icerdigini control edin
        //8-Sayfayi kapatin

        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.walmart.com");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Save” ifadesi icerdigini control edin

        String aktuelSayfaBasligi=driver.getTitle();
        String arananKelime="Save";

        if (aktuelSayfaBasligi.contains(arananKelime)){
            System.out.println("Sayfa basligi : '" + arananKelime + "' iceriyor. Test PASS");
        }   else{
            System.out.println("FAILED");
            System.out.println("Sayfa basligi : " + aktuelSayfaBasligi + " '" + arananKelime + "' icermiyor");
        }

        //6-Sayfa basliginin “Walmart.com | Save Money.Live Better” a esit oldugunu control ediniz

        String beklenenSayfaBasligi = "Walmart.com | Save Money.Live Better";

        if (aktuelSayfaBasligi.equals(beklenenSayfaBasligi)){
            System.out.println("Test Pass. Aktuel ve beklenen sayfa basliklari esit");
        } else {
            System.out.println("FAILED");
            System.out.println("Beklenen sayfa basligi : " + beklenenSayfaBasligi);
            System.out.println("Aktuel Sayfa Basligi : " + aktuelSayfaBasligi);
        }
        //7- URL in walmart.com icerdigini control edin

        String aktuelURL= driver.getCurrentUrl();
        String arananKelimeURL= "walmart.com";

        if (aktuelURL.contains(arananKelimeURL)){
            System.out.println("PASS . Aktuel URL '" + arananKelimeURL +"' iceriyor");
        } else {
            System.out.println("FAILED");
            System.out.println("Aktuel URL : " + aktuelURL + " '" + arananKelimeURL + "' icermiyor");
        }

    driver.close();
    }
}
