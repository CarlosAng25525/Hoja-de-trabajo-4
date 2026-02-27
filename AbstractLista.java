public abstract class AbstractLista<T> implements Lista<T> {

    protected int cont = 0;

    @Override
    public boolean isEmpty() {
        return cont == 0;
    }

    @Override
    public int size() {
        return cont;
    }
}