package obra;

public class Arbusto extends Vegetal implements IActor {
	public String nombreArbusto;
    public int lista;
    
    public void ArbustoTipo (){
        System.out.println("Explorando los Arbustos");
    }
    public Arbusto (){}

    public Arbusto(String nombreArbusto, int lista, String raices, int cantidad, String hojas, String flores) {
        super(raices, cantidad, hojas, flores);
        this.nombreArbusto = nombreArbusto;
        this.lista = lista;
    }

    public String getNombreArbusto() {
        return nombreArbusto;
    }

    public void setNombreArbusto(String nombreArbusto) {
        this.nombreArbusto = nombreArbusto;
    }

    public int getLista() {
        return lista;
    }

    public void setLista(int lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Arbusto{" + "nombreArbusto=" + nombreArbusto + ", lista=" + lista + '}'
                + super.toString();
    }
	@Override
	public void actuar() {
		System.out.println("Es un poco aburrido estar parado toda la obra");		
	}
}
