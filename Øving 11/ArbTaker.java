/**
 * ArbTaker.java
 *
 * Oppgave 11.10.1
 * Lager en klasse ArbTaker med get-metoder for alle attributtene og set-metoder for å endre attributter som det er naturlig at bør kunne forandres.
 */

public final class ArbTaker {
  java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();
  private int år = kalender.get(java.util.Calendar.YEAR);
  private Person personalia;
  private int arbtakernr;
  private int ansettelsesår;
  private int månedslønn;
  private int skatteprosent;
  
  public ArbTaker(Person personalia, int arbtakernr, int ansettelsesår, int månedslønn, int skatteprosent) {
    this.personalia = personalia;
    this.arbtakernr = arbtakernr;
    this.ansettelsesår = ansettelsesår;
    this.månedslønn = månedslønn;
    this.skatteprosent = skatteprosent;
  }
  
  public Person getPersonalia() {
    return personalia;
  }
  
  public int getArbtakernr() {
    return arbtakernr;
  }
  
  public int getAnsettelsesår() {
    return ansettelsesår;
  }
  
  public int getMånedslønn() {
    return månedslønn;
  }
  
  public int getSkatteprosent() {
    return skatteprosent;
  }
  
  public void setMånedslønn(int nyMånedslønn) {
    månedslønn = nyMånedslønn;
  }
  
  public void setSkatteprosent(int nySkatteprosent) {
    skatteprosent = nySkatteprosent;
  }
  
  public int skattetrekkPrMåned() {
    return månedslønn * skatteprosent / 100;
  }
  
  public int bruttolønnPrÅr() { // Lønn før fratrekk av skatt
    return månedslønn * 12;
  }
  
  public int skattetrekkPrÅr() {
    return (bruttolønnPrÅr() * skatteprosent) / 100;
  }
  
  public String navn() {
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
  }
  
  public int alder() {
    return år - personalia.getFødselsår();
  }
  
  public int antallÅrAnsatt() {
    return år - ansettelsesår;
  }
  
  public boolean ansattLengerEnn(int antallÅr) {
    return (antallÅrAnsatt() > antallÅr) ? true : false;
  }
}