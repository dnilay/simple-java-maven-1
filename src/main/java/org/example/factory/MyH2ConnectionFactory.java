package org.example.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyH2ConnectionFactory {

    private Connection connection;

    private static MyH2ConnectionFactory myH2ConnectionFactory;
    private MyH2ConnectionFactory()
    {

    }

    public static MyH2ConnectionFactory createObject(){
        if (myH2ConnectionFactory==null)
        {
            myH2ConnectionFactory=new MyH2ConnectionFactory();
        }
        return myH2ConnectionFactory;
    }

    public Connection getMyH2Connection() throws SQLException
    {
        connection= DriverManager.getConnection("jdbc:h2:~/test","sa","");
        return connection;
    }
}
