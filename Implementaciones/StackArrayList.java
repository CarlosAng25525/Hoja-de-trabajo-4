package Implementaciones;
import java.util.ArrayList;

import Interfaces.AbstractStack;

public class StackArrayList<T> extends AbstractStack<T> {

    private ArrayList<T> data = new ArrayList<>();

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
        return data.get(data.size() - 1);
    }
}