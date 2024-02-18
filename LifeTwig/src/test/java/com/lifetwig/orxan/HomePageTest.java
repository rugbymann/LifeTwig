package com.lifetwig.orxan;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void isHomePagePresentTest() {
        //System.out.println("Home component is " + isHomeComponentPresent());
        //System.out.println("Home component is " + isElementPresent(By.xpath("//div[contains(text(),'Let’s Sign You In')]")));
        Assert.assertTrue(isHomeComponentPresent());

}

}


