package org.example.service;

import org.example.factory.MyH2ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeServiceImpl {

    private Connection connection;
    private MyH2ConnectionFactory myH2ConnectionFactory;

    public EmployeeServiceImpl() throws SQLException {
        myH2ConnectionFactory=MyH2ConnectionFactory.createObject();
       connection=myH2ConnectionFactory.getMyH2Connection();
    }

    public Connection getMyConnection()
    {
        return connection;
    }
}
