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
import java.util.Scanner;

/**
 * @author Alberto Vivas
 *
 * 
 */
public class SerializarPersona {

	/**
	 * Con este metodo, extraigo los objetos de tipo persona que he guardado
	 * fisicamente en el ordenador.
	 * 
	 * @param fichero
	 * @return PersonaOptimizado
	 * @throws FileNotFoundException
	 * @throws IOException
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
	
	/**
	 * Este metodo nos permite guardar las personas en un archivo
	 * 
	 * @param persona
	 * @param fichero
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
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
	
	/**
	 * Con este metodo mostramos por consola un objeto de tipo persona
	 * @param persona
	 */
	private void mostrarArrayPersona(PersonaOptimizado persona[]){
		int longitud = persona.length;
		for (int i = 0; i < longitud; i++) {
			persona[i].mostrarPersonaOptimizado ();
		}
	}
	/**
	 * Metodo que nos permite introducir o no el numero de personas que
	 * queramos siempre seguido de un y/n
	 * @param persona
	 * @return
	 */
	private PersonaOptimizado[] bucleIntroducirPersona(PersonaOptimizado [] persona){
		PersonaOptimizado respuesta [] = null;
		SolicitarDatos sd = new SolicitarDatos();
		String yon ="n";
		System.out.print("Desea introducir una persona? (y/n) ");
		yon = sd.pedirString();
		
		
		while (yon.equals("y")){
		yon = "n";
		respuesta = introducirPersona(persona);
		System.out.print("Desea introducir otra persona? (y/n) ");
		yon = sd.pedirString();
		}
		if (respuesta == null){
			respuesta = persona;
		}
		
		return respuesta;
	}
	/**
	 * Con este metodo, creamos un objeto de tipo persona y lo incluimos
	 * a las personas que tenemos anteriormente
	 * @param persona
	 * @return
	 */
	private PersonaOptimizado[] introducirPersona(PersonaOptimizado [] persona){
		PersonaOptimizado respuesta [] = null;
		
		if (persona != null) {

			SolicitarDatos sd = new SolicitarDatos();
			String nombre = null;
			int edad = 0;

			System.out.print("introducir Nombre: ");
			nombre = sd.pedirNombreOpt();
			//System.out.println();
			System.out.print("Introducir edad: ");
			edad = sd.pedirEdadOpt();
			//System.out.println();

			respuesta = new PersonaOptimizado[persona.length + 1];
			for (int i = 0; i < persona.length; i++) {
				respuesta[i] = persona[i];
			}

			respuesta[persona.length] = new PersonaOptimizado(nombre, edad);
		}
		return respuesta;
	}
	/**
	 * Este metodo nos permite borrar una persona a elegir,
	 * si introducimos un nombre que exista, nos devuelve el array de objetos
	 * de tipo persona, sin la persona que solicitamos borrar.
	 * 
	 * En caso de que introduzcamos un nombre que no exista nos devuelve todas
	 * las personas que habian anteriormente.
	 * @param persona
	 * @return {@link PersonaOptimizado}
	 */
	private PersonaOptimizado[] borrarPersona(PersonaOptimizado [] persona){
		PersonaOptimizado [] respuesta = null;
		Scanner sd = new Scanner(System.in);
		String borraNombre = null;
		int posicionBorrar = -1;
		int contador = 0;
		
		System.out.print("Introduzca el nombre de la persona que desea borrar: ");
		borraNombre = sd.next();
		
		while ((posicionBorrar ==-1)&&(contador < persona.length)) {
			if(borraNombre.equals(persona[contador].getNombre())){
				posicionBorrar = contador;	
			}	
			contador++;
		}
		
		if (posicionBorrar == -1){
			System.out.println("El nombre no existe!!!");
		}else{
			respuesta = new PersonaOptimizado[persona.length-1];
			int j=0;
			for (int i = 0; i < persona.length; i++) {
				if(i!=posicionBorrar){
					respuesta[j]=persona[i];
					j++;
				}	
			}
		}
		
		if (respuesta == null){
			respuesta = persona;
		}
		
		
		return respuesta;
	}
	
	/**
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		SerializarPersona file = new SerializarPersona();
		Scanner sd = new Scanner(System.in);
		PersonaOptimizado [] persona = null;
		PersonaOptimizado [] masPersona = null;
		String fichero = "Archivo de personas.dat";
		
		/*PersonaOptimizado [] personainicial = new PersonaOptimizado[3];
		personainicial[0]= new PersonaOptimizado("caca", 21);
		personainicial[1]= new PersonaOptimizado("kk", 80);
		personainicial[2]= new PersonaOptimizado("popo", 1);
		file.escribirPersonaEnFichero(personainicial, fichero);*/
		
		
		persona = file.recuperarFicheroDePersona(fichero); //recupero las personas guardadas
		
		file.mostrarArrayPersona(persona);
		masPersona = file.bucleIntroducirPersona(persona);
		file.mostrarArrayPersona(masPersona);
		masPersona = file.borrarPersona(masPersona);
		file.mostrarArrayPersona(masPersona);
		
		//Arrays.sort(masPersona);
		
		file.salvarPersona(masPersona, fichero);//Salvo las personas en el archivo
		sd.close();
	}

}
