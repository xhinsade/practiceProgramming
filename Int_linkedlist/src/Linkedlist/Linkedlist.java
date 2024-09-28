package Linkedlist;


public class Linkedlist {

    private Node head;

    //Method use to add new Node at the end of the list
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

    //Method use to print the linked list
    public void printList(){
        Node current = head;

        while(current != null ){
            System.out.print( current.data + " -> ");
            current = current.next;
        }
        System.out.println( " null ");
    }
    
    //Method use to Delete a Node by Value
    public void deleteByValue(int value){
        if (head == null) return;

        //if the head needs to be removed 
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
        //,Method use to Move a Node to a new position / swap nodes
        public void moveNodePointer(int currentIndex, int newIndex){
            if (head == null || currentIndex == newIndex) return ;

            Node current = head;
            Node prev = null;
            Node movingNode = null;
            Node movingPrev = null;

            //Find the node to Move
            for (int i = 0; current != null && i < currentIndex; i++){

                movingPrev = prev;
                prev = current;
                current = current.next;

            }
                movingNode = current;

                //If the node to move was not found 
                if (movingNode == null) return ;


                //Remove the node from its current position 
                if (movingPrev != null) {
                    movingPrev.next = movingNode.next;
                } else {
                    //Moving the head
                    head = movingNode.next;
                }

                //Insert the nide at the new Position 
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
    

    

    
        
