package cartas;

public class CartaSecretos extends Carta {

	public Object efecto;
	public Object accion;

	protected CartaSecretos(String tip, String nom, String des, int id, int man, Object ef, Object acc) {
		super(tip, nom, des, id, man);
		this.efecto = ef;
		this.accion = acc;
	}

	public static Object EfectoMonsterHunt() {
		return null;
		// contrincante no puede atacar prox ronda
	}

	public static Object EfectoRedraw() {
		return null;
		// recuperar media vida
	}

	public static Object EfectoMonsterSwitch() {
		return null;
		// siguiente turno se puede invocar 3 cartas consecutivas sin importar mana
	}

	public static Object EfectoFreezeDefense() {
		return null;
		// roba carta aleatoria del otro jugador
	}

	public static Object EfectoCounterstrike() {
		return null;
		// salta por completo turno del otro jugador, version mas potente de congelar
	}

	public static Object EfectoDamageMultiplier() {
		return null;
		// roba cantidad aleatoria de mana del otro jugador
	}

	public static Object EfectoShield() {
		return null;
		// revela la mano del oponente
	}

	public static Object EfectoBlastShield() {
		return null;
		// da mana a cambio de mas ataque
	}

	public static Object EfectoLastStand() {
		return null;
		// da mana a cambio de mas ataque
	}

	public static Object EfectoAetherMumbler() {
		return null;
		// da mana a cambio de mas ataque
	}

	public static Object IncomingAttack() {
		return null;
		// da mana a cambio de mas ataque
	}

	public static Object LowHealth() {
		return null;
		// da mana a cambio de mas ataque
	}

	public static Object MumblersPlaced() {
		return null;
		// da mana a cambio de mas ataque
	}

	static CartaSecretos Secreto1 = new CartaSecretos("Secreto", "Monster Hunt",
			"Destroy the monster that attacked and negate the attack.", 21, 300, EfectoMonsterHunt(), IncomingAttack());
	static CartaSecretos Secreto2 = new CartaSecretos("Secreto", "Redraw",
			"Opponent has to discard hand and draw four cards.", 22, 50, EfectoRedraw(), IncomingAttack());
	static CartaSecretos Secreto3 = new CartaSecretos("Secreto", "Monster Switch",
			"Swap the attacking monsters attack with the lowest attacking monster in your hand.", 23, 100,
			EfectoMonsterSwitch(), IncomingAttack());
	static CartaSecretos Secreto4 = new CartaSecretos("Secreto", "Freeze Defense",
			"Freezes opponent's monsters for two turns.", 24, 300, EfectoFreezeDefense(), IncomingAttack());
	static CartaSecretos Secreto5 = new CartaSecretos("Secreto", "Counterstrike",
			"Make opponent take the damage of their attack.", 25, 200, EfectoCounterstrike(), IncomingAttack());
	static CartaSecretos Secreto6 = new CartaSecretos("Secreto", "Damage Multiplier", "Double your attack next round.",
			26, 100, EfectoDamageMultiplier(), IncomingAttack());
	static CartaSecretos Secreto7 = new CartaSecretos("Secreto", "Shield",
			"Receive half of the damage inflicted by attacking monster.", 27, 100, EfectoShield(), IncomingAttack());
	static CartaSecretos Secreto8 = new CartaSecretos("Secreto", "Blast Shield",
			"Take no damage from opponent's attack.", 28, 250, EfectoBlastShield(), IncomingAttack());
	static CartaSecretos Secreto9 = new CartaSecretos("Secreto", "Last Stand",
			"Attack max. once with every monster you have in play without using any mana.", 29, 200, EfectoLastStand(),
			LowHealth());
	static CartaSecretos Secreto10 = new CartaSecretos("Secreto", "Aether Mumbler",
			"Summon the all-mighty Aether Mumbler and instantly defeat your opponent winning the game. No cards can negate this effect.",
			30, 600, EfectoAetherMumbler(), MumblersPlaced());

}
