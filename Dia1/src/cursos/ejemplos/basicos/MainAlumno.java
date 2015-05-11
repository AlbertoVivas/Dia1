package cursos.ejemplos.basicos;

public class MainAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alumno a = null;
		PersonaOptimizado p = null;
		
		
		p = new Alumno("juan", 23, 5);
		System.out.println(p);
		p = new Alumno("mikel", 20, 10);
		System.out.println(p);
		p = new Alumno("alberto", 23, 9);
		System.out.println(p);
		p = new Alumno("j", 60, 1);
		System.out.println(p);
	}

}
