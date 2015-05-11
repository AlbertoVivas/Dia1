package cursos.ejemplos.basicos;

import java.util.Scanner;

public class Tarea {
	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numero1 =0;
		int numero2 =0;
		int numero3 =0;
		int mayor = 0;
		
		// TODO Auto-generated method stub
		System.out.println("introducir el primer numero:");
		numero1 = sc.nextInt();
		System.out.println("introducir el segundo numero:");
		numero2 = sc.nextInt();
		System.out.println("introducir el tercer numero:");
		numero3 = sc.nextInt();
		
		if (numero1 > mayor){
			mayor = numero1;
		}
		if (numero2 > mayor){
			mayor = numero2;
		}
		if (numero3 > mayor){
			mayor = numero3;
		}
		System.out.println("El mayor entre: "+numero1+" ,"+numero2+" ,"+numero3+" es: "+mayor);
	}

}
