package entidades.objetos;

import entidades.Objeto;

// RA7.a: Subclase de Objeto
public class Hacha extends Objeto {

	public Hacha() {
		// RA7.c 
		super("Hacha", 'h', true);

	}

	@Override
	public void interactuar() {
		// RA7.d: Sobreescribir el comportamiento de una interfaz
		System.out.println("Has examinado el hacha. Parece lo suficientemente afilada para matar a un Zombie!");
	}

}
