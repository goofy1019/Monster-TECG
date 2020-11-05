package listas;

public class Stack extends DLL{
	public int size;
	
	public Stack() {
		this.head = null;
		this.size = 0;
	}
	
	public void Push(Object data) {
		this.insertFirst(data);
	}
	
	public void Pop() {
		this.delFirst();
	}
	
	public Object Peek() {
		return this.head.getData();
	}
	
	public void printStack() {
		Node current = this.head;
		while (current != null) {
			System.out.println(current.getData().toString());
			current = current.getNext();
		}
	}

}
