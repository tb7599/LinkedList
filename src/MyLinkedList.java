public class MyLinkedList {
    private Node head;
    private Node tail;
    private Node currentSize;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }


    public MyLinkedList() {
        this.head=null;
        this.tail=null;
        currentSize=0;
    }

    public static void main(String[] args)
    {
        MyLinkedList linkedlist=new MyLinkedList();
        Node node = new Node(10,null);

        // linkedlist.insert(node);


}

}

