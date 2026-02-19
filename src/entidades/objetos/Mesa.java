package entidades.objetos;

import entidades.Objeto;

public final class Mesa extends Objeto {
    public Mesa() {
        super("Mesa", 'm', false); // 
    }

    @Override
    public void interactuar() {
        System.out.println("Una mesa robusta cubierta de polvo.");
    }
}