package tests;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PrimerTest {
    @Test
    public void seleccionarCategoria() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com");

        // Click en "Laptops"
        driver.findElement(By.linkText("Laptops")).click();
        Thread.sleep(2000); // Espera 2 segundos
        driver.findElement(By.linkText("Phones")).click();

        Thread.sleep(3000);

        driver.quit();
    }

}






