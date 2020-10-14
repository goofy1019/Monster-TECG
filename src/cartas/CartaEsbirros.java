package cartas;

public class CartaEsbirros extends Carta {

	public int ataque;

	protected CartaEsbirros(String tip, String nom, String att, int man, int atack) {
		super(tip, nom, att, man);
		this.ataque = atack;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	CartaEsbirros Esbirro1 = new CartaEsbirros("Esbirro", "Monstruo1", "Este es monstruo 1", 0, 0);
	CartaEsbirros Esbirro2 = new CartaEsbirros("Esbirro", "Monstruo2", "Este es monstruo 2", 0, 0);
	CartaEsbirros Esbirro3 = new CartaEsbirros("Esbirro", "Monstruo3", "Este es monstruo 3", 0, 0);
	CartaEsbirros Esbirro4 = new CartaEsbirros("Esbirro", "Monstruo4", "Este es monstruo 4", 0, 0);
	CartaEsbirros Esbirro5 = new CartaEsbirros("Esbirro", "Monstruo5", "Este es monstruo 5", 0, 0);
	CartaEsbirros Esbirro6 = new CartaEsbirros("Esbirro", "Monstruo6", "Este es monstruo 6", 0, 0);
	CartaEsbirros Esbirro7 = new CartaEsbirros("Esbirro", "Monstruo7", "Este es monstruo 7", 0, 0);
	CartaEsbirros Esbirro8 = new CartaEsbirros("Esbirro", "Monstruo8", "Este es monstruo 8", 0, 0);
	CartaEsbirros Esbirro9 = new CartaEsbirros("Esbirro", "Monstruo9", "Este es monstruo 9", 0, 0);
	CartaEsbirros Esbirro10 = new CartaEsbirros("Esbirro", "Monstruo10", "Este es monstruo 10", 0, 0);

}
