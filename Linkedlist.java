public class Linkedlist
{
    class Node
    {
        int data;
        Node next;
    }
    Node head=null;
    Node tail=null;
    int size=0;

    public void display()
    {
        Node temp=this.head;
        System.out.println("-------");
        while(temp!=null)
        {
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
        System.out.println(" ");
        System.out.println("-------");
    }
    public void addLast(int x) {
		Node node = new Node();
		node.data = x;
		node.next = null;
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}
		this.tail = node;
		this.size++;
	}

	public void addFirst(int x) {
		Node node = new Node();
		node.data = x;
		if (this.head == null) {
			this.head = node;
			this.tail = node;
			node.next = null;
		} else {
			node.next = this.head;
			this.head = node;
		}

		this.size++;
	}
	public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.display();
        list.addFirst(5);
        list.display();
	}

}