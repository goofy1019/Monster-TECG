package cartas;

import listas.CircularList;

public class Hand extends Deck{
	private int size;
	public static CircularList hand = new CircularList();
	
	public Hand(Deck deck) {
		this.size = 0;
		Object HandCard1 = deck.deck1.Peek();
		hand.insertEnd(HandCard1);
		deck.deck1.Pop();
		this.size ++;
		Object HandCard2 = deck.deck1.Peek();
		hand.insertEnd(HandCard2);
		deck.deck1.Pop();
		this.size ++;
		Object HandCard3 = deck.deck1.Peek();
		hand.insertEnd(HandCard3);
		deck.deck1.Pop();
		this.size ++;
		Object HandCard4 = deck.deck1.Peek();
		hand.insertEnd(HandCard4);
		deck.deck1.Pop();
		this.size ++;
		System.out.println(this.size);
	}
	
	public void PrintHand() {
		hand.printList();
	}
	
	public void DrawCard(Deck deck) {
		this.size ++;
		if(this.size <= 10) {
			Object HandCard = deck.deck1.Peek();
			hand.insertEnd(HandCard);
			deck.deck1.Pop();
		}else {
			System.out.println("Ya hay 10 cartas");
			this.size --;
		}
	}
	

}
