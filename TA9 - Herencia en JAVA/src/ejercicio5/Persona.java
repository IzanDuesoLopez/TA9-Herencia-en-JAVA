package ejercicio5;

import java.util.Random;

public abstract class Persona {
	
	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
	
	// Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = '0';
		this.falta = false;
	}
	
	// Constructor con todos los parámetros menos falta
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.falta = false;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean isFalta() {
		return falta;
	}
	public void setFalta(boolean falta) {
		this.falta = falta;
	}
	
	// Método abstracto que heredaran las clases hijas para comprobar si estan en clase
	public abstract boolean noEstaEnClase();
	
	// Método abstracto que heredaran las clases hijas para comprobar si estan en clase
	public abstract char esHombreOMujer();
	
	// Para generar nombres masculinos random
	public String nombreMasculino () {
		Random rdm = new Random();
		String[] hombre = {"Jose", "Antonio", "Jesus", "Sergio", "Aitor"};
			
		return hombre[(int) (rdm.nextDouble() * hombre.length)];
	}
	
	// Para generar nombres femeninos random
	public String nombreFemenino () {
		Random rdm = new Random();
		String[] mujer = {"Maria", "Paula", "Cristina", "Sara", "Mireia"};
			
		return mujer[(int) (rdm.nextDouble() * mujer.length)];
	}
}
