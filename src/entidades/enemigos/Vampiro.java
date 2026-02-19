package entidades.enemigos;

import entidades.Personaje;

public class Vampiro extends Personaje {
	
	private boolean estaVivo;
	private boolean estaDebil;
	
	
	public Vampiro() {
		super("Vampiro", 'v', 1);
		this.estaVivo = true;
		this.estaDebil = false;
	}

	@Override
	public void interactuar() {
		
		if (estaDebil) {
			System.out.println("El Vampiro parece más pálido de lo normal, quizás sea el momento de atacarle con el 'kit' adecuado...");
		} else if (estaVivo) {
			System.out.println("El Vampiro protege la ventana, luce muy poderoso... Quizás debas debilitarlo antes de enfrentarlo.");
		} else {
			System.out.println("El cuerpo del vampiro se ha desvanecido, la ventana está despejada.");
		}
		
	}
	
	public void debilitar() {
		
		if (!this.estaDebil) {
			this.estaDebil = true;
			System.out.println("¡LA SANGRE DE CRISTO TIENE PODER!, el vampiro se ha debilitado por la gracia del señor.");
		} else if (!estaVivo){
			System.out.println("El Vampiro ya está muerto!");
		} else {
			System.out.println("No puedes debilitar más al Vampiro! Dale el golpe de gracia!");
		}
		
	}
	
	public void morir() {
	    if (estaDebil) { 
	        this.vida = 0;
	        this.estaVivo = false;
	        System.out.println("¡Mataste al Vampiro con el kit!");
	        System.out.println("La ventana parece despejada.");
	    } else {
	        System.out.println("¡El Vampiro es demasiado fuerte! Debilítalo primero con la Cruz.");
	    }
	}
	
	public boolean isVivo() {
		return estaVivo;
	}
	
	public boolean isDebil() {
		return estaDebil;
	}

}
