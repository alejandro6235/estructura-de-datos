import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

       Scanner Scanner = new Scanner(System.in);

        productos p1 [ ] = new productos[5];

        p1[0] = new productos("camisas", 50.000, 5,"cxh4");
        p1[1] = new productos("pantalon",100.000,10,"cxh5");
        p1[2] = new productos("buso", 150.000, 2,"cxh6");
        p1[3] = new productos("medias", 5.000, 15,"cxh7");
        p1[4] = new productos("zapatos", 100.000, 11,"cxh8");

        for(int i = 0 ; i < 5;i++){
          p1[i].mostrardatos();
      }

     
       while (true) {
            System.out.print("\n¿Desea agregar un nuevo producto? (si/no): ");
            String respuesta = Scanner.nextLine();

            if (respuesta.equals("no")) {
                System.out.println("\nNo se agregaron más productos.");
                break;
            }

            if (respuesta.equals("si")) {
                System.out.print("Ingrese el nombre del producto: ");
                String nombre = Scanner.nextLine();

                System.out.print("Ingrese el precio del producto: ");
                double precio = Scanner.nextDouble();

                System.out.print("Ingrese la disponibilidad del producto: ");
                int disponibilidad = Scanner.nextInt();
                Scanner.nextLine();

                System.out.print("Ingrese el código del producto: ");
                String codigo = Scanner.nextLine();

                
                p1 = Arrays.copyOf(p1, p1.length + 1);
                p1[p1.length - 1] = new productos(nombre, precio, disponibilidad, codigo);

                System.out.println("Producto agregado con éxito.");
            } else {
                System.out.println("responda 'si' o 'no'");
            }
        }
                     
      System.out.println();   
      System.out.println("--------------------lista de productos con el nuevo producto------------------------------------");
     
      for(int i = 0 ; i < p1.length;i++){
        p1[i].mostrardatos();
    }

    System.out.println("ingrese el codigo del producto que desea buscar: ");
    for(int i = 0 ; i < p1.length;i++){
      System.out.println(p1[i].getCodigo());
    }
    String auxcodigo = Scanner.nextLine();


    for (int i = 0; i < p1.length; i++){
      if(p1[i].getCodigo().equals(auxcodigo)){
        System.out.println("------------------------------producto encontrado --------------------------------------------");
        p1[i].mostrardatos();
        break;
      }
      else{
        System.out.println("no se encontro el codigo");
        break;
      }
    }
      

        //metodo burbuja 

        for(int i = 0 ; i < p1.length -1 ; i++){
            for(int j = 0 ; j < p1.length -1 - i; j++){
                if(p1[j].getDisponibilidad() > p1[j+1].getDisponibilidad()){
                    productos aux = p1[j];
                    p1[j] = p1[j+1];
                    p1[j+1] = aux;
                }
            }
        }
       
        System.out.println("-------------------productos ordenadas por el metodo burbuja ordenado por  disponibilidad-------------------------------------");
        System.out.println();
      for(int i = 0 ; i < p1.length; i++ ){
        p1[i].mostrardatos();
      }



      //metodo insert sort 

      for(int i = 1 ; i < p1.length; i++ ){
        productos aux = p1[i];
        int j = i - 1;

        while (j  >= 0 && p1[j].getPrecio()  > aux.getPrecio() ) {
            p1[j+1] = p1[j];
            j= j - 1;
        }
        p1[j+1] = aux;
      }
      System.out.println("-------------------------productos ordenados mediante insert sort ordenadas por  precio----------------------------------------");
      for(int i = 0 ; i < p1.length;i++){
        p1[i].mostrardatos();
      }
     
            
        
      


    }
}
