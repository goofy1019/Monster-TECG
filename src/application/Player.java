package application;

import cartas.Deck;
import cartas.Hand;

public class Player {
	public int vida;
	public int mana;
	Deck deck = new Deck();
	Hand hand = new Hand(deck);
	
	public Player() {
		this.vida = 1000;
		this.mana = 200;
		this.hand.PrintHand();
	}
	
	public void Draw() {
		this.hand.DrawCard(deck);
	}
	

}
