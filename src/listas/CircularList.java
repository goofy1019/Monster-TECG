package listas;

public class CircularList {
	private Node start;
	private int size;

	public CircularList() {
		this.start = null;
		this.size = 0;
	}

	public void insertEnd(Object data) {
		Node newNode = new Node(data);
		if (this.start == null) {
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			this.start = newNode;
			return;
		}
		Node last = this.start.getPrev();
		newNode.setNext(this.start);
		this.start.setPrev(newNode);
		newNode.setPrev(last);
		last.setNext(newNode);
		this.size++;
	}

	public void insertFirst(Object data) {
		Node newNode = new Node(data);
		if (this.start == null) {
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			this.start = newNode;
			return;
		}
		Node last = this.start.getPrev();
		newNode.setNext(this.start);
		newNode.setPrev(last);
		last.setNext(newNode);
		this.start.setPrev(newNode);
		this.start = newNode;
		this.size++;
	}

	public void insertAfter(Node prev_Node, Object data) {
		Node newNode = new Node(data);
		Node temp = this.start;
		while (temp.getData() != prev_Node.getData()) {
			temp = temp.getNext();
		}
		Node next = temp.getNext();
		temp.setNext(newNode);
		newNode.setPrev(temp);
		newNode.setNext(next);
		next.setPrev(newNode);
		this.size++;
	}

	public void delNode(Object data) {
		if (this.start == null) {
			return;
		}
		Node current = this.start;
		Node prev_1 = null;
		while (current.getData() != data) {
			if (current.getNext() == this.start) {
				System.out.printf("\nList doesn't have node with value = %d", data);
				return;
			}
			prev_1 = current;
			current = current.getNext();
		}
		if (current.getNext() == this.start && prev_1 == null) {
			(this.start) = null;
			return;
		}
		if(current == this.start) {
			prev_1 = this.start;
			this.start = this.start.getNext();
			prev_1.setNext(this.start);
			this.start.setPrev(prev_1);
		}
		else if(current.getNext() == this.start) {
			prev_1.setNext(this.start);
			this.start.setPrev(prev_1);
		}
		else {
			Node temp = current.getNext();
			prev_1.setNext(temp);
			temp.setPrev(prev_1);
		}
		return;
	}

}
