
package service;

import java.sql.*;
/**
 *
 * @author lenovo
 */
public class ConnectionDB { 
    public static Connection getConnection(){
        
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3307/quanlythuchi";
            String user = "root";
            String pwd = "";
            conn = DriverManager.getConnection(url, user, pwd);
            if(conn != null)
                System.out.println("Ket noi thanh cong");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    }
}
