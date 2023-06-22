import java.util.ArrayList;

public class ComputadorEscritorio {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;
	public ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();
	public Pantalla unnamed_Pantalla_;

	public ComputadorEscritorio(String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public String getChasis() {return this.chasis;}

	public Pantalla getPantalla() {
		return this.pantalla;
	}
}

