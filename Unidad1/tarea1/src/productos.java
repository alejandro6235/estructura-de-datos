public class productos {
    private String nombre;
    private double precio;
    private int disponibilidad;

    public productos(String nombre, double precio, int disponibilidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void mostrardatos(){
        System.out.println("el nombre del producto es  : "+nombre);
        System.out.printf("El precio del %s es : %.3f\n", nombre, precio);
        System.out.println("la cantidad disponibles es : "+disponibilidad);
        System.out.println();
    }

    
}
