package Gestion_votos;
import java.io.Serializable;
public class Candidato implements Serializable{

        private String nombre;
        private String apellido;
        private String dni;
        private String partido;
    
        public Candidato(String nombre,String apellido, String dni, String partido) {
            this.nombre = nombre;
            this.dni = dni;
            this.partido = partido;
            this.apellido=apellido;
        }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
    
    

