package com.employee.search.dao;

import com.employee.search.exception.BusinessException;
import com.employee.search.model.Employee;

import java.util.List;

public interface EmployeeSearchDAO {
    public Employee getEmployeeById(int id) throws BusinessException;
    public Employee getEmployeeByContact(long contact) throws BusinessException;
    public List<Employee> getEmployeesByName(String name) throws BusinessException;
    public List<Employee> getEmployeesByCityName(String city) throws BusinessException;
    public List<Employee> getEmployeesByGender(String gender) throws BusinessException;
    public List<Employee> getEmployeesByDepartmentName(String name) throws BusinessException;
    public List<Employee> getEmployeesByAge(int age) throws BusinessException;
    public List<Employee> getAllEmployees() throws BusinessException;
}
