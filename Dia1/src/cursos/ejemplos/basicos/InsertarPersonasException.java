/**
 * 
 */
package cursos.ejemplos.basicos;

/**
 * @author Alberto Vivas
 * 
 * Definir una excepción propia, llamada InsertarPersonasException 
 * y que se lance al sobrepasar el número de personas que incrementamos 
 * en nuestra Lista.
 * 
 * Nota: debemos previamente a lanzar nuestra excepción, 
 * recoger la ArrayIndexOutOfBoundsException
 *
 */
public class InsertarPersonasException extends Exception{
	final static String MENSAJE = "Fuera de rango del array!!";
	
	public InsertarPersonasException(){
		super(MENSAJE);
	}
}
