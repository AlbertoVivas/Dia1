package cursos.ejemplos.basicos;

import java.util.Scanner;

public class MainPersona {
		//Pedir Datos
		 /*System.out.println("Teclee nombre: ");
			Scanner sc = new Scanner(System.in);
			nombre = sc.nextLine();
			//nombre = sc.
			System.out.println("El nombre introducido es: "+nombre);*/
		 
		 public static String pedirNombre(Scanner sc){
			 String nombre = null;
			 System.out.println("Teclee nombre: ");
			 //Scanner sc = new Scanner(System.in);
			 nombre = sc.next();
			 return nombre;
		 }
		 public static int pedirEdad(Scanner sc){
			 int edad = 0;
			 System.out.println("Teclee Edad: ");
			 //Scanner sc = new Scanner(System.in);
			 edad = sc.nextInt();
			 return edad;
		 }
		 
		 public static void main(String[] args) {
		//Pedir Datos
		Scanner sc = null;
		sc = new Scanner(System.in);
		String nombre= null;
		int edad = 0;
		//Persona persona1 = null;
		//Persona persona2 = null;
		Persona persona = null;
		int np = 0;
			 
		
		/*System.out.println("Persona 1: ");
		nombre = pedirNombre(sc);
		edad = pedirEdad(sc);
		//Crear Objeto persona
		persona1 = new Persona(nombre,edad) ;
		
		System.out.println("Persona 2: ");
		nombre = pedirNombre(sc);
		edad = pedirEdad(sc);
		//Crear Objeto persona
		persona2 = new Persona(nombre,edad);*/
		
			 
			 
			 
		//Mostrar persona
		 np = 3; //numero de personas a las que les pediremos datos...
		for (int contador=1;contador < np; contador++)
		{
			System.out.println("Introducir nombre de la persona "+contador+":");
			nombre = pedirNombre(sc);
			System.out.println("Introducir edad de la persona "+contador+":");
			edad = pedirEdad(sc);
			persona = new Persona(nombre, edad);
			persona.mostrarPersona();
	}
		/*
		persona1.mostrarPersona();
		persona2.mostrarPersona();*/
		
		
		sc.close();	
	}
		 
		 
		 
	 }
