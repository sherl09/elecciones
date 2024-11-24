package Gestion_votos;
import java.io.Serializable;
public class Nodo<T> implements Serializable{
    
        private T elemento;
        private Nodo<T> sgteNodo;
    
        public Nodo() {
            this.elemento = null;
            this.sgteNodo = null;
        }
    
        public Nodo(T pElemento, Nodo<T> pSgteNodo) {
            elemento = pElemento;
            sgteNodo = pSgteNodo;
        }
    
        public void setElemento(T pElemento) {
            elemento = pElemento;
        }
    
        public T getElemento() {
            return elemento;
        }
    
        public void setSgteNodo(Nodo<T> pSgteNodo) {
            sgteNodo = pSgteNodo;
        }
    
        public Nodo<T> getSgteNodo() {
            return sgteNodo;
        }
}
    
    

