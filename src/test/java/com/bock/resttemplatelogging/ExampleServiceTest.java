package com.bock.resttemplatelogging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by scottbock on 2/16/18.
 */
class ExampleServiceTest {

    private ExampleService exampleService;

    @BeforeEach
    private void setup(){
        exampleService = new ExampleService();
    }

    @Test
    void testGet() {
        exampleService.getWeather();
    }

    @Test
    void testPost() {
        exampleService.testPost();
    }

}