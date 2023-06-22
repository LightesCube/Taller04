public class Pantalla {
	private String marca;
	private String modelo;
	private int year;

	public Pantalla(String marca, String modelo, int year){
		this.marca = marca;
		this.modelo = modelo;
		this.year = year;
	}
	public ComputadorEscritorio computadorEscritorioTester;
	public String getMarca() {
		return this.marca;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}