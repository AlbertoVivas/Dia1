package cursos.ejemplos.basicos;

public class MainValorDeReferencia {

	/**
	 * @param args
	 */
	private static void suma(int a,int b, int suma){
		suma = a+b; //como suma es un int (tipo primitivo) al ser invocada este usa una copia y no modifica. asi que esto no modifica el 3er parametro
	}
	
	private static int suma2(int a, int b) {
		return a+b; //con este si que devolvemos un int al cual en el main asignamos a una variable
	}
	
	private static void porValor(int a){
		a+=7;
	}
	
	private static int[] sumaArray(int [] array, int a){
		int [] rpta = new int [5];
		int longitud = array.length;
		for (int i = 0; i < longitud; i++) {
			rpta[i]=array[i]+a;
		}
		
		return rpta;
	}
	
	private static void mostrarArray(int [] array){
		int longitud = array.length;
		
		for (int i = 0; i < longitud; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int a=0;
		int cadena[] = new int []{1,2,3,4,5};
		suma(6,8,c); 
		System.out.println(c);
		
		c = suma2(6,8);
		System.out.println(c);
		
		a = 5;
		porValor(a);
		System.out.println(a);
		
		System.out.println("");
		mostrarArray(cadena);
		System.out.println();
		mostrarArray(sumaArray(cadena, 5));
		
		
		
	}

}
