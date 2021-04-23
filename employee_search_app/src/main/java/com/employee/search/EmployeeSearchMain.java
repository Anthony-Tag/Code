package com.employee.search;

import com.employee.search.exception.BusinessException;
import com.employee.search.model.Employee;
import com.employee.search.service.EmployeeSearchService;

import com.employee.search.service.impl.EmployeeSearchServiceImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeSearchMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Vinay's Employee Search App V1.0");
        Scanner scanner=new Scanner(System.in);
        EmployeeSearchService employeeSearchService=new EmployeeSearchServiceImpl();
        int ch=0;
        do {
            System.out.println("Search Employee Menu");
            System.out.println("============================");
            System.out.println("1)By Id");
            System.out.println("2)By Name");
            System.out.println("3)By Age");
            System.out.println("4)By City");
            System.out.println("5)By Gender");
            System.out.println("6)By Department Name");
            System.out.println("7)By Contact Number");
            System.out.println("8)Get All Employees");
            System.out.println("9)EXIT");
            System.out.println("Enter your choice(1-9) : ");
            try {
                ch = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){}
            switch (ch){
                case 1://ID
                    System.out.println("Enter Employee Id to get Employee Details");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        Employee employee=employeeSearchService.getEmployeeById(id);
                        if(employee!=null){
                            System.out.println("Employee with id "+id+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Id should be integer only");
                    }
                    break;
                case 2://Name
                    System.out.println("Enter Employee Name to get Employee Details");
                    try {
                        String name = scanner.nextLine();
                        List<Employee> employee=employeeSearchService.getEmployeesByName(name);
                        if(employee!=null){
                            System.out.println("Employee with that name "+name+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Name should be String only");
                    }
                    break;
                case 3://Age
                    System.out.println("Enter Employee Age to get Employee Details");
                    try {
                        int age = Integer.parseInt(scanner.nextLine());
                        List<Employee> employee=employeeSearchService.getEmployeesByAge(age);
                        if(employee!=null){
                            System.out.println("Employee with that age "+age+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Name should be Integer only");
                    }
                    break;
                case 4://City
                    System.out.println("Enter Employee City to get Employee Details");
                    try {
                        String city = scanner.nextLine();
                        List<Employee> employee=employeeSearchService.getEmployeesByCityName(city);
                        if(employee!=null){
                            System.out.println("Employee in that city name "+city+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Name should be String only");
                    }
                    break;
                case 5://Gender
                    System.out.println("Enter gender to get all employees of that gender category (M-Male,F-Female,O-Others) enter M or F or O");
                    String gender=scanner.nextLine();
                    try {
                        List<Employee> employeeList=employeeSearchService.getEmployeesByGender(gender);
                        if(employeeList!=null && employeeList.size()>0){
                            System.out.println("We have total "+employeeList.size()+" no of employees in DB... Printing the details below for the gender "+gender);
                            for(Employee e:employeeList){
                                System.out.println(e);
                            }
                        }
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6://Department Name
                    System.out.println("Enter Employee Department Name to get Employee Details");
                    try {
                        String name = scanner.nextLine();
                        List<Employee> employee=employeeSearchService.getEmployeesByDepartmentName(name);
                        if(employee!=null){
                            System.out.println("Employee with that department name "+name+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Name should be String only");
                    }
                    break;
                case 7://Contact
                    System.out.println("Enter Employee Contact to get Employee Details");
                    try {
                        Long contact = Long.parseLong(scanner.nextLine());
                        Employee employee=employeeSearchService.getEmployeeByContact(contact);
                        if(employee!=null){
                            System.out.println("Employee with that contact "+contact+" was found... See below for details");
                            System.out.println(employee);
                        }

                    }catch (NumberFormatException | BusinessException e){
                        System.out.println("Name should be Long only");
                    }
                    break;
                case 8://All
                    try {
                        List<Employee> employeeList=employeeSearchService.getAllEmployees();
                        if(employeeList!=null && employeeList.size()>0){
                            System.out.println("We have total "+employeeList.size()+" no of employees in DB... Printing the details below");
                            for(Employee e:employeeList){
                                System.out.println(e);
                            }
                        }
                    } catch (BusinessException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    System.out.println("Thanks for using the App :) ");
                    break;
                default:
                    System.out.println("Invalid Input!!!!!! Your choice should be between 1-9 only........");

            }
        }while (ch!=9);
    }
}
