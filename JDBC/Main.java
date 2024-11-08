package JDBC;

import java.sql.*;

class JDBC_Methods{
    public void Connect(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab_data","root","Berlin@5885");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

public class Main
{
    public static void main(String[] args)
    {
        JDBC_Methods jdbc_methods = new JDBC_Methods();
        jdbc_methods.Connect();
    }
}
