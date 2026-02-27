import Interfaces.Stack;

public class PostfixEvaluator<T extends Number> {

    private Stack<T> valueStack;

    public PostfixEvaluator(Stack<T> valueStack) {
        this.valueStack = valueStack;
    }

    public int evaluate(String postfix) {
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {

            // Número
            if (token.matches("\\d+")) {
                valueStack.push((T) Integer.valueOf(token));
            }
            else { // operador
                int b = valueStack.pop().intValue();
                int a = valueStack.pop().intValue();

                int result = 0;
                switch (token.charAt(0)) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }
                valueStack.push((T) Integer.valueOf(result));
            }
        }
        return valueStack.pop().intValue();
    }
}