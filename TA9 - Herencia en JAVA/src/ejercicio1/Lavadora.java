package ejercicio1;

public class Lavadora extends Electrodomestico{
	
	private double carga;
	
	private static final double cargaDefault = 5.0;
	
	// Constructor por defecto
	public Lavadora () {
		this.carga = cargaDefault;
	}

	// Constructor con el precio y peso, el resto por defecto
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = cargaDefault;
	}

	// Constructor con la carga y el resto de atributos heredados
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

}
