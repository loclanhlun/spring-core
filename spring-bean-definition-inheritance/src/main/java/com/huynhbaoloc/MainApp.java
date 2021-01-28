package com.huynhbaoloc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");

        HelloVietNam helloVietNam = (HelloVietNam) applicationContext.getBean("helloVietNam");
        helloVietNam.getMessage1();
        helloVietNam.getMessage2();
        helloVietNam.getMessage3();

    }
}
