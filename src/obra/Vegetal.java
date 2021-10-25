package obra;

public abstract class Vegetal {
	 private String raices;
	 private int cantidad;
	 private String hojas;
	 private String flores;
	    
	 public void VegetalesTipo (){
	     System.out.println("Explorando los tipos de Vegetales");
	 }
	   
	 public Vegetal (){}

	 public Vegetal(String raices, int cantidad, String hojas, String flores) {
	     this.raices = raices;
	     this.cantidad = cantidad;
	     this.hojas = hojas;
	     this.flores = flores;    
	    }

//S- G	 
	    public String getRaices() {
	        return raices;
	    }
	    public void setRaices(String raices) {
	        this.raices = raices;
	    }

	    public int getCantidad() {
	        return cantidad;
	    }
	    public void setCantidad(int cantidad) {
	        this.cantidad = cantidad;
	    }

	    public String getHojas() {
	        return hojas;
	    }
	    public void setHojas(String hojas) {
	        this.hojas = hojas;
	    }

	    public String getFlores() {
	        return flores;
	    }
	    public void setFlores(String flores) {
	        this.flores = flores;
	    }

	    @Override
	    public String toString() {
	        return "Vegetal{" + "raices=" + raices + ", cantidad=" + cantidad + ", hojas=" + hojas + ", flores=" + flores + '}';
	    }
}
