package ejercicio5;

import java.util.Random;

public class Alumno extends Persona{
	
	private int calificacion;
	
	// Constructor por default de Alumno
	public Alumno() {
		this.calificacion = 0;
	}

	// Constructor con todos los parámetros
	public Alumno(String nombre, int edad, char sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.falta = noEstaEnClase();
		this.calificacion = calificacion;
	}

	// Método para comprobar si los estudiantes hacen novillos con un 50% de probabilidades
	@Override
	public boolean noEstaEnClase() {

		Random random = new Random();
		
		if(random.nextBoolean()) {
			return true;
		} else {
			return false;
		}
	}

	//Getter y Setter de Calificación
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
