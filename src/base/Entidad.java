package base;

import java.util.Objects;

import interfaces.IInteractuable;

public abstract class Entidad implements IInteractuable {

	//RA7.a y .b
	
	protected String nombre;
	protected char id;
	
	public Entidad(String nombre, char id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entidad other = (Entidad) obj;
		return id == other.id && Objects.equals(nombre, other.nombre);
	}
	
}
