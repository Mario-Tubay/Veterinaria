package controller;

import Class.Dueño;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Inserts;

public class DueñoDAO implements CrudDueño{

    Inserts i = new Inserts();
    @Override
    public int insert(Dueño d) {
        String sql = "INSERT INTO dueño(id, nombre, correo, direccion, fecha, eliminar) VALUES ('"+d.getId()+"','"+d.getNombre()+"','"+d.getCorreo()+"','"+d.getDireccion()+"', CURDATE(), 0)";
        int filasAfectadas = i.inserts(sql);
        return filasAfectadas;
    }

    @Override
    public int update(Dueño d) {
        String sql = "UPDATE dueño SET nombre='"+d.getNombre()+"' ,correo='"+d.getCorreo()+"' , direccion='"+d.getDireccion()+"' WHERE id ='"+d.getId()+"'  ";
        int filasAfectadas = i.updates(sql);
        return filasAfectadas;
    }

    @Override
    public int delete(Dueño d) {
        String sql = "update dueño set eliminar=1 where id = '"+d.getId()+"'";
        int filasAfectadas = i.deletes(sql);
        return filasAfectadas;
    }
    
    public static ArrayList<String> consultaDueño(String id){
        String sql = "Select id, nombre from dueño where id = '"+id+"' and eliminar = 0";
        ArrayList<String> list = new ArrayList<String>();
        list = model.Selects.consultaDueñoId(sql);
        if(list.size()!=0){
            JOptionPane.showMessageDialog(null,"Dueño encontrado");
        }else{
            JOptionPane.showMessageDialog(null,"No existe el Dueño");
        }
        return list;
    }
    
    public static ArrayList<String> consultaDueñoGloba1(String id){
        ArrayList<String> list = new ArrayList<String>();
         String sql = "Select d.id, d.nombre, m.id, m.nombre, m.sexo, m.edad, m.tipo, m.problema "
                + "from dueño d "
                + "inner join mascota m on d.id = m.idDueño "
                + "dueño where id like '%"+id+"'"
                 + "and  d.eliminar =0 and m.eliminar=0;";
        list = model.Selects.consultaDueñoId(sql);
        
        return list;
    }
}
