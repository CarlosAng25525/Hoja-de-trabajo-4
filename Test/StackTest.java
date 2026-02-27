import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import Interfaces.Stack;

public class StackTest {

    @Test
    @DisplayName("push y pop basico")
    public void testPushPop() {
        Stack<Integer> stack = StackFactory.createStack("arraylist");

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    @DisplayName("peek no elimina el elemento")
    public void testPeek() {
        Stack<Integer> stack = StackFactory.createStack("vector");

        stack.push(5);
        stack.push(8);

        assertEquals(8, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    @DisplayName("stack vacio")
    public void testIsEmpty() {
        Stack<String> stack = StackFactory.createStack("list-simple");

        assertTrue(stack.isEmpty());
        stack.push("A");
        assertFalse(stack.isEmpty());
    }
}