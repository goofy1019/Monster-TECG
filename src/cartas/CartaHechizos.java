package cartas;

public class CartaHechizos extends Carta {

	public Object efecto;

	protected CartaHechizos(String tip, String nom, String att, int man, Object ef) {
		super(tip, nom, att, man);
		this.efecto = ef;
	}

	public Object EfectoCongelar() {
		return null;
		// contrincante no puede atacar prox ronda
	}

	public Object EfectoCurarPoco() {
		return null;
		// recuperar poca vida
	}

	public Object EfectoCurarMedio() {
		return null;
		// recuperar media vida
	}

	public Object EfectoCurarMax() {
		return null;
		// recuperar mucha vida
	}

	public Object EfectoPoderSupremo() {
		return null;
		// siguiente turno se puede invocar 3 cartas consecutivas sin importar mana
	}

	public Object EfectoRobarCarta() {
		return null;
		// roba carta aleatoria del otro jugador
	}

	public Object EfectoSaltarTurno() {
		return null;
		// salta por completo turno del otro jugador, version mas potente de congelar
	}

	public Object EfectoRobarMana() {
		return null;
		// roba cantidad aleatoria de mana del otro jugador
	}

	public Object EfectoRevelaMano() {
		return null;
		// revela la mano del oponente
	}

	public Object EfectoSacrificaMana() {
		return null;
		// da mana a cambio de mas ataque
	}

	CartaHechizos Congelar = new CartaHechizos("Hechizo", "Congelamiento", "Congela a oponente", 20, EfectoCongelar());
	CartaHechizos CurarPoco = new CartaHechizos("Hechizo", "Curar Poco", "Cura poco", 20, EfectoCurarPoco());
	CartaHechizos CurarMedio = new CartaHechizos("Hechizo", "Curar Medio", "Cura medio", 20, EfectoCurarMedio());
	CartaHechizos CurarMax = new CartaHechizos("Hechizo", "Curar Mucho", "Cura mucho", 20, EfectoCurarMax());
	CartaHechizos PoderSupremo = new CartaHechizos("Hechizo", "Poder Supremo",
			"Siguiente turno se puede invocar 3 cartas consecutivas sin importar mana", 20, EfectoPoderSupremo());
	CartaHechizos RobarCarta = new CartaHechizos("Hechizo", "Robar Carta", "Roba carta aleatoria", 20,
			EfectoRobarCarta());
	CartaHechizos SaltarTurno = new CartaHechizos("Hechizo", "Saltar Turno", "Salta prox turno de oponente", 20,
			EfectoSaltarTurno());
	CartaHechizos RobarMana = new CartaHechizos("Hechizo", "Robar Mana", "Roba mana aleatoria del oponente", 20,
			EfectoRobarMana());
	CartaHechizos RevelaMano = new CartaHechizos("Hechizo", "Revela Mano", "Revela mano del otro jugador", 20,
			EfectoRevelaMano());
	CartaHechizos SacrificaMana = new CartaHechizos("Hechizo", "Sacrifica Mana",
			"Da mana pero duplica siguiente ataque", 100, EfectoSacrificaMana());

}
