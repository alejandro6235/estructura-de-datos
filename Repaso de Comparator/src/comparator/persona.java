package comparator;

public class persona {
	private String nombre;
	private int edad;
	private int dni;
	private double altura;
	public persona(String nombre, int edad, int dni, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.altura =  altura;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getAltuta() {
		return altura;
	}
	public void setAltuta(float altuta) {
		this.altura = altuta;
	}
	
	public void mostrardatos() {
		System.out.println(nombre + " " + edad + " " + dni + " " + altura);
	}
	
	
}
