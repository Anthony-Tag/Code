package com.employee.search.model;

public class Department {
    private int deptid;
    private String name;

    public Department(int deptid) {
        this.deptid = deptid;
    }

    public Department() {
    }

    public Department(int deptid, String name) {
        this.deptid = deptid;
        this.name = name;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptid +
                ", name='" + name + '\'' +
                '}';
    }
}
