package org.hl.springapi.scheduled;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;

public class MySpringScheduledDemo {

    @Scheduled(cron = "0/5 * * * * ? ")
    public void sayHello() {
        System.out.println("定时器的执行....");
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/ctx-scheduled.xml");


    }
}
