package ejercicio1;

public class Electrodomestico {

	// Atributos de la clase
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	// Constantes para el constructor por defecto
	protected final String colorDefault = "blanco";
	protected final char consumoEnergeticoDefault = 'F';
	protected final double precioBaseDefault = 100.0;
	protected final double pesoDefault = 5.0;

	// Constructor de la clase por defecto
	public Electrodomestico() {
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.precioBase = precioBaseDefault;
		this.peso = pesoDefault;
	}

	// Constructor con el precio y peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.color = colorDefault;
		this.consumoEnergetico = consumoEnergeticoDefault;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	// Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}

	// Método que recibe un color por parámetro, lo comprueba en un switch y
	// devuelve una string con el color disponible
	public String comprobarColor(String color) {

		String colorFinal = color;
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			colorFinal = color;
		}
		
		return colorFinal;

	}

	// Método que recibe un consumo eléctrico por parámetro, lo comprueba en un
	// switch y devuelve una string con el consumo eléctrico disponible
	public char comprobarConsumoEnergetico(char letra) {

		char consumo;

		switch (letra) {
		case 'A':
			consumo = 'A';
			break;
		case 'B':
			consumo = 'B';
			break;
		case 'C':
			consumo = 'C';
			break;
		case 'D':
			consumo = 'D';
			break;
		case 'E':
			consumo = 'E';
			break;
		case 'F':
			consumo = 'F';
			break;
		default:
			consumo = 'F'; // El consumo por defecto será F (es decir, consumo alto)
			break;
		}

		return consumo;

	}
	
	// Método que según el consumo energético y peso aumenta el precio
	public void precioFinal() {
		// ---
	}

	// Getters y Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		//prueba
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Método toString que devuelve una String con los atributos de la instancia
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + "€ " + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "Kg " + "]";
	}
	
	// probar commit

}
