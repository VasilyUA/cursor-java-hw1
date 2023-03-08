import org.example.TodoList.Todo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoTest {

    @Test
    void testConstructorAndGetters() {
        Todo todo1 = new Todo();
        todo1.setId(1);
        todo1.setTitle("Hello world!");
        todo1.setDescription("This is a description");
        todo1.setCompleted(true);
        Todo todo2 = new Todo();
        todo2.setId(2);
        todo2.setTitle("Hello world!");
        todo2.setDescription("This is a description");
        todo2.setCompleted(true);



        assertEquals(1, todo1.getId());
        assertEquals("Hello world!", todo1.getTitle());
        assertEquals("This is a description", todo1.getDescription());
        assertTrue(todo1.isCompleted());
        assertNotEquals(todo1.getId(), todo2.getId());

    }
}