package ejercicio5;

import java.util.Random;

public class Profesor extends Persona {

	// Atributos
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	// Constructores

	public Profesor() {
		this.edad = edad();
		this.materia = generarMateria();
		this.falta = noEstaEnClase();
	}

	// Metodos
	public boolean noEstaEnClase() {
		Random rdm = new Random();

		// Generamos un numero random
		if ((int) (rdm.nextDouble() * 10 + 1) > 8) {
			return true;
		} else {
			return false;
		}
	}

	// Genero su edad random
	public int edad() {
		Random rnd = new Random();
		return (int) (rnd.nextDouble() * 30 + 20); // Edad de 20 a 50
	}

	// Genero su materia random
	private String generarMateria() {
		Random rnd = new Random();
		// Un array donde esten las materias
		String[] nombreMateria = { "Matematicas", "Filosofia", "Fisica" };
		// Genero un numero random en funcion del array
		return nombreMateria[(int) (rnd.nextDouble() * nombreMateria.length)];
	}

	@Override
	public char esHombreOMujer() {

	}
}
