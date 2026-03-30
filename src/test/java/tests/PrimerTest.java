package tests;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PrimerTest {
    @Test
    public void abrirGoogle() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Página abierta correctamente");
        driver.quit();

        }

}






