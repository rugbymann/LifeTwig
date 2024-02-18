package com.lifetwig.orxan;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WhatsOnMindTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        click(By.xpath("//input[@id='login_email']"));
        type(By.xpath("//input[@id='login_email']"), "rugbisto@gmx.de");

        click(By.xpath("//input[@id='login_password']"));
        type(By.xpath("//input[@id='login_password']"), "Orxan13!");

        click(By.xpath("//*[@id=\"login\"]/div[5]/div/div/div/button"));

    }
@Test
    public void whatsOnMind(){
    driver.findElement(By.xpath("//div[@id='main-feed-scroll']/div/div/div/div/div/div/div[2]/textarea")).click();
    driver.findElement(By.xpath("//div[@id='main-feed-scroll']/div/div/div/div/div/div/div[2]/textarea")).clear();
    driver.findElement(By.xpath("//div[@id='main-feed-scroll']/div/div/div/div/div/div/div[2]/textarea")).sendKeys("Sun is shining");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun is shining'])[1]/following::*[name()='svg'][5]")).click();
}

    }

