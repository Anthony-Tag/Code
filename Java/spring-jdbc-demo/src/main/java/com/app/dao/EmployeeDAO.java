package com.app.dao;

import com.app.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployeeById(int id);
    public Employee getEmployeeById(int id);
    public List<Employee> getEmployeeByName(String name);
    public List<Employee> getEmployeeByAge(int age);
}
