package ejercicio6;

public class Pelicula extends Cine{
	
	private String titulo;
	private int duracion; // Duracion en minutos
	private int edadMinima;
	private String director;
	
	public Pelicula() {
		this.titulo = "";
		this.duracion = 0;
		this.edadMinima = 0;
		this.director = "";
	}

	public Pelicula(String nombre, double precioEntrada, String titulo, int duracion, int edadMinima, String director) {
		super(nombre, precioEntrada);
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}
	
}
