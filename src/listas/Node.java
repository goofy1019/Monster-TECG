package listas;

import cartas.CartaEsbirros;
import cartas.CartaHechizos;
import cartas.CartaSecretos;

public class Node {
	private Object data;
	private Node next;
	private Node prev;
	private String string;
	private CartaEsbirros cartaE;
	private CartaHechizos cartaH;
	private CartaSecretos cartaS;

	public Node(Object data) {
		this.next = null;
		this.prev = null;
		this.data = data;
	}
	
	public Node(String string) {
		this.next = null;
		this.prev = null;
		this.string = string;
	}
	
	public Node(CartaEsbirros carta) {
		this.next = null;
		this.prev = null;
		this.cartaE = carta;
	}
	
	public Node(CartaHechizos carta) {
		this.next = null;
		this.prev = null;
		this.cartaH = carta;
	}
	
	public Node(CartaSecretos carta) {
		this.next = null;
		this.prev = null;
		this.cartaS = carta;
	}

	public CartaEsbirros getCartaE() {
		return cartaE;
	}

	public void setCartaE(CartaEsbirros cartaE) {
		this.cartaE = cartaE;
	}

	public CartaHechizos getCartaH() {
		return cartaH;
	}

	public void setCartaH(CartaHechizos cartaH) {
		this.cartaH = cartaH;
	}

	public CartaSecretos getCartaS() {
		return cartaS;
	}

	public void setCartaS(CartaSecretos cartaS) {
		this.cartaS = cartaS;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
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
