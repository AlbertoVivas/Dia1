package cursos.ejemplos.basicos;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String [] arrayNombres = null;
		//int [] arrayEdad = null;
		//int [] arrayNota = null;
		PersonaOptimizado [] arraypersona = null;
		
		//arrayNombres = new String [10];
		//arrayEdad = new int [10];
		arraypersona = new Alumno[5];
		
		int longitud = arraypersona.length;
		
		String [] arrayNombres = {"juan","mikel","alb","inaki","petra"};
		int [] arrayEdad = {23,24,25,55,27};
		int [] arrayNota = {5,8,10,9,8};
		
		for (int i = 0; i < longitud; i++) {
			arraypersona [i] = new Alumno(arrayNombres[i],arrayEdad[i],arrayNota[i]);
			System.out.println(arraypersona[i]);
		}
		
		int a =15;
		int b = 10;
		System.out.println(~a);
		System.out.println(a&b);
		//boolean c = false;
		//boolean d = false;
		if ((a > 1) | (b < 5) ){
			System.out.println("ok");
		}
		
		
	}

}
