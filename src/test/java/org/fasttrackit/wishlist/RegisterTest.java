package org.fasttrackit.wishlist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterTest {

    @Test
    public void successfulRegisterWithAllDetails() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test");

        //inregistrarea intr-un cont
        driver.findElement(By.linkText("ACCOUNT")).click();
        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("firstname")).sendKeys("Roxana");
        driver.findElement(By.id("middlename")).sendKeys("V");
        driver.findElement(By.id("lastname")).sendKeys("Popoviciu");
        driver.findElement(By.name("email")).sendKeys("roxanacroitoru378" + System.currentTimeMillis() + "@yahoo.ro");
        driver.findElement(By.name("password")).sendKeys("passwOrd");
        driver.findElement(By.name("confirmation")).sendKeys("passwOrd");
        driver.findElement(By.className("checkbox")).click();

        driver.findElement(By.xpath("//div[@class='account-create']//button[@title='Register']")).click();

        WebElement successMessageContainer = driver.findElement(By.className("success-msg"));

        assertThat("Confirmation message not displayed.", successMessageContainer, notNullValue());
        assertThat("Unexpected confirmation message.", successMessageContainer.getText(),
                is("Thank you for registering with Madison Island."));

        //driver.quit();
    }
}
