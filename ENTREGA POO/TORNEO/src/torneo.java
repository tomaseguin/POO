
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class torneo {

    public static Equipo jugarTorneo(GestorEquipo gestor) {
        LinkedList<Equipo> equipos = gestor.getEquipos();

        // Octavos de final
        LinkedList<Equipo> ganadoresOctavos = new LinkedList<Equipo>();
        JOptionPane.showMessageDialog(null, "¡Comienzan los Octavos de Final!");
        ganadoresOctavos = jugarRonda(gestor, equipos, "Octavos de Final");

        // Cuartos de final
        LinkedList<Equipo> ganadoresCuartos = new LinkedList<Equipo>();
        JOptionPane.showMessageDialog(null, "¡Comienzan los Cuartos de Final!");
        ganadoresCuartos = jugarRonda(gestor, ganadoresOctavos, "Cuartos de Final");

        // Semifinales
        LinkedList<Equipo> ganadoresSemifinales = new LinkedList<Equipo>();
        JOptionPane.showMessageDialog(null, "¡Comienzan las Semifinales!");
        ganadoresSemifinales = jugarRonda(gestor, ganadoresCuartos, "Semifinales");

        // Final
        JOptionPane.showMessageDialog(null, "¡Comienza la Final!");
        Equipo ganadorFinal = jugarRonda(gestor, ganadoresSemifinales, "Final").get(0);
        
        return ganadorFinal;
    }

    public static LinkedList<Equipo> jugarRonda(GestorEquipo gestor, LinkedList<Equipo> equipos, String ronda) {
        LinkedList<Equipo> ganadores = new LinkedList<Equipo>();
        
        while (equipos.size() > 1) {
            String[] nombresEquipos = new String[equipos.size()];
            for (int i = 0; i < nombresEquipos.length; i++) {
                nombresEquipos[i] = equipos.get(i).getNombre();
            }

            int equipo1Elegido = JOptionPane.showOptionDialog(null, "Elija el primer equipo para el partido de " + ronda, null, 0, 0, null, nombresEquipos, nombresEquipos);
            Equipo equipo1 = equipos.remove(equipo1Elegido);

            nombresEquipos = new String[equipos.size()];
            for (int i = 0; i < nombresEquipos.length; i++) {
                nombresEquipos[i] = equipos.get(i).getNombre();
            }

            int equipo2Elegido = JOptionPane.showOptionDialog(null, "Elija el segundo equipo para el partido de " + ronda, null, 0, 0, null, nombresEquipos, nombresEquipos);
            Equipo equipo2 = equipos.remove(equipo2Elegido);

            Equipo ganador = gestor.JugarPartido(equipo1, equipo2);
            ganadores.add(ganador);
        }

        return ganadores;
    }
}
