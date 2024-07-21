package com.testngpolymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public abstract class SearchTest extends BaseTest {

    protected abstract String getSearchUrl();

    protected abstract String getSearchBoxName();

    @Test
    public void testSearch() {
        w.get(getSearchUrl());

        WebElement searchBox = w.findElement(By.name(getSearchBoxName()));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // Wait for a few seconds to see the results (use proper waits in real tests)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Validate the title of the page
        Assert.assertTrue(w.getTitle().contains("Selenium WebDriver"));
    }
}
