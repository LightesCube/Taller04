import java.util.ArrayList;

public class Tienda {
	private String direccion;
	private String catalogo;
	private String clientes;
	public Cliente unnamed_Cliente_;
	public ArrayList<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	public Cliente cliente;

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCatalogo() {
		return this.catalogo;
	}

	public void setCatalogo(String catalogo) {
		this.catalogo = catalogo;
	}

	public String getClientes() {
		return this.clientes;
	}

	public void setClientes(String clientes) {
		this.clientes = clientes;
	}
}