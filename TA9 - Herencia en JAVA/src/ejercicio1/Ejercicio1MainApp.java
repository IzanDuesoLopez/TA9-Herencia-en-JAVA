package ejercicio1;

import java.util.Scanner;

public class Ejercicio1MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Electrodomestico[] electrodomesticos = new Electrodomestico[10];
		crear_electrodomesticos(electrodomesticos, sc);
		calcular_precio_final(electrodomesticos);
		calcular_precio_por_clase(electrodomesticos);
	}

	// Instancia diez objetos y se añaden a la array de electrodomésticos
	public static void crear_electrodomesticos(Electrodomestico[] electrodomesticos, Scanner sc) {
		Electrodomestico lavavajillas = new Electrodomestico();
		Electrodomestico dvd = new Electrodomestico(35.50, 3.50);
		Electrodomestico microondas = new Electrodomestico(50, "blanco", 'A', 5);
		Television tv1 = new Television();
		Television tv2 = new Television(120, 8);
		Television tv3 = new Television(250, 11);
		Television tv4 = new Television(500, "negro", 'C', 14, 2048, true);
		Lavadora lavadora1 = new Lavadora();
		Lavadora lavadora2 = new Lavadora(199.99, 50);
		Lavadora lavadora3 = new Lavadora(300, "gris", 'B', 60.25, 50);
		
		electrodomesticos[0] = lavavajillas;
		electrodomesticos[1] = dvd;
		electrodomesticos[2] = microondas;
		electrodomesticos[3] = tv1;
		electrodomesticos[4] = tv2;
		electrodomesticos[5] = tv3;
		electrodomesticos[6] = tv4;
		electrodomesticos[7] = lavadora1;
		electrodomesticos[8] = lavadora2;
		electrodomesticos[9] = lavadora3;
	}
	
	// Calcula precio final de todos los electrodomésticos
	public static void calcular_precio_final(Electrodomestico[] electrodomesticos) {
		for(Electrodomestico x : electrodomesticos) {
			x.precioFinal();
		}
		
	}
	
	// Calcula precio de cada clase
	public static void calcular_precio_por_clase(Electrodomestico[] electrodomesticos) {
		double precio_lavadoras = 0;
		double precio_televisores = 0;
		double precio_electrodomesticos = 0;
		
		for(Electrodomestico x : electrodomesticos) {
			precio_electrodomesticos += x.getPrecioBase();
			
			if(x instanceof Lavadora) {
				precio_lavadoras += x.getPrecioBase();
			} else if(x instanceof Television) {
				precio_televisores += x.getPrecioBase();
			} 
		}
		
		System.out.println("El precio de todas las lavadoras es de " + precio_lavadoras + "€.");
		System.out.println("El precio de todos los televisores es de " + precio_televisores + "€.");
		System.out.println("El precio de todos los electrodomésticos es de " + precio_electrodomesticos + "€.");
	}
}
