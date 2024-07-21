package com.testngpolymorphism;

public class GoogleSearchTest extends SearchTest {

    @Override
    protected String getSearchUrl() {
        return "https://www.google.com";
    }

    @Override
    protected String getSearchBoxName() {
        return "q";
    }
}
