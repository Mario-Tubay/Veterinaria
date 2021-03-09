package Class;
public class Mascota  extends SerVivo{
    private String idDueño;
    private String edad;
    private String tipo; 
    private String sexo;
    private String problema;
    public Mascota() {
    }
    public Mascota(String idDueño, String edad, String tipo, String sexo, String problema, String id, String Nombre) {
        super(id, Nombre);
        this.idDueño = idDueño;
        this.edad = edad;
        this.tipo = tipo;
        this.sexo = sexo;
        this.problema = problema;
    }

    public String getIdDueño() {
        return idDueño;
    }

    public void setIdDueño(String idDueño) {
        this.idDueño = idDueño;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

   

    
}
