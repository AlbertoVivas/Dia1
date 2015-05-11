package cursos.ejemplos.basicos;
//otra solucion al problema de prueba
public class PruebaNull {
	public int calcula()
	{
		return 1+1; //Preferiblemente un solo return por codigo
	}
	public static void main(String[] args) {
		//System.out.println(calcula());
		PruebaNull pruebanull = null;   //con esto creo un objeto, esta 
									   //apuntando a una direccion de memoria
									  //vacia, al cual no podemos acceder.
		pruebanull = new PruebaNull(); //uso el metodo constructor por defecto 
									  //y reserva un espacio de memoria para
									 //el objeto prueba
		pruebanull.calcula();  //al poner pruebanull. el mismo eclipse me 
							  //proporciona los metodos que puedo usar
		System.out.println(pruebanull.calcula());
		
	}
}

//TODO