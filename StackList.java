public class StackList<T> extends AbstractStack<T> {

    private Lista<T> data;

    public StackList(Lista<T> list) {
        this.data = list;
    }

    @Override
    public void push(T item) {
        data.addLast(item);
        count++;
    }

    @Override
    public T pop() {
        count--;
        return data.removeLast();
    }

    @Override
    public T peek() {
        return data.getLast();
    }
}