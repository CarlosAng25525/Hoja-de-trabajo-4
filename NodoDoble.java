import java.lang.classfile.Superclass;

public class NodoDoble<T>{
    private T valor;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;

    public NodoDoble(T valor, NodoDoble<T> nodoA, NodoDoble<T> nodoB){
        this.valor=valor;
        this.siguiente=nodoB;
        this.anterior=nodoA;
    }

    public NodoDoble(T valor, NodoDoble<T> nodoA){
        this.valor=valor;
        this.siguiente=null;
        this.anterior=nodoA;
    }

    public NodoDoble(T valor){
        this.valor=valor;
        this.siguiente=null;
        this.anterior=null;
    }


    public T getValor(){
        return valor;
    }

    public NodoDoble<T> getSiguiente(){
        return siguiente;
    }
    
    public NodoDoble<T> getAnterior(){
        return anterior;
    }

    public void newSiguiente(NodoDoble<T> nodo){
        siguiente=nodo;
    }

    public void newAnterior(NodoDoble<T> nodo){
        anterior=nodo;
    }
}
