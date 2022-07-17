package ejercicio6;

public class Ejercicio6MainApp {

	public static void main(String[] args) {
		pelicula1();
	}
	
	// Creo una pelicula con sus distintos espectadores, con distinta cantidad de dinero y edades
	public static void pelicula1() {
		espectador1();
		espectador2();
		espectador3();
		espectador4();
	}
	
	// Este espectador tiene el dinero necesario pero no la edad para poder ver la película
	public static void espectador1 () {
		Espectador espectador = new Espectador("Juan", 12, 30);
		Pelicula pelicula = new Pelicula("Ambition", 80, 16, "Ridley Scott");
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		cine.comprobarSentarse(espectador);
		cine.sentarEspectador(espectador);
		cine.mostrarSala();
		
	}
	
	// Este espectador no tiene el dinero necesario pero si la edad para poder ver la película
	public static void espectador2 () {
		Espectador espectador = new Espectador("Rita", 18, 7);
		Pelicula pelicula = new Pelicula("Ambition", 80, 16, "Ridley Scott");
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		cine.comprobarSentarse(espectador);
		cine.sentarEspectador(espectador);
		cine.mostrarSala();
		
	}
	
	// Este espectador tiene el dinero necesario y la edad para poder ver la película
	public static void espectador3 () {
		Espectador espectador = new Espectador("Carlos", 20, 30);
		Pelicula pelicula = new Pelicula("Ambition", 80, 16, "Ridley Scott");
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		cine.comprobarSentarse(espectador);
		cine.sentarEspectador(espectador);
		cine.mostrarSala();
		
	}
	
	// Este espectador no tiene ni el dinero necesario ni la edad para poder ver la película
	public static void espectador4 () {
		Espectador espectador = new Espectador("Alba", 12, 2);
		Pelicula pelicula = new Pelicula("Ambition", 80, 16, "Ridley Scott");
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		cine.comprobarSentarse(espectador);
		cine.sentarEspectador(espectador);
		cine.mostrarSala();
		
	}
}
