package obra;

public class Bicicleta extends Vehiculo {
//ATRIBUTOS 
	   private String modelo;
	    private String rueda;
	    private int cuadras;
	    
//METODO
	    public void datosBico(){
	        System.out.println("Los datos de mi BICICLETA: ");
	    }
	    //metodo vacio
	    public void Bicicleta(){}
	    
//CONSTRUCTORES
	        public Bicicleta(String modelo, String rueda, int cuadras, int persona, String nombre, String color) {
	        super(persona, nombre, color);
	        this.modelo = modelo;
	        this.rueda = rueda;
	        this.cuadras = cuadras;
	    }
//SET - GET
	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getRueda() {
	        return rueda;
	    }

	    public void setRueda(String rueda) {
	        this.rueda = rueda;
	    }

	    public int getCuadras() {
	        return cuadras;
	    }

	    public void setCuadras(int cuadras) {
	        this.cuadras = cuadras;
	    }

	    @Override
	    public String toString() {
	        return "Bicicleta{" + "modelo=" + modelo + ", rueda=" + rueda + ", cuadras=" + cuadras + '}'
	                +super.toString();
	    }
		@Override
		public void actuar() {
			System.out.println("Las ruedas de la bicicleta girando van");
			
		}
}
