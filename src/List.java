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

    public Node findNode(int i){
        if (isEmpty()){
            return new Node("");
        }

        Node node = head;

        for (int j = 0; j < i; j++) {
            node = node.next;

            if(node == null){
                return new Node("");
            }
        }

        return node;
    }
    public Node findNode(String data){
        if (isEmpty()){
            return new Node("");
        }

        Node node = head;

        while (node.data != data){
         node = node.next;
        }
        return node;
    }

    public Node removeNode(int i){
        Node node = findNode(i);

        if (node == head){
            removeFromHead();
        }
        if (node == tail){
            removeFromTail();
        }
        if(node.next == null){
            return node;
        }

        return takeOutNode(node);
    }
    public Node removeNode(String data) {
        Node node = findNode(data);

        if (node == head) {
            removeFromHead();
        }
        if (node == tail) {
            removeFromTail();
        }
        if (node.next == null) {
            return node;
        }

        return takeOutNode(node);
    }

    private Node takeOutNode(Node node){
        node.next.previous = node.previous;
        node.previous.next = node.next;

        node.next = null;
        node.previous = null;

        return node;
    }

    public Node addNode(Node newNode, String data){
        Node node = findNode(data);

        newNode.next = node;
        newNode.previous = node.previous;

        newNode.previous.next = newNode;
        node.previous = newNode;

        return newNode;
    }

}
