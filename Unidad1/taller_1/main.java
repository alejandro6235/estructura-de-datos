package estructura_dato_;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		productos p1[] = new productos[10];

		p1[0] = new productos("camisas", 50.000, 5, 1001);
		p1[1] = new productos("pantalon", 100.000, 10, 1003);
		p1[2] = new productos("buso", 150.000, 2, 1002);
		p1[3] = new productos("medias", 5.000, 15, 1005);
		p1[4] = new productos("zapatos", 100.000, 11, 1008);
		p1[5] = new productos("chaquetas", 160.000, 3, 1004);
		p1[6] = new productos("billetera", 200.000, 30, 1009);
		p1[7] = new productos("maletin", 80.000, 2, 1007);
		p1[8] = new productos("correa", 40.000, 10, 1006);
		p1[9] = new productos("gafas", 10.000, 1, 1010);

		for (int i = 0; i < 10; i++) {
			p1[i].mostrardatos();
		}
		
		productos[] p2 = Arrays.copyOf(p1, p1.length);

		System.out.println("¿Desea agregar un nuevo producto? (s/n)");
		String resp = entrada.next();

		if (resp.equalsIgnoreCase("s")) {
			System.out.println("cuantos productos nuevos deseas agregar");
			int adicion = entrada.nextInt();
			
			// amplicar el arreglo a lo que el usuario elija
			p2 = new productos[p1.length + adicion];

			for (int i = 0; i < p1.length; i++) {
				p2[i] = p1[i];
			}

			for (int i = p1.length; i < p2.length; i++) {
				System.out.println("ingrese el nombre del producto: ");
				entrada.nextLine();
				String nombre = entrada.nextLine();
				
				System.out.println("ingrese el precio del producto:");
				float precio = entrada.nextFloat();
				
				System.out.println("ingrese la cantidad del producto:");
				int cantida = entrada.nextInt();
				
				System.out.println("ingrese el codigo del producto:");
				int codigo = entrada.nextInt();
				
				p2[i] = new productos(nombre, precio, cantida, codigo);
			}
			
			for(int i = 0 ; i < p2.length;i++) {
				p2[i].mostrardatos();
			}
		} else {
			System.out.println("no se agregaron nuevos productos");
		}
		

		
		
		
		// metodo burbuja

		for (int i = 0; i < p2.length - 1; i++) {
			for (int j = 0; j < p2.length - 1 - i; j++) {
				if (p2[j].getDisponibilidad() > p2[j + 1].getDisponibilidad()) {
					productos aux = p2[j];
					p2[j] = p2[j + 1];
					p2[j + 1] = aux;
				}
			}
		}

		System.out.println(
				"-------------------productos ordenadas por el metodo burbuja ordenado por  disponibilidad-------------------------------------");
		System.out.println();
		for (int i = 0; i < p1.length; i++) {
			p1[i].mostrardatos();
		}

		// metodo insert sort

		for (int i = 1; i < p2.length; i++) {
			productos aux = p2[i];
			int j = i - 1;

			while (j >= 0 && p2[j].getPrecio() > aux.getPrecio()) {
				p2[j + 1] = p2[j];
				j = j - 1;
			}
			p2[j + 1] = aux;
		}
		System.out.println(
				"-------------------------productos ordenados mediante insert sort ordenadas por  precio----------------------------------------");
		for (int i = 0; i < p2.length; i++) {
			p2[i].mostrardatos();
		}

		
		
		
		// metodo insert sort para ordenar por codigo

		System.out.println(
				"------------------------------------productos ordenados por codigos meidante el inseert sort y comparable");

		for (int i = 1; i < p2.length; i++) {
			productos aux2 = p2[i];

			int j = i - 1;

			while (j >= 0 && p2[j].compareTo(aux2) > 0) {
				p2[j + 1] = p2[j];
				j = j - 1;
			}
			p2[j + 1] = aux2;
		}
		for (int i = 0; i < p1.length; i++) {
			p2[i].mostrardatos();
		}
			System.out.println("--------------ordenamiento de busqueda---------------------------------");
			System.out.println("Digite el código del producto que desea buscar: ");
			int auxcodigo = entrada.nextInt();

			int indice = Arrays.binarySearch(p2, new productos("", 0, 0, auxcodigo));

			if (indice >= 0) {
			    System.out.println("Producto encontrado:");
			    p2[indice].mostrardatos();
			} else {
			    System.out.println("Producto no encontrado.");
			}
		
			
			
			

	}

}
