public class List {

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
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


}
