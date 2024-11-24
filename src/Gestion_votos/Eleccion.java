package Gestion_votos;

import java.util.Stack;
import java.io.Serializable;
public class Eleccion implements Serializable{
        private static int id=0;
        private String fecha;
        private String tipoEleccion;
        private Lista<Candidato> candidatos;
        private Lista<Mesa> mesaelectoral;
        
        public Eleccion(String fecha, String tipoEleccion) {
            this.fecha = fecha;
            this.tipoEleccion = tipoEleccion;
            this.candidatos = new Lista<>();
            this.mesaelectoral = new Lista<>();
            id++;
        }

    public Lista<Mesa> getMesaelectoral() {
        return mesaelectoral;
    }

    public void setMesaelectoral(Lista<Mesa> mesaelectoral) {
        this.mesaelectoral = mesaelectoral;
    }
    
        public String getFecha() {
            return fecha;
        }
    
        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
    
        public String getTipoEleccion() {
            return tipoEleccion;
        }
    
        public void setTipoEleccion(String tipoEleccion) {
            this.tipoEleccion = tipoEleccion;
        }
    
        public Lista<Candidato> getCandidatos() {
            return candidatos;
        }
    
        public void agregarCandidato(Candidato candidato) {
            candidatos.agregar(candidato);
        }
    
    public String[][] mostrarCandidato_row() {

    Nodo<Candidato> aux = candidatos.getCabeza();
    int numcandidatos=candidatos.longitud();
    String [][] candidatosArray=new String[numcandidatos][4];
    int i=0;

    while (aux != null) {
        Candidato candidato_ = aux.getElemento();
        candidatosArray[i][0] = candidato_.getDni(); 
        candidatosArray[i][1] = candidato_.getNombre();
        candidatosArray[i][2] = candidato_.getApellido();
        candidatosArray[i][3] = candidato_.getPartido();
        aux = aux.getSgteNodo();
        i++;
    }
    return candidatosArray;
}

    public void eliminar_candidato(int indice){
        candidatos.eliminar(indice);
    }
    public void modificarCandidato(int indice, String DNI, String nombre, String apellido,String partido) {
        int numElecciones = candidatos.longitud();
        Nodo<Candidato> aux = candidatos.getCabeza();
        int i = 0;
    
        while (aux != null && i<numElecciones) {
            Candidato candidato = aux.getElemento();
           
            if(i==indice){
                candidato.setDni(DNI);
                candidato.setNombre(nombre);
                candidato.setPartido(partido);
                candidato.setApellido(apellido);
            }
             i++;
            aux = aux.getSgteNodo();
    }
        }
   public Candidato candidato_pos(int pos){
        Nodo<Candidato> aux = candidatos.getCabeza();
        Candidato candidato = aux.getElemento();
        int i=0;
        while (aux != null && i<pos) {
            
            aux = aux.getSgteNodo();
            candidato = aux.getElemento();
             i++;
    }
        return candidato;
    }
    public String[][] mostrarMesa() {
    // Determina cuántas elecciones hay
    Nodo<Mesa> aux = mesaelectoral.getCabeza();
    int nummesa = mesaelectoral.longitud();
    String[][] eleccionesArray = new String[nummesa][2]; 
    
    int i = 0; 
    // Itera a través de las elecciones y llena el array bidimensional
    while (aux != null) {
        Mesa mesa = aux.getElemento();
        eleccionesArray[i][0] = String.valueOf(mesa.getNumero()) ; // Columna 1: Fecha
        eleccionesArray[i][1] = mesa.getUbicacion(); // Columna 2: Tipo de elección
        aux = aux.getSgteNodo();
        i++;
    }
    return eleccionesArray;
}
    public boolean buscar_mesa(String mesa_,String ubicacion){
        Nodo<Mesa> aux = mesaelectoral.getCabeza();
        int i = 0;
        boolean encontro=false;
    while (aux != null) {
        Mesa mesa = aux.getElemento();
        if(String.valueOf(mesa.getNumero()).equals(mesa_)&& mesa.getUbicacion().equals(ubicacion)){
            encontro=true;
            break;
        }
        aux = aux.getSgteNodo();
        i++;
    }
    return encontro;
    }
    public void agregarMesa(Mesa mesa) {
            mesaelectoral.agregar(mesa);
    }
    public void eliminar_mesa(int indice){
        mesaelectoral.eliminar(indice);
    }
        public void modificarMesa(int indice, String numero_mesa, String ubicacion) {
        int numMesa = mesaelectoral.longitud();
        Nodo<Mesa> aux = mesaelectoral.getCabeza();
        int i = 0;

        while (aux != null && i<numMesa) {
            Mesa mesa = aux.getElemento();
           
            if(i==indice){
                mesa.setNumero(numero_mesa);
                mesa.setUbicacion(ubicacion);
            }
             i++;
            aux = aux.getSgteNodo();
    }
        }
            
