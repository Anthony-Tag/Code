package com.app.main;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcbeans.xml");
        EmployeeDAO dao=(EmployeeDAO) context.getBean("employeeDAO");

        List<Employee> employeeList;
        Employee employee;
//        employeeList=dao.getAllEmployees();
//        System.out.println("print all employees");
//        for(Employee e:employeeList){
//            System.out.println(e);
//        }
//        employee = new Employee("Jack", 24, 8589651234l, "Oak Park", "M", 9002);
//        dao.addEmployee(employee);
//        System.out.println("Employee added");

//        employee = dao.getEmployeeById(19);
//        System.out.println(employee);
//        employee.setName("Joe");
//        dao.updateEmployee(employee);
//        System.out.println(employee);

//        dao.deleteEmployeeById(9);

        employeeList = dao.getEmployeeByAge(25);
        for(Employee e:employeeList) {
            System.out.println(e);
        }



    }
}
