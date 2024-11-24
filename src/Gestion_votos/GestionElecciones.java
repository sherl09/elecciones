package Gestion_votos;

import java.util.Arrays;
import java.io.Serializable;

public class GestionElecciones implements Serializable{
    
        private Lista<Eleccion> elecciones;

        public GestionElecciones() {
            this.elecciones = new Lista<>();
        }

    
        public void agregarEleccion(Eleccion eleccion) {
            elecciones.agregar(eleccion);
            
        }
    
public String[][] mostrarElecciones() {
  
    int numElecciones = elecciones.longitud();
    String[][] eleccionesArray = new String[numElecciones][2]; 
    Nodo<Eleccion> aux = elecciones.getCabeza();
    int i = 0;
    
   
    while (aux != null) {
        Eleccion eleccion = aux.getElemento();
        eleccionesArray[i][0] = eleccion.getFecha(); 
        eleccionesArray[i][1] = eleccion.getTipoEleccion(); 
        aux = aux.getSgteNodo();
        i++;
    }
    return eleccionesArray;
}

    public void modificarEleccion(int indice, String nuevaFecha, String nuevoTipo) {
        int numElecciones = elecciones.longitud();
        Nodo<Eleccion> aux = elecciones.getCabeza();
        int i = 0;
    
  
        while (aux != null && i<numElecciones) {
            Eleccion eleccion = aux.getElemento();
           
            if(i==indice){
                eleccion.setFecha(nuevaFecha);
                eleccion.setTipoEleccion(nuevoTipo);
            }
             i++;
            aux = aux.getSgteNodo();
    }
        }
    
        public void eliminarEleccion(int indice) {
            elecciones.eliminar(indice);
            
        }
        public int tama(){
            int i;
            System.out.println(" ");
            i=elecciones.longitud();
            return i;
        }
    public String[][] mostrarCandidato_row(int row) {
        int numElecciones = elecciones.longitud();
        Nodo<Eleccion> aux = elecciones.getCabeza();
        int i = 0;

        while (aux != null && i<numElecciones) {
            Eleccion eleccion = aux.getElemento();
            if(i==row){
          
               return eleccion.mostrarCandidato_row();
            }
             i++;
            aux = aux.getSgteNodo();
            
    }
        return null;
}
    public Eleccion eleccion_pos(int pos){
        int numElecciones = elecciones.longitud();
        Nodo<Eleccion> aux = elecciones.getCabeza();
        Eleccion eleccion = aux.getElemento();
        int i=0;
        while (aux != null && i<pos) {
            
            aux = aux.getSgteNodo();
            eleccion = aux.getElemento();
             i++;
    }
        return eleccion;
    }
    }
    
    

