package lavadora_uno;

import java.util.Scanner;

import lavadora.LavadoraFunciones;

public class Lavadora_uno {
	public static void main(String[] args) {
		Scanner respuesta = new Scanner(System.in);
		int kilos;
		do {
			System.out.println("introduce cantidad de kilos ");
			kilos = respuesta.nextInt();
			System.out.println("No superar 12 kilos, carga demasiado pesada");
			System.out.println("Introduce cantidad de ropa menos o igual de 12 kilos");
		} while (kilos > 12);
		kilos = respuesta.nextInt();
		respuesta.nextLine();
		System.out.println("introduce 1 si ropa es de color blanco 0 numero 2 si ropa es de color");
		int tipoDeRopa = respuesta.nextInt();
		LavadoraFunciones prueba = new LavadoraFunciones(kilos, tipoDeRopa);
		prueba.finalizado();
	}

}
