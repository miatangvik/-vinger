/**
 * Oppgaveoversikt.java
 *
 * Oppgave 12.10.1
 * Lager en klasse Oppgaveoversikt som holder orden på hvor mange oppgaver hver enkelt student har fått godkjent.
 */

class Oppgaveoversikt {
  private Student[] studenter;
  private int antStud;
  private int antStudRegistrert;
  
  public Oppgaveoversikt(int antStud) {
    this.antStud = antStud;
    
    studenter = new Student[antStud];
  }
  
  public int getAntStud() {
    return antStudRegistrert;
  }
  
  public int getAntOppgLost(String navn) {
    navn = navn.trim();
    for (int i = 0; i < studenter.length; i++) {
      if (navn.equalsIgnoreCase(studenter[i].getNavn())) {
        return studenter[i].getAntOppg();
      }
    }
    return 0;
  }
  
  public void nyStudent(Student nyStudent) {
    antStudRegistrert++;
    for (int i = 0; i < studenter.length; i++) {
      if (studenter[i] == null) {
        studenter[i] = nyStudent;
      }
    }
  }
  
  public void okAntOppg(String navn, int okning) {
    navn = navn.trim();
    for (int i = 0; i < studenter.length; i++) {
      if (navn.equalsIgnoreCase(studenter[i].getNavn())) {
        studenter[i].okAntOppg(okning);
      }
    }
  }
  
  public String toString() {
    String resultat = "";
    for (int i = 0; i < antStud; i++) {
      resultat += studenter[i].toString() + "\n";
    }
    return resultat + "\nAntall studenter er altså " + antStud;
  }
}