
package Gestion_votos;
import java.io.Serializable;
public class Mesa implements Serializable{
    private Lista<Miembro> miembro;
    private Acta_electoral acta;
    private String numero;
    private String ubicacion;
    private static int idsta = 1; 
    private int id;
    

    public Mesa(String numero, String ubicacion) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.miembro= new Lista<>();
        this.acta=new Acta_electoral();
        this.id = idsta++;
    }
    public Lista<Miembro> getMiembro() {
        return miembro;
    }

    public void setMiembro(Lista<Miembro> miembro) {
        this.miembro = miembro;
    }

    public int getId() {
        return id;
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Acta_electoral getActa() {
        return acta;
    }

    public void setActa(Acta_electoral acta) {
        this.acta = acta;
    }
   public void agregarMiembro(Miembro miembro) {
            this.miembro.agregar(miembro);
    }
   public String mostrarMiembro(String tipo) {
    Nodo<Miembro> aux = miembro.getCabeza();
    String miembro_dato = "";   
    int i = 0; 
    while (aux != null) {
        Miembro miembro_ = aux.getElemento();
        if(tipo.equals(miembro_.getipo_miembro())){
        miembro_dato= miembro_.getNombre()+" | " + miembro_.getApellido()+" | " + miembro_.getDNI();
        return miembro_dato;
        }
        aux = aux.getSgteNodo();
        i++;
    }
    return miembro_dato;
}

      public boolean encontrarTipo( String tipo) {
    Nodo<Miembro> aux = miembro.getCabeza();
    boolean encontrado = false;    
    while (aux != null) {
        Miembro miembro_ = aux.getElemento();
        if(tipo.equals(miembro_.getipo_miembro())){
            encontrado = true;
            break;
        }
        aux = aux.getSgteNodo();
    }
    return encontrado;
}
     public void modificarMiembro( String DNI,String nombre, String apellido,String tipo) {
        Nodo<Miembro> miemb = miembro.getCabeza();
        while (miemb != null) {
            Miembro aux = miemb.getElemento();
           
            if(tipo.equals(aux.getipo_miembro())){
                aux.setDNI(DNI);
                aux.setNombre(nombre);
                aux.setApellido(apellido);
                
            }
             
            miemb = miemb.getSgteNodo();
    }
        }
      
   
    
}
