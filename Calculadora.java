package miercoles1;

public class Calculadora {

	int num1;
	int num2;

	public Calculadora(int a, int b) {
		this.num1 = a;
		this.num2 = b;

	}

	public int sumar() {
		int suma = num1 + num2;
		return suma;
	}

	public int restar() {
		int resta = num1 - num2;
		return resta;
	}

	public int dividir() {
		int divicion = num1 / num2;
		return divicion;
	}

	public int multiplicar() {
		int multiplicacion = num1 * num2;
		return multiplicacion;
	}
}
