import Implementaciones.ListaDoble;
import Implementaciones.ListaSimple;
import Implementaciones.StackArrayList;
import Implementaciones.StackList;
import Implementaciones.StackVector;
import Interfaces.Stack;

public class StackFactory {

    public static <T> Stack<T> createStack(String type) {

        switch (type.toLowerCase()) {

            case "arraylist":
                return new StackArrayList<T>();

            case "vector":
                return new StackVector<T>();

            case "list-simple":
                return new StackList<T>(new ListaSimple<T>());

            case "list-double":
                return new StackList<T>(new ListaDoble<T>());

            default:
                throw new IllegalArgumentException("Tipo de pila no válido");
        }
    }
}