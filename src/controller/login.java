package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.*;

public class login {
    public Boolean ingresar(String user, String pass){
        boolean accion = false;
        String sql = "Select correo, clave from login where correo like '%"+user+"%'";
        ArrayList<String> list = new ArrayList<String>();
        list = model.Selects.inicioSesion(sql);
        if(list.size()!=0){
            if(list.get(0).equals(user)&& list.get(1).equals(pass)){
                Abministrador admin = new Abministrador();
                admin.show();
                accion = true;
            }else if(list.get(1)!= (pass)) {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                accion= false;
            }   
        }else{
            JOptionPane.showMessageDialog(null,"No existe usuario");
            accion= false;
        }
        return accion;
    }
}
