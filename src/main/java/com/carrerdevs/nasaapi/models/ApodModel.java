package com.carrerdevs.nasaapi.models;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class ApodModel {

    public ApodModel(){

    }
    public String getCopyright() {
        return copyright;
    }

    public String getDate() {
        return date;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getUrl() {
        return url;
    }

    public String getMedia_type() {
        return media_type;
    }

    public String getTitle() {
        return title;
    }

    public String copyright;
    public String date;
    public String explanation;
    public String url;
    public String media_type;
    public String title;



}
