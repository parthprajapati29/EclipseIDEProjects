package com.testngpolymorphism;

public class BingSearchTest extends SearchTest {

    @Override
    protected String getSearchUrl() {
        return "https://www.bing.com";
    }

    @Override
    protected String getSearchBoxName() {
        return "q";
    }
}
