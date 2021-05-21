package com.app.model;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private Address permanentAddress;
    private List<Projects> teamList;

    public Employee() {
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

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public List<Projects> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Projects> teamList) {
        this.teamList = teamList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanentAddress=" + permanentAddress +
                ", teamList=" + teamList +
                '}';
    }
}
