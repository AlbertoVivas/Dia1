/**
 * 
 */
package cursos.ejemplos.basicos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;

/**
 * 
 * Con esto pretendemos entender el uso de properties
 * Tenemos 3 archivos. properties de los cuales tienen en comun
 * los parametros outfile, start, body y end.
 * En el programa, por parametro seleccionas un idioma y automaticamente
 * segun el i
 * 
 * @author Alberto Vivas
 *
 * 
 */
public class ClasePropiedades {

	/**
	 * Con este metodo podemos ver por consola y 
	 * a su vez guardamos un archivo
	 * @param fis
	 * @throws IOException
	 */
	
	public static void imprimirPropiedades(FileInputStream fis) throws IOException{
		Properties propiedades = new Properties();
		File file = null;
		FileWriter fw = null;
		//cargamos las propiedades
		propiedades.load(fis);
		
		//
		System.out.println(propiedades.getProperty("outfile"));
		System.out.println(propiedades.getProperty("start"));
		System.out.println(propiedades.getProperty("body"));
		System.out.println(propiedades.getProperty("end"));
		
		//creamos el archivo de respaldo
		file = new File(propiedades.getProperty("outfile"));
		file.createNewFile();
		fw = new FileWriter(file);
		fw.write(propiedades.getProperty("start")+"\n");
		fw.write(propiedades.getProperty("body")+"\n");
		fw.write(propiedades.getProperty("end")+"\n");
		fw.close();
		
		
	}
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		
		try{	
			switch (args[0]) {
			case "it":
				System.out.print("Italiano: ");
				fis = new FileInputStream("story_it.properties");
				break;
			case "en":
				System.out.print("Ingles: ");
				fis = new FileInputStream("story_en.properties");
				break;
	
			default: //ES español
				System.out.print("Español: ");
				fis = new FileInputStream("story_es.properties");
				break;
			}
			
			//imprimimos las propiedades
			imprimirPropiedades(fis);
			
			
			} catch (IOException ex) {
		        ex.printStackTrace();
			    } finally {
			        if (fis != null) {
			            try {
			                fis.close();
			            } catch (IOException e) {
			                e.printStackTrace();
			            }
		        }
	    }
		
		
		
		
		
	}

}
