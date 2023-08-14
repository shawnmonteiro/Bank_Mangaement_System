package Bank.Management.System;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
       try{
           connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bms","root","shanon6122006s");
           statement = connection.createStatement();
       }
       catch(Exception ex)
       {
            ex.printStackTrace();
       }

    }

}
