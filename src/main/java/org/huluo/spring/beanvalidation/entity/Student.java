package org.huluo.spring.beanvalidation.entity;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Component
public class Student {

    @Size(min = 2, max = 3 ,message = "名字长度不合格")
    public String name = "1w";
    @Min(value = 18,message = "年纪太小了")
    public int  age = 11;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
