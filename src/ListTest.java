import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
        list.insertFormHead("1");
        assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void insertFormHead() {
        assertEquals("1", list.insertFormHead("1").data);
        assertEquals("2", list.insertFormHead("2").data);
        assertEquals("3", list.insertFormHead("3").data);
    }

    @Test
    void printListFromHead() {
        list.insertFormHead("1");
        list.insertFormHead("2");
        list.insertFormHead("3");

        assertEquals("321",list.printFromHead());

    }
}