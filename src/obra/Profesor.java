package obra;

public class Profesor extends Persona{
//ATRIBUTOS
	private String materia;
	
//METODOS
	public void ensenar() {
		System.out.println("Enseñando Java y sus contenidos");
	}

//CONSTRUCTORES
	public Profesor(String materia) {
		this.materia = materia;
	}
	
	public Profesor (String n, String a, int e, String r, String m) {
		super(n, a, e, r);
		this.materia = m;
	}
	
//SET - GET
	public void setMateria(String m) {
		this.materia = m;
	}
	public String getMateria() {
		return this.materia;
	}

//toString
        @Override
	public String toString() {
		return super.getNombre() + " " + super.getApellido() + " de " + super.getEdad() + " años" + ", cumple el rol de " + super.getRol() 
		+ " de la materia " + materia;
	}

	@Override
	public void actuar() {
		System.out.println("Actuando ando");
	}
}
