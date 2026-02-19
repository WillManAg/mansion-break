package entidades.objetos;

import entidades.Objeto;

public final class Silla extends Objeto {
    public Silla() {
        super("Silla", 's', false); 
    }

    @Override
    public void interactuar() {
        System.out.println("Es una silla de madera vieja. No parece muy cómoda.");
    }
}