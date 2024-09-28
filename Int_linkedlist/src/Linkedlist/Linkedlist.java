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
        public void moveNodePointer(int currentIndex, int newIndex){
            if (head == null || currentIndex == newIndex) return ;

            Node current = head;
            Node prev = null;
            Node movingNode = null;
            Node movingPrev = null;

            for (int i = 0; current != null && i < currentIndex; i++){

                movingPrev = prev;
                prev = current;
                current = current.next;

            }
                movingNode = current;

                if (movingNode == null) return ;

                if (movingPrev != null) {
                    movingPrev.next = movingNode.next;
                } else {
                    head = movingNode.next;
                }

                current = head;
                prev = null;

                for (int i = 0; current != null && i < newIndex; i++){
                    prev = null;
                    current = current.next;          
                
                } 

                if (prev != null){
                    movingNode.next = current;
                    prev.next = movingNode;

                } else {
                    movingNode.next = head;
                    head = movingNode;

                }
        }
    }
        
