public class List {

    Node head = null;
    Node tail = null;

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public Node insertFormHead(String s){

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
            res = res + n.data;
            n = n.next;
        }
        return res;
    }
}
