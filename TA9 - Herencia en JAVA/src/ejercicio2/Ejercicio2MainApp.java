package ejercicio2;

import java.util.Scanner;

import ejercicio1.Electrodomestico;
import ejercicio1.Lavadora;
import ejercicio1.Television;

public class Ejercicio2MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Serie[] series = new Serie[5];
		Videojuego[] videojuegos = new Videojuego[5];

	}

	public static void crear_entregables(Serie[] series, Videojuego[] videojuegos, Scanner sc) {
		Serie serie1 = new Serie();
		Serie serie2 = new Serie("True detective", "Nic Pizzolatto");
		Serie serie3 = new Serie("Stranger things", "Duffer & Duffer");
		Serie serie4 = new Serie("The Wire", 5, "policíaca", "David Simon");
		Serie serie5 = new Serie("Peppa Pig", 12, "terror", "Stephen King");
		
		Videojuego videojuego1 = new Videojuego();
		Videojuego videojuego2 = new Videojuego("Pokémon Oro", 12000);
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
}
