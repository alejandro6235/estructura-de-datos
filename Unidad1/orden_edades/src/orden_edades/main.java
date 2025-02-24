package orden_edades;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		personas persona [] = new personas [10];
		
		persona[0] = new personas("maria", 25);
		persona[1] = new personas("maicol", 23);
		persona[2] = new personas("valery", 19);
		persona[3] = new personas("alex", 17);
		persona[4] = new personas("juan", 15);
		persona[5] = new personas("nicol", 22);
		persona[6] = new personas("luisa", 31);
		persona[7] = new personas("pablo", 24);
		persona[8] = new personas("jhon", 16);
		persona[9] = new personas("mario", 15);
		
		
		Arrays.sort(persona);
		System.out.println("------------lista ordenada de personas por edad-----------");
		for(int i  = 0 ; i < 10 ; i++) {
			persona[i].mostrardatos();
		}

	}

}
