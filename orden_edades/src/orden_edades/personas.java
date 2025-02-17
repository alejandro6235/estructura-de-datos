package orden_edades;

public class personas implements Comparable<personas>{
	private String nombre;
	private int edad;
	public personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrardatos() {
		System.out.println(nombre + " " + edad);
	}
	@Override
	public int compareTo(personas otra) {
		return this.edad - otra.getEdad();
	}
}
