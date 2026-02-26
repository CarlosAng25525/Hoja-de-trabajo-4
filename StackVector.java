import java.util.Vector;

public class StackVector<T> extends AbstractStack<T> {

    private Vector<T> data = new Vector<>();

    @Override
    public void push(T item) {
        data.add(item);
        count++;
    }

    @Override
    public T pop() {
        count--;
        return data.remove(data.size() - 1);
    }

    @Override
    public T peek() {
        return data.lastElement();
    }
}