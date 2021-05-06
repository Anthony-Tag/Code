package com.employee.search.dao.impl;

import com.employee.search.dao.EmployeeSearchDAO;
import com.employee.search.dao.dbutil.PostgresSqlConnection;
import com.employee.search.exception.BusinessException;
import com.employee.search.model.Department;
import com.employee.search.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {
    @Override
    public Employee getEmployeeById(int id) throws BusinessException {
        Employee employee=null;
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.id=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
            }else{
                throw new BusinessException("No employee found with id : "+id);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employee;
    }

    @Override
    public Employee getEmployeeByContact(long contact) throws BusinessException {
        Employee employee=null;
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.contact=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setLong(1,contact);

            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
            }else{
                throw new BusinessException("No employee found with that contact : "+contact);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact " + "SysAdmin");
        }
        return employee;
    }

    @Override
    public List<Employee> getEmployeesByName(String name) throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.name=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now with that name : "+name);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByCityName(String city) throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.city=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,city);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now in that city : "+city);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.gender=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,gender.toUpperCase(Locale.ROOT));
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now with this gender : "+gender);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByDepartmentName(String name) throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where d.name=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now with this Department name : "+name);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getEmployeesByAge(int age) throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid where e.age=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,age);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setContact(resultSet.getLong("contact"));
                employee.setGender(resultSet.getString("gender"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now with this age : "+age);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }

    @Override
    public List<Employee> getAllEmployees() throws BusinessException {
        List<Employee> employeeList=new ArrayList<>();
        try(Connection connection= PostgresSqlConnection.getConnection()){
            String sql="select e.id,e.name,e.age,e.city,e.contact,e.gender,e.deptid,d.name as department_name from employee_schema.employee e LEFT JOIN employee_schema.department d on e.deptid=d.deptid";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                Department department=new Department();
                department.setDeptid(resultSet.getInt("deptid"));
                department.setName(resultSet.getString("department_name"));
                Employee employee=new Employee();
                employee.setDepartment(department);
                employee.setId(resultSet.getInt("id"));
                employee.setAge(resultSet.getInt("age"));
                employee.setCity(resultSet.getString("city"));
                employee.setName(resultSet.getString("name"));
                employee.setGender(resultSet.getString("gender"));
                employee.setContact(resultSet.getLong("contact"));
                employeeList.add(employee);
            }
            if(employeeList.size()==0){
                throw new BusinessException("No employee exist in DB as of now");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e); //This line will be replaced by logger... This is only for devs not for customers
            throw new BusinessException("Internal error occured.. Contact SysAdmin");
        }
        return employeeList;
    }
}

