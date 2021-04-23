package org.demo2;

import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Employee employee=new Employee();
        System.out.println("Enter Employee Details to register");
        System.out.println("Enter Employee Name");
        employee.setName(scanner.nextLine());
        System.out.println("Enter Employee Age");
        employee.setAge(scanner.nextInt());
        System.out.println("Enter Employee Gender(M/F/O)");
        employee.setGender(scanner.nextLine());
        System.out.println("Enter Employee Contact");
        employee.setContact(scanner.nextLong());
        System.out.println("Enter Employee City");
        employee.setCity(scanner.nextLine());
        System.out.println("Enter Employee Department ID");
        Department department=new Department();
        department.setDeptId(scanner.nextInt());
        employee.setDepartment(department);

        EmployeeDAO employeeDAO =new EmployeeDAOImp();
        try {
            employee = employeeDAO.createEmployee(employee);
            if(employee.getId()!=0){
                System.out.println("Employee Registered successfully with below details");
                System.out.println(employee);
            }
        }catch (SQLException | BusinessException e){
            System.out.println("Internal error occuered.... Please see SysAdmin");
        }

    }
}
