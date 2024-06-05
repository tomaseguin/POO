import java.util.LinkedList;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> plantel = new LinkedList<Jugador>();
	
	public Equipo(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public LinkedList<Jugador> getPlantel() {
		return plantel;
	}
	public void setPlantel(LinkedList<Jugador> plantel) {
		this.plantel = plantel;
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", ciudad=" + ciudad + ", plantel=" + plantel + "]";
	}
	
    
	public static void AgregarJugador(Equipo equipo, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			equipo.getPlantel().add(new Jugador(Jugador.elegirNombreAleatorio(),Jugador.elegirPosAleatoria(),Jugador.elegirEdadAleatoria()));
		}
	}
	

}
