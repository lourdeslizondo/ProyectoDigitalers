package obra;

public class Estudiante extends Persona {
//ATRIBUTOS
	private int grado;
	private int matricula;

//METODOS
	public void aprender() {
		System.out.println("Aprendiendo a programar");
	}
	
//CONSTRUCTORES
	public Estudiante(int g, int m) {
		this.grado = g;
		this.matricula = m;
	}
	
	public Estudiante(String n, String a, int e, String r, int g, int m) {
		super(n, a, e, r);
		this.grado = g;
		this.matricula = m;
	}
	
//toString
	public String toString() {
		return super.getNombre() + " " + super.getApellido() + " de " + super.getEdad() + " años, cumple el rol de " + super.getRol() 
		+ " de " + grado + " año, con el nro de matricula: " + matricula;
	}

	@Override
	public void actuar() {
		System.out.println("Ingreso a mi lugar para comenzar la escena");
		
	}	
}
