package com.app.service.impl;

import com.app.model.Employee;
import com.app.service.EmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private static Map<Integer,Employee> map=new HashMap<>();
    private int counter = 1000;
    @Override
    public Employee createEmployee(Employee employee) {
        employee.setId(counter++);
        map.put(employee.getId(),employee);
        return employee;
    }

    @Override
    public Employee getEmployeeId(int id) {
        return map.get(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        map.put(employee.getId(),employee);
        return employee;
    }

    @Override
    public void removeEmployee(int id) {
        map.remove(id);
    }

    @Override
    public List<Employee> getEmployeesList() {
        return new ArrayList<>(map.values());
    }

    @Override
    public List<Employee> getEmployeesByAge(int age) {

        return map.values().stream().filter(emp->emp.getAge()==age).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesBySalary(int salary) {
        return map.values().stream().filter(emp->emp.getSalary()==salary).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return map.values().stream().filter(emp->emp.getName()==name).collect(Collectors.toList());
    }
}
