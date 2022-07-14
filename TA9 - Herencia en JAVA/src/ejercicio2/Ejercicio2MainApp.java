package ejercicio2;

import java.util.Scanner;

public class Ejercicio2MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

		crearEntregables(series, videojuegos,sc);
		entregarEntregables(series, videojuegos);
		contarEntregados(series, videojuegos);
		encontrarVideojuegoMasJugado(videojuegos);
		encontrarSerieMasTemporadas(series);
	}

	public static void crearEntregables(Serie[] series, Videojuego[] videojuegos, Scanner sc) {
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("True detective", "Nic Pizzolatto");
		Serie serie3 = new Serie("Stranger things", "Duffer & Duffer");
		Serie serie4 = new Serie("The Wire", 5, "policíaca", "David Simon");
		Serie serie5 = new Serie("Peppa Pig", 12, "terror", "Stephen King");
		
		Videojuego videojuego1 = new Videojuego();
		Videojuego videojuego2 = new Videojuego("Pokémon Oro", 1200);
		Videojuego videojuego3 = new Videojuego("Super Mario Bros", 5000);
		Videojuego videojuego4 = new Videojuego("Tetris", 10, "puzzles", "Nintendo");
		Videojuego videojuego5 = new Videojuego("Guiñote online", 1000, "de mesa", "Quió");
		
		series[0] = serie1;
		series[1] = serie2;
		series[2] = serie3;
		series[3] = serie4;
		series[4] = serie5;
		
		videojuegos[0] = videojuego1;
		videojuegos[1] = videojuego2;
		videojuegos[2] = videojuego3;
		videojuegos[3] = videojuego4;
		videojuegos[4] = videojuego5;
	}
	
	public static void entregarEntregables(Serie[] series, Videojuego[] videojuegos) {
		series[1].entregar();
		series[3].entregar();
		videojuegos[0].entregar();
		videojuegos[2].entregar();
		videojuegos[4].entregar();

	}
	
	public static void contarEntregados(Serie[] series, Videojuego[] videojuegos) {
		int series_entregadas = 0;
		int videojuegos_entregados = 0;
		for(Serie x : series) {
			series_entregadas++;
			x.setEntregado(false);
		}
		
		for(Videojuego x : videojuegos) {
			videojuegos_entregados++;
			x.devolver();
		}
		
		System.out.println("Las series entregadas son " + series_entregadas);
		System.out.println("Los videojuegos entregados son " + videojuegos_entregados);
	}
	
	public static void encontrarVideojuegoMasJugado(Videojuego[] videojuegos) {
		int posicion_videojuego = 0;
		for(int i = 0; i < videojuegos.length; i++) {
			if(videojuegos[posicion_videojuego].getHorasEstimadas() < videojuegos[i].getHorasEstimadas()) {
				posicion_videojuego = i;
			}
		}
		System.out.println(videojuegos[posicion_videojuego].toString());
	}
	
	public static void encontrarSerieMasTemporadas(Serie[] series) {
		int posicion_serie = 0;
		for(int i = 0; i < series.length; i++) {
			if(series[posicion_serie].getNumeroDeTemporadas() < series[i].getNumeroDeTemporadas()) {
				posicion_serie = i;
			}
		}
		System.out.println(series[posicion_serie].toString());
	}
}
