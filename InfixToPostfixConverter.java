import Interfaces.Stack;

public class InfixToPostfixConverter<T> {

    private Stack<T> operatorStack;

    public InfixToPostfixConverter(Stack<T> operatorStack) {
        this.operatorStack = operatorStack;
    }

    public String convert(String expression) {
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') continue;

            // Número (permite varios dígitos)
            if (Character.isDigit(c)) {
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    postfix.append(expression.charAt(i));
                    i++;
                }
                postfix.append(' ');
                i--;
            }
            else if (c == '(') {
                operatorStack.push((T) Character.valueOf(c));
            }
            else if (c == ')') {
                while (!operatorStack.isEmpty() &&
                       (char) operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop()).append(' ');
                }
                operatorStack.pop(); // eliminar '('
            }
            else { // operador
                while (!operatorStack.isEmpty() &&
                       precedence((char) operatorStack.peek()) >= precedence(c)) {
                    postfix.append(operatorStack.pop()).append(' ');
                }
                operatorStack.push((T) Character.valueOf(c));
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    private int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}