package cartas;

public class CartaHechizos extends Carta {

	public Object efecto;

	protected CartaHechizos(String tip, String nom, String des, int id, int man, Object ef) {
		super(tip, nom, des, id, man);
		this.efecto = ef;
	}

	public static Object EfectoCongelar() {
		return null;
		// contrincante no puede atacar prox ronda
	}

	public static Object EfectoCurarPoco() {
		return null;
		// recuperar poca vida
	}

	public static Object EfectoCurarMedio() {
		return null;
		// recuperar media vida
	}

	public static Object EfectoCurarMax() {
		return null;
		// recuperar mucha vida
	}

	public static Object EfectoPoderSupremo() {
		return null;
		// siguiente turno se puede invocar 3 cartas consecutivas sin importar mana
	}

	public static Object EfectoRobarCarta() {
		return null;
		// roba carta aleatoria del otro jugador
	}

	public static Object EfectoSaltarTurno() {
		return null;
		// salta por completo turno del otro jugador, version mas potente de congelar
	}

	public static Object EfectoRobarMana() {
		return null;
		// roba cantidad aleatoria de mana del otro jugador
	}

	public static Object EfectoRevelaMano() {
		return null;
		// revela la mano del oponente
	}

	public static Object EfectoSacrificaMana() {
		return null;
		// da mana a cambio de mas ataque
	}

	static CartaHechizos Hechizo1 = new CartaHechizos("Hechizo", "Freeze", "Congela a oponente", 11, 100,
			EfectoCongelar());
	static CartaHechizos Hechizo2 = new CartaHechizos("Hechizo", "Small Heart", "Cura poco", 12, 50, EfectoCurarPoco());
	static CartaHechizos Hechizo3 = new CartaHechizos("Hechizo", "Heart", "Cura medio", 13, 100,
			EfectoCurarMedio());
	static CartaHechizos Hechizo4 = new CartaHechizos("Hechizo", "Big Heart", "Cura mucho", 14, 200,
			EfectoCurarMax());
	static CartaHechizos Hechizo5 = new CartaHechizos("Hechizo", "Supreme Power",
			"Siguiente turno se puede invocar 3 cartas consecutivas sin importar mana", 15, 450, EfectoPoderSupremo());
	static CartaHechizos Hechizo6 = new CartaHechizos("Hechizo", "Thief", "Roba carta aleatoria", 16, 200,
			EfectoRobarCarta());
	static CartaHechizos Hechizo7 = new CartaHechizos("Hechizo", "Jumper", "Salta prox turno de oponente", 17,
			200, EfectoSaltarTurno());
	static CartaHechizos Hechizo8 = new CartaHechizos("Hechizo", "Mana Retrieval", "Roba mana aleatoria del oponente", 18,
			200, EfectoRobarMana());
	static CartaHechizos Hechizo9 = new CartaHechizos("Hechizo", "Power Eye", "Revela mano del otro jugador", 19, 400,
			EfectoRevelaMano());
	static CartaHechizos Hechizo10 = new CartaHechizos("Hechizo", "Mana Seppuku",
			"Da mana pero duplica siguiente ataque", 20, 0, EfectoSacrificaMana());// definir mana requerido

}
