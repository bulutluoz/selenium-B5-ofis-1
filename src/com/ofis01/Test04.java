package com.ofis01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {







    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        driver.manage().window().maximize();
        // 2. Signin buttonuna tiklayin
        WebElement signInButonu = driver.findElement(By.id("signin_button"));
        signInButonu.click();

        // 3. Login alanine  “username” yazdirin
        // 4. Password alanine “password” yazdirin
        // 5. Sign in buttonuna tiklayin
        WebElement loginTextKutusu = driver.findElement(By.xpath("//input[@type='text']"));
        loginTextKutusu.sendKeys("username");

        WebElement passwordtextKutusu= driver.findElement(By.id("user_password"));
        passwordtextKutusu.sendKeys("password");
        Thread.sleep(3000);
        WebElement signInButonu2 = driver.findElement(By.name("submit"));
        signInButonu2.click();
        // 6. Pay Bills sayfasina gidin
        //Pay Bills
        WebElement payBillsLinki = driver.findElement(By.linkText("Pay Bills"));
        payBillsLinki.click();
        // 7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        // 8. tarih kismina “2020-09-10”
        // 9. Pay buttonuna tiklayin
        WebElement amauntTextkutusu= driver.findElement(By.id("sp_amount"));
        amauntTextkutusu.sendKeys("200");

        WebElement tarihKutusu = driver.findElement(By.id("sp_date"));
        tarihKutusu.sendKeys("2020-09-10");

        WebElement payButonu = driver.findElement(By.id("pay_saved_payees"));
        payButonu.click();
        // 10. “The payment was successfully submitted.” mesajinin ciktigini control edin
        // <span title="$ 200 payed to payee sprint">The payment was successfully submitted.</span>

        //      //span[@title='$ 200 payed to payee sprint']
        WebElement paraYattiYazisi=driver.findElement(By.xpath("//span[@title='$ 200 payed to payee sprint']"));
        System.out.println(paraYattiYazisi.getText());

        if (paraYattiYazisi.isDisplayed()){
            System.out.println("Para yazisi testi PASS");
        } else System.out.println("Para yazisi testi FAILED");





    }
}
