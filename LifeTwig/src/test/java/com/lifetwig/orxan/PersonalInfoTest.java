package com.lifetwig.orxan;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonalInfoTest extends TestBase{
@BeforeMethod
    public void ensurePrecondition(){
    click(By.xpath("//input[@id='login_email']"));
    type(By.xpath("//input[@id='login_email']"), "rugbisto@gmx.de");

    click(By.xpath("//input[@id='login_password']"));
    type(By.xpath("//input[@id='login_password']"), "Orxan13!");

    click(By.xpath("//*[@id=\"login\"]/div[5]/div/div/div/button"));
}
@Test
public void changePersonalInfoTest(){
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='rugbisto@gmx.de'])[1]/following::p[5]")).click();
    driver.findElement(By.id("personal-info_city")).click();
    driver.findElement(By.id("personal-info_city")).clear();
    driver.findElement(By.id("personal-info_city")).sendKeys("Frankfurt");
    driver.findElement(By.id("personal-info_birthPlace")).click();
    driver.findElement(By.id("personal-info_birthPlace")).clear();
    driver.findElement(By.id("personal-info_birthPlace")).sendKeys("Baku");
    driver.findElement(By.xpath("//form[@id='personal-info']/div[2]/div/div/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//div/div/div/div/div/div/button/span")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
}
}
