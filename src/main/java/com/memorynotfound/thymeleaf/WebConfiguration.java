package com.memorynotfound.thymeleaf;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter{


    public void addResourceHandler(ResourceHandlerRegistry ext_registory){
        ext_registory.addResourceHandler("/css/**", "/js**/" ).addResourceLocations("classpath:/static/css/","classpath:/static/js/");
    }
}
