import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import Interfaces.Stack;

public class InfixToPostfixTest {

    @Test
    @DisplayName("expresion simple")
    public void testConversionSimple() {
        Stack<Character> stack = StackFactory.createStack("arraylist");
        InfixToPostfixConverter converter =
                new InfixToPostfixConverter(stack);

        String infix = "3+4";
        String postfix = converter.convert(infix);

        assertEquals("3 4 +", postfix);
    }

    @Test
    @DisplayName("expresion con parentesis")
    public void testConversionConParentesis() {
        Stack<Character> stack = StackFactory.createStack("list-double");
        InfixToPostfixConverter converter =
                new InfixToPostfixConverter(stack);

        String infix = "(10+20)*9";
        String postfix = converter.convert(infix);

        assertEquals("10 20 + 9 *", postfix);
    }
}