public class Partido {
	private String resultado;
	private String fechaPartido;
	private Equipo equipo;
	private Cancha cancha;
	private Equipo equipoRival;

	public Partido(String resultado, String fechaPartido, Equipo equipo,Equipo equipoRival, Cancha cancha) {
		this.resultado = resultado;
		this.fechaPartido = fechaPartido;
		this.equipo = equipo;
		this.cancha = cancha;
		this.equipoRival = equipoRival;
	}

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

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Cancha getCancha() {
		return cancha;
	}

	public void setCancha(Cancha cancha) {
		this.cancha = cancha;
	}

	public Equipo getEquipoRival() {
		return equipoRival;
	}

	public void setEquipoRival(Equipo equipoRival) {
		this.equipoRival = equipoRival;
	}
}