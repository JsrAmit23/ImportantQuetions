package LinkedListQuestions;

public class MiddleOfLinkedList {
    //Find the middle of a given linked list
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.next = null;
        node.data = data;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }n.next=node;
        }
    }


    public void printMiddle(){
        Node fstNode = head;
        Node slowNode = head;
        if(head!=null){
            while(fstNode!=null&&slowNode!=null){
                fstNode  = fstNode.next.next;
                slowNode = slowNode.next;
            }
            System.out.println("The of the middle element is "+ slowNode.data);
        }
    }
}
