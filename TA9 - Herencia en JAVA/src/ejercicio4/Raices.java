package ejercicio4;

public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	// Insertamos los 3 valores para construir el objeto
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Devuelve el valor del discriminante 
	public double getDiscriminante() {
		// Aplicamos la formula
		double resultado = (Math.pow(b, 2) - (4 * a * c));
		return resultado;
	}
	
	// Devuelve true si el discriminante es mayor o igual a 0
	public boolean tieneRaices() {
		boolean resultado = false;
		// Si el discriminante es mayor o igual a 0
		if(this.getDiscriminante() >= 0) {
			resultado = true; // Resultado es igual a true
		}
		return resultado;
	}
	
	// Devuelve true si tiene una unica solución
	public boolean tieneRaiz() {
		boolean resultado = false;
		// Si el discriminante es igual a 0
		if (this.getDiscriminante() == 0) {
			resultado = true; // Resultado es igual a true
		}
		return resultado;
	}
	
	// Método calcular
	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		} else if(tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("¡No tiene solución!");
		}
	}
	
	// Métodos para obtener raíces
	public void obtenerRaices() {
		double raiz1 = ((-b) + Math.sqrt(getDiscriminante())) / (2 * a);
		double raiz2 = ((-b) - Math.sqrt(getDiscriminante())) / (2 * a);
		
		System.out.println("La primera raíz es " + raiz1);
		System.out.println("La segunda raíz es " + raiz2);
	}
	
	public void obtenerRaiz() {
		double raiz = (-b) / (2 * a);
		System.out.println("La raíz es " + raiz);
	}
}
