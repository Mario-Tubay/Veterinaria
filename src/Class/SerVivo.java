package Class;
public class SerVivo {
     private String  id;
     private String Nombre;

    public SerVivo() {
    }

    public SerVivo(String id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     
     
}
