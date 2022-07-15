package ejercicio5;

import java.util.ArrayList;

public class Aula {
	// Atributos
	private int identificador;
	private int maximo_estudiantes;
	private String materia;
	private Profesor profesor;
	private ArrayList<Alumno> alumnos;
	private boolean se_puede_dar_clase;
	
	// Constructor
	public Aula(int identificador, int maximo_estudiantes, String materia, Profesor profesor, ArrayList<Alumno> alumnos) {
		this.identificador = identificador;
		this.maximo_estudiantes = maximo_estudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.se_puede_dar_clase = darClase(alumnos, profesor, materia);
	}
	
	// Getters y setters
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public int getMaximo_estudiantes() {
		return maximo_estudiantes;
	}
	public void setMaximo_estudiantes(int maximo_estudiantes) {
		this.maximo_estudiantes = maximo_estudiantes;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public boolean isSe_puede_dar_clase() {
		return se_puede_dar_clase;
	}

	public void setSe_puede_dar_clase(boolean se_puede_dar_clase) {
		this.se_puede_dar_clase = se_puede_dar_clase;
	}
	
	// Métodos 
	public static boolean darClase(ArrayList<Alumno> alumnos, Profesor profesor, String materia) { //
		int alumnos_presentes = 0;
		for(Alumno alumno : alumnos) {
			if(alumno != null) 
				alumnos_presentes++;
		}
		if((profesor != null && profesor.getMateria().equals(materia) && alumnos_presentes >= alumnos.size() / 2))
			return true;
		
		return false;
	}
	
	public static void mostrarNumeroAprobados(ArrayList<Alumno> alumnos) {
		int numero_alumnos = 0;
		int numero_alumnas = 0;
		for(Alumno alumno : alumnos) {
			if(alumno.getSexo() == 'H') numero_alumnos++;
			else if(alumno.getSexo() == 'M') numero_alumnas++;
		}
		System.out.println("Alumnos aprobados: " + numero_alumnos);
		System.out.println("Alumnas aprobadas: " + numero_alumnas);
		
	}
}
