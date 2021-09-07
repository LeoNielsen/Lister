import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    List list = new List();

    @org.junit.jupiter.api.Test
    void insertFormHead() {
        assertEquals("1", list.insertFormHead(new Node("1")).data);
    }
}