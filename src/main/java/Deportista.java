public class Deportista {
	private String nombreApellido;
	private String contacto;
	private Equipo equipo;
	private Deporte deporte;

	public Deportista(String nombreApellido, String contacto, Equipo equipo, Deporte deporte) {
		this.nombreApellido = nombreApellido;
		this.contacto = contacto;
		this.equipo = equipo;
		this.deporte = deporte;
	}

	public String getNombreApellido() {
		return this.nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
}