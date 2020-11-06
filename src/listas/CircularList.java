package listas;

import cartas.Carta;
import cartas.CartaEsbirros;
import cartas.CartaHechizos;
import cartas.CartaSecretos;

public class CircularList {
	private Node start;
	public int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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
		}else {
			Node last = this.start.getPrev();
			newNode.setNext(this.start);
			this.start.setPrev(newNode);
			newNode.setPrev(last);
			last.setNext(newNode);
			this.setSize(size + 1);
		}
	}
	
	public void insertEnd(Carta data) {
		Node newNode = new Node(data);
		if (this.start == null) {
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			this.start = newNode;
			return;
		}else {
			Node last = this.start.getPrev();
			newNode.setNext(this.start);
			this.start.setPrev(newNode);
			newNode.setPrev(last);
			last.setNext(newNode);
			this.setSize(size + 1);
		}
	}

	public void insertFirst(Object data) {
		Node newNode = new Node(data);
		if (this.start == null) {
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			this.start = newNode;
			return;
		}else {
			Node last = this.start.getPrev();
			newNode.setNext(this.start);
			newNode.setPrev(last);
			last.setNext(newNode);
			this.start.setPrev(newNode);
			this.start = newNode;
			this.setSize(size + 1);
		}
	}
	
	public void insertFirstC(Carta data) {
		Node newNode = new Node(data);
		if (this.start == null) {
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			this.start = newNode;
			return;
		}else {
			Node last = this.start.getPrev();
			newNode.setNext(this.start);
			newNode.setPrev(last);
			last.setNext(newNode);
			this.start.setPrev(newNode);
			this.start = newNode;
			this.setSize(size + 1);
		}
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
		this.setSize(size + 1);
	}
	
	public void insertAfterC(Node prev_Node, Carta data) {
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
		this.setSize(size + 1);
	}

	public void delNode(Object data) {
		if (this.start == null) {
			return;
		}else {
			Node current = this.start;
			Node prev_1 = null;
			while (current.getData() != data) {
				if (current.getNext() == this.start) {
					System.out.printf("\nList doesn't have node with value = %d", data);
					return;
				}else {
					prev_1 = current;
					current = current.getNext();
				}
			}
			if (current.getNext() == this.start && prev_1 == null) {
				(this.start) = null;
				return;
			}
			else if (current == this.start) {
				prev_1 = this.start;
				this.start = this.start.getNext();
				prev_1.setNext(this.start);
				this.start.setPrev(prev_1);
			} else if (current.getNext() == this.start) {
				prev_1.setNext(this.start);
				this.start.setPrev(prev_1);
			} else {
				Node temp = current.getNext();
				prev_1.setNext(temp);
				temp.setPrev(prev_1);
			}
			return;
		}
		
	}
	
	public void delNodeC(Carta data) {
		if (this.start == null) {
			return;
		}else {
			Node current = this.start;
			Node prev_1 = null;
			while (current.getData() != data) {
				if (current.getNext() == this.start) {
					System.out.printf("\nList doesn't have node with value = %d", data);
					return;
				}else {
					prev_1 = current;
					current = current.getNext();
				}
			}
			if (current.getNext() == this.start && prev_1 == null) {
				(this.start) = null;
				return;
			}
			else if (current == this.start) {
				prev_1 = this.start;
				this.start = this.start.getNext();
				prev_1.setNext(this.start);
				this.start.setPrev(prev_1);
			} else if (current.getNext() == this.start) {
				prev_1.setNext(this.start);
				this.start.setPrev(prev_1);
			} else {
				Node temp = current.getNext();
				prev_1.setNext(temp);
				temp.setPrev(prev_1);
			}
			return;
		}
		
	}
	
	public Object getNode(int pos) {
		int contador = 1;
		Node current = this.start;
		while (pos != contador) {
			current = current.getNext();
			contador ++;
		}
		return current.getData();
	}
	
	public void printList() {
		Node current = this.start;
		while (current.getNext() != this.start) {
			System.out.println(current.getData().toString());
			current = current.getNext();
		}
		System.out.println(current.getData().toString());
	}

}
