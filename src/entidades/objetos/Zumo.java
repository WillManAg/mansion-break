package entidades.objetos;

import entidades.Objeto;

public final class Zumo extends Objeto {
    public Zumo() {
        super("Zumo de frutas", 'z', true); // 
    }

    @Override
    public void interactuar() {
        System.out.println("Rico en vitaminas. Te sientes con más energía con solo olerlo.");
    }
}