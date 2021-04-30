package com.app.service;

import com.app.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public Employee getEmployeeId(int id);
    public Employee updateEmployee(Employee employee);
    public void removeEmployee(int id);
    public List<Employee> getEmployeesList();
    public List<Employee> getEmployeesByAge(int age);
}
