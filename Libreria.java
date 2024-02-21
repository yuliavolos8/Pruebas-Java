package udemy;

import java.util.Scanner;

public class Libreria {
	public static void main(String Arg[]) {
		String nombre = "";
		int id = 0;
		double precio = 0;
		boolean envioGratuito = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce nombre de libro");
		nombre = sc.nextLine();

		System.out.println("introduce id ");
		id = sc.nextInt();
		sc.nextLine();

		System.out.println("introduce precio");
		precio = sc.nextDouble();

		System.out.println("introduce :true para envio gratuito o :folse en el caso contrario");
		envioGratuito = sc.nextBoolean();

		System.out.println(" nombre de libro es :" + nombre);
		System.out.println("#" + id);
		System.out.println("$" + precio);
		System.out.println("envio gratuito :" + envioGratuito);
	}
}