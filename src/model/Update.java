package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {
    
      public  static Statement statement;
    public  static  ResultSet resultSet;
    
    public static int updates(String sql){
        int filasAfectadas=0;
        Connection connection;
        Statement statement ;
        try{
            connection = model.Conexion.getConnection();
            statement = connection.createStatement();
            filasAfectadas = statement.executeUpdate(sql);
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return filasAfectadas;
    }
    
}
