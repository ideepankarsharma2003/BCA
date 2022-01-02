package com.servlet;


public class UserBean {
    /**
     * Tightly Encapsulated Class ---> All members are private !!!
     */
    private String name;
    private String password;
    private int age;
    private String phone;


    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
