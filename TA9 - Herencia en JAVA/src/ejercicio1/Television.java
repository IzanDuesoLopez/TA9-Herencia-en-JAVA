package ejercicio1;

public class Television extends Electrodomestico {

	// Atributos
	private double resolucion;
	private boolean tdt;
	
	// Constantes
	private static final double RESOLUCION = 20;
	private static final boolean TDT = false;
	
	// Getters y setters
	public double getResolucion() {
		return resolucion;
	}
	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isTdt() {
		return tdt;
	}
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", tdt=" + tdt + ", RESOLUCION=" + RESOLUCION + ", TDT=" + TDT
				+ ", precioBase=" + precioBase + ", color=" + color + ", consumoEnerg=" + consumoEnergetico + ", peso="
				+ peso + "]";
	}
	
	// Constructores
	public Television() {
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}
	public Television (int precioBase, int peso) {
		super (precioBase, peso);
		this.resolucion = RESOLUCION;
		this.tdt = TDT;
	}	
	public Television(int precioBase, String color, char consumoEnerg, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnerg, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}
	
	// Metodos
	public void precioFinal() {
		if (resolucion > 40) {
			precioBase += super.getPrecioBase() * 30 / 100;
		}
		if (tdt) {
			precioBase += 50;
		}
	}
	
}
