public class List {

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        return head == null;
    }

    public Node insertFromHead(String s){

        Node node = new Node(s);

        if (isEmpty()){
            head = node;
            tail = node;

            return head;
        }

        head.previous = node;
        node.next = head;

        head = node;

        return head;
    }

    public String printFromHead() {
        String res = "";
        Node n = head;

        if (isEmpty()){
            return res;
        }

        while (n != null) {
            res += n.data;
            n = n.next;
        }
        return res;
    }

    public Node insertFromTail(String s) {
        Node node = new Node(s);

        if (isEmpty()){
            head = node;
            tail = node;

            return tail;
        }

        tail.next = node;
        node.previous = tail;

        tail = node;

        return tail;
    }


    public String printFromTail() {
        String res = "";
        Node n = tail;

        if (isEmpty()){
            return res;
        }

        while (n != null) {
            res += n.data;
            n = n.previous;
        }
        return res;
    }


    public Node removeFromHead() {
        if (isEmpty()){
            return new Node("");
        }
        Node n = head;

        if (head == tail){
            head = null;
            tail = null;

            return n;
        }

        head = n.next;

        n.next.previous = null;
        n.next = null;

        return n;
    }

    public Node removeFromTail() {
        if (isEmpty()){
            return new Node("");
        }
        Node n = tail;

        if (tail == head){
            tail = null;
            head = null;

            return n;
        }


        tail = n.previous;

        n.previous.next = null;
        n.previous = null;

        return n;
    }
}
