package cartas;

import listas.DLL;

public class CardList {
	public DLL listEsbirros = new DLL();
	public DLL listHechizos = new DLL();
	public DLL listSecretos = new DLL();

	public CardList() {
		listEsbirros.insertLast(CartaEsbirros.Esbirro1.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro2.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro3.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro4.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro5.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro6.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro7.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro8.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro9.getNombre());
		listEsbirros.insertLast(CartaEsbirros.Esbirro10.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo1.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo2.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo3.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo4.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo5.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo6.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo7.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo8.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo9.getNombre());
		listHechizos.insertLast(CartaHechizos.Hechizo10.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto1.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto2.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto3.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto4.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto5.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto6.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto7.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto8.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto9.getNombre());
		listSecretos.insertLast(CartaSecretos.Secreto10.getNombre());
	}

	public void print() {
		listEsbirros.printList();
		listHechizos.printList();
		listSecretos.printList();
	}
	
	public Object getNodeE(int pos) {
		return listEsbirros.getNode(pos);
	}
	
	public Object getNodeH(int pos) {
		return listHechizos.getNode(pos);
	}
	
	public Object getNodeS(int pos) {
		return listSecretos.getNode(pos);
	}
	
	public void removeE(Object card) {
		listEsbirros.delNode(card);
	}
	
	public void removeH(Object card) {
		listHechizos.delNode(card);
	}
	
	public void removeS(Object card) {
		listSecretos.delNode(card);
	}

}
