package ejercicio5;

public abstract class Persona {
	
<<<<<<< HEAD
	// Atributos
	protected String nombre;
	protected int edad;
	protected char sexo;
	protected boolean falta;
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
	
	

=======
	
	// Método abstracto que heredaran las clases hijas para comprobar si estan en clase
	public abstract boolean noEstaEnClase();
>>>>>>> branch 'main' of https://github.com/IzanDuesoLopez/TA9-Herencia-en-JAVA
}
