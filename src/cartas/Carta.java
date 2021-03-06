package cartas;

public class Carta {

	private String tipo;
	private String nombre;
	private String descripcion;
	private int ID;
	private int mana;
	private boolean status;

	public Carta(boolean stat, String tip, String nom, String des, int id, int man) {
		this.status = stat;
		this.tipo = tip;
		this.nombre = nom;
		this.descripcion = des;
		this.ID = id;
		this.mana = man;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
