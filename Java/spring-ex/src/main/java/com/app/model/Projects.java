package com.app.model;

public class Projects {
    private int pid;
    private String projectName;

    public Projects() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "pid=" + pid +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
