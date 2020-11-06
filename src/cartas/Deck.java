package cartas;

import listas.Stack;
import java.util.Random;

public class Deck {
	public Stack deck1 = new Stack();

	public Deck() {
		Random rand = new Random();
		CardList lista = new CardList();
		Object carta1 = lista.listEsbirros.getNode(rand.nextInt(10) + 1);
		deck1.Push(carta1);
		lista.removeE(carta1);
		Object carta7 = lista.listHechizos.getNode(rand.nextInt(10) + 1);
		deck1.Push(carta7);
		lista.removeH(carta7);
		Object carta12 = lista.listSecretos.getNode(rand.nextInt(10) + 1);
		deck1.Push(carta12);
		lista.removeS(carta12);
		Object carta2 = lista.listEsbirros.getNode(rand.nextInt(9) + 1);
		deck1.Push(carta2);
		lista.removeE(carta2);
		Object carta3 = lista.listEsbirros.getNode(rand.nextInt(8) + 1);
		deck1.Push(carta3);
		lista.removeE(carta3);
		Object carta8 = lista.listHechizos.getNode(rand.nextInt(9) + 1);
		deck1.Push(carta8);
		lista.removeH(carta8);
		Object carta13 = lista.listSecretos.getNode(rand.nextInt(9) + 1);
		deck1.Push(carta13);
		lista.removeS(carta13);
		Object carta4 = lista.listEsbirros.getNode(rand.nextInt(7) + 1);
		deck1.Push(carta4);
		lista.removeE(carta4);
		Object carta9 = lista.listHechizos.getNode(rand.nextInt(8) + 1);
		deck1.Push(carta9);
		lista.removeH(carta9);
		Object carta14 = lista.listSecretos.getNode(rand.nextInt(8) + 1);
		deck1.Push(carta14);
		lista.removeS(carta14);
		Object carta5 = lista.listEsbirros.getNode(rand.nextInt(6) + 1);
		deck1.Push(carta5);
		lista.removeE(carta5);
		Object carta10 = lista.listHechizos.getNode(rand.nextInt(7) + 1);
		deck1.Push(carta10);
		lista.removeH(carta10);
		Object carta15 = lista.listSecretos.getNode(rand.nextInt(7) + 1);
		deck1.Push(carta15);
		lista.removeS(carta15);
		Object carta6 = lista.listEsbirros.getNode(rand.nextInt(5) + 1);
		deck1.Push(carta6);
		lista.removeH(carta6);
		Object carta11 = lista.listHechizos.getNode(rand.nextInt(6) + 1);
		deck1.Push(carta11);
		lista.removeH(carta11);
		Object carta16 = lista.listSecretos.getNode(rand.nextInt(6) + 1);
		deck1.Push(carta16);
		lista.removeS(carta16);
		
	}
	
	public void printDeck() {
		deck1.printStack();
	}
	
	public void peek() {
		deck1.Peek();
	}

}