   public Mesa mesa_pos(int pos){
        Nodo<Mesa> aux = mesaelectoral.getCabeza();
        Mesa mesa = aux.getElemento();
        int i=0;
        while (aux != null && i<pos) {
            aux = aux.getSgteNodo();
            mesa = aux.getElemento();
             i++;
    }
        return mesa;
    }
    public Lista<Acta_electoral> obtenerActas() {
        Lista<Acta_electoral> actas = new Lista<>();
        Nodo<Mesa> aux = mesaelectoral.getCabeza();
        while (aux != null) {
            Mesa mesa = aux.getElemento();
            actas.agregar(mesa.getActa()); 
            aux = aux.getSgteNodo();
        }
        return actas;
    }
    public int votos_totales_blancos(){
        int i=0;
        Lista<Acta_electoral> act=obtenerActas();
        Nodo <Acta_electoral>aux=act.getCabeza();
        while(aux!=null){
            Acta_electoral act_=aux.getElemento();
            i=act_.Voto_blanco_nulo("Voto blanco")+i;
            aux=aux.getSgteNodo();
        }
        return i;
    }
        public int votos_totales_nulos(){
        int i=0;
        Lista<Acta_electoral> act=obtenerActas();
        Nodo <Acta_electoral>aux=act.getCabeza();
        while(aux!=null){
            Acta_electoral act_=aux.getElemento();
            i=act_.Voto_blanco_nulo("Voto nulo")+i;
            aux=aux.getSgteNodo();
        }
        return i;
    }
public Candidato ganador_eleccion(){     
    int max = 0;
    Candidato ganador = null;
    Lista<Acta_electoral> act = obtenerActas();
    Nodo<Acta_electoral> aux = act.getCabeza();
    Nodo<Candidato> aux_ = candidatos.getCabeza();
    
    while(aux_ != null) {
        Candidato candidato = aux_.getElemento();
        int i = 0;
        Nodo<Acta_electoral> temp = aux;
        
        while(temp != null) {
            Acta_electoral act7 = temp.getElemento();
            i = act7.Voto_candidato(candidato.getDni()) + i;
            temp = temp.getSgteNodo();
        }
        if(i > max) {
            max = i;
            ganador = candidato;
        }
        aux_ = aux_.getSgteNodo();
    }
    
    return ganador;
}
public int voto_efectivo_total(){
    int i = 0;
    Lista<Acta_electoral> act = obtenerActas();
    Nodo<Acta_electoral> aux = act.getCabeza();
    while (aux != null) {
        Acta_electoral temp = aux.getElemento();
        i = temp.voto_efectivo() + i;
        aux = aux.getSgteNodo();  
    }
    return i;
}
     public int Voto_candidato_total(String candidato_DNI) {
        int i = 0;
        Lista<Acta_electoral> act=obtenerActas();
        Nodo<Acta_electoral> aux=act.getCabeza();
        while (aux!=null) {
            Acta_electoral temp=aux.getElemento();
            i=temp.Voto_candidato(candidato_DNI)+i;
            aux=aux.getSgteNodo();
        }
        
    return i; 
}
        public int votos_totales(){
        int i=0;
        Lista<Acta_electoral> act=obtenerActas();
        Nodo <Acta_electoral>aux=act.getCabeza();
        while(aux!=null){
            Acta_electoral act_=aux.getElemento();
            i=act_.Voto_blanco_nulo("Voto nulo")+act_.Voto_blanco_nulo("Voto blanco")+i;
            aux=aux.getSgteNodo();
        }
        i=i+voto_efectivo_total();
        return i;
    }
    
}
    
    

