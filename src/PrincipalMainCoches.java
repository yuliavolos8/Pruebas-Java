import java.util.ArrayList;

public class PrincipalMainCoches {

	public static void main(String[] args) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		Coche coche1 = new Coche(4, "rojo", false, "seat");
		Coche coche2 = new Coche(4, "blanco", false, "bmw");
		Coche coche3 = new Coche(4, "verde", true, "volvo");
		Coche coche4 = new Coche(4, "verde", true, "volvo");

		Furgoneta miFurgoneta1 = new Furgoneta(7, 580);
		coches.add(coche3);
		coches.add(coche2);
		coches.add(coche1);
		coches.add(coche4);
		coches.add(miFurgoneta1);// POLIMORFISMO
		coches.add(new Furgoneta(8, 600));// polimorfismo

		for (Coche c : coches) {
			System.out.println(c.dame_Datos());
		}
		String idSiguiente = Coche.DameIdSiguiente();

		System.out.println(idSiguiente);

		miFurgoneta1.setColor("azul");
		miFurgoneta1.setCarrroceria(false);
		miFurgoneta1.dame_Datos();
		System.out.println(miFurgoneta1.dame_Datos());
		System.out.println(coches.size());
	}
}
