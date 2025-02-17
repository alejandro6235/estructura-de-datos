package ordenar_con_nombres_edades;

public class PERSONAS implements Comparable<PERSONAS>{
	private String nombre;
	private int edad;
	public PERSONAS(String nombre, int edad) {
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
		System.out.println(nombre   +" " +   edad);
	}
	@Override
	public int compareTo(PERSONAS arg0) {
		return this.nombre.compareTo(arg0.getNombre());
	}
	
}
