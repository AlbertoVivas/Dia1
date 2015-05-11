package cursos.ejemplos.basicos;

import java.util.Scanner;

public class SolicitarDatos {
	static Scanner sc = new Scanner(System.in);
	/** Con esto se pretende tener una sola clase en la que se soliciten cada uno de los datos
	 * @param args
	 */
	
	public static String pedirString (){
		return sc.next();
	}
	public static int pedirInt () {
		return sc.nextInt();
	}
	
	
	
	
	
	public static String pedirNombreOpt(){
		return sc.next();
	}
	public static int pedirEdadOpt(){
			return sc.nextInt();
		}
	
	

}
