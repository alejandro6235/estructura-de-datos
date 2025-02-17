package comparator;

import java.util.Comparator;

public class comparador_edades implements Comparator<persona> {

	@Override
	public int compare(persona persona1, persona persona2) {
		
		return Integer.compare(persona1.getEdad(), persona2.getEdad());
	}
	
	
}
