package entidades.objetos;

import entidades.Objeto;

public class Cruz extends Objeto {

	public Cruz() {
		super("Cruz", 'c', true);
	}

	@Override
	public void interactuar() {
		System.out.println("Huele un poco a muerto, parece ideal para debilitar a un Vampiro!");
		
	}
	
}
