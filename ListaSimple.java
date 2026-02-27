public class ListaSimple<T> extends AbstractLista<T> {
    private NodoSimple<T> inicio = null;

    public void addLast(T item){
        
        NodoSimple<T> nodo=inicio;
        
        while(nodo!=null && nodo.getSiguiente()!=null) {
            nodo=nodo.getSiguiente();            
        }
        NodoSimple<T>  nuevo = new NodoSimple<T>(item);
        if(inicio==null){
            inicio=nuevo;
        }else{
            nodo.newSiguiente(nuevo);
        }
        cont++;

    }

    public T removeLast() {
        if (inicio == null) return null;

        if (inicio.getSiguiente() == null) {
            T valor = inicio.getValor();
            inicio = null;
            cont--;
            return valor;
        }

        NodoSimple<T> nodoA = null;
        NodoSimple<T> nodoB = inicio;

        while (nodoB.getSiguiente() != null) {
            nodoA = nodoB;
            nodoB = nodoB.getSiguiente();
        }

        nodoA.newSiguiente(null);
        cont--;
        return nodoB.getValor();
    }
    
    public T getLast(){
        if(inicio==null){return null;}
        NodoSimple<T> nodo=inicio;
        while(nodo!=null && nodo.getSiguiente()!=null) {
            nodo=nodo.getSiguiente();            
        }
        return nodo.getValor();
    }

    public boolean isEmpty(){
        return cont==0;
    }

    public int size(){
        return cont;
    }
}