import java.util.ArrayList;

public class PrincipalMainCoches {

	public static void main(String[] args) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		Coche coche1 = new Coche(4, "rojo", false, "seat");
		Coche coche2 = new Coche(4, "blanco", false, "bmw");
		Coche coche3 = new Coche(4, "verde", true, "volvo");
		Coche coche4 = new Coche(4, "verde", true, "volvo");

		coches.add(coche3);
		coches.add(coche2);
		coches.add(coche1);
		coches.add(coche4);

		for (Coche c : coches) {
			System.out.println(c.dame_Datos());
		}
		String idSiguiente = Coche.DameIdSiguiente();

		System.out.println(idSiguiente);
	}
}
