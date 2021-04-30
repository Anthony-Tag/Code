package com.app.model;

import com.app.service.EmployeeService;
import com.app.service.impl.EmployeeServiceImpl;
import io.javalin.Javalin;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService service=new EmployeeServiceImpl();
        Javalin app= Javalin.create().start(9000);

        app.post("/employee",ctx -> {
            Employee employee=ctx.bodyAsClass(Employee.class);
            employee=service.createEmployee(employee);
            ctx.json(employee);
        });

        app.put("/employee",ctx -> {
            Employee employee=ctx.bodyAsClass(Employee.class);
            employee=service.updateEmployee(employee);
            ctx.json(employee);
        });

        app.get("/employee/:id",ctx -> {
            //Employee employee=ctx.bodyAsClass(Employee.class);
            Employee employee=service.getEmployeeId(Integer.parseInt(ctx.pathParam("id")));
            ctx.json(employee);
        });

        app.delete("/employee",ctx -> {
            //Employee employee=ctx.bodyAsClass(Employee.class);
            int id = Integer.parseInt(ctx.pathParam("id"));
            service.removeEmployee(id);
            ctx.result("Employee with id "+ id + " is removed");
        });

        app.get("/employees",ctx -> {
            List<Employee> employees=service.getEmployeesList();
            ctx.json(employees);
        });

        app.get("/employees",ctx -> {
            List<Employee> employees=service.getEmployeesByAge(Integer.parseInt(ctx.pathParam("age")));
            ctx.json(employees);
        });
    }
}
