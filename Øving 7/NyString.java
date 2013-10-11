/**
 * NyString.java
 *
 * Oppgave 1 s. 283
 * Lager en klasse med et par metoder som endrer en streng.
 */

public class NyString {
  private String tekst = "";
  
  public NyString(String tekst) {
    this.tekst = tekst;
  }
  
  public String getForkorting() {
    String[] ord = tekst.split(" ");
    String forkortetTekst = "";
    for (int i = 0; i < ord.length; i++) {
      forkortetTekst += ord[i].charAt(0);
    }
    return forkortetTekst;
  }
  
  public String getFjerningAvTegn(char tegn) {
    String tegnFjernet = "";
    if (tekst != null) {
      tegnFjernet = tekst.replace(tegn, ' ');
    }
    return tegnFjernet;
  }
}