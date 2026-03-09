package com.example.springstarthere.main;

import com.example.springstarthere.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Paroot p1 = context.getBean(Paroot.class);
//        Paroot p2 = context.getBean("paroot2", Paroot.class);
//        Paroot p3 = context.getBean("paroot3", Paroot.class);

        System.out.println(p1);
        System.out.println(p1.getName());
//        System.out.println(p2.getName());
//        System.out.println(p3.getName());
    }
}
