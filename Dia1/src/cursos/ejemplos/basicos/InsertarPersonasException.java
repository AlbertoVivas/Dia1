/**
 * 
 */
package cursos.ejemplos.basicos;

/**
 * @author Alberto Vivas
 * 
 * Definir una excepci�n propia, llamada InsertarPersonasException 
 * y que se lance al sobrepasar el n�mero de personas que incrementamos 
 * en nuestra Lista.
 * 
 * Nota: debemos previamente a lanzar nuestra excepci�n, 
 * recoger la ArrayIndexOutOfBoundsException
 *
 */
public class InsertarPersonasException extends Exception{
	final static String MENSAJE = "Fuera de rango del array!!";
	
	public InsertarPersonasException(){
		super(MENSAJE);
	}
}
