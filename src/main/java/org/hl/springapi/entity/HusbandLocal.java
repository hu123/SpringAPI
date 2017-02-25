package org.hl.springapi.entity;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;



public class HusbandLocal {

    // 属性
    private String name;
    private int age;
    private String message;

    // set,get
    public String getName() {
        System.out.println("name:"+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("age:"+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMessage() {
        System.out.println("message:"+message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // 额外的操作，方法
    public void call(String message) {
        System.out.println("丈夫的call：" + message);
    }

    public void look(){
        System.out.println("发现发廊");
    }

    public void playDOTA(){
        System.out.println("这个不用解释了吧~DOTA");
    }

}