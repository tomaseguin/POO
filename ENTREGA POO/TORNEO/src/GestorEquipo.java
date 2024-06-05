import java.util.LinkedList;

import javax.swing.JOptionPane;

public class GestorEquipo {
	
	private LinkedList<Equipo> equipos = new LinkedList<Equipo>();

	public GestorEquipo() {
		
	}

	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "GestorEquipo [equipos=" + equipos + "]";
	}
	
	public Equipo JugarPartido(Equipo equipo1, Equipo equipo2) {
		if (equipo1==equipo2) {
			JOptionPane.showMessageDialog(null, "Has elegido dos veces el mismo equipo, el partido no puede jugarse.");
		} else {
			if (equipo1.getPlantel().size() >= 8 && equipo2.getPlantel().size() >= 8) {
				JOptionPane.showMessageDialog(null, "El partido esta por comenzar.");
				int goles1=(int)(Math.random()*5);
				int goles2=(int)(Math.random()*5);
				if (goles1==goles2) {
					JOptionPane.showMessageDialog(null, "Hubo un empate " + goles1 + " a " + goles2 + " habra desempate.");
					goles1=(int)(Math.random()*5);
					goles2=(int)(Math.random()*5);
				}
				
				String anotadoresEquipo1 = "";
		        String anotadoresEquipo2 = "";     
		        // Anotar goles para equipo1
				for (int i = 0; i < goles1; i++) {
		            int anotadorrandom = (int) (Math.random() * equipo1.getPlantel().size());
		            Jugador anotador = equipo1.getPlantel().get(anotadorrandom);
		            anotadoresEquipo1 += anotador.getNombre() + "\n";
		        }

		        // Anotar goles para equipo2
		        for (int i = 0; i < goles2; i++) {
		            int anotadorrandom = (int) (Math.random() * equipo2.getPlantel().size());
		            Jugador anotador = equipo2.getPlantel().get(anotadorrandom);
		            anotadoresEquipo2 += anotador.getNombre() + "\n";
		        }
				if (goles1>goles2) {
						JOptionPane.showMessageDialog(null, "Ganó " + equipo1.getNombre() + " por " + goles1 + " a " + goles2 + "\nGoles de " + equipo1.getNombre() + ":\n" + anotadoresEquipo1);
						JOptionPane.showMessageDialog(null, "Goles del equipo perdedor (" + equipo2.getNombre() + "):\n" + anotadoresEquipo2);
					
					return equipo1;
				} else {
						JOptionPane.showMessageDialog(null, "Ganó " + equipo2.getNombre() + " por " + goles2 + " a " + goles1 + "\nGoles de " + equipo2.getNombre() + ":\n" + anotadoresEquipo2);	
						JOptionPane.showMessageDialog(null, "Goles del equipo perdedor (" + equipo1.getNombre() + "):\n" + anotadoresEquipo1);
					
					return equipo2;
				}
			} else {
				JOptionPane.showMessageDialog(null, "No hay jugadores suficientes para jugar el partido.");
				
			}
			return null;
		}
		return null;
	}
	
	
	
	

}
