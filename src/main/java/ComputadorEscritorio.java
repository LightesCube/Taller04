import java.util.ArrayList;

public class ComputadorEscritorio {
	private String tarjetaVideo;
	private String fuentePoder;
	private String chasis;
	private Pantalla pantalla;
	public ArrayList<Dispositivo> dispositivo = new ArrayList<Dispositivo>();
	public Pantalla pantallaTester;

	public ComputadorEscritorio(String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public ComputadorEscritorio(String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
		this.tarjetaVideo = tarjetaVideo;
		this.fuentePoder = fuentePoder;
		this.chasis = chasis;
		this.pantalla = pantalla;
	}

	public String getTarjetaVideo() {
		return this.tarjetaVideo;
	}

	public void setTarjetaVideo(String tarjetaVideo) {
		this.tarjetaVideo = tarjetaVideo;
	}

	public String getFuentePoder() {
		return this.fuentePoder;
	}

	public String getChasis() {return this.chasis;}

	public Pantalla getPantalla() {
		return this.pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}
}

