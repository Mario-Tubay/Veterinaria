package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
 public static Connection getConnection()
    {
        Connection conexion=null;
        String url, user, pwd;
        url="jdbc:mysql://localhost:3306/medicos";
        user="root";
        pwd="";
        try {
            conexion= DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            conexion= null;
            e.printStackTrace();
        }
        return conexion;
        
    }    
}
