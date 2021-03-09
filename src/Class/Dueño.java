package Class;
public class Dueño extends SerVivo{
    private String Direccion;
    private String Correo;

    public Dueño() {
    }

    public Dueño(String Direccion, String Correo, String id, String Nombre) {
        super(id, Nombre);
        this.Direccion = Direccion;
        this.Correo = Correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    
    
}
