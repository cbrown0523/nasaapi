package com.carrerdevs.nasaapi.controllers;

import com.carrerdevs.nasaapi.models.ApodModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/nasa/apod")
public class NasaController {
    @GetMapping("/test")
    private String test(){
        return "testing";
    }
    @GetMapping("/today")
    private ApodModel appToday(RestTemplate restTemplate){
        String url = "https://api.nasa.gov/planetary/apod?api_key=KZjkreAzPBuhh2w46oRzxMPOQ9LzoXom1PjyFITg";

        return restTemplate.getForObject(url, ApodModel.class);

    }
}
