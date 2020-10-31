package cartas;

public class CartaEsbirros extends Carta {

	public int ataque;

	protected CartaEsbirros(String tip, String nom, String des, int id, int man, int atack) {
		super(tip, nom, des, id, man);
		this.ataque = atack;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	CartaEsbirros Esbirro1 = new CartaEsbirros("Esbirro", "Thundersnake", "A snake born from Zeus' thoughts.", 1, 50,
			75);
	CartaEsbirros Esbirro2 = new CartaEsbirros("Esbirro", "Dreadman",
			"This man has been dreading the fact that he killed his wife 1000 years ago and roams the Earth in penitence for his actions.",
			2, 50, 75);
	CartaEsbirros Esbirro3 = new CartaEsbirros("Esbirro", "Grim Wraith", "A wraith sent to Earth by accident.", 3, 100,
			85);
	CartaEsbirros Esbirro4 = new CartaEsbirros("Esbirro", "Crimson Ghost",
			"A ghost whose opponents blood has made him crimson colored.", 4, 150, 95);
	CartaEsbirros Esbirro5 = new CartaEsbirros("Esbirro", "Metalflayer",
			"A robot sent to kill all other machinery on Earth.", 5, 200, 100);
	CartaEsbirros Esbirro6 = new CartaEsbirros("Esbirro", "Hellhound", "Hade's own dog has come for dinner.", 6, 0, 0);
	CartaEsbirros Esbirro7 = new CartaEsbirros("Esbirro", "Gutwrencher",
			"This fiend likes only one dish. Guts. Best served fresh.", 7, 250, 150);
	CartaEsbirros Esbirro8 = new CartaEsbirros("Esbirro", "Corrupt Mumbler",
			"First of three worshipers looking for their savior.", 8, 100, 50);
	CartaEsbirros Esbirro9 = new CartaEsbirros("Esbirro", "Awful Mumbler",
			"Second of three worshipers looking for their savior.", 9, 100, 50);
	CartaEsbirros Esbirro10 = new CartaEsbirros("Esbirro", "Weird Mumbler",
			"Third of three worshipers looking for their savior.", 10, 100, 50);

}
