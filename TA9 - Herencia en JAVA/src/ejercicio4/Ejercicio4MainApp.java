package ejercicio4;

public class Ejercicio4MainApp {
	
	public static void main(String[] args) {
		
		// Probamos el método con una solución doble
		Raices raiz = new Raices (1, -2, 1);
		System.out.print("La ecuación a resolver es:  x^2 + -2x + 1 = 0");
		System.out.print("El discriminante de la raíz es: " + raiz.getDiscriminante());
		System.out.print("¿Tiene dos soluciones la ecuación?" + raiz.tieneRaices());
		System.out.print("¿Tiene la ecuación una única solución?" + raiz.tieneRaiz());
		raiz.calcular();
		raiz.obtenerRaices();
		raiz.obtenerRaiz();
		
		// Probamos el método con dos soluciones
		Raices raiz1 = new Raices (2, -7, 3);
		System.out.print("La ecuación a resolver es:  2x^2 + -7x + 3 = 0");
		System.out.print("El discriminante de la raíz es: " + raiz1.getDiscriminante());
		System.out.print("¿Tiene dos soluciones la ecuación?" + raiz1.tieneRaices());
		System.out.print("¿Tiene la ecuación una única solución?" + raiz1.tieneRaiz());
		raiz1.calcular();
		raiz1.obtenerRaices();
		raiz1.obtenerRaiz();
		
		// Probamos el método sin solucion
		Raices raiz2 = new Raices (1, 1, 1);
		System.out.print("La ecuación a resolver es:  x^2 + x + 1 = 0");
		System.out.print("El discriminante de la raiz es: " + raiz2.getDiscriminante());
		System.out.print("¿Tiene dos soluciones la ecuación?" + raiz2.tieneRaices());
		System.out.print("¿Tiene la ecuación una única solución?" + raiz2.tieneRaiz());
		raiz2.calcular();
		raiz2.obtenerRaices();
		raiz2.obtenerRaiz();
		
	}

}