package com.example.zakol;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.Locale;

public class CustomViewResolver implements ViewResolver {
    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        System.out.println("Разрешение представления: " + viewName);
        InternalResourceView view = new InternalResourceView();
        view.setUrl("/WEB-INF/views/" + viewName + ".html");
        return view;
    }
}
