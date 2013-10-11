/**
 * Tekstbehandling.java
 *
 * Lager en klasse for enkel tekstbehandling.
 */

import java.util.StringTokenizer;

class Tekstbehandling {
  private String tekst;
  private int antallOrd;
  private int antallBokstaverTotalt;
  
  public Tekstbehandling(String tekst) {
    this.tekst = tekst;
    
    StringTokenizer analyse = new StringTokenizer(tekst);
    antallOrd = analyse.countTokens();
    while (analyse.hasMoreTokens()) {
      String ord = analyse.nextToken();
      antallBokstaverTotalt += ord.length();
    }
  }

  public int getAntallOrd() { // Henter antall ord som regnes ut i konstruktøren
    return antallOrd;
  }
  
  public double getGjennomsnittligOrdlengde() {
    double gjennomsnittligOrdlengde = 0.0;
    if (antallOrd > 0) {
      gjennomsnittligOrdlengde = (double) antallBokstaverTotalt / (double) antallOrd;
    }
    return gjennomsnittligOrdlengde;
  }
  
  public double getGjennomsnittligAntallOrdPrPeriode() {
    String[] periode = tekst.split("[.!:?]");
    int antallOrdPrPeriode = 0;
    for (int i = 0; i < periode.length; i++) {
      String[] ordPrPeriode = periode[i].split("[ ]");
      for (int j = 0; j < ordPrPeriode.length; j++) {
        if (ordPrPeriode[j].length() > 0) {
			antallOrdPrPeriode++;      	
      	}
      }
    }
    double gjennomsnittligAntallOrdPrPeriode = (double) antallOrdPrPeriode / periode.length;
    return gjennomsnittligAntallOrdPrPeriode;
  }
  
  public String skifteOrd(String ordSomByttes, String ordByttesTil) {
    String ordSkiftet = tekst.replace(ordSomByttes, ordByttesTil);
    return ordSkiftet;
  }
  
  public String getTekst() {
    return tekst;
  }
  
  public String getStorTekst() {
    String storTekst = tekst.toUpperCase();
    return storTekst;
  }
}