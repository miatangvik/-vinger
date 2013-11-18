/**
 * Student.java
 *
 * Oppgave 12.10.1
 * Lager en klasse Student. antOppg holder orden på hvor mange av de oppgavene studenten har levert inn, som er godkjent.
 */

class Student {
  private String navn; // entydig (!)
  private int antOppg;
  
  public Student(String navn) {
    this.navn = navn;
  }
  
  public String getNavn() {
    return navn;
  }
  
  public int getAntOppg() {
    return antOppg;
  }
  
  public void okAntOppg(int okning) {
    antOppg += okning;
  }
  
  public String toString() {
    return navn + ", antall oppgaver godkjent: " + antOppg;
  }
}