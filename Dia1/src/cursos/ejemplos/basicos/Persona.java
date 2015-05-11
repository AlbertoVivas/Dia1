//hacer un programa que pida los datos de una persona (nombre y edad) 
//cree un objeto y lo muestre en pantalla

package cursos.ejemplos.basicos;

public class Persona {
	String nombre;
	int edad;
	
	/**
	 * constructor que nos almacena un nombre y edad
	 * @param nombrePersona
	 * @param edadPersona
	 */
	public boolean esMayorDeEdad()
	{
		boolean resul = true;
		if (this.edad >= 18)
		{
			resul = true;
		}
		if (this.edad < 18)
		{
			resul = false;
		}
		return resul;
	}
	public Persona(String nombrePersona, int edadPersona){
		nombre = nombrePersona;
		edad = edadPersona;
	}
	public void mostrarPersona(){
		System.out.println("El nombre de la persona es: "+this.nombre+" y su edad: "+this.edad);
		boolean mayor = true;
		//System.out.println("y es > "+esMayorDeEdad()+"  que es mayor de edad");
		mayor = esMayorDeEdad();
		if (mayor){
			System.out.println("Es Mayor de edad!!!!");
		}else {System.out.println("Es un piche menor!!!");}
	}
	
	
	
}

 
 
 