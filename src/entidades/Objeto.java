package entidades;

import base.Entidad;

 // RA7.a (Superclase) y RA7.e (Jerarquía)

public abstract class Objeto extends Entidad{
	
	// RA4.f (Visibilidad)
	
	protected boolean esRecogible;
	
	// RA7.c Llama al constructor de la superclase (Entidad) usando 'super'.

	public Objeto (String nombre, char id, boolean esRecogible) {
		super(nombre, id);
		this.esRecogible = esRecogible;
	}
	
	// Es un getter para que otras clases pregunten si eso no recogible
	public boolean isEsRecogible() {
		return esRecogible;
	}

}
