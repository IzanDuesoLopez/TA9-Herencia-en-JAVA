package ejercicio5;

import java.util.Random;

public class Alumno extends Persona {

	private int calificacion;

	// Constructor por default de Alumno
	public Alumno() {
		this.calificacion = 0;
	}

	// Constructor con todos los parámetros
	public Alumno(String nombre) {
		super(nombre);
		this.falta = noEstaEnClase();
		this.calificacion = generarCalificacion();
		this.sexo = esHombreOMujer();
		this.edad = generarEdadAlumno();
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

	// Método que nos asigna si el alumno es hombre o mujer
	@Override
	public char esHombreOMujer() {

		Random random = new Random();

		if (random.nextBoolean()) {
			return 'H';
		} else {
			return 'M';
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
	public int generarEdadAlumno() {

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
				+ ", falta=" + falta + "]";
	}

}
