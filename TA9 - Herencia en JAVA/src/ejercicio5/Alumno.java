package ejercicio5;

import java.util.Random;

public class Alumno extends Persona {

	private int calificacion;

	// Constructor con todos los parámetros generados aleatoriamente
	public Alumno() {
		this.falta = noEstaEnClase();
		this.calificacion = generarCalificacion();
		this.edad = edad();
	}

	// Método para comprobar si los estudiantes hacen novillos con un 50% de
	// probabilidades
	@Override
	public boolean noEstaEnClase() {

		Random random = new Random();

		if (random.nextBoolean()) {
			return true;
		} else {
			return false;
		}
	}

	// Método que genera un número aleatorio entre 0 y 10
	public int generarCalificacion() {

		Random random = new Random();
		int notaMinima = 0;
		int notaMaxima = 10;

		int calificacionAleatoria = random.nextInt((notaMaxima - notaMinima) + 1) + notaMinima;

		return calificacionAleatoria;

	}

	// Método que genera un número aleatorio entre 0 y 10
	@Override
	public int edad() {

		Random random = new Random();
		int edadMinima = 16;
		int edadMaxima = 20;

		int edadAlumnoAleatoria = random.nextInt((edadMaxima - edadMinima) + 1) + edadMinima;

		return edadAlumnoAleatoria;

	}

	// Getter y Setter de Calificación
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	// Método toString de Alumno
	@Override
	public String toString() {
		return "Alumno [calificacion=" + calificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
				+ ", falta=" + falta + "]\n";
	}


}
