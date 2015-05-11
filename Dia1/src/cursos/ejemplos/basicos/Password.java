package cursos.ejemplos.basicos;

public class Password {

	/**
	 * @param args
	 */
	String password = null;
	final static int passLengthMin = 9; //con esto defino el num min de caracteres de mi password para considerarlo seguro
	final static int passMayusMin = 3; //con esto defino el numero minimo de mayusculas de mi password para considerarlo seguro		
	final static int passMinusMin = 3;//con esto defino el numero minimo de minusculas de mi password para considerarlo seguro
	final static int passNumMin = 3; //con esto defino el numero minimo de numeros de mi password  para considerarlo seguro
	
	public static boolean estosCohinciden(char letra, String cadena){
		boolean rpta = false;
		boolean hacer = true;
		int longitud = cadena.length();
		int i = 0;
		
			do {
				if (letra == cadena.charAt(i)){
					rpta = true;
					hacer = false;
				}
				i++;
				if (i == longitud){
					hacer = false;
				}
			} while (hacer);
		
		return rpta;
	}
	
	
	public boolean esPasswordBuena(){ //con esto establesco si la password es segura o no
		boolean rpta = false;
		int numeroMayus = 0;
		int numeroMinus = 0;
		int numeroNum = 0;
		String num = null;
		num = "0123456789";
		String mayus = null;
		mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minus = null;
		minus = "abcdefghijklmnopqrstuvwxyz";
		
		int longitud = password.length();
		for (int i = 0; i < longitud; i++) {
			/*if (esNum(password.charAt(i))) numeroNum++;
			if (esMayuscula(password.charAt(i))) numeroMayus++;
			if (esMinuscula(password.charAt(i))) numeroMinus++;*/
			if (estosCohinciden(password.charAt(i), num))numeroNum++;
			if (estosCohinciden(password.charAt(i), mayus))numeroMayus++;
			if (estosCohinciden(password.charAt(i), minus))numeroMinus++;
		if ((longitud >= passLengthMin)&&(numeroMayus >= passMayusMin)&&(numeroMinus >= passMinusMin)&&(numeroNum >= passNumMin)){
			rpta = true;
		}else {
			rpta = false;
			}
		}
		//System.out.println(numeroMayus+" "+numeroMinus+" "+numeroNum); //Con esto compruebo los contadores
		//System.out.println(password);
		//System.out.println(password.charAt(1));
		return rpta;
	}
	
	//Con esta funcion pretendo es usar la tabla ASCII para determinar que tipo de caracter es.
	/*public static boolean esPasswordBuenaMejorado() {
		boolean rpta = false;
		int longitud = password.length();
		for (int i = 0; i < longitud; i++) {
			//password.charAt(i).ha
			password.
		}
		
		
		
		
		
		
		return rpta;
	}*/
	public void introducirPassword(){
		System.out.println("Programa que comprueba si una Password es \"segura\"");
		System.out.println("la pswd para ser segura, necesita:");
		System.out.println(+passLengthMin+" caracteres");
		System.out.println(+passMayusMin+" letras minusculas");
		System.out.println(+passMinusMin+" letras mayusculas");
		System.out.println(+passNumMin+" numeros");
		System.out.println("Introducir password: ");
		
		password = SolicitarDatos.pedirString();
	}
	
	
	public static void main(String[] args) {
		Password clave = new Password();
		
		clave.introducirPassword();
		if (clave.esPasswordBuena()){
			System.out.println("La clave es muy buena");
			}else {
				System.out.println("La clave es muy cutre!!! :@");
				}
		}

}
