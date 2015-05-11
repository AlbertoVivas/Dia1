package cursos.ejemplos.basicos;

import java.util.Scanner;

public class MainPersonaOptimizado {

	/*
	 * public static String pedirNombre(Scanner sc){
			 String nombre = null;
			 System.out.println("Teclee nombre: ");
			 //Scanner sc = new Scanner(System.in);
			 nombre = sc.next();
			 return nombre;
	 * */
	public static String pedirNombreOpt(Scanner sc){
		return sc.next();
	}
	/*
	 * public static int pedirEdad(Scanner sc){
			 int edad = 0;
			 System.out.println("Teclee Edad: ");
			 //Scanner sc = new Scanner(System.in);
			 edad = sc.nextInt();
			 return edad;
		 }
	 * */
	public static int pedirEdadOpt(Scanner sc){
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		//variables
		
		//Scanner sc = null;
		//sc = new Scanner(System.in);
		
		//Scanner sc = new Scanner(System.in);
		int numeroPersonas =0;
		int a=0; //contador para el for
		PersonaOptimizado persona = null;
		PersonaOptimizado persona2 = null;
		PersonaOptimizado persona3 = null;
		
		
		//bucle
		
		numeroPersonas =1;
		for (a=1;a<=numeroPersonas;a++){
			System.out.println("Introducir nombre de la persona "+a+":");
			String nombre = SolicitarDatos.pedirNombreOpt();
			System.out.println("Introducir edad de la persona "+a+":");
			int edad = SolicitarDatos.pedirEdadOpt();
			
			
			if (a==1) {
				persona = new PersonaOptimizado(nombre, edad);
				//persona.mostrarPersonaOptimizado();
				//System.out.println(persona);
			}
			if (a==2) {
				persona2 = new PersonaOptimizado(nombre, edad);
				persona2.mostrarPersonaOptimizado();
				System.out.println(persona2);
			}
			//persona3 = persona;
			/*if (persona.MayorOptimizado()){
				System.out.println("La persona es mayor!!!");
			}else System.out.println("Es menor");*/
			
		}
		//persona.PersonaIgual(persona, persona2);
		/*if (persona.equals(persona2)) {
			System.out.println("casting iguales");
		}else {
			System.out.println("Casting diferentes");
		}*/
		//sc.close();
		
		//persona.pedirIncrementoEdad();
		//persona.incrementarEdad(persona.pedirIncrementoEdad());
		//persona.mostrarPersonaOptimizado();
		System.out.println(persona);
		
		//persona2 = PersonaOptimizado.sumarAnios1(persona,5 );
		System.out.println("suma años 1");
		persona2 = PersonaOptimizado.sumarAnios1(persona,PersonaOptimizado.pedirIncrementoEdad() );
		persona2.mostrarPersonaOptimizado();
		
		System.out.println("suma años 2");
		persona.SumarAnios2(PersonaOptimizado.pedirIncrementoEdad());
		persona.mostrarPersonaOptimizado();
		
		System.out.println("suma años 3");
		PersonaOptimizado.SumarAnios3(persona, PersonaOptimizado.pedirIncrementoEdad());
		persona.mostrarPersonaOptimizado();
		
		
		System.out.println("bye!!!");
		
	}
}
