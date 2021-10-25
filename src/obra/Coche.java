package obra;

public class Coche extends Vehiculo {
    //ATRIBUTO
    private String marca;
    private String modelo;
    private String puerta;
    
    //METODO
    public void datos (){
        System.out.println("Los datos de mi COCHE: ");
    }
    
    //CONSTRUCTOR VACIO
    public void Coche (){}

    public Coche(String marca, String modelo, String puerta, int persona, String nombre, String color) {
        super(persona, nombre, color);
        this.marca = marca;
        this.modelo = modelo;
        this.puerta = puerta;
    }

   //S - G 
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPuerta() {
        return puerta;
    }
    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", puerta=" + puerta + '}'
                + super.toString();
    }

	@Override
	public void actuar() {
		System.out.println("Soy el más rapido del condado, puedes llamarme Rayo Mcqueen");
	}
}
