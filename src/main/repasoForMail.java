package main;

import javax.swing.JOptionPane;

public class repasoForMail {

	public static void main(String[] args) {
		String mail = "";
		boolean arroba = false;
		mail = JOptionPane.showInputDialog("introduce su correo electronico");
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba = true;
			}
		}
		if (arroba == true) {

			System.out.println("mail correcto");
		} else {
			System.out.println(" mail no valido");
		}
	}
}