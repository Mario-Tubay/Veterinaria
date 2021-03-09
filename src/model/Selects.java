package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Selects {
     public  static Statement statement;
    public  static  ResultSet resultSet;
    public static ArrayList<String> inicioSesion(String sql)
    {
       ArrayList<String> lista = new ArrayList<String>();
       Connection conexion;
        
        try {
            conexion= model.Conexion.getConnection();
            statement= conexion.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next())
            {
                lista.add(resultSet.getString("correo"));
                lista.add(resultSet.getString("clave"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
     public static ArrayList<String> consultaDueñoId(String sql)
    {
       ArrayList<String> lista = new ArrayList<String>();
       Connection conexion;
        
        try {
            conexion= model.Conexion.getConnection();
            statement= conexion.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            while (resultSet.next())
            {
                lista.add(resultSet.getString("id"));
                lista.add(resultSet.getString("nombre"));
            }
        } catch (Exception e) {
        }
        return lista;
    }
     
}
