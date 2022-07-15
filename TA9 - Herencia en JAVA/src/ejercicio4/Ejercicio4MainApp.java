package ejercicio4;

public class Ejercicio4MainApp {
	
	public static void main(String[] args) {
		

		Raices raiz = new Raices (9, -8, 1);
		raiz.getDiscriminante();
		
		Raices raiz1 = new Raices (10, -4, 2);
		raiz1.tieneRaices();
		
		Raices raiz2 = new Raices (7, 5, 4);
		raiz2.tieneRaiz();
		
		Raices raiz3 = new Raices (8, -2, 3);
		raiz3.calcular();
		
		Raices raiz4 = new Raices (7, 13, 3);
		raiz4.obtenerRaices();
		
		Raices raiz5 = new Raices (13, -22, 10);
		raiz5.obtenerRaiz();
		
	}

}