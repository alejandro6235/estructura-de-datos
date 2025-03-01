package estructura_dato_;

public class productos   implements Comparable<productos>{
    private String nombre;
    private double precio;
    private int disponibilidad;
    private int codigo;

    public productos(String nombre, double precio, int disponibilidad,int codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.codigo = codigo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    

	public void mostrardatos(){
        System.out.println("el nombre del producto es  : "+nombre);
        System.out.printf("El precio del %s es : %.3f\n", nombre, precio);
        System.out.println("la cantidad disponibles es : "+disponibilidad);
        System.out.println("el codigo de "+nombre + "es : "+codigo);
        System.out.println();
    }

	@Override
	public int compareTo(productos otro) {
		return Integer.compare(this.codigo, otro.codigo);
	}

	

    
}