package cursos.ejemplos.basicos;

public class Primo {
	
	static int [] primos = new int [25]; //creamos un array de 25 posiciones
	/**
	 * @param args
	 */
	
	private static boolean esPrimo(int numero) {
		boolean rpta = true;
		//boolean listo = false;
		//int contadorDeDivisor =0;
		int i = 2;
		
		 while (rpta && i<numero-1 ) {
			 
			 if (numero%i ==0){
				 rpta = false;
			 }
			 i++;
		}
		return rpta;
	}
	
	private static void primerosPrimos(){
		int posicion = 0;
		int i = 0;
		
		while ((i < 100)&&(posicion < 25)) {
			i++;
			if (esPrimo(i)){
				primos[posicion]=i;
				posicion++;
				}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(esPrimo(27));
		primerosPrimos();
		
		for (int i = 0; i < 25; i++) {
			System.out.println(primos[i]);
		}

	}

}
