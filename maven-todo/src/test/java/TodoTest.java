import org.example.Todo;
import org.junit.Test;

import static org.junit.Assert.*;

public class TodoTest {
    @Test
    public void testTodo() {
        Todo todo = new Todo(1, "Hello world!", "This is a description", true);
        assertEquals(1, todo.getId());
        assertEquals("Hello world!", todo.getTitle());
        assertEquals("This is a description", todo.getDescription());
        assertTrue(todo.isCompleted());
    }
}