package ejercicio3;

public class Ejercicio3MainApp {

	public static void main(String[] args) {

		// Creamos los objetos tipo libro
		Libro libroUno = new Libro("ISBN 0-7645-2641-3", "Effective Java", "Joshua Bloch", 357);
		Libro libroDos = new Libro("ISBN 0-4635-7941-1", "Head First Java", "Kathy Sierra", 532);

		// Los mostramos por pantalla
		System.out.println(libroUno.toString() + "\n");
		System.out.println(libroDos.toString() + "\n");
		
		compararPaginas(libroUno, libroDos); // Llamamos al método compararPaginas que recibe por parámetro los dos libros

	}

	// Cuál de los dos libros tiene más páginas:
	public static void compararPaginas(Libro libroUno, Libro libroDos) {

		if (libroUno.getNumero_paginas() > libroDos.getNumero_paginas()) { // Si el primer libro tiene más páginas que el segundo
			System.out.println(
					libroUno.getTitulo() + " con " + libroUno.getNumero_paginas() + " páginas tiene más páginas que "
							+ libroDos.getTitulo() + " con " + libroDos.getNumero_paginas() + " páginas");

		} else if (libroUno.getNumero_paginas() < libroDos.getNumero_paginas()) { // Si el segundo libro tiene más páginas que el primero
			System.out.println(
					libroDos.getTitulo() + " con " + libroDos.getNumero_paginas() + " páginas tiene más páginas que "
							+ libroUno.getTitulo() + " con " + libroUno.getNumero_paginas() + " páginas");

		} else { // Si tienen las mismas páginas
			System.out.println(libroUno.getTitulo() + " con " + libroUno.getNumero_paginas()
					+ " páginas tiene las mismas páginas que " + libroDos.getTitulo() + " con "
					+ libroDos.getNumero_paginas() + " páginas");
		}
	}
}
