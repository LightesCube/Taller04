import java.util.ArrayList;

public class Tablet {
	private String resolucionPantalla;
	private String accesorios;

	public Tablet(String resolucionPantalla, String accesorios){
		this.resolucionPantalla = resolucionPantalla;
		this.accesorios = accesorios;
		this.dispositivoX = dispositivoX;
	}
	public ArrayList<Dispositivo> dispositivoX = new ArrayList<Dispositivo>();

	public String getResolucionPantalla() {
		return this.resolucionPantalla;
	}

	public void setResolucionPantalla(String resolucionPantalla) {
		this.resolucionPantalla = resolucionPantalla;
	}

	public String getAccesorios() {
		return this.accesorios;
	}

	public void setAccesorios(String accesorios) {
		this.accesorios = accesorios;
	}
}