package cartas;

import listas.CircularList;
import java.util.Random;

public class Deck {
	private int size;
	public static CircularList deck1 = new CircularList();

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Deck() {
		this.setSize(deck1.size);
		Random rand = new Random();
		CardList lista = new CardList();
		Object carta1 = lista.listEsbirros.getNode(rand.nextInt(10) + 1);
		deck1.insertEnd(carta1);
		lista.removeE(carta1);
		Object carta2 = lista.listEsbirros.getNode(rand.nextInt(9) + 1);
		deck1.insertEnd(carta2);
		lista.removeE(carta2);
		Object carta3 = lista.listEsbirros.getNode(rand.nextInt(8) + 1);
		deck1.insertEnd(carta3);
		lista.removeE(carta3);
		Object carta4 = lista.listEsbirros.getNode(rand.nextInt(7) + 1);
		deck1.insertEnd(carta4);
		lista.removeE(carta4);
		Object carta5 = lista.listEsbirros.getNode(rand.nextInt(6) + 1);
		deck1.insertEnd(carta5);
		lista.removeE(carta5);
		Object carta6 = lista.listHechizos.getNode(rand.nextInt(10) + 1);
		deck1.insertEnd(carta6);
		lista.removeH(carta6);
		Object carta7 = lista.listHechizos.getNode(rand.nextInt(9) + 1);
		deck1.insertEnd(carta7);
		lista.removeH(carta7);
		Object carta8 = lista.listHechizos.getNode(rand.nextInt(8) + 1);
		deck1.insertEnd(carta8);
		lista.removeH(carta8);
		Object carta9 = lista.listHechizos.getNode(rand.nextInt(7) + 1);
		deck1.insertEnd(carta9);
		lista.removeH(carta9);
		Object carta10 = lista.listHechizos.getNode(rand.nextInt(6) + 1);
		deck1.insertEnd(carta10);
		lista.removeH(carta10);
		Object carta11 = lista.listHechizos.getNode(rand.nextInt(5) + 1);
		deck1.insertEnd(carta11);
		lista.removeH(carta11);
		Object carta12 = lista.listSecretos.getNode(rand.nextInt(10) + 1);
		deck1.insertEnd(carta12);
		lista.removeS(carta12);
		Object carta13 = lista.listSecretos.getNode(rand.nextInt(9) + 1);
		deck1.insertEnd(carta13);
		lista.removeS(carta13);
		Object carta14 = lista.listSecretos.getNode(rand.nextInt(8) + 1);
		deck1.insertEnd(carta14);
		lista.removeS(carta14);
		Object carta15 = lista.listSecretos.getNode(rand.nextInt(7) + 1);
		deck1.insertEnd(carta15);
		lista.removeS(carta15);
		Object carta16 = lista.listSecretos.getNode(rand.nextInt(6) + 1);
		deck1.insertEnd(carta16);
		lista.removeS(carta16);
		
	}
	
	//definir mano inicial en clase player
	
	public void DrawCard() {

	}
	
	public void printDeck() {
		deck1.printList();
	}

}
