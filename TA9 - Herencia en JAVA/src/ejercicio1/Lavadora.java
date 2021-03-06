package ejercicio1;

public class Lavadora extends Electrodomestico{
	
	private double carga;
	
	private static final double CARGA_DEFAULT = 5.0;
	
	// Constructor por defecto
	public Lavadora () {
		this.carga = CARGA_DEFAULT;
	}

	// Constructor con el precio y peso, el resto por defecto
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFAULT;
	}

	// Constructor con la carga y el resto de atributos heredados
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	
	// Método GET de carga
	public double getCarga() {
		return carga;
	}

	// Método precioFinal
	@Override
	public void precioFinal() {

		// Si la carga es mayor que 30
		if(this.carga > 30) {
			this.precioBase += 50;
		}
		
		super.precioFinal();
	}
}
