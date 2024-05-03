package clasesAbstractas;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaClaseInterna {

	public static void main(String[] args) {
		Reloj miReloj = new Reloj();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		System.exit(0);
	}

}

class Reloj {
	private int intervalo;
	private boolean sonido;

	public void enMarcha(int intervalo, final boolean sonido) {
		class DameLaHora2 implements ActionListener {

			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println(" te pongo la hora cada 3 segundos" + ahora);
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();

				}
			}
		}
		ActionListener oyente = new DameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();

	}

}