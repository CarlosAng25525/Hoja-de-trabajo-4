import java.util.Scanner;

import Interfaces.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Selección de pila
        System.out.println("Seleccione la implementación de la pila:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        int stackOption = scanner.nextInt();

        Stack<String> operatorStack;
        Stack<Integer> valueStack;

        if (stackOption == 1) {
            operatorStack = StackFactory.createStack("arraylist");
            valueStack = StackFactory.createStack("arraylist");

        } else if (stackOption == 2) {
            operatorStack = StackFactory.createStack("vector");
            valueStack = StackFactory.createStack("vector");

        } else {
            System.out.println("Seleccione el tipo de lista:");
            System.out.println("1. Simplemente encadenada");
            System.out.println("2. Doblemente encadenada");
            int listOption = scanner.nextInt();

            if (listOption == 1) {
                operatorStack = StackFactory.createStack("list-simple");
                valueStack = StackFactory.createStack("list-simple");
            } else {
                operatorStack = StackFactory.createStack("list-double");
                valueStack = StackFactory.createStack("list-double");
            }
        }

        // 2. Leer expresión
        String expression = new FileReader().readExpression("datos.txt");

        // 3. Convertir infix a postfix
        InfixToPostfixConverter<String> converter =
                new InfixToPostfixConverter<>(operatorStack);
        String postfix = converter.convert(expression);

        // 4. Evaluar postfix
        PostfixEvaluator<Integer> evaluator =
                new PostfixEvaluator<>(valueStack);
        int result = evaluator.evaluate(postfix);

        // 5. Mostrar resultados
        System.out.println("Expresión infix: " + expression);
        System.out.println("Expresión postfix: " + postfix);
        System.out.println("Resultado: " + result);

        scanner.close();
    }
}