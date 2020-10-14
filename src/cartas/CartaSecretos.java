package cartas;

public class CartaSecretos extends Carta {

	public Object evento;
	public Object accion;

	protected CartaSecretos(String tip, String nom, String att, int man, Object ev, Object acc) {
		super(tip, nom, att, man);
		this.evento = ev;
		this.accion = acc;
	}

	public Object getEvento() {
		return evento;
	}

	public void setEvento(Object evento) {
		this.evento = evento;
	}

	public Object getAccion() {
		return accion;
	}

	public void setAccion(Object accion) {
		this.accion = accion;
	}

	CartaSecretos Secreto1 = new CartaSecretos("Secreto", "Secreto1", "Este es secreto 1", 0, evento, accion);
	CartaSecretos Secreto2 = new CartaSecretos("Secreto", "Secreto2", "Este es secreto 2", 0, evento, accion);
	CartaSecretos Secreto3 = new CartaSecretos("Secreto", "Secreto3", "Este es secreto 3", 0, evento, accion);
	CartaSecretos Secreto4 = new CartaSecretos("Secreto", "Secreto4", "Este es secreto 4", 0, evento, accion);
	CartaSecretos Secreto5 = new CartaSecretos("Secreto", "Secreto5", "Este es secreto 5", 0, evento, accion);
	CartaSecretos Secreto6 = new CartaSecretos("Secreto", "Secreto6", "Este es secreto 6", 0, evento, accion);
	CartaSecretos Secreto7 = new CartaSecretos("Secreto", "Secreto7", "Este es secreto 7", 0, evento, accion);
	CartaSecretos Secreto8 = new CartaSecretos("Secreto", "Secreto8", "Este es secreto 8", 0, evento, accion);
	CartaSecretos Secreto9 = new CartaSecretos("Secreto", "Secreto9", "Este es secreto 9", 0, evento, accion);
	CartaSecretos Secreto10 = new CartaSecretos("Secreto", "Secreto10", "Este es secreto 10", 0, evento, accion);

}
