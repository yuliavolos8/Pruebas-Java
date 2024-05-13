package nif;

public class Empleado {

	private Nif nif;
	private double sueldoBase;
	private double pagoHoraExtra;
	private double horasExtra;
	private double TipoPorcentajeIRPF;
	private boolean casado;
	private int hijos;

	



public Empleado(long nif, double sueldoBase, double pagoHoraExtra, double horasExtra, double tipoPorcentajeIRPF,
		boolean casado,  int hijos) {
	
	this.nif = new Nif(nif);
	this.sueldoBase = sueldoBase;
	this.pagoHoraExtra = pagoHoraExtra;
	this.horasExtra = horasExtra;
	TipoPorcentajeIRPF = tipoPorcentajeIRPF;
	this.casado = casado;
	this.hijos = hijos;
}



	public void setNif(Nif nifNuevo) {
		this.nif = nifNuevo;
	}

	public Nif getNif() {
		return this.nif;
	}

	public void setSueldoBase(double sueldo) {
		this.sueldoBase = sueldo;
	}

	public double getSueldoBase() {
		return this.sueldoBase;
	}

	public void setPagoHorasExtra(double cantidadNueva) {
		if(cantidadNueva >= 0) {
		this.pagoHoraExtra = cantidadNueva;
		}
	}

	public void setHorasExtra(int horas) {
		if( horas >=0) {
		this.horasExtra = horas;
		}
	}

	public double getHorasExtra() {
		return this.horasExtra;
	}

	public boolean getCasado() {
		return this.casado = true;
	}

	public void setCasado() {
		this.casado = false;
	}

	public void setHijos(int cantidad) {
		if( cantidad >= 0) {
		this.hijos = cantidad;
		}
	}

	public int getHijos() {
		return this.hijos;
	}

	public void print() {
		String mensaje = "";
		mensaje += this.nif + " " + this.casado + " " + this.hijos;
		System.out.println(mensaje);
	}

	public void printlnAll() {
		print();
		String mensaje = " ";
		mensaje += "sueldo base es :" + this.sueldoBase + " " + this.horasExtra + this.pagoHoraExtra + "ingreso Extra"
				+ pagoExtra() + "porcentaje que se quita" + retencionIRPF() + "sueldo bruto es : " + sueldoBruto()
				+ "sueldo neto es :" + sueldoNeto();

		System.out.println(mensaje);
	}

	// Cálculo y devolución del complemento correspondiente a las horas extra
	// realizadas.
	public double pagoExtra() {
		double pagaExtra = this.horasExtra * this.pagoHoraExtra;
		return pagaExtra;
	}

//	Cálculo y devolución del sueldo bruto.
	public double sueldoBruto() {
		Double sueldoBruto = this.sueldoBase + pagoExtra();
		return sueldoBruto;
	}
	/*
	 * Cálculo y devolución de las retenciones (IRPF) a partir del tipo, teniendo en
	 * cuenta que el porcentaje de retención que hay que aplicar es el tipo menos 2
	 * puntos si el empleado está casado y menos 1 punto por cada hijo que tenga; el
	 * porcentaje se aplica sobre todo el sueldo bruto.
	 */

	public double retencionIRPF() {
		double porcentajeRetencion = TipoPorcentajeIRPF;

		if (this.casado == true) {
			porcentajeRetencion = this.TipoPorcentajeIRPF - this.TipoPorcentajeIRPF * 0.02;
		}
		if(this.hijos > 0) {
			porcentajeRetencion = this.TipoPorcentajeIRPF - this.TipoPorcentajeIRPF * 0.01 * this.hijos;
		}
		if (porcentajeRetencion >= 0 && porcentajeRetencion < 100) {
			porcentajeRetencion = porcentajeRetencion  * sueldoBruto();

		}
		return porcentajeRetencion;

	}

	public double sueldoNeto() {
		Double sueldoNeto = sueldoBruto() - retencionIRPF();
		return sueldoNeto;
	}
	//copia(): clonación de objetos.
	public Empleado copia() {
	Empleado infoClonada = new Empleado(this.nif.getNumero(), this.sueldoBase, this.pagoHoraExtra, this.horasExtra,
			this.TipoPorcentajeIRPF, this.casado,  this.hijos);
	return  infoClonada ;

	}
}
	
