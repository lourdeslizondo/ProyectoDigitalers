package obra;

public abstract class Vehiculo implements IObjetoInerte, IActor{
	 //ATRIBUTOS
    private int persona;
    private String nombre;
    private String color;
    
   //I
    public void adorno() {
    	System.out.println("Soy parte de la escenografia");
    
    }
    //METODO
    public void arrancar (){
        System.out.println("Arranco el viaje con mi vehiculo favorito");
    }
            
    //CONSTRUCTORES
    //constructor vacio
    public Vehiculo(){}
    
    public Vehiculo(int persona, String nombre, String color) {
        this.persona = persona;
        this.nombre = nombre;
        this.color = color;
    }

    //SET - GET
    public int getPersona() {
        return persona;
    }
    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Persona=" + persona + ", Nombre=" + nombre +
                ", color=" + color + '}';
    }    
}
