package obra;

public abstract class Persona implements IActor{
//ATRIBUTOS
	private String nombre;
	private String apellido;
	private int edad;
	private String rol;
	
//METODOS
	public void irInsti() {
		System.out.println("Yendo a la Instituci�n");
	}
	
//CONSTRUCTORES
	public Persona() {}
	
	public Persona (String n, String a, int e, String r) {
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
		this.rol = r;
	}
	
//SET - GET
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String ape) {
		this.apellido = ape;
	}
	public String getApellido() {
		return this.apellido;
	}
	
	public void setEdad(int e) {
		this.edad = e;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setRol(String r) {
		this.rol = r;
	}
	public String getRol() {
		return this.rol;
	}

//toString
        @Override
	public String toString() {
		return "Persona [nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", rol: " + rol + "]";
	}
}
