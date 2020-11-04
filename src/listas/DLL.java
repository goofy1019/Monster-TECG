package listas;

public class DLL { // Doubly Linked List
	private Node head;
	private int size;

	public DLL() {
		this.head = null;
		this.size = 0;
	}

	public void insertFirst(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(this.head);
		newNode.setPrev(null);
		if (this.head != null) {
			this.head.setPrev(newNode);
		}
		this.head = newNode;
		this.size++;
	}

	public void insertLast(Object data) {
		Node newNode = new Node(data);
		Node last = this.head;
		newNode.setNext(null);
		if (head == null) {
			newNode.setPrev(null);
			this.head = newNode;
			return;
		}
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrev(last);
		this.size++;
	}

	public void insertAfter(Node prev_Node, Object data) {
		if (prev_Node == null) {
			System.out.println("Node cannot be null");
			return;
		}
		Node newNode = new Node(data);
		newNode.setNext(prev_Node.getNext());
		prev_Node.setNext(newNode);
		newNode.setPrev(prev_Node);
		if (newNode.getNext() != null) {
			newNode.getNext().setPrev(newNode);
		}
	}

	public void printList(Node node) {
		Node last = null;
		System.out.println("Recorrido izq-der");
		while (node != null) {
			System.out.print(node.getData() + " ");
			last = node;
			node = node.getNext();
		}
		System.out.println();
		System.out.println("Recorrido der-izq");
		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getPrev();
		}
	}

}
