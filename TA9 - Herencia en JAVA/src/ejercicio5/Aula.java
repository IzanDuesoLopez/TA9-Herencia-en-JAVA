package ejercicio5;

import java.util.ArrayList;

public class Aula {
	// Atributos
	private int identificador;
	private int maximo_estudiantes;
	private String materia;
	private Profesor profesor;
	private ArrayList<Alumno> alumnos;
	
	// Constructor
	public Aula(int identificador, int maximo_estudiantes, String materia, Profesor profesor, ArrayList<Alumno> alumnos) {
		this.identificador = identificador;
		this.maximo_estudiantes = maximo_estudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
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
	
	
	
	
}
