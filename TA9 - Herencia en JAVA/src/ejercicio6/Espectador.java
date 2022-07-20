package ejercicio6;

public class Espectador {
	
	// Atributos
	private String nombre;
	private int edad;
	private double dinero;
	
	// Constructor por defecto
	public Espectador () {
		this("anonimo", 18, 0);
	}
	
	// Constructor en el que recibimos por parámetro un nombre, edad y dinero
	public Espectador (String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	// Método en el que comprobamos si el espectador de la instancia es apto para ver la pelicula
	// Recibe por parámetro una instancia de pelicula
	public boolean aptoEdad(Pelicula peli) {
		
		// Si la edad es mayor o igual a la edad minima
		if (getEdad() >= peli.getEdadMinima()) {
			return true; // El espectador será apto
		} else {
			return false; // El espectador no será apto
		}
	}
	
	// Método comprar entrada, que comprueba si el espectador tiene suficiente dinero para poder ver la pelicula
	public boolean compraEntrada(Cine cine) {
		if (cine.getPrecioEntrada() > this.getDinero()) {
			return false; // El espectador no tiene suficiente dinero
		} else {
			return true; // Devolvemos true ya que el espectador si ha podido comprar la entrada
		}
	}
}
