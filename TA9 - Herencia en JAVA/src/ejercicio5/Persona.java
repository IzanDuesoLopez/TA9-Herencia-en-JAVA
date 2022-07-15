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
	public Persona(String nombre) {
		this.nombre = nombre;
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
	
	// Método abstracto para generar edad
	public abstract int edad();
	
	// Método abstracto que heredaran las clases hijas para comprobar si estan en clase
	public abstract char esHombreOMujer();
	
	// Para generar nombres masculinos random
	public String nombreMasculino () {
		Random rdm = new Random();
		String[] hombre = {"Izan", "Dani", "Michael", "Jose", "Pablo", "Alberto"};
			
		return hombre[(rdm.nextInt() * hombre.length)];
	}
	
	// Para generar nombres femeninos random
	public String nombreFemenino () {
		Random rdm = new Random();
		String[] mujer = {"Tiffany", "Barbara", "Cami", "Regina", "Antonia", "Gloria"};
			
		return mujer[(rdm.nextInt() * mujer.length)];
	}
}
