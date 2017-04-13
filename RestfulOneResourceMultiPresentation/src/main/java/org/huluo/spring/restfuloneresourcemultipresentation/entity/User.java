package org.huluo.spring.restfuloneresourcemultipresentation.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student") // 标注类名为XML根节点
@XmlAccessorType(XmlAccessType.FIELD) // 表示将所有域作为XML节点
public class User {
    private   String username="zhangsan";
    private String password="密码" ;
    private int age = 22;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
