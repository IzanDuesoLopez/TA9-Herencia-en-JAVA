package ejercicio6;

public class Cine {
	// Constante
	private final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	// Atributos
	private Pelicula pelicula;
	private double precio_entrada;
	private Asiento[][] sala;
	private int filas;
	private int columnas;
	
	// Constructor
	public Cine(Pelicula pelicula, double precio_entrada, int filas, int columnas) {
		this.pelicula = pelicula;
		this.precio_entrada = precio_entrada;
		this.filas = filas;
		this.columnas = columnas;
		this.sala = new Asiento[filas][columnas];
		
		for(int i = filas; i > 0; i--) {
			for(int j = 0; j < columnas; j++) {
				String numeracion_asiento = "" + i + caracteres.charAt(j);
				Asiento asiento = new Asiento(numeracion_asiento);
				sala[i - 1][j] = asiento;
				System.out.print(sala[i - 1][j].getNombre() + " ");
			}
			System.out.println("");
		}
	}

	// Getters & setters
	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precio_entrada;
	}

	public void setPrecioEntrada(double precio_entrada) {
		this.precio_entrada = precio_entrada;
	}

	public Asiento[][] getSala() {
		return sala;
	}

	public void setSala(Asiento[][] sala) {
		this.sala = sala;
	}

	public int getFilas() {
		return filas;
	}

	public void setFilas(int filas) {
		this.filas = filas;
	}

	public int getColumnas() {
		return columnas;
	}

	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	// Métodos
	public boolean comprobarSentarse(Espectador espectador) {
		boolean flag = false;
		if(espectador.getDinero() < this.getPrecioEntrada()) {
			System.out.println("No tiene suficiente dinero.");
			return false;
		}
		if(espectador.getEdad() < this.getPelicula().getEdadMinima()) {
			System.out.println("No tiene la edad mínima.");
			return false;
		}
		for(int i = 0; i < this.getFilas(); i++) {
			for(int j = 0; j < this.getColumnas(); j++) {
				if(!(this.getSala()[i][j].getEspectador()!=null)) {
					flag = true;
					System.out.println("Hay sitio para sentarse.");
					break;
				} 		
			}
		}
		if(!flag) {
			System.out.println("No hay sitio.");
			return false;
		}
		
		
		return true;
	}
	
	public void sentarEspectador(Espectador espectador) {
		int posicion_x;
		int posicion_y;
		boolean sentado = false;
		
		while(!sentado) {
			//(int)(Math.random() * (max - min)) + min;
			posicion_x = (int)(Math.random() * (this.getFilas() - 1));
			posicion_y = (int)(Math.random() * (this.getColumnas() - 1));
			// Coge la array, le pasa las posiciones aleatorias, comprueba que el atributo del espectador sea null
			if(!(this.getSala()[posicion_x][posicion_y].getEspectador() != null)) { // La negación es una forma rápida de no lidiar con null
				this.getSala()[posicion_x][posicion_y].setEspectador(espectador);
				System.out.println("El espectador ha sido acomodado.");
				break;
			}
		}
	}
	
	public void mostrarSala() {
		for(int i = this.getFilas(); i > 0; i--) {
			for(int j = 0; j < this.getColumnas(); j++) {
				if(this.getSala()[i - 1][j].getEspectador() != null) {
					System.out.print("[X]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println("");
		}
	}
}
