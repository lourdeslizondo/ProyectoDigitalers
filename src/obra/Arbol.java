package obra;

public class Arbol extends Vegetal implements IActor {
	private String nombreArbol;
    private String color;
    private Double altura;
    
    public void Arboles (){
        System.out.println("Listas de árboles: ");
    }
    
    public Arbol (){}

    public Arbol(String nombreArbol, String color, Double altura, String raices, int cantidad, String hojas, String flores) {
        super(raices, cantidad, hojas, flores);
        this.nombreArbol = nombreArbol;
        this.color = color;
        this.altura = altura;
    }

    public String getNombreArbol() {
        return nombreArbol;
    }

    public void setNombreArbol(String nombreArbol) {
        this.nombreArbol = nombreArbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    

    @Override
    public String toString() {
        return "Arbol{" + "nombreArbol=" + nombreArbol + ", color=" + color + ", altura=" + altura + '}'
                + super.toString();
    }

	@Override
	public void actuar() {
		System.out.println("Soy el arbol en el que va Billy a jugar");
	}
}
