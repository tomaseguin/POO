import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		GestorEquipo gestor = new GestorEquipo();
		Equipo boca = new Equipo("Boca", "La Boca");
		Equipo river = new Equipo("River", "Nunez");
		river.getPlantel().add(new Jugador("Tomas","Arquero",26));
		Equipo.AgregarJugador(river,10);
		Jugador.setNum(0);
		boca.getPlantel().add(new Jugador("Rafael","Arquero",21));
		Equipo.AgregarJugador(boca,10);
		//JOptionPane.showMessageDialog(null, river);
		//JOptionPane.showMessageDialog(null, boca);
		gestor.getEquipos().add(river);
		gestor.getEquipos().add(boca);
		String[] equipos = new String[gestor.getEquipos().size()];
		for (int i = 0; i < equipos.length; i++) {
			equipos[i] = gestor.getEquipos().get(i).getNombre();
		}
		int equipo1 = JOptionPane.showOptionDialog(null, "Elija el equipo 1", null, 0, 0, null, equipos, equipos);
		int equipo2 = JOptionPane.showOptionDialog(null, "Elija el equipo 2", null, 0, 0, null, equipos, equipos);
		JOptionPane.showMessageDialog(null, "Plantel ganador:\n" + gestor.JugarPartido(gestor.getEquipos().get(equipo1), gestor.getEquipos().get(equipo2)));
		

	}

}
 