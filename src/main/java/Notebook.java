import java.util.ArrayList;

public class Notebook {
	private String resolucionPantalla;
	private String teclado;
	private int bateria;

	public Notebook(String resolucionPantalla, String teclado, int bateria){
		this.resolucionPantalla = resolucionPantalla;
		this.teclado = teclado;
		this.bateria = bateria;
	}

	public ArrayList<Dispositivo> dispositivoTester = new ArrayList<Dispositivo>();

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}
	public String getTeclado() {
		return this.teclado;
	}
	public int getBateria() {
		return this.bateria;
	}
	public void setBateria(int bateria) {
		this.bateria = bateria;
	}
}