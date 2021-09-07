import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();

    @org.junit.jupiter.api.Test
    void insertFormHead() {
        assertEquals("1", list.insertFormHead("1"));
        assertEquals("2", list.insertFormHead("2"));
        assertEquals("3", list.insertFormHead("3"));
    }


}