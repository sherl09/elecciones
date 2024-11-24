/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_votos;
import java.io.Serializable;
/**
 *
 * @author H04114
 */
public class Miembro implements Serializable{
    private String DNI;
    private String nombre;
    private String apellido;
    private String tipo_miembro;

    public Miembro(String DNI,String nombre, String apellido, String tipo_miembro) {
        this.DNI=DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo_miembro = tipo_miembro;
        generarusuario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getipo_miembro() {
        return tipo_miembro;
    }

    public void setTipo_miembro(String ripo_miembro) {
        this.tipo_miembro = ripo_miembro;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void generarusuario(){
        String sub=nombre.substring(0,2)+"@hotmail.com";
        String contra=DNI;
        Registro reg=new Registro(sub,contra);
        Datos.data1.registrar(reg);
        
    }

    
}
