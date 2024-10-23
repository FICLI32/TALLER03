import java.util.ArrayList;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private Entrenador equipo;
	private Deporte deporte;

	public Equipo(String nombreEquipo, Entrenador equipo,Deporte deporte) {
		this.equipo = equipo;
		this.nombreEquipo = nombreEquipo;
		this.deporte = deporte;
	}

	public String getNombreEquipo() {
		return this.nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public void añadirDeportista(Deportista deportista) {
		deportistas.add(deportista);
	}

	public void eliminarDeportista(Deportista deportista) {
		deportistas.remove(deportista);
	}
}