public class Entrenador {
	private String nombre;
	private String experiencia;
	private Equipo entrenador;
	private Deporte deporte;

	public Entrenador(String nombre, String experiencia, Equipo entrenador, Deporte deporte) {
		this.nombre = nombre;
		this.experiencia = experiencia;
		this.entrenador = entrenador;
		this.deporte = deporte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExperiencia() {
		return this.experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getDeporteEspecializacion() {
		throw new UnsupportedOperationException();
	}

	public void setDeporteEspecializacion(String deporteEspecializacion) {
		throw new UnsupportedOperationException();
	}
}