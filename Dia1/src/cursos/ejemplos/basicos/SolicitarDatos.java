package cursos.ejemplos.basicos;

import java.util.Scanner;

public class SolicitarDatos {
	static Scanner sc = new Scanner(System.in);
	/** Con esto se pretende tener una sola clase en la que se soliciten cada uno de los datos
	 * @param args
	 */
	
	public String pedirString (){
		return sc.next();
	}
	public int pedirInt () {
		return sc.nextInt();
	}
	
	
	
	
	
	public String pedirNombreOpt(){
		return sc.next();
	}
	public int pedirEdadOpt(){
			return sc.nextInt();
		}
	
	

}
