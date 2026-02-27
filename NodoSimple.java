public class NodoSimple<T>{
    private T valor;
    private NodoSimple<T> siguiente;

    public NodoSimple(T valor, NodoSimple<T> nodo){
        this.valor=valor;
        this.siguiente=nodo;
    }

    public NodoSimple(T valor){
        this.valor=valor;
        this.siguiente=null;
    }

    public T getValor(){
        return valor;
    }

    public NodoSimple<T> getSiguiente(){
        return siguiente;
    }

    public void newSiguiente(NodoSimple<T> nodo){
        siguiente=nodo;
    }
}
