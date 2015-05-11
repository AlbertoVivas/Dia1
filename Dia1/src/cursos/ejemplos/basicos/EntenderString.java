package cursos.ejemplos.basicos;

public class EntenderString {
	
	/** Con este codigo pretendemos entender el funcionamiento y comparacion
	 * en el momento que java procesa dos variables.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String palabra = null;
String palabra2 = null;

palabra = new String ("A");
palabra2 = new String("A");
//if (palabra==palabra2) {	//con esta linea comparo los strings con ==
						   // lo que compara las direcciones de memoria y no
						  //el valor que hay dentro de la variable
	if (palabra.equals(palabra2)) {//con el equals si que se compara el valor
								  // de la variable string
		
	System.out.println("son iguales");
	
} else {
	System.out.println("son distintas");
}
 System.out.println(palabra+"  "+palabra2);
	}

}
