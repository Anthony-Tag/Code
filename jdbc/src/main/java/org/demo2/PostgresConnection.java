package org.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    private PostgresConnection(){}
    private static Connection connection;

    static {

        try {
            //STEP 1 - Lad Driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

            //step 2
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "ageomon16";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Connection/Ping Success");
    }
    public static Connection getConnection(){
        return connection;
    }
}

/*
How to build SingleTon Java class?
Disable the constructor by making it as private
Keep a static method which checks and returns the instance of the Connection object
*/