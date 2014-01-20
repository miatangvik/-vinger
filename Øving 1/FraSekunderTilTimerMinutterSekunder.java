/**
 * FraSekunderTilTimerMinutterSekunder.java
 *
 * Oppgave 2.13.3 s. 83
 * Leser inn antall sekunder og beregner hvor mange timer, minutter og sekunder det er.
 */

import static javax.swing.JOptionPane.*;
class FraSekunderTilTimerMinutterSekunder {
	public static void main(String[] args) {
		String sekunderLest = showInputDialog("Sekunder (s): ");
		int sekunder = Integer.parseInt(sekunderLest);
		int timer = sekunder / 3600;
		int minutter = sekunder % 3600 / 60;
		int sekunder2 = sekunder % 60;
		String utskrift = "Tiden er " + timer + " timer, " + minutter + " minutter og " + sekunder2 + " sekunder";
		showMessageDialog(null, utskrift);
	}
}