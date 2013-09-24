/**
 * Brok.java
 *
 * Oppgave 2 s. 207
 * Lager en klasse for å regne med brøk.
 */


class Brok {
  public int teller;
  public int nevner;
  
  public Brok(int teller, int nevner) {
    if (nevner == 0) {
      throw new IllegalArgumentException("Å dele på 0 er tull.");
    }
    this.teller = teller;
    this.nevner = nevner;
  }
  
  public Brok(int teller) {
    this.teller = teller;
    this.nevner = 1;
  }
  
  public void getSum(Brok brok) { // argumentet metoden skal ha inn er en referanse fra klassen Brok (referensen er brok, kunne vært kalt noe helt annet)
    int nevnerBackup = this.nevner;
    this.teller *= brok.getNevner();
    this.nevner *= brok.getNevner();
    this.teller += brok.getTeller() * nevnerBackup;
  }
  
  public void getDifferanse(Brok brok) {
    int nevnerBackup = this.nevner;
    this.teller *= brok.getNevner();
    this.nevner *= brok.getNevner();
    this.teller -= brok.getTeller() * nevnerBackup;
  }
  
  public void getProdukt(Brok brok) {
    this.teller *= brok.getTeller();
    this.nevner *= brok.getNevner();
  }
  
  public void getKvotient(Brok brok) {
    this.teller *= brok.getNevner();
    this.nevner *= brok.getTeller();
  }
  
  public int getTeller() {
    return this.teller;
  }
  
  public int getNevner() {
    return this.nevner;
  }
  
  public String toString() {
    return ("Telleren er " + this.teller + " og nevneren er " + this.nevner);
  }
}