package org.demo2;

import java.sql.*;

public class EmployeeDAOImp implements EmployeeDAO {

    @Override
    public Employee createEmployee(Employee employee) throws SQLException {

        Connection connection = PostgresConnection.getConnection();
        String sql="INSERT INTO employee_schema.employee\n" +
                "(name, age, contact, city, gender, deptid)\n" +
                "VALUES(?, ?, ?, ?, ?, ?);\n";
        PreparedStatement preparedStatement= connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setInt(2,employee.getAge());
        preparedStatement.setLong(3,employee.getContact());
        preparedStatement.setString(4,employee.getCity());
        preparedStatement.setString(5,employee.getGender());
        preparedStatement.setInt(6,employee.getDepartment().getDeptId());

        int c=preparedStatement.executeUpdate();
        if(c==1){
            ResultSet resultSet= preparedStatement.getGeneratedKeys();
            if(resultSet.next()){
                employee.setId(resultSet.getInt(1));
            }
        }
        return employee;
    }
}
