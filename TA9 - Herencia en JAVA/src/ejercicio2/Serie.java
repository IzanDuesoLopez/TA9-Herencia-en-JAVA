package ejercicio2;

public class Serie {
	
	// Atributos de la clase
	private String titulo;
	private int numeroDeTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	// Constantes para el constructor por defecto
	private final int numeroDeTemporadasDefault = 3;
	private final boolean entregadoDefault = false;
	
	// Constructor por defecto de la clase Serie
	public Serie() {
		this.titulo = "";
		this.numeroDeTemporadas = numeroDeTemporadasDefault;
		this.entregado = entregadoDefault;
		this.genero = "";
		this.creador = "";
	}
	
	// Constructor que recibe por parámetro el título y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadasDefault;
		this.entregado = entregadoDefault;
		this.genero = "";
		this.creador = creador;
	}

	// Constructor con todos los atributos menos entregado
	public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.entregado = entregadoDefault;
		this.genero = genero;
		this.creador = creador;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// Método toString que devuelve una String con los atributos de la instancia
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
}
