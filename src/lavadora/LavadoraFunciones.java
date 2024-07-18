package lavadora;

public class LavadoraFunciones {
	private int kilos;
	private int tipoDeRopa;
	private int secadoTerminado;
	private int lavadoIniciado;
	private int llenadoTerminado;

	public LavadoraFunciones(int kilos, int tipo) {
		this.kilos = kilos;
		this.tipoDeRopa = tipo;
		this.secadoTerminado = 0;
		this.llenadoTerminado = 0;
		this.lavadoIniciado = 0;
	}

//metodo para llenar la lavadora , sin superar los limites de peso
	private void llenarLavadora() {
		if (this.kilos <= 12) {
			this.llenadoTerminado = 1;
			System.out.println("llenado completado");
		} else

		{
			System.out.println("no superar 12 kilos");
			this.llenadoTerminado = 0;
		}
	}

	// metodo para lavar poner a 0 si esta lavandose, o a 1 si ya se haya acabado
	// lavado

	private void lavar() {
		llenarLavadora();
		if (this.llenadoTerminado == 1) {
			if (this.tipoDeRopa == 1) {
				System.out.println("el tipo de ropa es blanco, lavado delicado");
			} else if (this.tipoDeRopa > 1) {
				System.out.println("Lavado intenso para ropa oscura");
			} else {
				System.out.println("eligue algun numero >=1");
			}
		}
		this.lavadoIniciado = 1;
	}

//metodo para secar 
	private void secar() {
		lavar();
		if (this.tipoDeRopa == 1) {
			System.out.println("secado suave");
		} else if (this.tipoDeRopa > 1) {
			System.out.println("secado intenso");
		}
		this.secadoTerminado = 1;
	}

//final
	public void finalizado() {
		secar();
		System.out.println("el lavado y secado esta acabado");
	}
}
