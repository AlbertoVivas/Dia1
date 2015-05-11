package cursos.ejemplos.basicos;

import java.util.Scanner;

public class BlucleFor {
	
	 public static String pedirNombre(Scanner sc){
		 String nombre = null;
		 //System.out.println("Teclee nombre: ");
		 //Scanner sc = new Scanner(System.in);
		 nombre = sc.next();
		 return nombre;
	 }
	 public static int pedirEdad(Scanner sc){
		 int edad = 0;
		 //System.out.println("Teclee Edad: ");
		 //Scanner sc = new Scanner(System.in);
		 edad = sc.nextInt();
		 return edad;
	 }
	
	
public static void main(String[] args) {
	int np =0;
	String nombre;
	int edad;
	Scanner sc =null;
	sc = new Scanner(System.in);
	Persona persona = null;
	
	
	np = 5; //numero de personas a las que les pediremos datos...
	for (int contador=0;contador < np; contador++)
	{
		System.out.println("Introducir nombre de la persona "+contador+":");
		nombre = pedirNombre(sc);
		System.out.println("Introducir edad de la persona "+contador+":");
		edad = pedirEdad(sc);
		persona = new Persona(nombre, edad);
		persona.mostrarPersona();
	}
}
}
