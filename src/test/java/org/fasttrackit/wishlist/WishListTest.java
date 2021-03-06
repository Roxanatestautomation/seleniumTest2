package org.fasttrackit.wishlist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    @Test
    public void wishlist () {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.linkText("SALE")).click();
        driver.findElement(By.linkText("VIEW DETAILS")).click();
        driver.findElement(By.linkText("Add to Wishlist")).click();

        driver.quit();
    }
}
