package ejercicio6;

public class Ejercicio6MainApp {

	public static void main(String[] args) {
		pelicula1(); // Llámamos al método con la funcionalidad del cine
		
	}
	
	// Creo una pelicula con sus distintos espectadores, con distinta cantidad de dinero y edades
	public static void pelicula1() {
		Pelicula pelicula = new Pelicula("Ambition", 80, 16, "Ridley Scott");
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		
		// Este espectador tiene el dinero necesario pero no la edad para poder ver la película
		Espectador espectador1 = new Espectador("Juan", 12, 30);
		// Este espectador no tiene el dinero necesario pero si la edad para poder ver la película
		Espectador espectador2 = new Espectador("Rita", 18, 7);
		// Este espectador tiene el dinero necesario y la edad para poder ver la película
		Espectador espectador3 = new Espectador("Carlos", 20, 30);
		// Este espectador no tiene ni el dinero necesario ni la edad para poder ver la película
		Espectador espectador4 = new Espectador("Alba", 12, 2);
		
		/* Creamos el array de espectadores para llamar a las funciones comprobarSentarse, sentarEspectador
		   y mostrarSala */
		Espectador[] cola = {espectador1, espectador2, espectador3, espectador4};
		for(int i = 0; i < cola.length; i++) {
			if(cine.comprobarSentarse(cola[i])) // Comprobamos si nos podemos sentar
				cine.sentarEspectador(cola[i]); // Si nos podemos sentar nos sentamos
			cine.mostrarSala(); // Mostramos la sala de cine con los diferentes asientos
		}	
	}
}
