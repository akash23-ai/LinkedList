public class LinkedListCustom {
    private Node head;
    private int size;
    class Node {
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        
        LinkedListCustom list  = new LinkedListCustom();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(3);
        list.print();
    }

    private void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }
    private void add(int data , int index){
        Node newNode = new Node(data);
        if(head == null&& index > 0){
            System.out.println("cant access the index");
            return;
        }
        Node currNode = head.next;
        Node prevNode = head;
        int counter = 0;
        while(counter!=(index-1)){
            counter++;
            currNode = currNode.next;
            prevNode = prevNode.next;
        }
        prevNode.next = newNode;
        newNode.next = currNode;
    }

    private void print(){
        if(head == null){
            System.out.println("Null");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }
}