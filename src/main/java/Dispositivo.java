import java.util.ArrayList;

public class Dispositivo {
	private String marca;
	private int memoriaRAM;
	private int memoriaAlmacenamiento;
	private String procesador;
	private String modelo;
	private int year;
	private float precio;
<<<<<<< HEAD
	private String stock;

	private int id;
	public Tienda tienda;

	public Dispositivo(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int year, float precio, String stock, int id) {
=======
	private int stock;
	public Tienda tienda;

	public Dispositivo(String marca, int memoriaRAM, int memoriaAlmacenamiento, String procesador, String modelo, int year, float precio, int stock){
>>>>>>> origin/develop
		this.marca = marca;
		this.memoriaRAM = memoriaRAM;
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
		this.procesador = procesador;
		this.modelo = modelo;
		this.year = year;
		this.precio = precio;
		this.stock = stock;
<<<<<<< HEAD
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public ArrayList<ComputadorEscritorio> computadorEscritorioTester = new ArrayList<ComputadorEscritorio>();
	public ArrayList<Tablet> tablet01 = new ArrayList<Tablet>();
	public ArrayList<Notebook> notebook01 = new ArrayList<Notebook>();
=======
	}
	public ArrayList<ComputadorEscritorio> computadorEscritorio = new ArrayList<ComputadorEscritorio>();
	public ArrayList<Tablet> unnamed_Tablet_ = new ArrayList<Tablet>();
	public ArrayList<Notebook> unnamed_Notebook_ = new ArrayList<Notebook>();
>>>>>>> origin/develop

	public String getMarca() {
		return this.marca;
	}

<<<<<<< HEAD
=======
	public void setMarca(String marca) {
		this.marca = marca;
	}

>>>>>>> origin/develop
	public int getMemoriaRAM() {
		return this.memoriaRAM;
	}

<<<<<<< HEAD
=======
	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}

>>>>>>> origin/develop
	public int getMemoriaAlmacenamiento() {
		return this.memoriaAlmacenamiento;
	}

<<<<<<< HEAD
=======
	public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
		this.memoriaAlmacenamiento = memoriaAlmacenamiento;
	}

>>>>>>> origin/develop
	public String getProcesador() {
		return this.procesador;
	}

<<<<<<< HEAD
=======
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

>>>>>>> origin/develop
	public String getModelo() {
		return this.modelo;
	}

<<<<<<< HEAD
=======
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

>>>>>>> origin/develop
	public int getYear() {
		return this.year;
	}

<<<<<<< HEAD
=======
	public void setYear(int year) {
		this.year = year;
	}

>>>>>>> origin/develop
	public float getPrecio() {
		return this.precio;
	}

<<<<<<< HEAD
=======
	public void setPrecio(float precio) {
		this.precio = precio;
	}

>>>>>>> origin/develop
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
<<<<<<< HEAD

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


=======
}
>>>>>>> origin/develop
