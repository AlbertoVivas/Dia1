package cursos.ejemplos.basicos;

public class Alumno extends PersonaOptimizado {
	public enum NotaCualitativa {
		SUSPENSO, APROBADO, NOTABLE,BIEN, SOBRESALIENTE, MATRICULA
	}
	private NotaCualitativa notaPalabra = NotaCualitativa.SUSPENSO;
		
	private int nota = 0;
		
	public Alumno (String nombre , int edad) { // esta llamando al constructor
		super (nombre , edad);				  // del padre que es persona
	}										 //
	
	public Alumno(String nombre, int edad, int nota) {//nuevo constructor
		super(nombre, edad);   						 //de la clase alumno
		this.nota = nota;							//
		this.notaPalabra = NotaEquivalente();
	}

	public int getNota() {
		return nota;
	}
	public NotaCualitativa getNotaPalabra(){
		return this.notaPalabra;
	}
	public void setNota(int nota) {
		this.nota = nota;
		this.notaPalabra = NotaEquivalente();
	}
	
	private NotaCualitativa NotaEquivalente (){
		NotaCualitativa notaPalabra = NotaCualitativa.SUSPENSO;
		//10 matricula
		//9 sobresaliente
		//8,7 notable
		//6 bien
		//5 aprovado
		//<5 suspenso
		switch (this.nota) {
		case 10:
			notaPalabra = NotaCualitativa.MATRICULA;
			break;
		case 9:
			notaPalabra = NotaCualitativa.SOBRESALIENTE;
			break;
		case 8:
			notaPalabra = NotaCualitativa.NOTABLE;
			break;
		case 7:
			notaPalabra = NotaCualitativa.NOTABLE;
			break;
		case 6:
			notaPalabra = NotaCualitativa.BIEN;
			break;
		case 5:
			notaPalabra = NotaCualitativa.APROBADO;
			break;	
		default:
			notaPalabra = NotaCualitativa.SUSPENSO;
			break;
		}
		return notaPalabra;
	}
	@Override
	public String toString() {
		String dato = null; 
		// TODO Auto-generated method stub
		//return super.toString();
		dato = "El alumno: "+getNombre()+" de edad: "+getEdad()+" su nota es: "+this.nota+" "+this.notaPalabra;
		return dato;
	}
	
}
