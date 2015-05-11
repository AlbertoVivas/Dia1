package cursos.ejemplos.basicos;

import java.util.Scanner;

public class QueHace {

	int a;// por estar declarada aquí, fuera de cualquier método; a es un
			// atributo de la clase. Por lo tanto, es accesible y visible desde
			// todos los métodos de la clase
	static int b = 50;

	void metodo() {
		System.out.println("Valor a: "+a);
		a++; // equivalente --> a = a + 1;
		System.out.println("Valor b: "+b);
		b++;
	}
	public QueHace(){
		a = 0;
		b = 50;
	}
	public QueHace(int valor1, int valor2){
		a = valor1;
		b = valor2;
	}

	public static void main(String args[]) {
		QueHace qh1 = null;
		QueHace qh2 = null;
		QueHace qh3 = null;

		qh1 = new QueHace();
		System.out.println("Valor a: "+qh1.a);
		System.out.println("Valor b: "+qh1.b);
		
		qh2 = new QueHace(2,7);
		System.out.println("Valor a: "+qh2.a);
		System.out.println("Valor b: "+qh2.b);
		
		qh3 = new QueHace(20,70);
		System.out.println("Valor a: "+qh3.a);
		System.out.println("Valor b: "+qh3.b);
		
		//String nombre;
	

		//qh1.metodo();
		/*qh1.metodo();
		qh1.a = 33;
		qh1.metodo();
		System.out.println(qh1.a);
		qh2.metodo();
		qh2.metodo();
		qh2.metodo();
		qh2.a = 222;
		qh2.metodo();
		System.out.println(qh2.a);
		System.out.println(QueHace.b);*/
		/*System.out.println("Teclee nombre: ");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		//nombre = sc.
		System.out.println("El nombre introducido es: "+nombre);*/
	}

}
