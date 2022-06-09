package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final Util util = new Util();
    private Util() {

    };
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER_NAME = "root17";
    private static final String PASSWORD = "root";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";



    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        //Connection connect = null;

       // try {
       //     Class.forName(DB_DRIVER);
      //      connect = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
      //  } catch (ClassNotFoundException | SQLException e) {
      //      e.printStackTrace();
      //  }
     //   return connect;
    }


}
