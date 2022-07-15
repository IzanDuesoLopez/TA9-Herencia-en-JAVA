package ejercicio5;

import java.util.Random;

public class Profesor extends Persona {
	
	// Atributos
	private String materia;

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	// Constructores
	
	public Profesor () {
		this.edad = edad();
		this.materia = generarMateria();
		this.falta = ausencia();
	}
	
	// Metodos
	public boolean ausencia() {
		Random rdm = new Random();
		boolean falta = false;
		
		// Generamos un numero random
		if ((int) (rdm.nextDouble() * 10 + 1) > 8) {
			falta = true;
		}
		
		return falta;
	}
	
	
	

}
