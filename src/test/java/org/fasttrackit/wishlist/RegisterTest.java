package org.fasttrackit.wishlist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    @Test
    public void successfulRegisterWithAllDetails() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test");

        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("firstname")).sendKeys("Roxana");
        driver.findElement(By.id("middlename")).sendKeys("V");
        driver.findElement(By.id("lastname")).sendKeys("Popoviciu");
        driver.findElement(By.name("email")).sendKeys("roxanacroitoru378@yahoo.ro");
        driver.findElement(By.name("password")).sendKeys("passwOrd");
        driver.findElement(By.name("confirmation")).sendKeys("passwOrd");
        driver.findElement(By.className("checkbox")).click();
    }
}
