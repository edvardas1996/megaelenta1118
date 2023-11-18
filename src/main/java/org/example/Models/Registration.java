package org.example.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration {

    public String username;
    public String email;
    public String password1;
    public String password2;
    public static WebDriver driver;
    public static WebDriverWait wait;

    public Registration(String username, String email, String password1, String password2) {
        this.username = username;
        this.email = email;
        this.password1 = password1;
        this.password2 = password2;
    }
    public void fillReg(){
    driver.get("https://elenta.lt/registracija");
    driver.findElement(By.id("UserName")).sendKeys(this.username);
    driver.findElement(By.id("Email")).sendKeys(this.email);
    driver.findElement(By.id("Password")).sendKeys(this.password1);
    driver.findElement(By.id("Password2")).sendKeys(this.password2);
    driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();
    }
}
