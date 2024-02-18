package com.lifetwig.orxan;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://lifetwig.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod( enabled = false)
    public void tearDown(){
        driver.quit();
    }

    public boolean isHomeComponentPresent() {
        return driver.findElements(By.xpath("//div[contains(text(),'Let’s Sign You In')]")).size()>0;

    }

    //universal method
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;

    }

    public boolean isElementPresent2(By locator){
        try {
            driver.findElement(locator);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }
    }

    public void click(By locator) {
        locator.    findElement(driver).click();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void clickOnLogoutButton() {
        click(By.xpath("By.xpath(//p[contains(text(),'Logout')]"));
    }

    public boolean isLoginElementPresent() {
        return !isElementPresent(By.xpath("//span[contains(text(),'Login')]"));
    }

    public void isLogoutElementPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//p[contains(text(),'Logout')]")));
    }

    public void clickOnRegistrSignUp() {
        click(By.xpath("//*[@class='ant-btn ant-btn-primary auth_register_form_button__pi0px']"));
    }

    public void clickOnInput() {
        click(By.xpath("//*[@class='ant-checkbox-input']"));
    }

    public void fillRegistrationForm(String password, String login) {
        type(By.xpath("//input[@id='registration_firstName']"), "Ori");

        //click last name - fill Xpath //input[@id='registration_lastName']
        type(By.xpath("//input[@id='registration_lastName']"), "Maori");


        //click email  Xpath //input[@id='registration_email']
        type(By.xpath("//input[@id='registration_email']"), login);


        //click password Xpath //input[@id='registration_password']
        type(By.xpath("//input[@id='registration_password']"), password);
    }

    public void clickOnSignUpButton() {
        click(By.xpath("//a[contains(text(),'Sign up')]"));
    }
}
