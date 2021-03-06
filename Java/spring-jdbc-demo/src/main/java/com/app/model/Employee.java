package com.app.model;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long contact;
    private String city;
    private String gender;
    private int deptid;

    public Employee() {
    }

    public Employee(String name, int age, long contact, String city, String gender, int deptid) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.city = city;
        this.gender = gender;
        this.deptid = deptid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                ", city='" + city + '\'' +
                ", gender='" + gender + '\'' +
                ", deptid=" + deptid +
                '}';
    }
}
