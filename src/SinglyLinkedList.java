
public class SinglyLinkedList {
	private SinglyLinkedList head;
	private SinglyLinkedList next;
	private SinglyLinkedList previous;
	private int data;
	
	public SinglyLinkedList()
	{
		this.data = 0;
		this.next = null;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void addElement(SinglyLinkedList sll)
	{
		SinglyLinkedList node = new SinglyLinkedList();
		
		if (sll.head == null)
		{
			sll.head = node;
		}
		
		else
		{
			while (sll.next != null)
			{
				sll = sll.next;
			}
			sll.next = node;
		}
	}
	
	public SinglyLinkedList getElement(SinglyLinkedList sll, int index)
	{
		SinglyLinkedList node = new SinglyLinkedList();
		node = sll.head;
		
		if(node != null && node.data == index)
		{
			return node;
		}
		
		return sll;
	}
	
	
}

class Main {
	SinglyLinkedList sll = new SinglyLinkedList();
	
	
}