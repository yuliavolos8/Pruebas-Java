package clasesAbstractas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

public class Pruebatemporizador extends PrinciapalPerson {

	public static void main(String[] args) {
		DameLaHora oyente = new DameLaHora();
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		System.exit(0);
	}

}

class DameLaHora implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println(" te pongo la hora cada 5 segundos" + ahora);

	}
}