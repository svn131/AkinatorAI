package com.example.zakol.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfiggg implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {

        System.out.println();
        registry.addViewController("").setViewName("user_page");
        registry.addViewController("").setViewName("admin_page");
        registry.addViewController("").setViewName("login");
    }
}

