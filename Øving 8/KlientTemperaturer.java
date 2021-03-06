/**
 * KlientTemperaturer.java
 *
 * Oppgave 9.11.2
 * Lager en klient som tester metodene i klassen.
 */

import static javax.swing.JOptionPane.*;
import java.text.DecimalFormat;

class KlientTemperaturer {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("#.##"); // Angir at tallet skal ha MAKS to desimaler
    String antallDager = showInputDialog("Hvor mange dager skal måneden din inneholde?");
    String antallTimer = showInputDialog("Hvor mange timer skal døgnet ditt ha?");
    int antDager = Integer.parseInt(antallDager);
    int antTimer = Integer.parseInt(antallTimer);
        
    Temperaturer maned = new Temperaturer(antDager, antTimer);
    
    double[] test = maned.getMiddeltemperaturPrDag();
    for (int i = 0; i < test.length; i++) {
      System.out.print("Dag " + (i + 1) + " var middeltemperaturen ");
      System.out.printf("%.1f", test[i]);
      System.out.println();
    }
    System.out.println();
    
    test = maned.getMiddeltemperaturPrTime();
    for (int i = 0; i < test.length; i++) {
      System.out.print("Middeltemperaturen for time " + (i + 1) + " i måneden var ");
      System.out.printf("%.1f", test[i]);
      System.out.println();
    }
        
    String resultat = "\nMiddeltemperaturen for hele måneden er " + df.format(maned.getMiddeltemperaturManed()) + "\n";
    int[] gruppertTemperatur = maned.getGruppertTemperatur();
    resultat += "\nAntall døgn med middeltemperatur under -5 grader er " + gruppertTemperatur[0];
    resultat += "\nAntall døgn med middeltemperatur mellom -5 og 0 grader er " + gruppertTemperatur[1];
    resultat += "\nAntall døgn med middeltemperatur mellom 0 og 5 grader er " + gruppertTemperatur[2];
    resultat += "\nAntall døgn med middeltemperatur mellom 5 og 10 grader er " + gruppertTemperatur[3];
    resultat += "\nAntall døgn med middeltemperatur over 10 grader er " + gruppertTemperatur[4];
    
    System.out.println(resultat);
  }
}