package mundo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import entidades.Objeto;
import entidades.Personaje;
import entidades.objetos.Mesa;
import entidades.objetos.Silla;

/**
 * Clase que representa cada habitación de la mansión
 * RA7.h: Documentación de código
 */

public class Habitacion {

	// RA6.b y RA6.e: Usar HashMap para acceso rápido por id
	private Map<Character, Objeto> objetos;
	// RA 6.c: Lista para almacenar los personajes presentes
	private List<Personaje> personajes;
	
	private boolean norte, sur, este, oeste;
	private boolean bajadaEsc, subidaEsc;
	private boolean ventana;
	
	public Habitacion() {
		this.objetos = new HashMap<>();
		this.personajes = new ArrayList<>();
		
		mueblesAleatorios();
	}
	
	private void mueblesAleatorios() {
		
		Random rnd = new Random();
		
		// genera 4 sillas ramdom porque 0 sillas es una posibilidad
		int sillas = rnd.nextInt(5);
		int mesas = rnd.nextInt(3);
		
		for (int i=0; i < sillas; i++) {
			this.objetos.put((char)('s' + i), new Silla());
		}
		
		for (int i=0; i < mesas; i++) {
			this.objetos.put((char)('m' + i), new Mesa());
		}
	}
	
	public void agregarObjeto(Objeto obj) {
		this.objetos.put(obj.getId(), obj);
	}
	
	public Objeto quitarObjeto(char id) {
		return this.objetos.remove(id);
	}
	
	public void agregarPersonaje(Personaje p) {
		this.personajes.add(p);
	}

	public Map<Character, Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(Map<Character, Objeto> objetos) {
		this.objetos = objetos;
	}

	public List<Personaje> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Personaje> personajes) {
		this.personajes = personajes;
	}

	public boolean isNorte() {
		return norte;
	}

	public void setNorte(boolean norte) {
		this.norte = norte;
	}

	public boolean isSur() {
		return sur;
	}

	public void setSur(boolean sur) {
		this.sur = sur;
	}

	public boolean isEste() {
		return este;
	}

	public void setEste(boolean este) {
		this.este = este;
	}

	public boolean isOeste() {
		return oeste;
	}

	public void setOeste(boolean oeste) {
		this.oeste = oeste;
	}

	public boolean isBajadaEsc() {
		return bajadaEsc;
	}

	public void setBajadaEsc(boolean bajadaEsc) {
		this.bajadaEsc = bajadaEsc;
	}

	public boolean isSubidaEsc() {
		return subidaEsc;
	}

	public void setSubidaEsc(boolean subidaEsc) {
		this.subidaEsc = subidaEsc;
	}

	public boolean isVentana() {
		return ventana;
	}

	public void setVentana(boolean ventana) {
		this.ventana = ventana;
	}
	
}
