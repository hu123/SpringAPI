package org.huluo.springrmi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRmiServer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:spring/spring-rmi-server.xml");
        applicationContext.start();
    }
}
