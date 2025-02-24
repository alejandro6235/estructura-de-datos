public class main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        productos p1 [ ] = new productos[5];

        p1[0] = new productos("camisas", 50.000, 5);
        p1[1] = new productos("pantalon",100.000,10);
        p1[2] = new productos("buso", 150.000, 2);
        p1[3] = new productos("medias", 5.000, 15);
        p1[4] = new productos("zapatos", 100.000, 11);

        for(int i = 0 ; i < 5;i++){
            p1[i].mostrardatos();
        }
        //< >
        //metodo burbuja 

        for(int i = 0 ; i < p1.length -1 ; i++){
            for(int j = 0 ; j < p1.length -1 - i; j++){
                if(p1[j].getPrecio() > p1[j+1].getPrecio()){
                    productos aux = p1[j];
                    p1[j] = p1[j+1];
                    p1[j+1] = aux;
                }
            }
        }
       
        System.out.println("-------------------productos ordenadas por el metodo burbuja-------------------------------------");
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
      System.out.println("-------------------------productos ordenados mediante insert sort----------------------------------------");
      for(int i = 0 ; i < p1.length;i++){
        p1[i].mostrardatos();
      }
     
            
        
      


    }
}
