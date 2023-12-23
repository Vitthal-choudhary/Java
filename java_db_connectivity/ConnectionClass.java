/*
 * JDBC Java Database Connectivity - java driver program
 * ODBC Open Database Connectivity - windows component
 * JDBC ODBC Bridge
*/

package java_db_connectivity;

import java.sql.*;

public class ConnectionClass
{
    public Connection con;     //to estabilish connection with db
    PreparedStatement pst;  //to prepare a sql statement
    ResultSet rst;  //to execute a SQL Query and get results

    public void Connect()
    {
        try
        {
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con = DriverManager.getConnection("jdbc:odbc:DSN9am");
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:1433;databasename=db_inventory;integratedSecurity=true;");
            //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=db_Inventory;integratedSecurity=true;");
            //con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dbsp;uid=username;pwd=password;");
            System.out.println("Connected");

        }
        catch(Exception ex)
        {
            System.out.println("Error in connection "+ex);
        }
    }
    public void DisConnect()
    {
        try
        {
            con.close();
            System.out.println("Disconnected");
        }
        catch(Exception ex)
        {
            System.out.println("Error in disconnection "+ex);
        }
    }
    public static void main(String a[])
    {
        ConnectionClass cobj = new ConnectionClass();
        cobj.Connect();
        cobj.DisConnect();
    }

}
