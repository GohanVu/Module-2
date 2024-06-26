package excersice.ImpleQueue;

public class MyLinkedListQueue {
    private Node head ;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null ;
        this.tail = null;
    }
    public void enqueue(int value){
        Node temp = new Node (value);
        if(this.tail == null){
            this.tail= temp;
            this.head = this.tail;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue(){
        if (this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return temp;
    }
}
