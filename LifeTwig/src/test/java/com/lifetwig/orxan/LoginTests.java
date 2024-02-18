package com.lifetwig.orxan;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        //precondition : user should be logged out
        if (isLoginElementPresent()) {
            clickOnLogoutButton();
        }

    }
    @Test
    public void loginPositiveTest(){
        //Login xpath  //input[@id='login_email']
        click(By.xpath("//input[@id='login_email']"));
        type(By.xpath("//input[@id='login_email']"), "rugbisto@gmx.de");
        //password xpath    //input[@id='login_password']
        click(By.xpath("//input[@id='login_password']"));
        type(By.xpath("//input[@id='login_password']"), "Orxan13!");
        //click on Login button
        click(By.xpath("//*[@id=\"login\"]/div[5]/div/div/div/button"));

        //assert is sign out button present
        isLogoutElementPresent();
    }
}
