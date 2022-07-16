package ejercicio6;

public class Asiento {
	// Atributos
	private String nombre;
	private boolean ocupado = false;
	private Espectador espectador;
	
	// Constructor
	public Asiento(String nombre) {
		this.nombre = nombre;
	}

	// Getters & setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
}
