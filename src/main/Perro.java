package main;

public class Perro {
	private String nombre;
	private int edad;
	private String raza;
	private boolean hambriento;

	public Perro(String n, int e, String r) {
		this.nombre = n;
		this.edad = e;
		this.raza = r;
		this.hambriento = false;

	}
	public void setHambriento(boolean h) {
		this.hambriento = h;
	}

	public int getEdad() {
		return this.edad;
	}

	public void print() {
		String mensaje = "nombre es: " + this.nombre + "," + "raza es: " + this.raza + ", "+ "edad es:" + this.edad;
		System.out.println(mensaje);
	}

	public void comer() throws Exception {
		if (this.hambriento == true) {
			System.out.println(" el perro esta comiendo");
			this.hambriento = false;
		} else {
			Exception e = new Exception(" el perro no debe comer");
			throw e;
		}

	}

	public void setEdad(int edad) throws Exception {
		if (edad >= 0) {
			this.edad = edad;
		} else {
			Exception e = new Exception("La edad no puede ser negativa");
			throw e;
		}
	}

	public static void main(String[] args)throws Exception {
	Perro p1 = new Perro("toby", 2, "bulldog");
	
    	
    	p1.print();
    	p1.setEdad(-3);
    	p1.print();
    	
    	int edad =	p1.getEdad();
    	System.out.println( edad);
    
	}

}