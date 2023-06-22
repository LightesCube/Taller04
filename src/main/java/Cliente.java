public class Cliente {
	private String nombre;
	private String apellido;
	private String correoElectronico;
	private String numeroContacto;
	private String estadoCivil;
	private String ciudad;
	public Tienda Cubito_Store;

	public Cliente(String nombre, String apellido, String correoElectronico, String numeroContacto, String estadoCivil, String ciudad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.correoElectronico = correoElectronico;
		this.numeroContacto = numeroContacto;
		this.estadoCivil = estadoCivil;
		this.ciudad = ciudad;
	}

	public String getApellido() {
		return this.apellido;
	}
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}
	public String getNumeroContacto() {
		return this.numeroContacto;
	}
	public String getEstadoCivil() {
		return this.estadoCivil;
	}
	public String getCiudad() {
		return this.ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}