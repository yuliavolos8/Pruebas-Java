package juego;

import javax.swing.JOptionPane;

public class CalcularPesoIdeal {

	public static void main(String[] args) {
		int altura = 0;
		String genero = "";
		int pesoIdeal;
		do {
			genero = JOptionPane.showInputDialog("introduce tu genero( H/M");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
		altura = Integer.parseInt(JOptionPane.showInputDialog("introduce su altura en sentimetros"));
		if (genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 100;
			System.out.println(" Peso ideal para un  hombre de tu estatura es :" + pesoIdeal + " kilos");
		} else if (genero.equalsIgnoreCase("m")) {
			pesoIdeal = altura - 110;
			System.out.println(" Peso ideal para una mujer de tu estatura es :" + pesoIdeal + " kilos");
		}

	}

}
