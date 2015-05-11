package cursos.ejemplos.basicos;

import java.util.Scanner;

public class Bucle {

	public static String pedirRespuesta(Scanner sc){  //Con esta clase 
		String respuesta;
		respuesta = sc.next();
		return respuesta;
	}	
	
	public static boolean sigo(String reinicio){
		boolean respuesta2;
		if (reinicio.equals("y")){ // == "y" 
			respuesta2 = true;
			}
		else {
			respuesta2 = false;
		}
		return respuesta2;
	}
	
	public static void main(String[] args) {
		
		String reinicio;
		boolean rpta; 
		Scanner sc = null;
		sc = new Scanner(System.in); //Creo sc y leo teclado
		rpta = true;		
		//bucle
		do{
			System.out.println("Desea reiniciar?"); //Imprimo en pantalla
			System.out.println(rpta);	
			reinicio = pedirRespuesta(sc);//asigno lo que leo a reinicio	
			rpta = sigo (reinicio);	
		  } while (rpta == true);
				
		System.out.println("Adios!!!"); //Imprimo en pantalla
		sc.close();
		
	}
}
