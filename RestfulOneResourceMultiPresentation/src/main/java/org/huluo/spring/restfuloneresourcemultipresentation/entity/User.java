package org.huluo.spring.restfuloneresourcemultipresentation.entity;

public class User {
    public  String username="zhangsan";
    public String password="密码" ;
    public int age = 22;
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
