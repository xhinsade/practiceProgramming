package Linkedlist;

public class Main {
    
    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();

        // Added the Elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(" Current Linked List: ");
        list.printList();

        //Deleting the Node inside the list
        System.out.println();
        System.out.println( " Deleting 20 from the list... ");
        System.out.println( " Current Linked List: ");
        list.deleteByValue(20);
        list.printList();

        //Moving and Swapping the Node from the list
        System.out.println();
        System.out.println(" Moving / Swapping node from index 1 to index 0");
        list.moveNodePointer(1, 0) ;
        list.printList();

    }
}