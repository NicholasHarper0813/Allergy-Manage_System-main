package com.example.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vaadin.flow.component.page.AppShellConfigurator;
import org.springframework.boot.SpringApplication;
import com.vaadin.flow.theme.Theme;

@SpringBootApplication
@Theme(value = "frontend")
public class Application implements AppShellConfigurator 
{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
