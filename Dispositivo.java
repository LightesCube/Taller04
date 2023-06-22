import java.util.ArrayList;

public class Dispositivo {
	private String marca;
	private int memoriaRAM;
	private int memoriaAlmacenamiento;
	private String procesador;
	private String modelo;
	private int year;
	private float precio;
	private int stock;
	public Tienda tienda;
	public ArrayList<ComputadorEscritorio> computadorEscritorio = new ArrayList<ComputadorEscritorio>();
	public ArrayList<Tablet> unnamed_Tablet_ = new ArrayList<Tablet>();
	public ArrayList<Notebook> unnamed_Notebook_ = new ArrayList<Notebook>();

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

	public int getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}