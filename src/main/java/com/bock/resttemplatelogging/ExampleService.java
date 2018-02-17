package com.bock.resttemplatelogging;

import org.springframework.http.HttpEntity;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Created by scottbock on 2/16/18.
 */
public class ExampleService {

    private RestTemplate createRestTemplate(){
        RestTemplate restTemplate = new RestTemplate(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));

        restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));

        return restTemplate;
    }

    public void getWeather(){
        RestTemplate restTemplate = createRestTemplate();

        restTemplate.getForObject("https://www.metaweather.com/api/location/44418/", Object.class, "");


    }

    public void testPost(){

        RestTemplate restTemplate = createRestTemplate();

        HttpEntity<String> request = new HttpEntity<>("bar");
        restTemplate.postForObject("https://postman-echo.com/post", request, String.class);
    }


}
