package com.lifetwig.orxan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddFriendsTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        click(By.xpath("//input[@id='login_email']"));
        type(By.xpath("//input[@id='login_email']"), "rugbisto@gmx.de");

        click(By.xpath("//input[@id='login_password']"));
        type(By.xpath("//input[@id='login_password']"), "Orxan13!");

        click(By.xpath("//*[@id=\"login\"]/div[5]/div/div/div/button"));

    }

    public void pause (int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void addNewFriendsTest() {
        pause(1000);
        driver.findElement(By.xpath("//a[contains(text(),'now')]")).click();
        driver.findElement(By.xpath("//div[@id='watermark-wrapper23dwyc2rz']/div[2]/div[4]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//input[@value='Maria']")).clear();
        driver.findElement(By.xpath("//input[@value='Maria']")).sendKeys("Maria");
        driver.findElement(By.xpath("//div[@id='watermark-wrapper23dwyc2rz']/div[2]/div[4]/div/div/div/div[2]/button[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='watermark-wrapper23dwyc2rz']/div[2]/div[4]/div/div[2]/div[2]/div/div/div/div/div[8]/div[2]/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//div[@id='watermark-wrapper23dwyc2rz']/div[2]/div[4]/div/div/div/div/div/div/div/div/div[2]/div[4]/div/button/div")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Stop'])[1]/following::button[1]")).click();
    }


}