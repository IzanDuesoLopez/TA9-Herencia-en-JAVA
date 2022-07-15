package ejercicio6;

import java.util.Iterator;

public class Ejercicio5MainApp {

	public static void main(String[] args) {
		
		final int TAM_FILAS = 8;
		final int TAM_COLS = 8;
		
		String salaCine[][] = new String[TAM_FILAS][TAM_COLS];
		boolean estaOcupado[][] = new boolean[TAM_FILAS][TAM_COLS];
		char abedecario[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		System.out.println("Las casillas marcadas con una X estan ocupadas, elige tu sitio a continuación: \n");
		for (int fil = 0; fil < estaOcupado.length; fil++) {
			for (int col = 0; col < estaOcupado[fil].length; col++) {
				estaOcupado[fil][col] = false;
				if(!estaOcupado[fil][col]) {
					System.out.print("[ ]" + " ");
				} else {
					System.out.print("[X]" + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		// Asignamos los valores a la matriz del cine y mostramos por tamaño la sala
		for (int fil = 0; fil < salaCine.length; fil++) {
			for (int col = 0; col < salaCine[fil].length; col++) {
				salaCine[fil][col] = String.valueOf(fil+1) + abedecario[col];
				System.out.print(salaCine[fil][col] + " ");
			}
			System.out.println();
		}

	}

}
