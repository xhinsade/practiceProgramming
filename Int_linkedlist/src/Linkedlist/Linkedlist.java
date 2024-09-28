package Linkedlist;


public class Linkedlist {

    private Node head;

    public void add(int data){
        Node newNode = new Node(data);

        if ( head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    
    }

    public void printList(){
        Node current = head;

        while(current != null ){
            System.out.print( current.data + " -> ");
            current = current.next;
        }
        System.out.println( " null ");
    }
    
    public void deleteByValue(int value){
        if (head == null) return;

        if (head.data == value){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if(current.next.data == value){
                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
 
        }
    }
