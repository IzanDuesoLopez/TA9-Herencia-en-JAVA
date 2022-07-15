package ejercicio5;

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
	
	// Constructor con todos los parámetros
	public Persona(String nombre, int edad, char sexo, boolean falta) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.falta = falta;
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

}
