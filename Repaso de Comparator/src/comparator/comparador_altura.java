package comparator;

import java.util.Comparator;

public class comparador_altura implements Comparator<persona>{

	@Override
	public int compare(persona persona1, persona persona2) {
		return Double.compare(persona1.getAltuta(), persona2.getAltuta());
	}

}
