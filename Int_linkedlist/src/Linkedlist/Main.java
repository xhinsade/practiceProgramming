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
    }
}