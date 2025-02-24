package ordenar_con_nombres_edades;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		PERSONAS persona[] = new PERSONAS[10];
		
		persona[0] = new PERSONAS("nicolas", 22);
		persona[1] = new PERSONAS("andres", 30);
		persona[2] = new PERSONAS("santiago", 20);
		persona[3] = new PERSONAS("stiven", 19);
		persona[4] = new PERSONAS("luisa", 17);
		persona[5] = new PERSONAS("ignacio", 18);
		persona[6] = new PERSONAS("kelvin", 21);
		persona[7] = new PERSONAS("camilo", 24);
		persona[8] = new PERSONAS("celeste", 23);
		persona[9] = new PERSONAS("karen", 50);
		
		Arrays.sort(persona);
		
		System.out.println("arreglo de personas ordenadas por orden alfabetico");
		for(int i = 0 ; i < 10; i++) {
			persona[i].mostrardatos();
		}
		
		
		
	}

}
