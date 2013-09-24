/**
 * FraTommerTilCentimeter.java
 *
 * Oppgave 2.13.1 s. 83
 * Regner om fra tommer til centimeter.
 */
 
import static javax.swing.JOptionPane.*;
class FraTommerTilCentimeter {
  public static void main(String[] args) {
    String tommerLest = showInputDialog("Tommer (tommer): ");
    double tommer = Double.parseDouble(tommerLest);
    double centimeter = tommer * 2.54;
    String utskrift = "Antall centimeter er " + centimeter + " cm";
    showMessageDialog(null, utskrift);
  }
}