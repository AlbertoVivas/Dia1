/**
 * 
 */
package cursos.ejemplos.basicos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
	
	private PersonaOptimizado [] recuperarFicheroDePersona(String fichero) throws FileNotFoundException, IOException{
		PersonaOptimizado [] respuesta = null;
		ObjectInputStream ois = null;
		
		try{
		ois = new ObjectInputStream(new FileInputStream(fichero));
		respuesta = (PersonaOptimizado[]) ois.readObject();
		}catch (Exception e ){
			System.out.println("Error al leer el fichero "+fichero);
		}finally{
			ois.close();
		}
		return respuesta;
	}
	
	private void escribirPersonaEnFichero(PersonaOptimizado [] persona, String fichero) throws IOException{
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(fichero));
			oos.writeObject(persona);
		} catch (Exception e) {
			System.out.println("Error al escribir el fichero: "+fichero);
			// TODO: handle exception
		}finally{
			oos.close();
		}
		
		
	}
	
	private void salvarPersona(PersonaOptimizado persona[] , String fichero) throws FileNotFoundException, IOException{
		ObjectOutputStream oos =null;
		try{
		oos = new ObjectOutputStream(new FileOutputStream(fichero));		
		oos.writeObject(persona);
		}catch(Exception e){
			System.out.println("Error al guardar en el archivo "+fichero);
		}finally{
			oos.close();
		}
	}
	
	private void mostrarArrayPersona(PersonaOptimizado persona[]){
		int longitud = persona.length;
		for (int i = 0; i < longitud; i++) {
			persona[i].mostrarPersonaOptimizado ();
		}
	}
	
	private PersonaOptimizado[] bucleIntroducirPersona(PersonaOptimizado [] persona){
		PersonaOptimizado respuesta [] = null;
		SolicitarDatos sd = new SolicitarDatos();
		String yon ="n";
		System.out.println("Desea introducir una persona? (y/n)");
		yon = sd.pedirString();
		
		
		while (yon.equals("y")){
		yon = "n";
		respuesta = introducirPersona(persona);
		System.out.println("Desea introducir otra persona? (y/n)");
		yon = sd.pedirString();
		}
		return respuesta;
	}
	
	private PersonaOptimizado[] introducirPersona(PersonaOptimizado [] persona){
		PersonaOptimizado respuesta [] = null;
		
		if (persona != null) {

			SolicitarDatos sd = new SolicitarDatos();
			String nombre = null;
			int edad = 0;

			System.out.print("introducir Nombre: ");
			nombre = sd.pedirNombreOpt();
			System.out.println();
			System.out.print("Introducir edad: ");
			edad = sd.pedirEdadOpt();
			System.out.println();

			respuesta = new PersonaOptimizado[persona.length + 1];
			for (int i = 0; i < persona.length; i++) {
				respuesta[i] = persona[i];
			}

			respuesta[persona.length] = new PersonaOptimizado(nombre, edad);
		}
		return respuesta;
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SerializarPersona file = new SerializarPersona();
		PersonaOptimizado [] persona = null;
		PersonaOptimizado [] masPersona = null;
		String fichero = "Archivo de personas.dat";
		
		PersonaOptimizado [] personainicial = new PersonaOptimizado[3];
		personainicial[0]= new PersonaOptimizado("caca", 21);
		personainicial[1]= new PersonaOptimizado("kk", 80);
		personainicial[2]= new PersonaOptimizado("popo", 1);
		
		file.escribirPersonaEnFichero(personainicial, fichero);
		
		
		persona = file.recuperarFicheroDePersona(fichero); //recupero las personas guardadas
		
		file.mostrarArrayPersona(persona);
		masPersona = file.bucleIntroducirPersona(persona);
		file.mostrarArrayPersona(masPersona);
		
		file.salvarPersona(persona, fichero);//Salvo las personas en el archivo
		
		/*PersonaOptimizado persona = new PersonaOptimizado("lucrecia",24);
		ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Media3.dat"));
		salida.writeObject(persona);
		
		salida.close();
		
		
		ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Media3.dat") );
		
		persona = (PersonaOptimizado)entrada.readObject();
		persona.mostrarPersonaOptimizado();
		entrada.close();*/
		
		
	}

}
