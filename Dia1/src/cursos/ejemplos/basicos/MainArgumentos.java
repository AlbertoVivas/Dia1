package cursos.ejemplos.basicos;

public class MainArgumentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int aux = 0;
		int max = 0;
		String maxNombre = null;
		int maxPosicion = 0;
		int maxLongitud = 0;
		// TODO Auto-generated method stub
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
			aux = args[i].length();
			if (aux > max){
				maxPosicion = i;
				maxLongitud = args[i].length();
				maxNombre = args[i];
				aux = max;
			}
		}
		System.out.println(" ");
		System.out.println("|----------------------------------|");
		System.out.println("|-La palabra de mayor longitud es:-|");
		System.out.print("|-Nombre: "+maxNombre);
		for (int i = 0; i<(25-maxNombre.length());i++){System.out.print("-");}
		System.out.println("|");
		System.out.print("|-Longitud: "+maxLongitud);
		for (int i = 0; i<(28-maxLongitud);i++){System.out.print("-");}
		System.out.println("|");
		System.out.print("|-Posición: "+maxPosicion);
		for (int i = 0; i<(28-maxLongitud);i++){System.out.print("-");}
		System.out.println("|");
		System.out.println("|----------------------------------|");
		System.out.println("fin");
	}
}
