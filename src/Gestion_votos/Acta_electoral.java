/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_votos;

import java.util.Queue;
import java.util.Stack;
import java.io.Serializable;
/**
 *
 * @author sherlock
 */
public class Acta_electoral implements Serializable{
    private static int idsta = 1;
    private int id;
    private Stack<Voto> votos;
    private String observaciones;

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Acta_electoral() {
        this.id = idsta++;
        this.votos = new Stack<>();
        this.observaciones = "";
    }

      
    public void agregarVoto(Voto voto) {
        this.votos.push(voto); 

    }
    public int Voto_blanco_nulo(String voto_tip) {
        int i = 0;
        Stack<Voto> aux = new Stack<>();  
        while (!votos.isEmpty()) {
        Voto voto = votos.pop(); 
        if (voto.getTipo().equals(voto_tip)) {
            i++; 
        }
        aux.push(voto); 
    }

    while (!aux.isEmpty()) {
        votos.push(aux.pop()); 
    }
    return i; 
}
    public int Voto_candidato(String candidato_DNI) {
        int i = 0;
        Stack<Voto> aux = new Stack<>();  
        while (!votos.isEmpty()) {
        Voto voto = votos.pop(); 
        if (voto.getTipo().equals("Voto efectivo") && voto.getCandidato().getDni().equals(candidato_DNI)) {
            i++; 
        }
        aux.push(voto); 
    }

    while (!aux.isEmpty()) {
        votos.push(aux.pop()); 
    }
    return i; 
} 
    public int voto_efectivo(){
         int i = 0;
        Stack<Voto> aux = new Stack<>();  
        while (!votos.isEmpty()) {
        Voto voto = votos.pop(); 
        if (voto.getTipo().equals("Voto efectivo")) {
            i++; 
        }
        aux.push(voto); 
    }

    while (!aux.isEmpty()) {
        votos.push(aux.pop()); 
    }
    return i; 
    }
        public Candidato ganador(){
        Stack<Voto> aux = new Stack<>();  
        int max = 0; 
        Candidato candidato=null;
        while (!votos.isEmpty()) {
            Voto voto = votos.pop(); 
            if (voto.getTipo().equals("Voto efectivo")) {
                Candidato candidato2 = voto.getCandidato();
                int votos2 = Voto_candidato(candidato2.getDni());
                if (votos2> max) {
                    max = votos2;
                    candidato=candidato2;
                }
            }
            aux.push(voto);
        }
        while (!aux.isEmpty()) {
            votos.push(aux.pop()); 
        }


        return candidato;
    }

}
    

