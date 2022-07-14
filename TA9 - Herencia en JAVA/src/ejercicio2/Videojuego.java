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
}
