package ejercicio3;

public class Ejercicio3MainApp {

	public static void main(String[] args) {

		// Creamos los objetos tipo libro
		Libro libroUno = new Libro("ISBN 0-7645-2641-3", "Effective Java", "Joshua Bloch", 367);
		Libro libroDos = new Libro("ISBN 0-4635-7941-1", "Head First Java", "Kathy Sierra", 532);
		
		// Los mostramos por pantalla
		System.out.println(libroUno.toString());
		System.out.println(libroDos.toString());
	}

}
