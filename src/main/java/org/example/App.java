package org.example;

import org.example.service.EmployeeServiceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        EmployeeServiceImpl service=new EmployeeServiceImpl();
        Connection connection=service.getMyConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from employees");
        System.out.println("ID  NAME\n======================\n");
        while (resultSet.next())
        {
            System.out.println("ID: "+resultSet.getInt(1)+"  NAME: "+resultSet.getString(2));
        }
    }
}
