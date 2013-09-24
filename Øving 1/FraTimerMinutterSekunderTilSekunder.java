/**
 * FraTimerMinutterSekunderTilSekunder.java
 *
 * Oppgave 2.13.2 s. 83
 * Regner om timer, minutter og sekunder til totalt antall sekunder.
 */
 
import static javax.swing.JOptionPane.*;
class FraTimerMinutterSekunderTilSekunder {
 public static void main(String[] args) {
  String timerLest = showInputDialog("Timer (hrs): ");
  String minutterLest = showInputDialog ("Minutter (min): ");
  String sekunderLest = showInputDialog ("Sekunder (sek): ");
  double timer = Double.parseDouble(timerLest);
  double minutter = Double.parseDouble(minutterLest);
  double sekunder = Double.parseDouble(sekunderLest);
  double svar = (timer * 3600) + (minutter * 60) + sekunder;
  String utskrift = "Antall sekunder er " + svar + " s";
  showMessageDialog(null, utskrift);
 }
}