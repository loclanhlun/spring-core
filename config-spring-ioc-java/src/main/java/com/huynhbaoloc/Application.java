package com.huynhbaoloc;

import com.huynhbaoloc.bean.HelloWorld;
import com.huynhbaoloc.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// cuoi cung ta su dung spring ioc container de nap bean vao cac doi tuong ta can su dung
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());
    }
}
