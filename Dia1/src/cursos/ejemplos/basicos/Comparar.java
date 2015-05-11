package cursos.ejemplos.basicos;

public class Comparar {

	/**
	 * @param args
	 */

	public static boolean compararString(String cadena1, String cadena2) {
		return cadena1.equals(cadena2);
	}
	public static boolean compararInt(int num1, int num2) {
		return num1==num2;
		}
	public static boolean compararChar (char letra1, char letra2){
		return letra2==letra1;
	}
	public static int mayorInt (int num1, int num2){
		int mayor = num2;
		if (num1 > num2) 
			mayor = num1;
		return mayor;
	}
	



}
