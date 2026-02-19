package entidades.objetos;

import entidades.Objeto;

public class Aspiradora extends Objeto{

	public Aspiradora() {
		super("Aspiradora", 'a', true);
	}

	@Override
	public void interactuar() {
		System.out.println("Vaya, parece que esta Dyson puede absorver hasta el más allá...");
	}

}
