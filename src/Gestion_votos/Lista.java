package Gestion_votos;
import java.io.Serializable;
public class Lista<T> implements Serializable{
    
        private Nodo<T> cabeza;
        private Nodo<T> ultimo;
    
       
        public Lista() {
            cabeza = null;
            ultimo = null;
        }
    
        public boolean esVacia() {
            return cabeza == null;
        }
    
        public void agregar(T pElemento) {
            Nodo<T> nuevoNodo = new Nodo<>(pElemento, null);
            if (esVacia()) {
                cabeza = nuevoNodo;
                ultimo = nuevoNodo;
            } else {
                ultimo.setSgteNodo(nuevoNodo);
                ultimo = nuevoNodo;
            }
        }
    
        public void mostrar() {
            Nodo<T> aux = cabeza;
            while (aux != null) {
                System.out.print(aux.getElemento() + "\t");
                aux = aux.getSgteNodo();
            }
            System.out.println();
        }
    
        public int longitud() {
            int num = 0;
            Nodo<T> aux = cabeza;
            while (aux != null) {
                num++;
                aux = aux.getSgteNodo();
            }
            return num;
        }
    
        public T iesimo(int pos) {
            if (pos >= 1 && pos <= longitud()) {
                Nodo<T> aux = cabeza;
                for (int i = 1; i < pos; i++) {
                    aux = aux.getSgteNodo();
                }
                return aux.getElemento();
            }
            return null;
        }
    
    public void eliminar(int pos) {
        if (pos >= 1 && pos <= longitud()) {
            if (pos == 1) { 
                cabeza = cabeza.getSgteNodo();
            } else { 
                Nodo<T> aux = cabeza;
                int i = 1;
                while (i < pos - 1) {
                    aux = aux.getSgteNodo();
                    i++;
                }
                
                if (aux.getSgteNodo() == this.ultimo) {
            aux.setSgteNodo(null);
            this.ultimo = aux; 
        } else {
            
            aux.setSgteNodo(aux.getSgteNodo().getSgteNodo());
        }
                
            }
        }
    }


        public Nodo<T> getCabeza() {
            return cabeza;
            
        }
    }
    
    

