import java.util.ArrayList;

public class Dispositivo {
	private String marca;
	private int memoriaRAM;
	private int memoriaAlmacenamiento;
	private String procesador;
	private String modelo;
	private int year;
	private float precio;
	private String stock;

	private int id;
	public Tienda tienda;

	public Dispositivo(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int year, float precio, String stock, int id) {
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.year = year;
		this.precio = precio;
		this.stock = stock;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public ArrayList<ComputadorEscritorio> computadorEscritorioTester = new ArrayList<ComputadorEscritorio>();
	public ArrayList<Tablet> tablet01 = new ArrayList<Tablet>();
	public ArrayList<Notebook> notebook01 = new ArrayList<Notebook>();

	public String getMarca() {
		return this.marca;
	}

	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

	public int getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

	public String getProcesador() {
		return this.procesador;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getYear() {
		return this.year;
	}

	public float getPrecio() {
		return this.precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean agregarDispositivo(Dispositivo dispositivo) {
		stock.add(dispositivo);
		return true;
	}

	public String obtenerInfoDispositivo(int id) {
		for (Dispositivo dispositivo : stock) {
			if (dispositivo.getId() == id) {
				return dispositivo.obtenerEspecificaciones();
			}
		}
		return "Dispositivo no encontrado";
	}

	public stock buscarPorMarca(String marca) {
		stock dispositivosEncontrados = new ArrayList<>();
		for (Dispositivo dispositivo : stock) {
			if (dispositivo.getMarca().equalsIgnoreCase(marca)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}

	public stock buscarPorModeloYTipo(String modelo, String tipo) {
		stock dispositivosEncontrados = new ArrayList<>();
		for (Dispositivo dispositivo : stock) {
			if (dispositivo.getModelo().equalsIgnoreCase(modelo) && dispositivo.getStock().equalsIgnoreCase(tipo)) {
				dispositivosEncontrados.add(dispositivo);
			}
		}
		return dispositivosEncontrados;
	}
		public String getTipo() {
			return "Dispositivo";
		}

		public String obtenerEspecificaciones () {
			return "Especificaciones del dispositivo" + id + ":\n" +
					"Marca: " + marca + "\n" +
					"Memoria RAM: " + memoriaRAM + "GB\n" +
					"Memoria de Almacenamiento";

		}
	}


