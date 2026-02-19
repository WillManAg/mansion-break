package entidades.enemigos;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import entidades.Objeto;
import entidades.Personaje;
import base.Habitacion; // Suponiendo que tu clase de la celda se llama Habitacion

public final class Fantasma extends Personaje {

    public Fantasma() {
        super("Fantasma", 'f', 1000);
    }

    @Override
    public void interactuar() {
        System.out.println("¡El Fantasma aparece! No puedes tocarlo, pero él a ti sí...");
    }

    /**
     * RA6.d: Uso de Iteradores para vaciar la mochila y redistribuir objetos.
     *  El fantasma roba los objetos y los coloca en habitaciones aleatorias.
     */
    public void robarYRedistribuir(List<Objeto> mochila, Habitacion[][][] mansion) {
        Random rnd = new Random();
        
        // RA6.d: Creamos el objeto iterador para recorrer la lista mochila
        Iterator<Objeto> it = mochila.iterator();

        while (it.hasNext()) {
            // Obtenemos el objeto actual
            Objeto obj = it.next();

            // Lógica para elegir una habitación aleatoria [cite: 4, 46, 52]
            int planta = rnd.nextInt(3);  // 3 plantas [cite: 3]
            int fila = rnd.nextInt(3);    // Matriz 3x4 [cite: 4]
            int col = rnd.nextInt(4);

            // "Soltamos" el objeto en esa habitación aleatoria de la mansión
            mansion[planta][fila][col].agregarObjeto(obj);
            
            System.out.println("El Fantasma ha lanzado tu " + obj.getNombre() + " a una habitación lejana...");

            // RA6.d: Borramos el objeto de la mochila de forma SEGURA
            it.remove(); 
        }
        
        System.out.println("Tu mochila está vacía. El Fantasma se ríe y desaparece a otra habitación.");
    }
}