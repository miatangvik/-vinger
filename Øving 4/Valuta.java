/**
 * Valuta.java
 *
 * Lager en klasse med minst én konstruktør. Klassen har metoder for å regne fra og til norske kroner.
 */

public class Valuta {
  private final double belop;
  private final double kurs;
  private int enhet;
  
  public Valuta(double belop, double kurs, int enhet) {
    this.belop = belop;
    this.kurs = kurs;
    this.enhet = enhet;
  }
  
  public double beregnFraNok() {
    return belop / kurs * enhet;
  }
  
  public double beregnTilNok() {
    return belop * kurs / enhet;
  }
  
  public String toString() {
    return "\nBeløp: " + belop + "\nKurs: " + kurs + "\nEnhet: " + enhet;
  }
}