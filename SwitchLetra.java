package udemy;

import java.util.Scanner;

public class SwitchLetra {

	public static void main(String[] args) {

		int valor = -1;
		char letra = ' ';

		Scanner sc = new Scanner(System.in);
		System.out.println(" introduce una calicficacion con valors entre 0 y 10");
		valor = sc.nextInt();

		if (valor >= 9 && valor <= 10) {
			letra = 'A';
		} else if (valor >= 8 && valor < 9) {
			letra = 'B';
		} else if (valor >= 7 && valor < 8) {
			letra = 'C';

		} else if (valor >= 6 && valor < 7) {
			letra = 'D';
		} else if (valor >= 0 && valor < 6) {
			letra = 'F';
		} else {
			System.out.println("valor desconocido");
		}
		System.out.println(letra);
	}

}
