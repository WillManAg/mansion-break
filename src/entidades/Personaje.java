package entidades;

import base.Entidad;

public abstract class Personaje extends Entidad {

	protected int vida;

	public Personaje(String nombre, char id, int vida) {
		super(nombre, id);
		this.vida = vida;
	}
	
}
