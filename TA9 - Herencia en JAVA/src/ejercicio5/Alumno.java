package ejercicio5;

import java.util.Random;

public class Alumno extends Persona{
	
	private int calificacion;
	
	// Constructor por default de Alumno
	public Alumno() {
		this.calificacion = 0;
	}

	// Constructor con todos los parámetros
	public Alumno(String nombre, int edad, char sexo, boolean falta, int calificacion) {
		super(nombre, edad, sexo, falta);
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
}
