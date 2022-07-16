package ejercicio6;

public class Ejercicio6MainApp {

	public static void main(String[] args) {
		Espectador espectador = new Espectador();
		Pelicula pelicula = new Pelicula();
		Cine cine = new Cine(pelicula, 8.50, 8, 8);
		cine.comprobarSentarse(espectador);
		cine.sentarEspectador(espectador);
		cine.mostrarSala();
	}

}
