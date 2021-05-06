package org.demo1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class HelloJbdc {
    public static void main(String[] args) {

        Connection connection=null;
        try {
            //STEP 1 - Lad Driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

            //step 2
            String url="jdbc:postgresql://localhost:5432/postgres";
            String username="postgres";
            String password="ageomon16";
            connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connection/Ping Success");

            //step 3 Create Statement
            Statement statement = connection.createStatement();
            String sql="select id,name,contact,city,age,gender from employee_schema.employee";

            //step 4 Execute Query
            ResultSet resultSet=statement.executeQuery(sql);
            System.out.println("Query executed");

            //step 5 Process Results
            while (resultSet.next()){
                System.out.println("id : " +resultSet.getInt("id"));
                System.out.println("name : " +resultSet.getString("name"));
                System.out.println("contact : " +resultSet.getLong("contact"));
                System.out.println("city : " +resultSet.getString("city"));
                System.out.println("Age : " +resultSet.getInt("age"));
                System.out.println("gender : " +resultSet.getString("gender"));

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }


        }

    }
}
