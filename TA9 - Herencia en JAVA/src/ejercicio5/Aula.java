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
	
	// Constructores
	public Aula() {
		this.identificador = generar_identificador();
		this.maximo_estudiantes = 50;
		this.materia = elegir_materia();
		this.profesor = new Profesor();
		this.alumnos = new ArrayList<Alumno>();
		generar_alumnos();
		this.se_puede_dar_clase = darClase(alumnos, profesor, materia, maximo_estudiantes);
		if(this.se_puede_dar_clase) {
			mostrarNumeroAprobados(alumnos);
		}
	}
	
	public Aula(int identificador, int maximo_estudiantes, String materia, Profesor profesor, ArrayList<Alumno> alumnos) {
		this.identificador = identificador;
		this.maximo_estudiantes = maximo_estudiantes;
		this.materia = materia;
		this.profesor = profesor;
		this.alumnos = alumnos;
		this.se_puede_dar_clase = darClase(alumnos, profesor, materia, maximo_estudiantes);
		if(this.se_puede_dar_clase) {
			mostrarNumeroAprobados(alumnos);
		}
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
	public static boolean darClase(ArrayList<Alumno> alumnos, Profesor profesor, String materia, int maximo_estudiantes) { //
		int alumnos_presentes = 0;
		for(Alumno alumno : alumnos) {
			if(alumno != null) 
				alumnos_presentes++;
		}
		
		if(!(profesor != null)) {
			System.out.println("No se puede dar clase. No hay profesor.");
			return false;
		} else if(!(profesor.getMateria().equals(materia))) {
			System.out.println("No se puede dar clase. El profesor no da la materia correspondiente.");
			return false;
		} else if(alumnos_presentes < maximo_estudiantes / 2) {
			System.out.println("No se puede dar clase. Hay " + alumnos.size() + " alumnos de los " + maximo_estudiantes + " máximos.");
			return false;
		}
		
		System.out.println("Se puede dar clase. Hay " + alumnos.size() + " alumnos de los " + maximo_estudiantes + " máximos.");
		return true;
	}
	
	public static void mostrarNumeroAprobados(ArrayList<Alumno> alumnos) {
		int numero_alumnos = 0;
		int numero_alumnas = 0;
		for(Alumno alumno : alumnos) {
			if(alumno.getSexo() == 'H' && alumno.getCalificacion() >= 5) 
				numero_alumnos++;
			else if(alumno.getSexo() == 'M' && alumno.getCalificacion() >= 5) 
				numero_alumnas++;
		}
		System.out.println("Alumnos aprobados: " + numero_alumnos);
		System.out.println("Alumnas aprobadas: " + numero_alumnas);
		
	}
	
	public static int generar_identificador() {
		int longitud = 4;
		int posicion_caracter;
		String nuevo_identificador = "";
		
		for(int i = 0; i < longitud; i++) {
			posicion_caracter = (int)(Math.random() * 9);
			nuevo_identificador += posicion_caracter;
		}
		
		return Integer.parseInt(nuevo_identificador);
	}
	
	public static String elegir_materia() {
		String[] materias = {"matemáticas", "filosofía", "física"};
		//(int)(Math.random() * (max - min)) + min;
		int posicion = (int)(Math.random() * (materias.length - 1));
		return materias[posicion];
		
	}
	
	public void generar_alumnos() {
		//(int)(Math.random() * (max - min)) + min;
		for(int i = 0; i < this.maximo_estudiantes; i++) {
			Alumno alumno = new Alumno();
			if(alumno.isFalta()) this.alumnos.add(alumno);
		}
	}
}
