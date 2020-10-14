package cartas;

public class Carta {

	private String tipo;
	private String nombre;
	private String atributos;
	private int mana;

	public Carta(String tip, String nom, String att, int man) {
		this.tipo = tip;
		this.nombre = nom;
		this.atributos = att;
		this.mana = man;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAtributos() {
		return atributos;
	}

	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
