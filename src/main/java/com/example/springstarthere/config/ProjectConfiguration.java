package com.example.springstarthere.config;

import com.example.springstarthere.main.Paroot;
import com.example.springstarthere.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = {
        "com.example.springstarthere.proxy",
        "com.example.springstarthere.service",
        "com.example.springstarthere.repository"})
public class ProjectConfiguration {

    @Bean
    @Primary
    Paroot paroot() {
        Paroot p = new Paroot();
        p.setName("troller");
        return p;
    }

    @Bean
    Person person() {
        Person p = new Person();
        p.setName("jon");
        return p;
    }

}
