package obra;

public class appPrincipal {

	public static void main(String[] args) {
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("PROFESOR");
                Profesor p1 = new Profesor("Guillermina", "Cardozo", 25, "Profesora", "Programación");
		System.out.println(p1);
		p1.ensenar();
		
                
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("ESTUDIANTE");
		Estudiante e1 = new Estudiante("Lucas", "Rodriguez", 20, "Estudiante", 1, 2565);
		System.out.println(e1);
		e1.aprender();
		e1.irInsti();
		
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("ARBUSTO");
                Arbusto arb1 = new Arbusto("Abelia",1,"Raiz delgada y profunda",1,"Hojas verdes oscuras y ovalada"
                        , "Flores fucsia");
                System.out.println(arb1);
                
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("ÁRBOL");
                Arbol a1 = new Arbol("Jacarandá","Violeta",1.5,"oblicua",1,"si","si");
                System.out.println(a1.toString());
                
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("COCHE");
                Coche c1 = new Coche("Ford","Fiesta","trasera y delantera",1,"Lucas","Rojo");
                System.out.println(c1.toString()); 
                
                System.out.println();System.out.println();
		System.out.println("**********************************");
		System.out.println("BICICLETA");
                Bicicleta b1 =new Bicicleta("KHT390 Kawasaki","Doble pared",100,2,"Maria","Verde");
                 System.out.println(b1.toString());
                
                
                
                
	}

}
