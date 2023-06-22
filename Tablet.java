import java.util.ArrayList;

public class Tablet {
	private String resolucionPantalla;
	private String accesorios;
	public ArrayList<Dispositivo> unnamed_Dispositivo_ = new ArrayList<Dispositivo>();

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