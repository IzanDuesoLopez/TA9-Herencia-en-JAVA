package ejercicio6;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio6MainApp {

	public static void main(String[] args) {
		final int TAM_FILAS = 8;
		final int TAM_COLS = 8;
		String salaCine[][] = new String[TAM_FILAS][TAM_COLS]; // Matriz con las posiciones de la sala
		boolean estaOcupado[][] = new boolean[TAM_FILAS][TAM_COLS]; // Matriz que nos indica si la posición esta ocupada o no
		char abecedario[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		menuCine(salaCine, estaOcupado, abecedario); // Llamamos al método principal del menú
	}

	// Método del menu cine
	public static void menuCine(String[][] salaCine, boolean[][] estaOcupado, char[] abecedario) {
		// Pedimos al espectador que tome asiento
		System.out.println("Las casillas marcadas con una X estan ocupadas, elige tu sitio a continuación: \n");
		inicializarSalaCine(salaCine, estaOcupado, abecedario); // Inicializamos la matriz que contiene la información de la sala de cine
		mostrarSalaCine(salaCine, estaOcupado, abecedario); // Mostramos la sala de cine

		// Seleccionamos asiento para el espectador
		System.out.println("Selecciona posicion");
		Scanner sc = new Scanner(System.in);
		String asiento = sc.next();
		
		// Recorremos la sala del cine
		for (int fil = 0; fil < salaCine.length; fil++) {
			for (int col = 0; col < salaCine[fil].length; col++) {
				// Si el asiento existe y no esta ocupado
				if (asiento.equals(salaCine[fil][col]) && estaOcupado[fil][col] == false) {
					estaOcupado[fil][col] = true; // El asiento se ocupa ya que el espectador se sienta
				}
			}
		}
		
		mostrarSalaCine(salaCine, estaOcupado, abecedario); // Mostramos la sala de cine
	}

	// Método que muestra la sala de cine y sus posiciones
	public static void mostrarSalaCine(String[][] salaCine, boolean[][] estaOcupado, char[] abecedario) {
		// Recorremos la matriz mostrando filas y columnas
		for (int fil = 0; fil < estaOcupado.length; fil++) {
			for (int col = 0; col < estaOcupado[fil].length; col++) {
				if (!estaOcupado[fil][col]) { // Si no esta ocupada, mostramos el asiento vacio
					System.out.print("[ ]" + " ");
				} else { // Si esta ocupada mostramos el asiento ocupado
					System.out.print("[X]" + " ");
				}
			}
			System.out.println();
		}

		System.out.println("\n");

		// Asignamos los valores a la matriz del cine y mostramos por tamaño la sala
		for (int fil = 0; fil < salaCine.length; fil++) {
			for (int col = 0; col < salaCine[fil].length; col++) {
				System.out.print(salaCine[fil][col] + " ");
			}
			System.out.println();
		}
	}

	// Método que inicializa la sala de cine
	public static void inicializarSalaCine(String[][] salaCine, boolean[][] estaOcupado, char[] abecedario) {
		// Inicializamos la matriz que nos indica si un asiento esta ocupado o no
		for (int fil = 0; fil < estaOcupado.length; fil++) {
			for (int col = 0; col < estaOcupado[fil].length; col++) {
				estaOcupado[fil][col] = false; // Inicialmente los asientos estaran vacios
			}
		}

		// Asignamos los valores a la matriz del cine y mostramos por tamaño la sala
		for (int fil = 0; fil < salaCine.length; fil++) {
			for (int col = 0; col < salaCine[fil].length; col++) {
				salaCine[fil][col] = String.valueOf(fil + 1) + abecedario[col]; // Cada posición de la matriz sera número de fila + letra de columna
			}
		}
	}

}
