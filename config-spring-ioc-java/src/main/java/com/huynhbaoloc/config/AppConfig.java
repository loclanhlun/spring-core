package com.huynhbaoloc.config;

import com.huynhbaoloc.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// tao ra 1 class de quan ly cac bean

//thay vi config bang xml ta dung 1 java class de config

@Configuration//su dung Annotation @Configuration de define class la class config
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        //tao doi tuong helloworld
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World");
        return helloWorld;
    }
}
