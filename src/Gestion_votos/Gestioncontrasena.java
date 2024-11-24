/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_votos;
import java.io.Serializable;
/**
 *
 * @author sherlock
 */
public class Gestioncontrasena implements Serializable{
    private Lista<Registro> registro;

    public Gestioncontrasena() {
            this.registro = new Lista<>();
        }
    public void registrar(Registro reg){
        registro.agregar(reg);
    }
    public boolean validar_suario(String usuario,String contrasena){
        boolean x=false;
        Nodo<Registro> reg=registro.getCabeza();
        while(reg!=null){
            Registro aux=reg.getElemento();
            if(usuario.equals(aux.getUsuario())&& contrasena.equals(aux.getContra())){
                x=true;
                break;
            }
            reg=reg.getSgteNodo();
        }
        
        return x;
    }
}
