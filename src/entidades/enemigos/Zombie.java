package entidades.enemigos;

import entidades.Personaje;

// RA7.a Subclase de Personaje
public class Zombie extends Personaje {
	
	private boolean estaVivo;

	public Zombie() {
		super("Zombie", 'z', 1);
		this.estaVivo = true;
	}

	@Override
	public void interactuar() {
		if (estaVivo) {
			System.out.println("El zombie gruñe, parece tener una cruz colada en el cuello");
		} else {
			System.out.println("Hay un cuerpo de zombie en el suelo.");
		}
	}
	
	public void morir() {
		this.vida = 0;
		this.estaVivo = false;
		System.out.println("Cortaste la cabeza del zombie con el hacha!");
		System.out.println("Al caer se le ha soltado la cruz al suelo");
	}
	
	public boolean isVivo() {
		return estaVivo;
	}

}
