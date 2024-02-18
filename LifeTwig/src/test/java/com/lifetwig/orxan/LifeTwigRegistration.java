package com.lifetwig.orxan;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LifeTwigRegistration extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        //precondition : user should be logged out
        if (isLoginElementPresent()){
            clickOnLogoutButton();
        }

    }

    @Test
    public void createNewUserPositiveTest(){

        //click on sign up  XPath   //a[contains(text(),'Sign up')]
        clickOnSignUpButton();


        //click first name - fill  Xpath //input[@id='registration_firstName']
        fillRegistrationForm("Orxan13!", "rugbisto@gmx.de");

        //click i agree with terms  Xpath  //*[@class='ant-checkbox-input']
        clickOnInput();

        //click sign up   //*[@class='ant-btn ant-btn-primary auth_register_form_button__pi0px']
        clickOnRegistrSignUp();

        isLogoutElementPresent();
    }


}
