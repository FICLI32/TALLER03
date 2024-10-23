public class Partido {
	private String resultado;
	private String fechaPartido;
	private Equipo equipo;
	private Cancha cancha;
	private Equipo equipoRival;

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFechaPartido() {
		return this.fechaPartido;
	}

	public void setFechaPartido(String fechaPartido) {
		this.fechaPartido = fechaPartido;
	}
}