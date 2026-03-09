package com.example.springstarthere.config;

import com.example.springstarthere.main.Paroot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = "com.example.springstarthere.main")
public class BeanConfig {

//    @Bean
//    @Primary
//    Paroot paroot1() {
//        Paroot p = new Paroot();
//        p.setName("troller");
//        return p;
//    }
//
//    @Bean
//    Paroot paroot2() {
//        Paroot p = new Paroot();
//        p.setName("lich");
//        return p;
//    }
//
//    @Bean
//    Paroot paroot3() {
//        Paroot p = new Paroot();
//        p.setName("zeus");
//        return p;
//    }
}
