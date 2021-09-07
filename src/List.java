public class List {

    Node head = null;
    Node tail = null;

    public Node insertFormHead(Node n){
        if (head == null){
            head = n;
            tail = n;

            return head;
        }

        head.previous = n;
        n.next = head;

        head = n;

        return head;
    }

}
