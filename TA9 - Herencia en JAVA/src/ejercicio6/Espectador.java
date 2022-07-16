package ejercicio6;

public class Espectador {
	
	// Atributos
	private String nombre;
	private int edad;
	private double dinero;
	
	// Constructores
	
	public Espectador () {
		this("anonimo", 18, 0);
	}
	
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
	
	// Métodos
	public boolean aptoEdad(Pelicula peli) {
		boolean apto = false;
		
		if (getEdad() > peli.getEdadMinima()) {
			apto = true;
		}
		
		return apto;
	}
	
	// Método comprar entrada, que comprueba si el espectador tiene suficiente dinero para poder ver la pelicula
	public boolean compraEntrada(Cine cine) {
		if (cine.getPrecioEntrada() > this.getDinero()) {
			return false;
		} else {
			return true;
		}
	}
}
