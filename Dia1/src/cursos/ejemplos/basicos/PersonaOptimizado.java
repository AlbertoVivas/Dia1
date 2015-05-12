package cursos.ejemplos.basicos;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.Scanner;

public class PersonaOptimizado implements Serializable {
	private String nombre;
	private int edad;
	private final int MAYOR_EDAD =18;
	/**
	 * @param args
	 */
	
	public boolean MayorOptimizado(){ //Esta clase comprueba si la persona es mayor
		return edad>=MAYOR_EDAD;		   // y devuelve un boolean 
								  // se ha optimizado
	}
	
	public PersonaOptimizado (String nombre , int edad){
		this.nombre = nombre; // el this se refiere al objeto que llama
		this.edad = edad;    // nombre = nombre
				            //    |         |
						   //  (this)   (argumento)
	}
	
	public void mostrarPersonaOptimizado (){
		System.out.println("El nombre de la persona introducido es: "+this.nombre+" y su edad: "+this.edad);
		}
	
	
	
	public void PersonaIgual(PersonaOptimizado persona1 , PersonaOptimizado persona2){
		//if (persona1.nombre == persona2.nombre && persona1.edad == persona2.edad ) {
		if (persona1.nombre.equals(persona2.nombre) && persona1.edad == persona2.edad ) {
			System.out.println("Son iguales!!!");
		}else {
			System.out.println("No son iguales");
		}
	
	}
	/**
	 * compara 
	 */
	@Override
		public boolean equals(Object ob) {
		// TODO Auto-generated method stub
		boolean rpta = false;
		PersonaOptimizado p = null;
		if (ob instanceof PersonaOptimizado){ // con el instanceof
											 // me aseguro que el objeto ob
											// pertenece a la clase persona.
			p = (PersonaOptimizado) ob; //casting 
		
			if (p.nombre.equals(this.nombre) && p.edad == this.edad) {
				rpta = true;
			}else {
				rpta = false;}
		}else rpta = false;
		//return super.equals(arg0);
		return rpta;
		}
	@Override
		public String toString() {
	 // TODO Auto-generated method stub
		String dato = null;
		dato ="El nombre es: " +this.nombre+" y su edad: "+this.edad;
		//return super.toString();
		return dato; 
		}
	/*public void mostrarMayorOptimizado (){
		if (MayorOptimizado(this.edad)){
			System.out.println("La persona es mayor!!!");
		}else (System.out.println("Es menor");)
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void incrementarEdad(int inc) {
		this.edad+= inc;
	}
	public static int pedirIncrementoEdad(){
		int rpta = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("cuantos años desea incrementar");
			rpta=sc.nextInt();
		return rpta;
	}
	
	public static PersonaOptimizado sumarAnios1(PersonaOptimizado p, int edad){
		PersonaOptimizado persona = null;
		persona = new PersonaOptimizado(p.getNombre(), p.getEdad());
		persona.incrementarEdad(edad);
		return persona;
	}
	
	public void SumarAnios2 (int edad){
		this.edad+=edad;
	}
	
	public static void SumarAnios3 (PersonaOptimizado p, int edad){
		p.setEdad(p.getEdad()+edad);
	}
	
	
}
