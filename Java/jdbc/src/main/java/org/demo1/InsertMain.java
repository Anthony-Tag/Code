package org.demo1;

import java.sql.*;

public class InsertMain {
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
            //Statement statement = connection.createStatement();
            String sql="INSERT INTO employee_schema.employee\n" +
                    "(\"name\", age, contact, city, gender, deptid)\n" +
                    "VALUES(?, ?, ?, ?, ?, ?);\n";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"ajay");
            preparedStatement.setInt(2,25);
            preparedStatement.setLong(3,9234567899L);
            preparedStatement.setString(4,"Tinley Park");
            preparedStatement.setString(5,"M");
            preparedStatement.setInt(6,9002);

            //step 4 Execute Query
            //ResultSet resultSet=statement.executeQuery(sql);
            int c=preparedStatement.executeUpdate();
            System.out.println("Query executed");

            //step 5 Process Results
            System.out.println("Query executed - "+c+" no of row/s inserted successfully");
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
