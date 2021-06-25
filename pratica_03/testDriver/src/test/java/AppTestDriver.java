/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTestDriver {
    
    // System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    // WebDriver driver = new ChromeDriver();
    // driver.get("http://localhost:8080/testing_tools_selenium_wd/");

    @Test
    public void testRaizNumber() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");

      WebDriver driver = new ChromeDriver();
      driver.get("http://localhost:8080/app/");

        //CASO DE TESTE 1
        //NÚMERO MAIS PERTO DE 0
        Thread.sleep(2000);
        WebElement numberInput1 = driver.findElement(By.name("number"));
        numberInput1.sendKeys("0.01");
        Thread.sleep(2000);
        WebElement bt1 = driver.findElement(By.id("dataSender"));
        bt1.click();
        Thread.sleep(2000);
        Double raiz1 = Double.parseDouble(driver.findElement(By.id("raizParagraph")).getText());
        assertEquals(0.1, raiz1, 0.0001);
        driver.close();
        driver.quit();

        //CASO DE TESTE 2
        //NÚMERO MAIS PERTO DE 50
        Thread.sleep(3000);
        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://localhost:8080/app/");
        WebElement numberInput2 = driver2.findElement(By.name("number"));
        numberInput2.sendKeys("49.99");
        Thread.sleep(2000);
        WebElement bt2 = driver2.findElement(By.id("dataSender"));
        bt2.click();
        Thread.sleep(2000);
        Double raiz2 = Double.parseDouble(driver2.findElement(By.id("raizParagraph")).getText());
        assertEquals(7.070360669725414, raiz2, 0.00000000001);
        driver2.close();
        driver2.quit();

        //CASO DE TESTE 3
        //Nulo
        WebDriver driver3 = new ChromeDriver();
        driver3.get("http://localhost:8080/app/");
      Thread.sleep(2000);
      WebElement numberInput3 = driver3.findElement(By.name("number"));
      numberInput3.sendKeys("0");
      Thread.sleep(2000);
      WebElement bt3 = driver3.findElement(By.id("dataSender"));
      bt3.click();
      Thread.sleep(2000);
      Double raiz3 = Double.parseDouble(driver3.findElement(By.id("raizParagraph")).getText());
      assertEquals(0.0, raiz3, 0.0001);
      driver3.close();
      driver3.quit();
    }
}


