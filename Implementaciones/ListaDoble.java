package Implementaciones;
import Interfaces.AbstractLista;


public class ListaDoble<T> extends AbstractLista<T> {
    private NodoDoble<T> inicio = null;
    private NodoDoble<T> fin = null;

    public void addLast(T item) {
        NodoDoble<T> nuevo = new NodoDoble<>(item);

        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.newSiguiente(nuevo);  
            nuevo.newAnterior(fin);    
            fin = nuevo;              
        }
        cont++;
    }

    public T removeLast() {
        if (fin == null) return null;

        T valor = fin.getValor();

        if (inicio == fin) { 
            inicio = null;
            fin = null;
        } else {
            fin = fin.getAnterior();   
            fin.newSiguiente(null);   
        }

        cont--;
        return valor;
    }

    public T getLast() {
        if (fin == null) return null;
        return fin.getValor();
    }

    public boolean isEmpty() {
        return cont == 0;
    }

    public int size() {
        return cont;
    }
}