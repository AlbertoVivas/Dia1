package cursos.ejemplos.basicos;

public class Fibonacci {

	/**
	 * @param args
	 */
	
	private static int sucesionDeFibonacci(int numero){
		int rpta = 0;	
		if (numero == 0 || numero == 1) {
			if (numero==0){rpta = 0;}
			if (numero==1){rpta = 1;}
			
		} else {
			rpta = sucesionDeFibonacci(numero-1)+sucesionDeFibonacci(numero-2);
		}
		
		
		return rpta;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Serie de Fibonacci:");
		for (int i = 0; i <= 10; i++) {
			System.out.print("f("+i+")=");
			System.out.print(sucesionDeFibonacci(i));
			System.out.println("");
		} 
		//System.out.println(sucesionDeFibonacci(3));
	}

}
