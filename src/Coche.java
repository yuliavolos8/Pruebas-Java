
public class Coche {
	private int ruedas;
	private String color;
	private double precioMin = 10000;
	private boolean carroceria_piel;
	private String marca;
	private int Id;
	private static int idSuigiente = 1;

	public Coche(int rue, String col, boolean carroceria, String marca) {
		this.ruedas = rue;
		this.color = col;
		this.carroceria_piel = carroceria;
		this.marca = marca;
		this.Id = idSuigiente;
		idSuigiente++;
	}

	public static String DameIdSiguiente() {
		return "id suigiente es " + idSuigiente;

	}

	public String dame_Datos() {
		return "Este coche tiene " + this.ruedas + " ruedas," + " su color es " + this.color
				+ ", tiene caroceria de piel " + carroceria_piel + " ,la marca es " + this.marca + ", cuesta = "
				+ this.getPrecio() + " ,ID es:  " + this.Id;
	}

	public int getRuedas() {
		return this.ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public double getPrecio() {
		return this.precioMin;
	}

	public void setPrecio(double precio) {
		this.precioMin = precio;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String col) {
		this.color = col;
	}

	public boolean getCarroceria() {
		return this.carroceria_piel;
	}

	public void setCarrroceria(boolean c) {
		this.carroceria_piel = c;
	}

}
