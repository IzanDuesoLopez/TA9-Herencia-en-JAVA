package ejercicio5;

import java.util.Random;

public abstract class Persona {
	
	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
	
	// Constructor por defecto con valores aleatorios menos la edad y falta
	public Persona() {
		this.falta = false;
		this.edad = 0;
		this.sexo = esHombreOMujer();
		if(sexo == 'H') {
			this.nombre = nombreMasculino();
		} else {
			this.nombre = nombreFemenino();
		}
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

	// Método que nos asigna si el alumno es hombre o mujer
	public char esHombreOMujer() {

		Random random = new Random();

		if (random.nextBoolean()) {
			return 'H';
		} else {
			return 'M';
		}
	}
	
	// Para generar nombres masculinos random
	public String nombreMasculino () {
		Random rdm = new Random();
		String[] hombre = {"Izan", "Dani", "Michael", "Jose", "Pablo", "Alberto"};
			
		return hombre[(int) (rdm.nextDouble() * hombre.length)];
	}
	
	// Para generar nombres femeninos random
	public String nombreFemenino () {
		Random rdm = new Random();
		String[] mujer = {"Tiffany", "Barbara", "Cami", "Regina", "Antonia", "Gloria"};
			
		return mujer[(int) (rdm.nextDouble() * mujer.length)];
	}
}
