package cuentaCorriente;

public class CuentaCorriente {

	private int numero;
	private double saldo;

	public CuentaCorriente() {
		this.numero = (int) (Math.random() * (1000 - 0 + 1) + 0);
		this.saldo = 0;
	}

	public CuentaCorriente(int numero) {

		this.numero = numero;
		this.saldo = 0;
	}

	public CuentaCorriente(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public double getSaldo() {
		return this.saldo;
	}

	private static void anadirDinero(CuentaCorriente cuenta, double cantidad) {
		cuenta.numero += cantidad;
	}

	private static void retirarDinero(CuentaCorriente c, double cantidad) throws Exception {
		if (cantidad > c.saldo) {
			Exception e = new Exception("ERROR: Saldo insuficiente");
			throw e;
		} else {
			c.saldo -= cantidad;
		}
	}

}
