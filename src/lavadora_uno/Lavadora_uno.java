package lavadora_uno;

import java.util.Scanner;

import lavadora.LavadoraFunciones;

public class Lavadora_uno {
	public static void main(String[] args) {
		Scanner respuesta = new Scanner(System.in);
		System.out.println("introduce cantidad de kilos ");
		int kilosDeRopa = respuesta.nextInt();
		respuesta.nextLine();
		System.out.println("introduce 1 si ropa es de color blanco 0 numero 2 si ropa es de color");
		int tipoDeRopa = respuesta.nextInt();
		LavadoraFunciones prueba = new LavadoraFunciones(kilosDeRopa, tipoDeRopa);
		prueba.finalizado();
	}

}
