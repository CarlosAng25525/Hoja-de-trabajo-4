import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Interfaces.Stack;

public class PostfixEvaluatorTest {

    @Test
    @DisplayName("evaluacion postfix simple")
    public void testEvaluacionBasica() {
        Stack<Integer> stack = StackFactory.createStack("arraylist");
        PostfixEvaluator<Integer> evaluator =
                new PostfixEvaluator<>(stack);

        int resultado = evaluator.evaluate("3 4 +");

        assertEquals(7, resultado);
    }

    @Test
    @DisplayName("evaluacion postfix compleja")
    public void testEvaluacionCompleja() {
        Stack<Integer> stack = StackFactory.createStack("list-simple");
        PostfixEvaluator<Integer> evaluator =
                new PostfixEvaluator<>(stack);

        int resultado = evaluator.evaluate("10 20 + 9 *");

        assertEquals(270, resultado);
    }
}