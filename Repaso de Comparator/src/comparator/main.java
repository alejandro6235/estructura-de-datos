package comparator;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		persona personas[] = new persona[4];
		
		personas[0]= new persona("ricardo", 20, 111111, 1.80);
		personas[1]= new persona("luis", 30, 222222,1.90 );
		personas[2]= new persona("carlos", 25, 333333, 1.70);
		personas[3]= new persona("eduardo", 10, 444444, 1.65);
		
		System.out.println("personas ordenas por edades");
		Arrays.sort(personas, new comparador_edades());
		for(int i = 0 ; i < 4 ; i++) {
			personas[i].mostrardatos();
		}
		
		System.out.println();
		
		System.out.println("personas ordenas por nombre");
		Arrays.sort(personas, new comparador_nombre());
		for(int i = 0 ; i < 4 ; i++) {
			personas[i].mostrardatos();
		}
		
		System.out.println();
		
		System.out.println("personas ordenas por dni");
		Arrays.sort(personas, new comparador_dni());
		for(int i = 0 ; i < 4 ; i++) {
			personas[i].mostrardatos();
		}
		
		
		
		System.out.println();
		
		System.out.println("personas ordenadas por altura");
		
		Arrays.sort(personas, new comparador_altura());
		for(int i = 0 ; i < 4 ; i++) {
			personas[i].mostrardatos();
		}
	}
	
	

}
