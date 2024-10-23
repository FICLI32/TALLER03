import java.util.ArrayList;

public class Cancha {
	private String tipoSuperficie;
	private String ubicacion;
	private int capacidadEspectadores;
	private ArrayList<Partido> partidos;
	private Club club;

	public Cancha(String tipoSuperficie, String ubicacion, int capacidadEspectadores, Club club) {
		this.tipoSuperficie = tipoSuperficie;
		this.ubicacion = ubicacion;
		this.capacidadEspectadores = capacidadEspectadores;
		this.partidos = new ArrayList<>();
		this.club = club;
	}

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidadEspectadores() {
		return this.capacidadEspectadores;
	}

	public void setCapacidadEspectadores(int capacidadEspectadores) {
		this.capacidadEspectadores = capacidadEspectadores;
	}

	public void agregarPartido(Partido partido) {
		if (validarPartido(partido)){
			System.out.println("ya hay un partido en esa fecha");
		}else{
			partidos.add(partido);
			System.out.println("resultado: "+ partido.getResultado()+"equipos: " + partido.getEquipo()+ "-" + partido.getEquipoRival()+ "cancha: " + partido.getCancha()  );
		}
	}

	public void mostrarPartidos() {
		System.out.println("lista partidos: ");
		for (Partido partido : partidos){
			System.out.println("partido: " + partido);
		}
	}

	public boolean validarPartido(Partido partido){
		for(Partido p : partidos){
			if (p.getFechaPartido().equals(partido.getFechaPartido())){
				return false;
			}
		}
		return true;
	}


}