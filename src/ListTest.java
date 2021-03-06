import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
        list.insertFromHead("1");
        assertFalse(list.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void insertFormHead() {
        assertEquals("1", list.insertFromHead("1").data);
        assertEquals("2", list.insertFromHead("2").data);
        assertEquals("3", list.insertFromHead("3").data);
    }

    @Test
    void printListFromHead() {
        list.insertFromHead("1");
        list.insertFromHead("2");
        list.insertFromHead("3");

        assertEquals("321",list.printFromHead());
    }

    @Test
    void insertFormTail() {
        assertEquals("1",list.insertFromTail("1").data);
        assertEquals("2",list.insertFromTail("2").data);
        assertEquals("3",list.insertFromTail("3").data);
        assertEquals("4",list.insertFromTail("4").data);
    }

    @Test
    void printListFromTail() {
        list.insertFromHead("1");
        list.insertFromHead("2");
        list.insertFromHead("3");

        assertEquals("123",list.printFromTail());
    }

    @Test
    void removeFromHead() {
        Node n = new Node("");

        assertEquals(n.data, list.removeFromHead().data);

        list.insertFromHead("1");

        assertEquals("1",list.removeFromHead().data);

        list.insertFromHead("2");
        list.insertFromHead("3");

        assertEquals("3",list.removeFromHead().data);

        assertEquals("2", list.printFromHead());
    }
    @Test
    void removeFromTail() {
        Node n = new Node("");

        assertEquals(n.data, list.removeFromTail().data);

        list.insertFromTail("2");

        assertEquals("2",list.removeFromTail().data);

        list.insertFromTail("1");
        list.insertFromTail("3");

        assertEquals("3",list.removeFromTail().data);


        assertEquals("1", list.removeFromTail().data);
    }
}