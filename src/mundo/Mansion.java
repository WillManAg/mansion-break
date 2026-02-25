package mundo;

import java.util.Random;
import entidades.enemigos.*;
import entidades.objetos.*;

/**
 * Representa la mansión completa mediante un array de 3 dimensiones.
 * RA6.a: Uso de arrays tridimensionales.
 * RA7.h: Código documentado.
 */
public class Mansion {

	// RA6.a Array 3d [PLANTAS][FILAS][COLUMNAS]
	private Habitacion[][][] pisos;
	private Random rnd = new Random();

	public Mansion() {
		
		pisos = new Habitacion[3][3][4];
		iniciarMansion();
		configPyV();
		configEsc();
		
	}
	
	// creamos los objetos dentro de la habitación
	
	private void iniciarMansion() {
		for (int p = 0; p < 3; p++) {
			for (int f = 0; f < 3; f++) {
				for (int c = 0; c < 4; c++) {
					pisos[p][f][c] = new Habitacion();
				}
			}
		}
	}
	
	// configuramos las habitaciones con puertas y ventanas
	
	private void configPyV() {
		
		for (int p = 0; p < 3; p++) {
			for (int f = 0; f < 3; f++) {
				for (int c = 0; c < 4; c++) {
					Habitacion h = pisos[p][f][c];
					
					// Puertas
					
					if (f > 0) {
						h.setNorte(true);
					}
					if (f < 2) {
						h.setSur(true);
					}
					if (c > 0) {
						h.setOeste(true);
					}
					if (c < 3) {
						h.setEste(true);
					}
					
					// ventanas
					
					if (f == 0 || f == 2 || c == 0 || c == 3) {
						// Aquí la lógica de si la ventana está abierta o es la de escape
					}
					
				}
			}
		}
		
	}
	
	// colocamos escaleras
	
	private void configEsc() {
		
		pisos[0][0][0].setSubidaEsc(true);
		pisos[1][0][0].setBajadaEsc(true);
		
		pisos[1][2][3].setSubidaEsc(true);
		pisos[2][2][3].setBajadaEsc(true);
	}
	
	// añadir entidades a las habitaciones
	
	public void colocarEntidadAleatoria(Object entidad) {
        int p, f, c;
        do {
            p = rnd.nextInt(3);
            f = rnd.nextInt(3);
            c = rnd.nextInt(4);
            // Aquí añadirías validaciones como la del Fantasma y la Aspiradora [cite: 53]
        } while (false); // Simplificado para el ejemplo

        if (entidad instanceof entidades.Objeto) {
            pisos[p][f][c].agregarObjeto((entidades.Objeto) entidad);
        } else if (entidad instanceof entidades.Personaje) {
            pisos[p][f][c].agregarPersonaje((entidades.Personaje) entidad);
        }
    }

    // RA4.f: Getter para obtener una habitación específica
    public Habitacion getHabitacion(int p, int f, int c) {
        return pisos[p][f][c];
    }
}