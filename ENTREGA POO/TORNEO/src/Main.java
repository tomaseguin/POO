import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        GestorEquipo gestor = new GestorEquipo();
        Equipo boca = new Equipo("Boca", "La Boca");
        Equipo river = new Equipo("River", "Nunez");
        Equipo independiente = new Equipo("Independiente", "Avellaneda");
        Equipo racing = new Equipo("Racing", "Avellaneda");
        Equipo velez = new Equipo("Velez", "Liniers");
        Equipo sanLorenzo = new Equipo("San Lorenzo", "Boedo");
        Equipo estudiantes = new Equipo("Estudiantes", "La Plata");
        Equipo gimnasia = new Equipo("Gimnasia", "La Plata");
        Equipo newells = new Equipo("Newell's Old Boys", "Rosario");
        Equipo rosarioCentral = new Equipo("Rosario Central", "Rosario");
        Equipo argentinosJuniors = new Equipo("Argentinos Juniors", "La Paternal");
        Equipo huracan = new Equipo("Huracán", "Parque Patricios");
        Equipo banfield = new Equipo("Banfield", "Banfield");
        Equipo lanus = new Equipo("Lanús", "Lanús");
        Equipo talleres = new Equipo("Talleres", "Córdoba");
        Equipo colon = new Equipo("Colón", "Santa Fe");
        
        Equipo[] equipos = {
            river, boca, independiente, racing, velez, sanLorenzo, estudiantes, gimnasia,
            newells, rosarioCentral, argentinosJuniors, huracan, banfield, lanus, talleres, colon
        };
        
        // Agregar jugadores a los equipos
        for (Equipo equipo : equipos) {
            Equipo.AgregarJugador(equipo, 11);
            gestor.getEquipos().add(equipo);
        }

        Equipo ganador = torneo.jugarTorneo(gestor);
        JOptionPane.showMessageDialog(null, "¡El ganador del torneo es " + ganador.getNombre() + "!");
    }
}

 