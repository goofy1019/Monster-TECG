package listas;

public class DLL { // Doubly Linked List
	private Node head;
	private int size;

	// agregar funcion find node

	public DLL() {
		this.setHead(null);
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public void insertFirst(Object data) {
		Node newNode = new Node(data);
		newNode.setNext(this.getHead());
		newNode.setPrev(null);
		if (this.getHead() != null) {
			this.getHead().setPrev(newNode);
		} else {
			this.setHead(newNode);
			this.size++;
		}
	}

	public void insertLast(Object data) {
		Node newNode = new Node(data);
		Node last = this.getHead();
		newNode.setNext(null);
		if (this.getHead() == null) {
			newNode.setPrev(null);
			this.setHead(newNode);
		} else {
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
			newNode.setPrev(last);
			this.size++;
		}

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
	
	public void delNode(Object searchValue) {
		Node current = this.head;
		Node previous = this.head;
		while (current != null) {
			if (current.getData().equals(searchValue)) {
				if (current == this.head) {
					this.head = this.head.getNext();
				} else {
					previous.setNext(current.getNext());
				}
				this.size--;
				return;
			} else {
				previous = current;
				current = current.getNext();
			}
		}
		return;
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
			System.out.print(last.getData().toString() + " ");
			last = last.getPrev();
		}
	}

	public void printList() {
		Node current = this.getHead();
		while (current != null) {
			System.out.println(current.getData().toString());
			current = current.getNext();
		}
	}
	
	public Object getNode(int pos) {
		int contador = 1;
		Node current = this.getHead();
		while (pos != contador) {
			current = current.getNext();
			contador ++;
		}
		return current.getData();
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
