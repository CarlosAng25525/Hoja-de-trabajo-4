public interface List<T> {
    void addLast(T item);
    T removeLast();
    T getLast();
    boolean isEmpty();
    int size();
}