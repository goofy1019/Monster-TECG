package cartas;

public class CartaEsbirros extends Carta {

	public int ataque;

	public CartaEsbirros(boolean stat, String tip, String nom, String des, int id, int man, int atack) {
		super(stat, tip, nom, des, id, man);
		this.ataque = atack;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	static CartaEsbirros Esbirro1 = new CartaEsbirros(false, "Esbirro", "Thundersnake", "A snake born from Zeus' thoughts.", 1,
			50, 75);
	static CartaEsbirros Esbirro2 = new CartaEsbirros(false, "Esbirro", "Dreadman",
			"This man has been dreading the fact that he killed his wife 1000 years ago and roams the Earth in penitence for his actions.",
			2, 50, 75);
	static CartaEsbirros Esbirro3 = new CartaEsbirros(false, "Esbirro", "Grim Wraith", "A wraith sent to Earth by accident.",
			3, 100, 85);
	static CartaEsbirros Esbirro4 = new CartaEsbirros(false, "Esbirro", "Crimson Ghost",
			"A ghost whose opponents blood has made him crimson colored.", 4, 150, 95);
	static CartaEsbirros Esbirro5 = new CartaEsbirros(false, "Esbirro", "Metalflayer",
			"A robot sent to kill all other machinery on Earth.", 5, 200, 100);
	static CartaEsbirros Esbirro6 = new CartaEsbirros(false, "Esbirro", "Hellhound", "Hade's own dog has come for dinner.", 6,
			0, 0);
	static CartaEsbirros Esbirro7 = new CartaEsbirros(false, "Esbirro", "Gutwrencher",
			"This fiend likes only one dish. Guts. Best served fresh.", 7, 250, 150);
	static CartaEsbirros Esbirro8 = new CartaEsbirros(false, "Esbirro", "Corrupt Mumbler",
			"First of three worshipers looking for their savior.", 8, 100, 50);
	static CartaEsbirros Esbirro9 = new CartaEsbirros(false, "Esbirro", "Awful Mumbler",
			"Second of three worshipers looking for their savior.", 9, 100, 50);
	static CartaEsbirros Esbirro10 = new CartaEsbirros(false, "Esbirro", "Weird Mumbler",
			"Third of three worshipers looking for their savior.", 10, 100, 50);

}
