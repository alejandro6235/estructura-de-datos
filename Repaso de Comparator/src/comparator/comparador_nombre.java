package comparator;

import java.util.Comparator;

public class comparador_nombre implements Comparator<persona>{


	public int compare(persona persona1, persona persona2) {
		return persona1.getNombre().compareTo(persona2.getNombre());
	}


	
}
