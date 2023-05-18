
public class LinkList1 {

	public static class Node {
		int key;
		Node next;

		// Node(int key)
		// {
		// 	this.key=key;
		// 	this.next=null;
		// }
	}

	public static Node newNode(int key) {
		Node temp = new Node();
		temp.key = key;
		temp.next = null;
		return temp;
	}

	// A utility function to print a linked list
	public static void printList(Node head) {
		while (head != null) {
			System.out.print(head.key + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static Node addfirst(Node head, int val) {
		Node new_Node = newNode(val);

		new_Node.next = head;
		head = new_Node;
		return head;
	}

	public static void addLast(Node head, int val) {
		Node new_node = newNode(val);

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = new_node;

	}

	public static void search(Node head, int val) {
		Node ptr = head;
		while (ptr != null) {
			if (ptr.key == val) {
				System.out.println(" Yes !");
				// return true;
				return;

			}
			ptr = ptr.next;
		}
		System.out.println("not Present !");
		// return false;
	}

	public static Node deleteAtFirst(Node head) {
		if (head == null) {
			System.out.println("can't delete at first");
			return null; // return head;
		}

		head = head.next;
		return head;
	}

	public static Node deleteLast(Node head) {
		if (head.next == null) {
			
			System.out.println("Empty List");
			// head=null;
			//return head;
			return null;
		}
		Node last = head;
		while (last.next.next != null) {
			last = last.next;
		}
		last.next = null;
		return head;
	}

	public static void insertAfterNode(Node second, Node head, int val) {
		Node new_node = newNode(val);
		Node ptr = head;
		while (ptr != second) {
			ptr = ptr.next;
		}

		new_node.next = ptr.next;
		ptr.next = new_node;

	}

public static Node deleteNodeData(Node head, int val)
{
	if(head.key == val)
	{
		head=head.next;
		return head;
	}

	Node ptr=head;
	while(ptr != null && ptr.next != null)
	{
		if(ptr.next.key == val)
		{
			ptr.next=ptr.next.next;
			// return head;
		}
		ptr=ptr.next;
	}
	
	return head;

}

	// Driver code
	public static void main(String args[]) {
		// Node head = newNode(1);
		// head.next = newNode(2);
		// head.next.next = newNode(3);
		// head.next.next.next = newNode(4);
		// head.next.next.next.next = newNode(5);

		Node head = newNode(5);
		Node second = newNode(6);
		Node third = newNode(8);
		Node fourth = newNode(9);
		Node five = newNode(10);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = five;
		five.next = null;

		System.out.println("LinkedList created :");
		printList(head);

		// Node head1 = addfirst(head, 14);
		// System.out.println("LinkedList after addfirst");
		// printList(head1);

		// LinkList1 llist = new LinkList1();
		// Node head3=llist.addfirst(head,99);
		// printList(head3);

		// insertAfterNode(second, head, 17);
		// System.out.println("LinkList After Insert after given node");
		// printList(head);

		// addLast(head, 100);
		// System.out.println("LinkedList after addLast");
		// printList(head);

		// Node head4=deleteAtFirst(head);
		// System.out.println("link list after delear First");
		// printList(head4);

		// Node head1= deleteLast(head);
		// System.out.println("LinkedList After deleteLast");
		// printList(head1);

// Node head1=deleteNodeData(head, 5);
// System.out.println("LinkList AFter delete given Val");
// printList(head1);

		// System.out.println("LinkedList After deleteLast");
		// printList(deleteLast(head));
		// printList(deleteLast(head));
		// printList(deleteLast(head));
		// printList(deleteLast(head));

		search(head, 16);//search given val

		

	}
}
