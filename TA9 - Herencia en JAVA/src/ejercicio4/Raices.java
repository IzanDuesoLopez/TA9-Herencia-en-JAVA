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
		double resultado = (Math.pow(b, 2) - 4 * a * c);
		return resultado;
	}
	
}
