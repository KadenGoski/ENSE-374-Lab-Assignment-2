import java.util.*;

public class ListElement2 {
    private ListElement2 head;
    private ListElement2 tail;
    private ListElement2 next = null;
    private ListElement2 previous;
    private int data = 0;

    //Constructor.
    public ListElement2() {
        this.next = null;
        this.previous = null;
        this.data = 0;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void addElement(int data)
    {
        ListElement2 node = new ListElement2();
        ListElement2 end = new ListElement2();
        end = head;
        //Set the data of the new element.
        node.setData(data);
        node.next = head;
        node.previous = null;
        // Make next of node the new head.
        if (head != null)
        {
            head.previous = node;
        }
        head = node;

    }

    public  ListElement2 deleteElement (int index) {

        if(head==null) {
            return null;
        }
        ListElement2 node = head;

        if (index == 0)
        {
            head = node.next;
            return head;
        }

        for (int i=0; node!=null && i<index-1; i++)
            node = node.next;

        // If position is more than number of nodes. Return the original list.
        if (node == null || node.next == null)
            return head;

        // node.next is the node that is deleted
        ListElement2 next = node.next.next;

        node.next = next;
        return node;
    }

    //Prints linked list from head first.
    public void printLinkedListHead()
    {
        ListElement2 node = head;
        while (node !=null)
        {
            System.out.print(node.getData()+" ");
            node = node.next;
        }
    }


    //Kinda odd implementation however this allowed me to keep the same-ish code for the other functions as a SinglyLinkedList.
    public void printLinkedListTail()
    {
        ListElement2 node = head;
        while (node !=null)
        {
            tail = node;
            node = node.next;
        }


        while (tail != null)
        {
            System.out.print(tail.getData()+" ");
            tail = tail.previous;
        }
    }

    public void getElement(int index) {

        ListElement2 node = new ListElement2();
        node = head;

        //Loop to appropriate position.
        if (index == 0)
        {
            if (node != null) {
                System.out.print(node.getData() + " ");
            }
        }
        else {
            for (int i = 0; node != null && i < index - 1; i++) {
                node = node.next;
            }

            // If position is more than number of nodes, do nothing
            if (node == null || node.next == null) {

            }
            //else print out the data at position. (Prints out at index position assuming list starts at index 0.)
            else {
                System.out.print(node.next.getData() + " ");
            }
        }
    }

    public static void main(String[] args)
    {

        ListElement2 list = new ListElement2();

        list.addElement(6);
        list.addElement(4);
        list.addElement(3);
        list.addElement(2);
        list.addElement(1);
        System.out.println("\nElement at index 4 is: ");
        list.getElement(4);
        System.out.println("\nCreated Linked list is: ");
        list.printLinkedListHead();

        list.deleteElement(4);  // Delete node at position 5 -> first position is 0 index.

        System.out.println("\nLinked List after Deletion at position 5 (index 4): ");
        list.printLinkedListHead();
        System.out.println("\nLinked list in order: ");
        list.printLinkedListHead();
        System.out.println("\nLinked list in reverse order: ");
        list.printLinkedListTail();
    }
}