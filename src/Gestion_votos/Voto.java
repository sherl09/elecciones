/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_votos;
import java.io.Serializable;
public class Voto implements Serializable{
    private String tipo;          
    private Candidato candidato;  


    public Voto(String tipo) {
        this.tipo = tipo;
        this.candidato = null; 
    }


    public void setCandidato(Candidato candidato) {
            this.candidato = candidato;
    }

    public Candidato getCandidato() {
        return this.candidato;
    }

    public String getTipo() {
        return this.tipo;
    }
    
}