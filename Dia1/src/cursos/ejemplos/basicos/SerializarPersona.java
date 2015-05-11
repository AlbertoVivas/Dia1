/**
 * 
 */
package cursos.ejemplos.basicos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class SerializarPersona {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		PersonaOptimizado persona = new PersonaOptimizado("lucrecia",24);
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Media3.dat"));
		salida.writeObject(persona);
		
		salida.close();
		
		
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Media3.dat") );
		
		persona = (PersonaOptimizado)entrada.readObject();
		persona.mostrarPersonaOptimizado();
		entrada.close();
		
		
	}

}
