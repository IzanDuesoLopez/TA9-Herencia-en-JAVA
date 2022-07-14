package ejercicio2;

public class Videojuego {
	
	// Atributos de la clase
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compañia;
	
	// Constantes predeterminadas
	private static final int HORAS_ESTIMADAS_DEFAULT = 10;
	private static final boolean ENTREGADO_DEFAULT = false;
	
	// Constructor por defecto
	public Videojuego() {
		this.titulo = "";
		this.horasEstimadas = HORAS_ESTIMADAS_DEFAULT;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = "";
		this.compañia = "";
	}
	
	// Constructor con el titulo y horas estimadas, el resto por defecto
	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = "";
		this.compañia = "";
	}

	// Constructor con todos los atributos, excepto de entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = ENTREGADO_DEFAULT;
		this.genero = genero;
		this.compañia = compañia;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	// Método toString
	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	
	
	
	
}
