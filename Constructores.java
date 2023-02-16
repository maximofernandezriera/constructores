/**
 * 
 */
package constructores;

/**
 *
 */
public class Constructores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona johndoe = new Persona();		
		johndoe.presentacion();
		
		Persona manuel = new Persona("Manuel", "Ruiz Gonzalez");		
		manuel.presentacion();
		
		Persona antonio = new Persona("Antonio", "Castillo Real", 31);
		antonio.presentacion();

	}

}
