import java.util.*;

public class ListElement {
    private ListElement head;
    private ListElement next = null;
    private ListElement previous;
    private int data = 0;

    //Constructor.
    public ListElement() {
        this.next = null;
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

        ListElement node = new ListElement();
        //Set the data of the new element.
         node.setData(data);
        // Make next of node the new head.
        node.next = head;

      // Move the head to new Node
        head = node;

    }

    public  ListElement deleteElement (int index) {
                if(head==null) {
                   return null;
                }
        ListElement node = head;

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

        // Node.next is the node to be deleted
        ListElement next = node.next.next;

        node.next = next;
         return node;
    }

    //Prints linked list from head first.
    public void printLinkedListHead()
    {
        ListElement node = head;
        while (node !=null)
        {
            System.out.print(node.getData()+" ");
            node = node.next;
        }
    }


    public void getElement(int index) {
        ListElement node = new ListElement();
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

        ListElement list = new ListElement();

        list.addElement(6);
        list.addElement(4);
        list.addElement(3);
        list.addElement(2);
        list.addElement(1);
        System.out.println("\nElement at index 4 is:");
        list.getElement(4);
        System.out.println("\nLinked list is: ");
        list.printLinkedListHead();

        list.deleteElement(4);  // Delete node at position 5 -> first position is 0.

        System.out.println("\nLinked List after Deletion at index 4: ");
        list.printLinkedListHead();
    }
}

