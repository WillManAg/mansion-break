package entidades.objetos;

import entidades.Objeto;

// RA7.b: Usamos 'final' para bloquear la herencia (no habrá sub-kits)
public final class KitVampiro extends Objeto {
    public KitVampiro() {
        super("Kit mata-vampiros", 'k', true);
    }

    @Override
    public void interactuar() {
        System.out.println("Un kit con estacas de madera y agua bendita. El final de cualquier vampiro.");
    }
}