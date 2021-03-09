package controller;

import Class.Mascota;
import model.Deletes;
import model.Inserts;
import model.Update;

public class MascotaDAO implements CrudMascota{

    Inserts i = new Inserts();
    Update u = new Update();
    Deletes d = new Deletes();
    @Override
    public int insert(Mascota m) {
        int filasAfectadas=0;
        String sql = "INSERT INTO mascota(idDueño,nombre, sexo, edad, tipo, problema, fecha, eliminar)values('"+m.getIdDueño()+"','"+m.getNombre()+"','"+m.getSexo()+"','"+m.getEdad()+"','"+m.getTipo()+"','"+m.getProblema()+"',CURDATE(), 0)";
        filasAfectadas = i.inserts(sql);
        return filasAfectadas;
    }

    @Override
    public int update(Mascota m) {
        int filasAfectadas=0;
        String sql="UPDATE mascota SET nombre= '"+m.getNombre()+"' , sexo='"+m.getSexo()+"' ,edad='"+m.getEdad()+"', tipo='"+m.getTipo()+"', problema='"+m.getProblema()+"' where id = '"+m.getId()+"'";
        filasAfectadas = u.updates(sql);
        return filasAfectadas;
    }

    @Override
    public int delete(Mascota m) {
        int filasAfectadas=0;
        String sql ="DELETE FROM mascota WHERE id ='"+m.getId()+"'";
        filasAfectadas = d.deletes(sql);
        return filasAfectadas;
    }
    
}
