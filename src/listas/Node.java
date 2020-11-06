package listas;

public class Node {
	private Object data;
	private Node next;
	private Node prev;

	public Node(Object data) {
		this.next = null;
		this.prev = null;
		this.data = data;
	}

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
