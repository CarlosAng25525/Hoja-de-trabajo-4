public class StackFactory {

    public static <T> Stack<T> createStack(String type) {

        switch (type.toLowerCase()) {

            case "arraylist":
                return new StackArrayList<>();

            case "vector":
                return new StackVector<>();

            case "list-simple":
                return new StackList<>(new ListaSimple<>());

            case "list-double":
                return new StackList<>(new ListaDoble<>());

            default:
                throw new IllegalArgumentException("Tipo de pila no válido");
        }
    }
}