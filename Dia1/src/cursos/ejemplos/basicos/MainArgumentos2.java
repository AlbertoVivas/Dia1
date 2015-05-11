package cursos.ejemplos.basicos;



public class MainArgumentos2 {

	/**
	 * @param args
	 */
	//Tarea 1
	public static int NumeroDeIguales (String cadena, char caracter){
		int rpta = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)== caracter) {
				rpta++;
			}
		}
		return rpta;
	}
	
	public static String Espar(int numero) {
		String rpta = null;
		
		if (numero%2==0) {
			rpta = "Es par!!!!";
		} else {
			rpta = "No es par, es impar";
		}
		
		
		return rpta;
	}
	
	//Tarea 6
	public static String VolteaPalabra (String palabra){
		String rpta = "";
		int tamaño = palabra.length()-1;
		for (int i = 0; i <= tamaño; i++) {
			rpta += palabra.charAt(tamaño-i);
		}
		return rpta;
	}
	public static void  Multiplicamelo(int numero) {
		
		
		for (int i = 1; i <= 33; i++) {
		System.out.print(+i*numero+"," );	
		}
		System.out.println(".");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 0;
		int cohincidencias =0;
		
		caracter = args[args.length-1].charAt(0); //'h' (caracter del string del ultimo argumento)
		//System.out.println(NumeroDeIguales("hholah", caracter));
		for (int i = 0; i < args.length-1; i++) {
			cohincidencias += NumeroDeIguales(args[i],caracter);
		}
		//caca hola chao hijos helado hehehe
		System.out.println("El numero de iguales con: "+caracter+" es "+cohincidencias);
		
		System.out.println(VolteaPalabra("hola"));
		System.out.println(Espar(87));
		Multiplicamelo(3);
	}

}
