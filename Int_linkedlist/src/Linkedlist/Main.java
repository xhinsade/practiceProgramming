package Linkedlist;

public class Main {
    
    public static void main(String[] args) {
        
        Linkedlist list = new Linkedlist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(" Current Linked List: ");
        list.printList();

        System.out.println();
        System.out.println( " Deleting 20 from the list... ");
        System.out.println( " Current Linked List: ");
        list.deleteByValue(20);
        list.printList();

        System.out.println();
        System.out.println(" Moving / Swapping node from index 1 to index 0");
        list.moveNodePointer(1, 0) ;
        list.printList();

    }
}