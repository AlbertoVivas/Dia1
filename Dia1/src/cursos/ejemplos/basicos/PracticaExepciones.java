/**
 * 
 */
package cursos.ejemplos.basicos;


/**
 * @author Alberto Vivas
 *
 * 
 */
public class PracticaExepciones {

	
	private void mostrarArrayPersona(PersonaOptimizado persona[]){
		int longitud = persona.length;
		for (int i = 0; i < longitud; i++) {
			persona[i].mostrarPersonaOptimizado ();
		}
	}
	
	private void insertarPersona(PersonaOptimizado persona[],String nombre, int edad, int pos) throws InsertarPersonasException{
		try{
		persona[pos]=new PersonaOptimizado(nombre,edad);
		} catch(ArrayIndexOutOfBoundsException a){
			throw new InsertarPersonasException();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	
	/**
	 * @param args
	 * @throws InsertarPersonasException 
	 */
	public static void main(String[] args) throws InsertarPersonasException {
		// TODO Auto-generated method stub
		PersonaOptimizado [] persona = null;
		PracticaExepciones pe = new PracticaExepciones();
		
		
		
			persona = new PersonaOptimizado[3];
			pe.insertarPersona(persona, "pim", 22, 0);
			pe.insertarPersona(persona, "pum", 55, 1);
			pe.insertarPersona(persona, "pam", 28, 2);
			
			pe.insertarPersona(persona, "zas", 22, 3);
		/*try {
			
			
			PersonaOptimizado [] personainicial = new PersonaOptimizado[3];
			personainicial[0]= new PersonaOptimizado("caca", 21);
			personainicial[1]= new PersonaOptimizado("kk", 80);
			personainicial[2]= new PersonaOptimizado("popo", 1);
			
			personainicial= null;
			pe.mostrarArrayPersona(personainicial);
			
			//personainicial[3]= new PersonaOptimizado("patatan", 20);
			
			
		} catch (NullPointerException e1) {
			// TODO: handle exception
			System.out.println("Deja de apuntar a null -.-!");
		}catch (IndexOutOfBoundsException e2) {
			// TODO: handle exception
			System.out.println("macho sobrepasaste el tamaño del fichero!!! :@");
		}catch (Exception e) {
			System.out.println("excepcion general!!!");
			// TODO: handle exception
		} */
	}

}
