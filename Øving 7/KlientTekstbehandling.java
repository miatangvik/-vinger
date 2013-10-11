/**
 * KlientTekstbehandling.java
 *
 * Lager en testklient for klassen Tekstbehandling. Bruker skriver inn en tekst og får informasjon/endrer den.
 */

import static javax.swing.JOptionPane.*;

class KlientTekstbehandling {
  public static void main(String[] args) {
    String behandletTekst = "";
    String tekst = showInputDialog("Skriv teksten du vil behandle: ");
    
    Tekstbehandling behandleTekst = new Tekstbehandling(tekst);
    
    String ordSomByttes = showInputDialog("Hvilket ord vil du skifte ut?");
    String ordByttesTil = showInputDialog("Hva vil du skifte det ut med?");
    behandletTekst = "Antall ord i teksten er " + behandleTekst.getAntallOrd();
    behandletTekst += "\nGjennomsnittlig ordlengde er " + behandleTekst.getGjennomsnittligOrdlengde();
    behandletTekst += "\nGjennomsnittlig antall ord per periode er " + behandleTekst.getGjennomsnittligAntallOrdPrPeriode();
    behandletTekst += "\nMed \"" + ordSomByttes + "\" skiftet ut med \"" + ordByttesTil + "\", blir teksten: " + behandleTekst.skifteOrd(ordSomByttes, ordByttesTil);
    behandletTekst += "\nTeksten du skrev inn: " + behandleTekst.getTekst();
    behandletTekst += "\nTeksten med store bokstaver: " + behandleTekst.getStorTekst();
    
    showMessageDialog(null, behandletTekst);
  }
}